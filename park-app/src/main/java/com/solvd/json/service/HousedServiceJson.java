package com.solvd.json.service;

import java.io.IOException;
import java.util.List;

import com.solvd.entities.Housed;
import com.solvd.json.utils.HousedMapperJson;

public class HousedServiceJson {

    public static HousedMapperJson housedMapperJson = new HousedMapperJson();

    public Housed readJsonHoused(String fileName) throws IOException {
        return housedMapperJson.readJsonHoused(fileName);
    }

    public List<Housed> readJsonHouseds(String fileName) throws IOException {
        return housedMapperJson.readJsonHouseds(fileName);
    }

    public void writeJsonHoused(Housed housed, String fileName) throws IOException {
        housedMapperJson.writeJsonHoused(housed, fileName);
    }

    public void writeJsonHouseds(List<Housed> houseds, String fileName) throws IOException {
        housedMapperJson.writeJsonHouseds(houseds, fileName);
    }

    public List<Housed> readJsonHousedsWithMapper(String fileName) throws IOException {
        return housedMapperJson.readJsonHousedsWithMapper(fileName);
    }

    public void writeJsonHousedWithMapper(Housed housed, String fileName) throws IOException {
        housedMapperJson.writeJsonHousedWithMapper(housed, fileName);
    }
    
}
