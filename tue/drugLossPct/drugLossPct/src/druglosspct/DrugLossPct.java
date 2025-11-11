/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package druglosspct;

import javax.swing.JOptionPane;

/**
 *
 * @author mspriggs
 */
public class DrugLossPct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String userInput = JOptionPane.showInputDialog("Enter the depresiation percentage:");
        int depPct = Integer.parseInt(userInput);

        // Calculate the drug loss percentage
        final int startEfficacy = 100;
        final int cutOffEfficacy = 50;

        int monthsValid = numberOfMonthsToCutOffEfficacy(depPct, startEfficacy, cutOffEfficacy);

        for (int month = 0; month < monthsValid; month++) {
            int efficacy = startEfficacy - (depPct * month);
            System.out.println("Month " + (month + 1) + ": Efficacy = " + efficacy + "%");
        }

        System.out.println("Number of months valid (inclusive): " + monthsValid);

    }

    public static int numberOfMonthsToCutOffEfficacy(int depPct, int startEfficacy, int cutOffEfficacy) {
        return (int) cutOffEfficacy / depPct;
    }

}
