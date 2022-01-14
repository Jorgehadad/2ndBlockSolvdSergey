package com.solvd.json;

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



public class jsonParserJackson {
    //Json Parser With Jackson
    //https://www.baeldung.com/jackson-json-parser
    //https://www.baeldung.com/jackson-json-parser-tutorial
    //https://www.baeldung.com/jackson-json-parser-tutorial-java


    public static void main(String[] args) throws IOException {
        java.util.Date utilDate = new java.util.Date();
        ObjectMapper mapper = new ObjectMapper();
        Park park = new Park();
        park.setNameP("Park1");
        park.setDateDeclaracion(new java.sql.Date(utilDate.getTime()));
        park.setAreas(null);
        mapper.writeValue(new File("src/main/java/com/solvd/json/parks2.json"), park);

        Park newpark = mapper.readValue(new File("src/main/java/com/solvd/json/parks2.json"), Park.class);
        System.out.println(newpark.getNameP());
        System.out.println(newpark.getDateDeclaracion());
        System.out.println(newpark);

        //MAP JSON WITH JACKSON 
        //String jsonParkArray = "[{\"nameP\":\"Park1\",\"dateDeclaracion\":\"2019-01-01\"},{\"nameP\":\"Park2\",\"dateDeclaracion\":\"2019-01-02\"}]";
        List<Park> listPark = mapper.readValue(new File("src/main/java/com/solvd/json/parks.json"), new TypeReference<List<Park>>(){});
        System.out.println(listPark);

        String jsonParkArray2 = JsonMapper.builder().build().writeValueAsString(listPark);
        List<Park> listPark2 = mapper.readValue(jsonParkArray2, new TypeReference<List<Park>>(){});
        System.out.println(listPark2);

        String json = "{\"nameP\":\"Park1\",\"dateDeclaracion\":\"2019-01-01\"}";
        JsonNode jsonNode = mapper.readTree(json);
        String nameP = jsonNode.get("nameP").asText();
        String dateDeclaracion = jsonNode.get("dateDeclaracion").asText();
        System.out.println(nameP);
        System.out.println(dateDeclaracion);

        List<Park> listPark3 = mapper.readValue(new File("src/main/java/com/solvd/json/parks.json"), new TypeReference<List<Park>>(){});
        System.out.println(listPark3.size());
        System.out.println(listPark3.get(0).getNameP());
        System.out.println(listPark3.get(0).getDateDeclaracion());
        



    }



    
}
