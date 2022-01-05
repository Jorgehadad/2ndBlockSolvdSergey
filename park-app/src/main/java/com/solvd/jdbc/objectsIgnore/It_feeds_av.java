package com.solvd.jdbc.objectsIgnore;

public class It_feeds_av {
    private String scientific_name_come ;
    private String scientific_name_iseaten;

    public It_feeds_av() {
    }

    public It_feeds_av(String scientific_name_come, String scientific_name_iseaten) {
        this.scientific_name_come = scientific_name_come;
        this.scientific_name_iseaten = scientific_name_iseaten;
    }

    public String getScientific_name_come() {
        return scientific_name_come;
    }

    public void setScientific_name_come(String scientific_name_come) {
        this.scientific_name_come = scientific_name_come;
    }

    public String getScientific_name_iseaten() {
        return scientific_name_iseaten;
    }

    public void setScientific_name_iseaten(String scientific_name_iseaten) {
        this.scientific_name_iseaten = scientific_name_iseaten;
    }

    @Override
    public String toString() {
        return "It_feeds_av{" +
                "scientific_name_come='" + scientific_name_come + '\'' +
                ", scientific_name_iseaten='" + scientific_name_iseaten + '\'' +
                '}';
    }
    
}
