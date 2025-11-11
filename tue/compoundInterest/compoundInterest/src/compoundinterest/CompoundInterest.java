/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compoundinterest;

/**
 *
 * @author mspriggs
 */
public class CompoundInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double principal = 1000.0; // Initial amount
        double rate = 7.5; // Annual interest rate (5%)
        int years = 3; // Number of years

        double amount = calculateCompoundInterest(principal, years, rate);
        System.out.printf("Amount after %d years: %.2f%n", years, amount);

    }

    public static double calculateCompoundInterest(double principal, int years, double rate) {

        for (int i = 0; i < years; i++) {
            principal = principal * (1 + rate / 100);
        }
        return principal;
    }

}
