package com.solvd.builderpattern;

import com.solvd.entities.Staff;

public interface RunnerBuilderPattern {
    // Builder pattern is a creational design pattern that lets you construct
    // complex objects step by step.
    // The Builder pattern is used to construct complex objects with a step-by-step
    // approach.
    
    //follow this example:
    //https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
    //https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/

    public static void main(String[] args) {
        DirectorStaff director = new DirectorStaff();
        StaffBuilder juniorStaff = new JuniorStaffBuilder();
        StaffBuilder bossStaff = new BossStaffBuilder();

        director.setStaffBuilder(juniorStaff);
        director.constructStaff();

        Staff staff = director.getStaff();
        System.out.println(staff);
    }
}
