ALTER TABLE `Park` ADD COLUMN `Description` VARCHAR(45) default NULL;

ALTER TABLE staff ADD COLUMN description varchar(45) default NULL; 

ALTER TABLE residesAreaEsp MODIFY COLUMN individualsNumber INT UNSIGNED NOT NULL;

ALTER TABLE species MODIFY COLUMN numInventory INT UNSIGNED NOT NULL;

ALTER TABLE `specie` ADD COLUMN `Description2` VARCHAR(45) default "just species";



