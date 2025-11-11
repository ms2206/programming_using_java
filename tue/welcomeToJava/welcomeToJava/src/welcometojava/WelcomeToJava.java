/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package welcometojava;

import javax.swing.JOptionPane;

/**
 *
 * @author mspriggs
 */
public class WelcomeToJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String userInput = JOptionPane.showInputDialog(null, "Enter a number:");
        int numberRepeater = Integer.parseInt(userInput);

        for (int i = 0; i < numberRepeater; i++) {

            String suffix;
            if (i == 0) {
                suffix = "st";
            } else if (i == 1) {
                suffix = "nd";
            } else if (i == 2) {
                suffix = "rd";
            } else {
                suffix = "th";
            }

            JOptionPane.showMessageDialog(null,
                    "Welcome to Java Programming for the " + (i + 1) + suffix + " time!",
                    "Welcome", JOptionPane.INFORMATION_MESSAGE);

        }

    }

}
