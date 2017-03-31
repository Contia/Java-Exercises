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
public class Text {
    private String data;
    private Long size;
    private String style,name,alignment,onMouseUp;
    private Long hOffset,vOffset;
    public Text(String d, String st, String n, String a, String o,Long s, Long h, Long v){
        data = d;
        name = n;
        hOffset = h;
        vOffset = v;
        alignment = a;
        style = st;
        onMouseUp = o;
        size =s;
    }
    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append("data: " + data  +"\n");
        st.append("name: " + name  +"\n");
        st.append("style: " + style  +"\n");
        st.append("onMouseUp: " + onMouseUp + "\n");
        st.append("size: " + size  +"\n");
        st.append("alignment: " + alignment  +"\n");
        st.append("hOffset: " + hOffset  +"\n");
        st.append("vOffset: " + vOffset  +"\n");
        return st.toString();
    } 
}
