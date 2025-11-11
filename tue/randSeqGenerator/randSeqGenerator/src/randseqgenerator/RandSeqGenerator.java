/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randseqgenerator;

import javax.swing.JOptionPane;

/**
 *
 * @author mspriggs
 */
public class RandSeqGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Get sequence length from user
        String userInput = JOptionPane.showInputDialog(null, "Enter a sequence length:");
        int seqLength = Integer.parseInt(userInput);

        // Generate random sequence
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seqLength; i++) {
            sb.append(getRandomBase());
        }

        // Display generated sequence
        JOptionPane.showMessageDialog(null, "Generated Sequence: " + sb.toString());

        // Exit program
        System.exit(0);

    }

    // Generate random base
    /**
     * @return
     */
    public static char getRandomBase() {
        char[] bases = { 'A', 'T', 'C', 'G' };
        int randomIndex = (int) (Math.random() * bases.length);
        return bases[randomIndex];

    }

}
