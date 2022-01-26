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
from specie left join animal on specie.scientificname=animal.scientificname
where specie.scientificname not in (select specie.scientificname
									from specie right join animal
											on specie.scientificname=animal.scientificname);


#show just the species that are animals
select specie.scientificname
from specie right join animal on specie.scientificname=animal.scientificname;


#show just the species that are vegetables
select specie.scientificname
from specie right join vegetable	on specie.scientificname=vegetable.scientificname;
