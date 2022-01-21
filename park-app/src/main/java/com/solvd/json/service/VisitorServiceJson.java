package com.solvd.json.service;

import java.io.IOException;
import java.util.List;

import com.solvd.entities.Visitor;
import com.solvd.json.utils.VisitorMapperJson;

public class VisitorServiceJson {

    public static VisitorMapperJson visitorMapperJson = new VisitorMapperJson();

    public Visitor readJsonVisitor(String fileName) throws IOException {
        return visitorMapperJson.readJsonVisitor(fileName);
    }

    public List<Visitor> readJsonVisitors(String fileName) throws IOException {
        return visitorMapperJson.readJsonVisitors(fileName);
    }

    public void writeJsonVisitor(Visitor visitor, String fileName) throws IOException {
        visitorMapperJson.writeJsonVisitor(visitor, fileName);
    }

    public void writeJsonVisitors(List<Visitor> visitors, String fileName) throws IOException {
        visitorMapperJson.writeJsonVisitors(visitors, fileName);
    }

    public List<Visitor> readJsonVisitorsWithMapper(String fileName) throws IOException {
        return visitorMapperJson.readJsonVisitorsWithMapper(fileName);
    }

    public void writeJsonVisitorWithMapper(Visitor visitor, String fileName) throws IOException {
        visitorMapperJson.writeJsonVisitorWithMapper(visitor, fileName);
    }

    
}
