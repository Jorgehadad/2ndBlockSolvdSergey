SET FOREIGN_KEY_CHECKS = 0;
set sql_safe_updates = 0;

INSERT INTO `solvd`.`accomodation`(`NumAccomodation`,`Capacity`,`Category`,`NameP`)
VALUES (4,3,"Premium","Day Light");

INSERT INTO `staff` VALUES (23596180,'Juancito2',28589,4780,'9 de Julio 552',44369989,36258974,'Without Autumn', "hi");

INSERT INTO `record` VALUES (3,'Without Summer',43000333,'2021-10-19 23:47:31');

INSERT INTO `HasCommunityPark` VALUES ('Resistencia2','Without Summer');

INSERT INTO `Visitor` VALUES (900087745,'Dannie2','26445 Charing Cross Road2','Legal');

INSERT INTO `sale` VALUES (900087754,'With Spring','Area2',1,'2022-10-20 14:20:38');

INSERT INTO `solvd`.`specie`(`scientificName`,`nameVulgar`,`numInventory`)
VALUES("flowercina2","justAFlower",10);

INSERT INTO `solvd`.`vegetable`(`scientificName`,`Flowering`,`start_date`,`end_date`)
VALUES("flowercina2",0,"2021/10/20","2022/01/10");

INSERT INTO `solvd`.`accomodation`(`NumAccomodation`,`Capacity`,`Category`,`NameP`)
VALUES (3,3,"Estandar","Without Summer");

INSERT INTO `makesProyInvEsp` VALUES ('proyect10',42569784,'flowercina');

SET FOREIGN_KEY_CHECKS = 1;
set sql_safe_updates = 1;