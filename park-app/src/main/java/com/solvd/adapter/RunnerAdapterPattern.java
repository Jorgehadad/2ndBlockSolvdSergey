package com.solvd.adapter;

import java.util.Date;

import com.solvd.entities.Proyect;
import com.solvd.entities.Staff;

public class RunnerAdapterPattern {
    // Adapter pattern is a structural design pattern that allows objects to work together
    // in a way that is not possible with the previous design pattern.
    // The adapter pattern is used to provide a different interface to the same class.
    //Example:

    public static void main(String[] args) {

        // based on these links:
        // https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
        // https://www.baeldung.com/java-adapter-pattern

        Proyect proyect = new Proyect();
        proyect.setProyectName("Proyect");
        proyect.setBudget(1000.0);


        System.out.println(proyect);

        Staff staff = new Staff();
        staff.setName("Staff");
        staff.setSalary(1000.0);

        System.out.println(staff);

        ISetAmount el1 = new Staff();
        el1.setAmount(1200.30);

        System.out.println(el1.getAmount());

        IAdapterBudget el2 = new Proyect();
        el2.setAmount(5000000.50);

        System.out.println(el2.getAmount());


    }


    
}
