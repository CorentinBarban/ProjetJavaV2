/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import com.opencsv.CSVReader;
import org.apache.commons.lang3.*;
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

    @Override
    public void readData() {

        try {
            CSVReader reader = new CSVReader(new FileReader("liste_personnel.csv"));

            //Read all rows at once
            List<String[]> allRows = reader.readAll();

            //Read CSV line by line and use the string array as you want
            for(String[] row : allRows) {
                System.out.println(Arrays.toString(row));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManagePerson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManagePerson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void writeData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
