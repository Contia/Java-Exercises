/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmonicsum;

/**
 *
 * @author contia
 */
public class HarmonicSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long n = 5000000;
        double Harmonic = 0.0;
        for (long i=1;i<=n;i++){
            Harmonic += 1.0/i;
        }
        System.out.println("left to right:" + Harmonic);
        Harmonic=0.0;
        for (long i=n;i>0;i--){
            Harmonic += 1.0/i;
        }
        System.out.println("right to left:" + Harmonic);
    
        // The most accurate result is the second one. Because
        // computers have learned to ignore additions where 
        // the variable k >> to variable l. So, if we calcuate,
        // firstly, the smallest values then we will create a
        // big one 
    }
    
}
