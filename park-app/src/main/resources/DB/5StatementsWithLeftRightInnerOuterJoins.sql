#show staff that aren't investigators
select *
from staff p left join investigator i on p.DNI=i.DNI
where p.DNI not in (select io.DNI
			from staff po right join investigator io on po.DNI=io.DNI);

#show just staff that are investigators
select *
from staff p right join investigator i on p.DNI=i.DNI;

#show species that aren't animals
select *
from species left join animals on species.scientific_name=animals.scientific_name
where species.scientific_name not in (select species.scientific_name
									from species right join animals 
											on species.scientific_name=animals.scientific_name);


#show just the species that are animals
select species.scientific_name
from species right join animals	on species.scientific_name=animals.scientific_name;


#show just the species that are vegetables
select species.scientific_name
from species right join vegetables	on species.scientific_name=vegetables.scientific_name;
