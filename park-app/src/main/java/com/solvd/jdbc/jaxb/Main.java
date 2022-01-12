package com.solvd.jdbc.jaxb;

import java.sql.SQLException;

import com.solvd.jdbc.entities.Area;
import com.solvd.jdbc.jaxb.service.AreaService;

public class Main {
    public static void main(String[] args) throws SQLException {


        Area area = new Area();
        area.setnameA("Area16");
        area.setnameA("With Summer");
        area.setExtension(100.0);
        


        AreaService areasService = new AreaService();
        areasService.save(area);
        //areasDAO.getById(area.getNameA());
        //areasDAO.update(area);
        //areasDAO.delete(area);

    }    
}
