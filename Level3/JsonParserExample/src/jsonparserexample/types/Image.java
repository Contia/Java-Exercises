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
public class Image {
    private String src;
    private String name,alignment;
    private Long hOffset,vOffset;
    public Image(String s, String n, String a, Long h, Long v){
        src = s;
        name = n;
        hOffset = h;
        vOffset = v;
        alignment = a;
    }
    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append("src: " + src  +"\n");
        st.append("name: " + name  +"\n");
        st.append("alignment: " + alignment  +"\n");
        st.append("hOffset: " + hOffset  +"\n");
        st.append("vOffset: " + vOffset  +"\n");
        return st.toString();
    }
}
