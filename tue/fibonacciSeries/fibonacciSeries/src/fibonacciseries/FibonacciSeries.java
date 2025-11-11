/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacciseries;

import javax.swing.JOptionPane;

/**
 *
 * @author mspriggs
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String userInput = JOptionPane.showInputDialog("Enter the number of Fibonacci numbers to generate:");
        int n = Integer.parseInt(userInput);

        int first = 0, second = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

        }

    }

}
