package com.solvd.jdbc.objectsIgnore;

public class Minerals {
    private String scientific_name;
    private String type;

    public Minerals() {
    }

    public Minerals(String scientific_name, String type) {
        this.scientific_name = scientific_name;
        this.type = type;
    }

    public String getScientific_name() {
        return scientific_name;
    }

    public void setScientific_name(String scientific_name) {
        this.scientific_name = scientific_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Minerals{" +
                "scientific_name='" + scientific_name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
