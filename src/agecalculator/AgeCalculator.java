/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agecalculator;

import javax.swing.SwingUtilities;
/**
 *
 * @author Subham
 */
public class AgeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Hello");
        SwingUtilities.invokeLater(() -> {
            new MainInterface().setVisible(true);
        });
    }
    
}
