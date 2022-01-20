package com.solvd.objectsignore;

import java.sql.Date;

public class Records {
    private Integer NumTicket;
    private String NameP; 
    private Integer DNI;
    private Date Register_date;

    public Records() {
    }

    public Records(Integer NumTicket, String NameP, Integer DNI, Date Register_date) {
        this.NumTicket = NumTicket;
        this.NameP = NameP;
        this.DNI = DNI;
        this.Register_date = Register_date;
    }

    public Integer getNumTicket() {
        return NumTicket;
    }

    public void setNumTicket(Integer NumTicket) {
        this.NumTicket = NumTicket;
    }

    public String getNameP() {
        return NameP;
    }

    public void setNameP(String NameP) {
        this.NameP = NameP;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Date getRegister_date() {
        return Register_date;
    }

    public void setRegister_date(Date Register_date) {
        this.Register_date = Register_date;
    }

    @Override
    public String toString() {
        return "Records{" + "NumTicket=" + NumTicket + ", NameP=" + NameP + ", DNI=" + DNI + ", Register_date=" + Register_date + '}';
    }

    
}
