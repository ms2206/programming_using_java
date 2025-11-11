/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newrapmethod;

import javax.swing.JOptionPane;

/**
 *
 * @author mspriggs
 */
public class NewRapMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String userInput = JOptionPane.showInputDialog("Enter a value:");
        float num = Float.parseFloat(userInput);

        float lastGuess = num / 2;
        float nextGuess = (lastGuess + (num / lastGuess)) / 2;
        final float TOLERANCE = 0.0001f;

        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (num / lastGuess)) / 2;
        } while (Math.abs(nextGuess - lastGuess) >= TOLERANCE);

        System.out.println("The square root of " + num + " is approximately " + nextGuess);
    }

}
