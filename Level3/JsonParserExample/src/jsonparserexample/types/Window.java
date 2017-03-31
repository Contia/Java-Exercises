/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparserexample.types;

/**
 *
 * @author contia
 */
public class Window {
    private String title;
    private String name;
    private Long width,height;
    public Window(String t, String n, Long w, Long h){
        title = t;
        name = n;
        width = w;
        height = h;
    }
    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append("title: " + title  +"\n");
        st.append("name: " + name  +"\n");
        st.append("width: " + width  +"\n");
        st.append("height: " + height  +"\n");
        return st.toString();
    }
        
}
