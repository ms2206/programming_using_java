/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import javax.swing.JOptionPane;

/**
 *
 * @author mspriggs
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int frontLeftTirePressure = getTirePressure("front left");

        int frontRightTirePressure = getTirePressure("front right");

        int rearLeftTirePressure = getTirePressure("rear left");

        int rearRightTirePressure = getTirePressure("rear right");

        int tolerance = 3;
        boolean frontTiresOk = isPressureWithinEqualRange(frontLeftTirePressure, frontRightTirePressure, tolerance);
        boolean rearTiresOk = isPressureWithinEqualRange(rearLeftTirePressure, rearRightTirePressure, tolerance);

        if (frontTiresOk && rearTiresOk) {
            JOptionPane.showMessageDialog(null, "All tires are within the acceptable pressure range.",
                    "Tire Pressure Status", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (!frontTiresOk) {
                JOptionPane.showMessageDialog(null,
                        "Warning: Front tires pressure difference exceeds " + tolerance + " PSI.",
                        "Tire Pressure Warning", JOptionPane.WARNING_MESSAGE);
            }
            if (!rearTiresOk) {
                JOptionPane.showMessageDialog(null,
                        "Warning: Rear tires pressure difference exceeds " + tolerance + " PSI.",
                        "Tire Pressure Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static int getTirePressure(String tirePosition) {
        String userInput = JOptionPane.showInputDialog("Enter the pressure of the " + tirePosition + " tire: ");
        int tirePressure = Integer.parseInt(userInput);

        return tirePressure;
    }

    public static boolean isPressureWithinEqualRange(int pressure1, int pressure2, int tolerance) {

        return Math.abs(pressure1 - pressure2) <= tolerance;
    }

}
