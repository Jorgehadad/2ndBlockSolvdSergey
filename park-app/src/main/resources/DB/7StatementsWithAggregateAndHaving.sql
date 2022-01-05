#Nombre de los parks en donde residen al menos 10 species distintas.
#Show the parks names where there are more or equal than 10 diferents specie
SELECT a.NameP
from residesAreaEsp r inner join area a on r.nameA = a.nameA 
group by a.nameP 
having count(r.scientificname)>=10;

#List the specie that were visited by all visitor (add more record)
SELECT cons2.specie 
FROM (SELECT DISTINCT v.DNI AS Dni_Visitor, e.nameP AS N_park 
							FROM visitor v INNER JOIN record r ON v.DNI = r.DNI
							INNER JOIN ticket e ON r.numTicket = e.numTicket)AS cons1, (SELECT a.nameP AS park, r.scientificname AS specie
																						FROM area a INNER JOIN residesAreaEsp r ON a.nameA = r.nameA) AS cons2 
WHERE cons1.N_park = cons2.park
GROUP BY cons2.specie 
HAVING COUNT(*)= (SELECT COUNT(*) FROM visitor v2);


#List the name of all personnel who work in at least two different area
SELECT p.Name
FROM Staff p INNER JOIN area a ON p.nameP = a.nameP 
GROUP BY p.DNI 
HAVING COUNT(*)>1 
ORDER BY p.Name;

#List the names of the specie that were not seen by any visitor who has had accomodation.
SELECT rya.specie 
FROM (SELECT a.nameP AS park, r.scientificname AS specie 
		FROM (area a INNER JOIN residesAreaEsp r ON a.nameA=r.nameA) )AS rya
WHERE rya.park IN( SELECT en.nameP 
			FROM Ticket en 
			WHERE en.numTicket NOT IN( SELECT record.numTicket 
										FROM record 
                                        WHERE record.DNI IN(SELECT a.dniVisitor FROM housed a) ) );
                                        
#Name of the animals that eat at least two different animals.
SELECT c.scientificnameEat
FROM eattofeedaa c 
GROUP BY c.scientificnameEat
HAVING COUNT(*)>1;

#List the animals that feed on everyone else (directly).
select c.scientificnameEat
from eattofeedaa c 
group by c.scientificnameEat
having count(*)=(select count(*) 
				from animal);
                

#Total sale of tickets sold per month and year by Park and Area.
SELECT (MONTH(v.datePayment)) AS month, count(v.DNI) as saleTotal 
FROM sale v 
GROUP BY(MONTH(v.datePayment));

#per year
SELECT (YEAR(v.datePayment)) AS month, count(v.DNI) as saleTotal 
FROM sale v 
GROUP BY(YEAR(v.datePayment));
