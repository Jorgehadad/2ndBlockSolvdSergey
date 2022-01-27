package com.solvd.builderpattern;

import com.solvd.entities.Staff;

public class DirectorStaff {

    private StaffBuilder staffBuilder;

    public void setStaffBuilder(StaffBuilder staffBuilder) {
        this.staffBuilder = staffBuilder;
    }

    public Staff getStaff() {
        return staffBuilder.getStaff();
    }

    public void constructStaff() {
        staffBuilder.createStaff();
        staffBuilder.setDni(123456789);
        staffBuilder.setName("Juan");
        staffBuilder.setSalary(1000.0);
        staffBuilder.setNumSegSoc(123456789);
        staffBuilder.setAddress("Calle falsa 123");
        staffBuilder.setPhone_fijo(123456789);
        staffBuilder.setPhone_mobile(123456789);
        staffBuilder.setNameP("Juan");
    }
    
}
