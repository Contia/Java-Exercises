/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkboard;

/**
 *
 * @author contia
 */
public class CheckBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 7;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                if (i%2 != 0)
                    System.out.print(" #");
                else
                    System.out.print("# ");
            }
            System.out.println();
        }
    }
    
}
