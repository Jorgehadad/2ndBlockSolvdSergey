UPDATE `parques`
SET `NombreP` = "Park1"
WHERE `NombreP` = "With Spring";

UPDATE `solvd`.`accomodation`
SET `Capacity` = 10
WHERE `NumAccomodation` = 1 AND `NameP` = "Day Light";

UPDATE `solvd`.`accomodation`
SET `Capacity` = 5
WHERE accomodation.Capacity <= 2;

UPDATE `solvd`.`animals`
SET `feeding` = "vegetables"
WHERE `scientific_name` = "Juampus";

UPDATE `solvd`.`areas`
SET `Extension` = 500
WHERE `NameA` = "Area1" AND `NameP` = "With Summer";

UPDATE `solvd`.`housed`
SET `Room` = "Room 10"
WHERE `NumAccomodation` = 342 AND `dniVisitor` = 42000222;

UPDATE `solvd`.`vegetables`
SET `Flowering` = 1
WHERE `scientific_name` = "flowercina";

UPDATE `solvd`.`sale` 
SET `Date_payment` = '2022-10-20 11:20:38' 
WHERE (`DNI` = '10057482') and (`NumTicket` = '1') and (`NameP` = 'With Spring');

UPDATE `solvd`.`enjoy` 
SET `Cod_Excursion` = '48' 
WHERE (`Cod_Excursion` = '47') and (`DNI` = '18351435');

UPDATE `solvd`.`excursions` 
SET `Hour` = '00:05:00' 
WHERE (`Cod_Excursion` = '1');

