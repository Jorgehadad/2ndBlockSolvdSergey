SET FOREIGN_KEY_CHECKS = 0;
set sql_safe_updates = 0;

DELETE FROM `solvd`.`excursion` WHERE (`codExcursion` = '2');

DELETE FROM `solvd`.`accomodation` WHERE (`NumAccomodation` = '3') and (`NameP` = 'Without Summer');

DELETE FROM `solvd`.`animal` WHERE (`scientificName` = '#A_1');

DELETE FROM `solvd`.`area` WHERE (`NameA` = 'Area1') and (`NameP` = 'With Summer');

DELETE FROM `solvd`.`conservation` WHERE (`DNI` = '41456112');

DELETE FROM `solvd`.`community` WHERE (`NameCA` = 'Resistencia');

DELETE FROM `solvd`.`eattofeedaa` WHERE (`scientificnameEat` = '#A_1') and (`scientificnameIseaten` = '#A_1');

DELETE FROM `solvd`.`enjoy` WHERE (`CodExcursion` = '2') and (`DNI` = '20304468');

DELETE FROM `solvd`.`exemployee` WHERE (`DNI` = '21484612');

DELETE FROM `solvd`.`housed` WHERE (`NumAccomodation` = '342') and (`dniVisitor` = '43000333');

set sql_safe_updates = 1;
SET FOREIGN_KEY_CHECKS = 1;
