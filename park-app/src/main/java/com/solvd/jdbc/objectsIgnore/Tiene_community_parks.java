package com.solvd.jdbc.objectsIgnore;

public class Tiene_community_parks {
    private String Name_CA;
    private String NameP;

    public Tiene_community_parks() {
    }

    public Tiene_community_parks(String Name_CA, String NameP) {
        this.Name_CA = Name_CA;
        this.NameP = NameP;
    }

    public String getName_CA() {
        return Name_CA;
    }

    public void setName_CA(String Name_CA) {
        this.Name_CA = Name_CA;
    }

    public String getNameP() {
        return NameP;
    }

    public void setNameP(String NameP) {
        this.NameP = NameP;
    }

    @Override
    public String toString() {
        return "Tiene_community_parks{" +
                "Name_CA='" + Name_CA + '\'' +
                ", NameP='" + NameP + '\'' +
                '}';
    }
}
