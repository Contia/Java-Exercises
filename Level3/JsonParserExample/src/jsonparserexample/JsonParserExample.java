/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparserexample;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;

/**
 *
 * @author contia
 */
public class JsonParserExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
        // TODO code application logic here
        JSONParser  jsonParser = new JSONParser();
        jsonParser.startParsing(System.getProperty("user.dir") +"/input.json");
        System.out.println(jsonParser.getWindow());
        System.out.println(jsonParser.getText());
        System.out.println(jsonParser.getImage());
    }
    
}
