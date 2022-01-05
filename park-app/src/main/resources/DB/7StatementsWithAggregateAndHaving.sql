#Nombre de los parks en donde residen al menos 10 Speciess distintas.
#Show the parks names where there are more or equal than 10 diferents species
SELECT a.NameP
from resides_area_esp r inner join areas a on r.NameA = a.NameA 
group by a.NameP 
having count(r.scientific_name)>=10;

#List the species that were visited by all visitors (add more records)
SELECT cons2.species 
FROM (SELECT DISTINCT v.DNI AS Dni_Visitor, e.NameP AS N_park 
							FROM Visitors v INNER JOIN records r ON v.DNI = r.DNI
							INNER JOIN ticket e ON r.NumTicket = e.NumTicket)AS cons1, (SELECT a.NameP AS park, r.scientific_name AS species
																						FROM areas a INNER JOIN Resides_Area_Esp r ON a.NameA = r.NameA) AS cons2 
WHERE cons1.N_park = cons2.park
GROUP BY cons2.species 
HAVING COUNT(*)= (SELECT COUNT(*) FROM Visitors v2);


#List the name of all personnel who work in at least two different areas
SELECT p.Name
FROM Staff p INNER JOIN areas a ON p.NameP = a.NameP 
GROUP BY p.DNI 
HAVING COUNT(*)>1 
ORDER BY p.Name;

#List the names of the species that were not seen by any visitor who has had accomodation.
SELECT rya.Species 
FROM (SELECT a.NameP AS park, r.scientific_name AS Species 
		FROM (areas a INNER JOIN Resides_Area_Esp r ON a.NameA=r.NameA) )AS rya
WHERE rya.park IN( SELECT en.NameP 
			FROM Ticket en 
			WHERE en.NumTicket NOT IN( SELECT records.NumTicket 
										FROM records 
                                        WHERE records.DNI IN(SELECT a.dniVisitor FROM housed a) ) );
                                        
#Name of the animals that eat at least two different animals.
SELECT c.scientific_name_come
FROM eat_to_feed_aa c 
GROUP BY c.scientific_name_come
HAVING COUNT(*)>1;

#List the animals that feed on everyone else (directly).
select c.scientific_name_come
from eat_to_feed_aa c 
group by c.scientific_name_come
having count(*)=(select count(*) 
				from animals);
                

#Total sale of tickets sold per month and year by Park and Area.
SELECT (MONTH(v.date_payment)) AS month, count(v.DNI) as saleTotal 
FROM sale v 
GROUP BY(MONTH(v.date_payment));

#per year
SELECT (YEAR(v.date_payment)) AS month, count(v.DNI) as saleTotal 
FROM sale v 
GROUP BY(YEAR(v.date_payment));
