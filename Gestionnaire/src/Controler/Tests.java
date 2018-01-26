/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Company;
import Model.Person;
import java.text.ParseException;

/**
 *
 * @author MathieuSTIVANIN
 */
public class Tests {
    public static void main (String[] args) throws ParseException{
        Company c1 = new Company();
        ManageData mp = new ManagePerson();
        Person p = new Person(98, "Test2", "Write","06/09/1996");
        
        mp.readData(c1);
        c1.displayPerson();
        c1.addPerson(p);
        c1.displayPerson();
        mp.writeData(c1);
    }
            
}
