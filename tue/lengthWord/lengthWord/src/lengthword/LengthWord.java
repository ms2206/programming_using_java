/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lengthword;

import java.io.Console;

import javax.swing.JOptionPane;

/**
 *
 * @author mspriggs
 */
public class LengthWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String word = JOptionPane.showInputDialog("Enter a word:");
        int length = word.length();

        // JOptionPane.showMessageDialog(null,
        // "The word \"" + word + "\" has " + length + " letters.",
        // "Word Length", JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < length; i++) {
            System.out.print(word + " ");
        }
    }

}
