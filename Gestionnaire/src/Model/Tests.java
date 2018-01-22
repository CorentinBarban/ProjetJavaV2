/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controler.*;
import java.text.ParseException;

/**
 *
 * @author Mathieu Stivanin
 * Simple classe de tests d'intégration. NE PAS CONSERVER
 */
public class Tests {
    
    public static void main (String[] args) throws ParseException{
        Company myCompany = new Company();
        ManageData mySkill = new ManageSkill();
        /*mySkill.readData(myCompany);
        myCompany.displaySkills();
        */
        ManageData mPerson = new ManagePerson();
        mPerson.readData(myCompany);
        myCompany.displayPerson();
        /*
        ManageData mMission = new ManageMission();
        mMission.readData(myCompany);
        myCompany.displayMissions();
        */
        
    }
}
