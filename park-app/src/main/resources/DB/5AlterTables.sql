ALTER TABLE `Parks` ADD COLUMN `Description` VARCHAR(45) default NULL;

ALTER TABLE staff ADD COLUMN description varchar(45) default NULL; 

ALTER TABLE resides_area_esp MODIFY COLUMN individualsNumber INT UNSIGNED NOT NULL;

ALTER TABLE species MODIFY COLUMN Num_inventory INT UNSIGNED NOT NULL;

ALTER TABLE `species` ADD COLUMN `Description` VARCHAR(45) default "just species";



