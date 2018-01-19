/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.*;
import java.text.ParseException;

/**
 *
 * @author Mathieu Stivanin
 * Simple classe de tests d'intégration. NE PAS CONSERVER
 */
public class Tests {
    
    public static void main (String[] args) throws ParseException{
        Mission m1 = new Mission("Mission test 1", "06/02/2018", 4);
        ManagePerson mp = new ManagePerson();
        mp.readData();
    }
}
