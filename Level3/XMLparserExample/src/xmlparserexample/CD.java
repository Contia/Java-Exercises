/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparserexample;

/**
 *
 * @author contia
 */
public class CD {
    private String title,artist,year,company,country;
    private String price;
    public CD(String t,String a, String y, String c, String country, String p){
        title = t;
        artist = a;
        year = y;
        company = c;
        this.country = country;
        price = p;
    }
    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append("title: " + title + "\n");
        st.append("artist: " + artist + "\n");
        st.append("year: " + year + "\n");
        st.append("company: " + company + "\n");
        st.append("country: " + country + "\n");
        st.append("price: " + price + "\n");
        return st.toString();
    }

}
