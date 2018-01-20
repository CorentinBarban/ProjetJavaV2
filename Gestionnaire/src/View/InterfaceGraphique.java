/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author maths
 */
public class InterfaceGraphique extends JFrame {

    public InterfaceGraphique(String pTitre){
        super(pTitre);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setContentPane(panneauDeContenu());
	this.setResizable(false);
	this.pack();
    }
    
    public JLabel panneauDeContenu() {
        return null;
    }
    
}
