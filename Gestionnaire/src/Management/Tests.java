/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import API.Company;
import API.Mission;
import API.Person;
import java.text.ParseException;

/**
 *
 * @author MathieuSTIVANIN
 */
public class Tests {
    public static void main (String[] args) throws ParseException{
        Company c1 = new Company("Arès");
        ManageData mp = new ManagePerson();
        Person p = new Person(98, "Test2", "Write","06/09/1996");
        
        ManageData mm = new ManageMission();
        Mission m = new Mission(99, "Test de mission", "19/08/2018", 15);
        
        mp.readData(c1);
        mp.writeData(c1);
        
        mm.readData(c1);
        mm.writeData(c1);
    }
            
}
