/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparserexample;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author contia
 */
public class XMLparserExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JDOMparser jdomParser = new JDOMparser();
        jdomParser.startParsing(new File("input.xml"));
        ArrayList<CD> cds = jdomParser.getCDs();
        for (CD cd: cds){
            System.out.println(cd);
        }
    }
    
}
