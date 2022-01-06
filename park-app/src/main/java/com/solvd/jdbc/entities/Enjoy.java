package com.solvd.jdbc.entities;

import com.fasterxml.jackson.annotation.*;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "area")
@XmlAccessorType(XmlAccessType.FIELD)
public class Enjoy {
    @XmlElement(name = "DNI")
    @JsonProperty("DNI")
    private Integer DNI;

    @XmlElement(name = "codExcursion")
    @JsonProperty("codExcursion")
    private Integer codExcursion;


    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getCodExcursion() {
        return codExcursion;
    }

    public void setCodExcursion(Integer codExcursion) {
        this.codExcursion = codExcursion;
    }

    @Override
    public String toString() {
        return "Enjoy{" +
                "DNI=" + DNI +
                ", codExcursion=" + codExcursion +
                '}';
    }

}
