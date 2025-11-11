/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloopdegf;

/**
 *
 * @author mspriggs
 */
public class ForLoopDegF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Cels. Temp." + "    " + "Fahr. Temp."); 
        System.out.println("-------------------------");

        for (float i = 40; i > 30; i--) {
             

            double degC = convertFtoC(i);
            System.out.println(i + "                " + degC);

        }

    }

    public static double convertFtoC(double degF) {
        double degC = (degF * 9 / 5) + 32;
        return degC;
    }

}
