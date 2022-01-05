package com.solvd.jdbc.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.jdbc.entities.Park;



public class jsonParserJackson {
    //Json Parser With Jackson
    //https://www.baeldung.com/jackson-json-parser
    //https://www.baeldung.com/jackson-json-parser-tutorial
    //https://www.baeldung.com/jackson-json-parser-tutorial-java


    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Park park = new Park();

        Park newpark = mapper.readValue(new File("src/main/java/jaxb/json/parks.json"), Park.class);

        System.out.println(newpark.getNameP());
        System.out.println(newpark.getDateDeclaracion());
        System.out.println(park);
        System.out.println(newpark);

        //mapper.writeValue(new File("src/main/java/jaxb/json/parks.json"), park);

    }



    
}
