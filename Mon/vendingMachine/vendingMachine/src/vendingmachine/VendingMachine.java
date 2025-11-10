/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vendingmachine;

/**
 *
 * @author mspriggs
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int itemCost = 125;
        int amountPaid = 600;

        // return change in lowest number of coins
        int change = amountPaid - itemCost;

        int twoPoundCoins = change / 200;
        int onePoundCoins = (change % 200) / 100;
        int fiftyPenceCoins = (change % 100) / 50;
        int twentyPenceCoins = (change % 50) / 20;
        int tenPenceCoins = (change % 20) / 10;
        int fivePenceCoins = (change % 10) / 5;

        System.out.println("Your change is: ");
        System.out.println(twoPoundCoins + " x £2 coins");
        System.out.println(onePoundCoins + " x £1 coins");
        System.out.println(fiftyPenceCoins + " x 50p coins");
        System.out.println(twentyPenceCoins + " x 20p coins");
        System.out.println(tenPenceCoins + " x 10p coins");
        System.out.println(fivePenceCoins + " x 5p coins");
        System.out.println("Total change: £" + (change / 100.0));

    }

}
