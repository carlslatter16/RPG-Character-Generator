/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.generator;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Carl Slatter
 */
public class RPGGenerator {

   
    public static void main(String[] args) 
    {
        
             SwingUtilities.invokeLater(new Runnable() {
             public void run() {
                GUIManagement();
            }
        });
    }
    
    static void GUIManagement()
    {         
        JFrame frame = new GUIINFO();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 550));
        frame.pack();
        frame.setVisible(true);     
    }
    
}
