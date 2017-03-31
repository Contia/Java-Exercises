/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparserexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import jsonparserexample.types.Image;
import jsonparserexample.types.Text;
import jsonparserexample.types.Window;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 *
 * @author contia
 */
public class JSONParser {
    private String debug;
    private Window window;
    private Text text;
    private Image image;
    
    public JSONParser(){
        
    }
    public void startParsing(String filepath) throws FileNotFoundException, IOException, ParseException{
        org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
        JSONObject o = (JSONObject) parser.parse(new FileReader(filepath));
        JSONObject widget = (JSONObject) o.get("widget");
        String debug =  (String) widget.get("debug");
        this.debug = debug;
        JSONObject window = (JSONObject) widget.get("window");
        String windowTitle = (String) window.get("title");
        String windowName = (String) window.get("name");
        Long windowWidth = (Long) window.get("width");
        Long windowHeight = (Long) window.get("height");
        this.window = new Window(windowTitle,windowName,windowWidth,windowHeight);
        JSONObject image = (JSONObject) widget.get("image");
        String imageSrc = (String) image.get("src");
        String imageName = (String) image.get("name");
        Long imageHoffset = (Long) image.get("hOffset");
        Long imageVoffset = (Long) image.get("vOffset");
        String imageAlignment = (String) image.get("alignment");
        this.image = new Image(imageSrc,imageName,imageAlignment,imageHoffset,imageVoffset);
        JSONObject text = (JSONObject) widget.get("text");
        String textData = (String) text.get("data");
        String textStyle = (String) text.get("style");
        Long textHoffset = (Long) text.get("hOffset");
        Long textVoffset = (Long) text.get("vOffset");
        String textAlignment = (String) text.get("alignment");
        Long textSize = (Long) text.get("size");
        String textName = (String) text.get("name");
        String textOnMouseUp = (String) text.get("onMouseUp");
        this.text = new Text(textData,textStyle,textName,textAlignment,textOnMouseUp,textSize,textHoffset,textVoffset);
          
    }
    public Window getWindow(){
        return window;
    }
    public Image getImage(){
        return image;
    }
    public Text getText(){
        return text;
    }
}
