/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Company;
import Model.Person;
import Model.Skill;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mathieu Stivanin Classe permettant de vérifier le bon déroulement des
 * méthodes de Person.
 */
public class ManagePerson implements ManageData {
    
    private static final String CSV_FILE_PATH = "liste_personnel.csv";

    @Override
    public void readData(Company c){
        String csvFile = CSV_FILE_PATH;
        String line = "\r";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] row = line.split(cvsSplitBy);
                Person person = new Person(Integer.parseInt(row[3]),row[1],row[0],row[2]);
                c.addPerson(person);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
