package com.solvd.builderpattern;

//CONCRETE BUILDER
public class BossStaffBuilder extends StaffBuilder {

    public BossStaffBuilder() {
        super();
        createStaff();
    }

    @Override
    public void setDni(Integer dni) {
        staff.setDni(dni);
    }

    @Override
    public void setName(String name) {
        staff.setName("BOSS " + name);
    }

    @Override
    public void setSalary(Double salary) {
        staff.setSalary(salary * 1.20);
    }

    @Override
    public void setNumSegSoc(Integer numSegSoc) {
        staff.setNumSegSoc(numSegSoc);
    }

    @Override
    public void setAddress(String address) {
        staff.setAddress(address);
    }

    @Override
    public void setPhone_fijo(Integer phone_fijo) {
        staff.setPhone_fijo(phone_fijo);
    }

    @Override
    public void setPhone_mobile(Integer phone_mobile) {
        staff.setPhone_mobile(phone_mobile);
    }

    @Override
    public void setNameP(String nameP) {
        staff.setNameP(nameP);
    }

    
}
