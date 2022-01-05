DELETE FROM `solvd`.`excursions` WHERE (`Cod_Excursion` = '1');

DELETE FROM `solvd`.`accomodation` WHERE (`NumAccomodation` = '3') and (`NameP` = 'Without Summer');

DELETE FROM `solvd`.`animals` WHERE (`scientific_name` = '#A_1');

DELETE FROM `solvd`.`areas` WHERE (`NameA` = 'Area1') and (`NameP` = 'With Summer');

DELETE FROM `solvd`.`conservation` WHERE (`DNI` = '41456112');

DELETE FROM `solvd`.`community` WHERE (`Name_CA` = 'Resistencia');

DELETE FROM `solvd`.`eat_to_feed_aa` WHERE (`scientific_name_come` = '#A_1') and (`scientific_name_iseaten` = '#A_1');

DELETE FROM `solvd`.`enjoy` WHERE (`Cod_Excursion` = '2') and (`DNI` = '20304468');

DELETE FROM `solvd`.`exemployees` WHERE (`DNI` = '21484612');

DELETE FROM `solvd`.`housed` WHERE (`NumAccomodation` = '342') and (`dniVisitor` = '43000333');


