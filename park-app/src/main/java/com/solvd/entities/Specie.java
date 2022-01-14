package com.solvd.entities;

public class Specie {
    private String scientific_name;
    private String name_vulgar;
    private Integer Num_inventory;
    private String Description;

    public Specie() {
    }

    public Specie(String scientific_name, String name_vulgar, Integer Num_inventory, String Description) {
        this.scientific_name = scientific_name;
        this.name_vulgar = name_vulgar;
        this.Num_inventory = Num_inventory;
        this.Description = Description;
    }   

    public String getScientific_name() {
        return scientific_name;
    }

    public void setScientific_name(String scientific_name) {
        this.scientific_name = scientific_name;
    }

    public String getName_vulgar() {
        return name_vulgar;
    }

    public void setName_vulgar(String name_vulgar) {
        this.name_vulgar = name_vulgar;
    }

    public Integer getNum_inventory() {
        return Num_inventory;
    }

    public void setNum_inventory(Integer Num_inventory) {
        this.Num_inventory = Num_inventory;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Species{" + "scientific_name=" + scientific_name + ", name_vulgar=" + name_vulgar + ", Num_inventory=" + Num_inventory + ", Description=" + Description + '}';
    }
    
}
