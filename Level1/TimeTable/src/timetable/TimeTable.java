/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

/**
 *
 * @author contia
 */
public class TimeTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i =0;i<=10;i++){
            for (int j=0;j<=9;j++){
                if (i == 0){
                    if (j==0) System.out.print("* |");
                    else  System.out.format("%3d", j); 
                    
                }
                else if (i==1){
                    System.out.printf("%s", "---");
                }
                else {
                    if (j==0) System.out.print( i-1 + " |");
                    else System.out.printf("%3d",j*(i-1));
                }
            }
            System.out.println();
        }
    }
    
}
