package com.solvd.objectsignore;

public class Visitors {
    private Integer DNI;
    private String Name;
    private String Address;
    private String Profession;

    public Visitors() {
    }

    public Visitors(Integer DNI, String Name, String Address, String Profession) {
        this.DNI = DNI;
        this.Name = Name;
        this.Address = Address;
        this.Profession = Profession;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    @Override
    public String toString() {
        return "Visitors{" +
                "DNI=" + DNI +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Profession='" + Profession + '\'' +
                '}';
    }
    
}
