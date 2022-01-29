
package com.solvd.entities;

import com.fasterxml.jackson.annotation.*;
import com.solvd.factorypattern.IStaff;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "investigator")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"DNI","Title"})
@JsonRootName("investigator")
@JsonPropertyOrder({"DNI","Title"})
public class Investigator implements IStaff {

    @JsonProperty("DNI")
    private Integer DNI;

    @JsonProperty("Title")
    private String Title;

    public Investigator() {
    }

    @JsonCreator
    public Investigator(@JsonProperty("DNI") Integer DNI, @JsonProperty("Title") String title) {
        this.DNI = DNI;
        Title = title;
    }


    @JsonGetter("DNI")
    public Integer getDNI() {
        return DNI;
    }

    @XmlElement(name = "DNI")
    @JsonSetter("DNI")
    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    @JsonGetter("Title")
    public String getTitle() {
        return Title;
    }

    @XmlElement(name = "Title")
    @JsonSetter("Title")
    public void setTitle(String title) {
        Title = title;
    }

    @Override
    public String toString() {
        return "Investigator{" +
                "DNI=" + DNI +
                ", Title='" + Title + '\'' +
                '}';
    }

    @Override
    public void earnMoney() {
        System.out.println("Investigator earns money");
    }

    @Override
    public void work() {
        System.out.println("Investigator works");
    }

    @Override
    public boolean isConservation() {
        return false;
    }

    @Override
    public boolean isInvestigator() {
        return true;
    }

    @Override
    public boolean isVigilance() {
        return false;
    }
    
    
}
