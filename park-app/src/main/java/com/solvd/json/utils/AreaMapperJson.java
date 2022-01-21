package com.solvd.json.utils;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.solvd.entities.Area;
import com.solvd.entities.Park;

public class AreaMapperJson {

    public Area readJsonArea(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Area readJsonArea = mapper.readValue(new File(fileName), Area.class);
        return readJsonArea;
    }

    public List<Area> readJsonAreas(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Area> readJsonAreas = mapper.readValue(new File(fileName), new TypeReference<List<Area>>() {});
        return readJsonAreas;
    }

    public void writeJsonArea(Area area, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), area);
    }

    public void writeJsonAreas(List<Area> areas, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), areas);
    }

    public List<Area> readJsonAreasWithMapper(String fileName) throws IOException {
        JsonMapper mapper = new JsonMapper();
        JsonNode readJsonAreas = mapper.readTree(new File(fileName));
        List<Area> areas = mapper.convertValue(readJsonAreas, new TypeReference<List<Area>>() {});
        return areas;
    }

    public void writeJsonAreaWithMapper(Area area, String fileName) throws IOException {
        JsonMapper mapper = new JsonMapper();
        JsonNode jsonArea = mapper.valueToTree(area);
        mapper.writeValue(new File(fileName), jsonArea);
    }

    public Park readJsonPark(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Park readJsonPark = mapper.readValue(new File(fileName), Park.class);
        return readJsonPark;
    }

    public List<Park> readJsonParks(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Park> readJsonParks = mapper.readValue(new File(fileName), new TypeReference<List<Park>>() {});
        return readJsonParks;
    }

    public void writeJsonPark(Park park, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), park);
    }

    public void writeJsonParks(List<Park> parks, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), parks);
    }

    
    
}
