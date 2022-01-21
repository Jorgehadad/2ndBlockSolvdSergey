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
import com.solvd.entities.Housed;
import com.solvd.entities.Park;

public class HousedMapperJson {

    public Housed readJsonHoused(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Housed readJsonHoused = mapper.readValue(new File(fileName), Housed.class);
        return readJsonHoused;
    }

    public List<Housed> readJsonHouseds(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Housed> readJsonHouseds = mapper.readValue(new File(fileName), new TypeReference<List<Housed>>() {});
        return readJsonHouseds;
    }

    public void writeJsonHoused(Housed housed, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), housed);
    }

    public void writeJsonHouseds(List<Housed> houseds, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), houseds);
    }

    public List<Housed> readJsonHousedsWithMapper(String fileName) throws IOException {
        JsonMapper mapper = new JsonMapper();
        JsonNode readJsonHouseds = mapper.readTree(new File(fileName));
        List<Housed> houseds = mapper.convertValue(readJsonHouseds, new TypeReference<List<Housed>>() {});
        return houseds;
    }

    public void writeJsonHousedWithMapper(Housed housed, String fileName) throws IOException {
        JsonMapper mapper = new JsonMapper();
        JsonNode jsonHoused = mapper.valueToTree(housed);
        mapper.writeValue(new File(fileName), jsonHoused);
    }


    
    
}
