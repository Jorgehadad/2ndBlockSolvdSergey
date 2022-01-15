package com.solvd.xml;

import java.sql.SQLException;

import com.solvd.entities.Area;
import com.solvd.xml.service.AreaServiceXML;

public class Main {
    public static void main(String[] args) throws SQLException {


        Area area = new Area();
        area.setnameA("Area23");
        area.setnameA("With Summer2");
        area.setExtension(200.0);
        


        AreaServiceXML areasService = new AreaServiceXML();
        areasService.save(area);
        //areasService.getAll();
        //areasService.update(area);
        //areasService.delete(area);

    }    
}
