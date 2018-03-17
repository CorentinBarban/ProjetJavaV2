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
        ManageData mm = new ManageMission();
        ManageData ms = new ManageSkill();
        
        mm.readData(c1);
        System.out.println(c1.listeMission);
        mm.writeData(c1);
    }
            
}
