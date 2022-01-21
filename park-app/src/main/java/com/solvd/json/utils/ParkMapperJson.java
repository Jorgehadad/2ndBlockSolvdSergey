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
import com.solvd.entities.Park;

public class ParkMapperJson {

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

    public List<Park> readJsonParksWithMapper(String fileName) throws IOException {
        JsonMapper mapper = new JsonMapper();
        JsonNode readJsonParks = mapper.readTree(new File(fileName));
        List<Park> parks = mapper.convertValue(readJsonParks, new TypeReference<List<Park>>() {});
        return parks;
    }

    public void writeJsonParkWithMapper(Park park, String fileName) throws IOException {
        JsonMapper mapper = new JsonMapper();
        JsonNode jsonPark = mapper.valueToTree(park);
        mapper.writeValue(new File(fileName), jsonPark);
    }



    
}
