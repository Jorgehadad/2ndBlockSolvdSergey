package com.solvd.factory;

import com.solvd.entities.Conservation;
import com.solvd.entities.Investigator;
import com.solvd.entities.Vigilance;

public class StaffFactory {
    
    public IStaff getStaff(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("conservation")) {
            return new Conservation();
        } else if (type.equalsIgnoreCase("investigator")) {
            return new Investigator();
        } else if (type.equalsIgnoreCase("vigilance")) {
            return new Vigilance();
        }
        return null;
    }
}
