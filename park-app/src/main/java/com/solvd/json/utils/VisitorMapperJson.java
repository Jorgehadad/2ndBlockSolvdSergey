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
import com.solvd.entities.Visitor;

public class VisitorMapperJson {

    public Visitor readJsonVisitor(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Visitor readJsonVisitor = mapper.readValue(new File(fileName), Visitor.class);
        return readJsonVisitor;
    }

    public List<Visitor> readJsonVisitors(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Visitor> readJsonVisitors = mapper.readValue(new File(fileName), new TypeReference<List<Visitor>>() {});
        return readJsonVisitors;
    }

    public void writeJsonVisitor(Visitor visitor, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), visitor);
    }

    public void writeJsonVisitors(List<Visitor> visitors, String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), visitors);
    }

    public List<Visitor> readJsonVisitorsWithMapper(String fileName) throws IOException {
        JsonMapper mapper = new JsonMapper();
        JsonNode readJsonVisitors = mapper.readTree(new File(fileName));
        List<Visitor> visitors = mapper.convertValue(readJsonVisitors, new TypeReference<List<Visitor>>() {});
        return visitors;
    }

    public void writeJsonVisitorWithMapper(Visitor visitor, String fileName) throws IOException {
        JsonMapper mapper = new JsonMapper();
        JsonNode jsonVisitor = mapper.valueToTree(visitor);
        mapper.writeValue(new File(fileName), jsonVisitor);
    }

    
    
}
