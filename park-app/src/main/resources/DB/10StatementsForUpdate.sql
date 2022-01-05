SET FOREIGN_KEY_CHECKS = 0;
set sql_safe_updates = 0;

UPDATE `park`
SET `nameP` = "Park1"
WHERE `nameP` = "With Spring";

UPDATE `solvd`.`accomodation`
SET `Capacity` = 10
WHERE `numAccomodation` = 1 AND `nameP` = "Day Light";

UPDATE `solvd`.`accomodation`
SET `Capacity` = 5
WHERE accomodation.Capacity <= 2;

UPDATE `solvd`.`animal`
SET `feeding` = "vegetables"
WHERE `scientificname` = "Juampus";

UPDATE `solvd`.`area`
SET `Extension` = 500
WHERE `NameA` = "Area1" AND `NameP` = "With Summer";

UPDATE `solvd`.`housed`
SET `Room` = "Room 10"
WHERE `NumAccomodation` = 342 AND `dniVisitor` = 42000222;

UPDATE `solvd`.`vegetable`
SET `Flowering` = 1
WHERE `scientificname` = "flowercina";

UPDATE `solvd`.`sale` 
SET `Datepayment` = '2022-10-20 11:20:38' 
WHERE (`DNI` = '10057482') and (`NumTicket` = '1') and (`NameP` = 'With Spring');

UPDATE `solvd`.`enjoy` 
SET `CodExcursion` = '48' 
WHERE (`CodExcursion` = '47') and (`DNI` = '18351435');

UPDATE `solvd`.`excursion` 
SET `Hour` = '00:05:00' 
WHERE (`CodExcursion` = '1');

SET FOREIGN_KEY_CHECKS = 1;
set sql_safe_updates = 1;

