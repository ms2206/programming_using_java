/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celstodeg;

import javax.swing.JOptionPane;

/**
 *
 * @author mspriggs
 */
public class CelsToDeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Get celsius

        String input = JOptionPane.showInputDialog(null, "Enter Celsius:");
        double celsius = Double.parseDouble(input);

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        JOptionPane.showMessageDialog(null, "Fahrenheit: " + fahrenheit);

        System.exit(0);

    }

}
