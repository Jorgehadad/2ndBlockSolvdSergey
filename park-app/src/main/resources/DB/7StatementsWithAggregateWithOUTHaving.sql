#count how many staff are in the database
select count(*)
from staff;

#show maximun staff salary
select max(sueldo)
from personal;

#show average staff salary
select avg(sueldo)
from personal;

#show minimum staff salary
select min(salary)
from staff;


select count(*) as NumberofExcursions
from excursions
where excursions.date > "2020-10-10";

#Count how many parks are without consider the park "With Summer"
SELECT count(*)
FROM `solvd`.`parks`
where NameP != "With Summer" ;


#Show the average of the all of the proyects after "2020-01-01"
select avg(budget)
from proyect
where startDate > "2020-01-01";
