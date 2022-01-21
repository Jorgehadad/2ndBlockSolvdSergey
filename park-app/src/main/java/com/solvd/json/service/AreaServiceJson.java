package com.solvd.json.service;

import java.io.IOException;
import java.util.List;

import com.solvd.entities.Area;
import com.solvd.json.utils.AreaMapperJson;

public class AreaServiceJson {
    // Area Service Json

    public static AreaMapperJson areaMapperJson = new AreaMapperJson();

    public Area readJsonArea(String fileName) throws IOException {
        return areaMapperJson.readJsonArea(fileName);
    }

    public List<Area> readJsonAreas(String fileName) throws IOException {
        return areaMapperJson.readJsonAreas(fileName);
    }

    public void writeJsonArea(Area area, String fileName) throws IOException {
        areaMapperJson.writeJsonArea(area, fileName);
    }

    public void writeJsonAreas(List<Area> areas, String fileName) throws IOException {
        areaMapperJson.writeJsonAreas(areas, fileName);
    }

    public List<Area> readJsonAreasWithMapper(String fileName) throws IOException {
        return areaMapperJson.readJsonAreasWithMapper(fileName);
    }



    

}
