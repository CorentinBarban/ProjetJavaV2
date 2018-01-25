/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Company;

/**
 *
 * @author MathieuSTIVANIN
 */
public class Tests {
    public static void main (String[] args){
        Company c1 = new Company();
        ManagePerson mp = new ManagePerson();
        
        mp.readData(c1);
        c1.displayPerson();
    }
            
}
