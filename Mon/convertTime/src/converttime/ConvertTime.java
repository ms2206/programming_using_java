/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package converttime;

/**
 *
 * @author mspriggs
 */
public class ConvertTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int seconds = 3456;
        int hours = seconds / 3600;
        int minuets = (seconds % 3600) / 60;

        System.out.println(seconds + " seconds is " + hours + " hours and " + minuets + " minuets.");

    }

}
