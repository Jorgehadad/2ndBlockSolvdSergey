package com.solvd.entities;

import com.solvd.factory.IStaff;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@XmlRootElement(name = "vigilance")
@XmlType(propOrder = {"DNI", "NameP", "NameA", "enrollment", "type"})
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("vigilance")
@JsonPropertyOrder({"DNI", "NameP", "NameA", "enrollment", "type"})
public class Conservation implements IStaff {
    private Integer DNI;
    private String Speciality;
    private String NameA;
    private String NameP;

    //constructors
    public Conservation() {
    }

    @JsonCreator
    public Conservation(@JsonProperty("DNI") Integer DNI, @JsonProperty("Speciality") String Speciality, @JsonProperty("NameA") String NameA, @JsonProperty("NameP") String NameP) {
        this.DNI = DNI;
        this.Speciality = Speciality;
        this.NameA = NameA;
        this.NameP = NameP;
    }

    //getters and setters

    @JsonGetter("DNI")
    public Integer getDNI() {
        return DNI;
    }

    @XmlElement(name = "DNI")
    @JsonSetter("DNI")
    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    @JsonGetter("Speciality")
    public String getSpeciality() {
        return Speciality;
    }

    @XmlElement(name = "Speciality")
    @JsonSetter("Speciality")
    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    @JsonGetter("NameA")
    public String getNameA() {
        return NameA;
    }

    @XmlElement(name = "NameA")
    @JsonSetter("NameA")
    public void setNameA(String nameA) {
        NameA = nameA;
    }

    @JsonGetter("NameP")
    public String getNameP() {
        return NameP;
    }

    @XmlElement(name = "NameP")
    @JsonSetter("NameP")
    public void setNameP(String nameP) {
        NameP = nameP;
    }

    @Override
    public String toString() {
        return "Conservation{" +
                "DNI=" + DNI +
                ", Speciality='" + Speciality + '\'' +
                ", NameA='" + NameA + '\'' +
                ", NameP='" + NameP + '\'' +
                '}';
    }

    @Override
    public void earnMoney() {
        System.out.println("Conservation earns money");
    }

    @Override
    public void work() {
        System.out.println("Conservation works");
    }

    @Override
    public boolean isConservation() {
        return true;
    }

    @Override
    public boolean isInvestigator() {
        return false;
    }

    @Override
    public boolean isVigilance() {
        return false;
    }
    

    
}
