package com.solvd.json.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.entities.Park;
import com.solvd.jdbc.dao.ParkDAO;
import com.solvd.json.utils.ParkMapperJson;

public class ParkServiceJson {
    
    public static ParkMapperJson mapper = new ParkMapperJson();

    public Park readJsonPark(String fileName) throws IOException {
        return mapper.readJsonPark(fileName);
    }

    public List<Park> readJsonParks(String fileName) throws IOException {
        return mapper.readJsonParks(fileName);
    }

    public void writeJsonPark(Park park, String fileName) throws IOException {
        mapper.writeJsonPark(park, fileName);
    }

    public void writeJsonParks(List<Park> parks, String fileName) throws IOException {
        mapper.writeJsonParks(parks, fileName);
    }

    public List<Park> readJsonParksWithMapper(String fileName) throws IOException {
        return mapper.readJsonParksWithMapper(fileName);
    }

    public void writeJsonParkWithMapper(Park park, String fileName) throws IOException {
        mapper.writeJsonParkWithMapper(park, fileName);
    }

    
}
