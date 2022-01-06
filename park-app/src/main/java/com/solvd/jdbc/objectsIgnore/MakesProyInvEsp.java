package com.solvd.jdbc.objectsIgnore;

public class MakesProyInvEsp {
    private String ProyectName;
    private String DNI;
    private Integer scientific_name;

    public MakesProyInvEsp() {
    }

    public MakesProyInvEsp(String proyectName, String DNI, Integer scientific_name) {
        ProyectName = proyectName;
        this.DNI = DNI;
        this.scientific_name = scientific_name;
    }

    public String getProyectName() {
        return ProyectName;
    }

    public void setProyectName(String proyectName) {
        ProyectName = proyectName;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Integer getScientific_name() {
        return scientific_name;
    }

    public void setScientific_name(Integer scientific_name) {
        this.scientific_name = scientific_name;
    }

    @Override
    public String toString() {
        return "Makes_proy_inv_esp{" +
                "ProyectName='" + ProyectName + '\'' +
                ", DNI='" + DNI + '\'' +
                ", scientific_name=" + scientific_name +
                '}';
    }
    
}
