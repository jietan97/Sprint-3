/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partb;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class addNewDeliveryMan {

    /**
     * @param args the command line arguments
     */
    
    JTextField jtfName = new JTextField();
    
    public addNewDeliveryMan() {
        JFrame frame = new JFrame();
        
        jtfName.setText("");
        
        frame.setSize(500, 400);
        //frame.pack();
        frame.setTitle("Delivery Man Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);
    }
    
    
    public static void main(String[] args) {
    }
    
}
