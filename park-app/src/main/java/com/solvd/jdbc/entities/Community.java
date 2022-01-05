package com.solvd.jdbc.entities;

public class Community {
    private String Name_CA;
    private String org_respon;
    
    public String getName_CA() {
        return Name_CA;
    }

    public void setName_CA(String name_CA) {
        Name_CA = name_CA;
    }

    public String getOrg_respon() {
        return org_respon;
    }

    public void setOrg_respon(String org_respon) {
        this.org_respon = org_respon;
    }

    @Override
    public String toString() {
        return "Community{" +
                "Name_CA='" + Name_CA + '\'' +
                ", org_respon='" + org_respon + '\'' +
                '}';
    }
    
}
