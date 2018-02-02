/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import API.Company;
import static API.Company.listePerson;
import API.Person;
import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
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
    public void writeData(Company c) {
        try {
            FileWriter writer = new FileWriter(CSV_FILE_PATH);
            Set entrySet = listePerson.entrySet();
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry me = (Map.Entry)it.next();
                writer.append(me.getValue().toString());
                //writer.append(",");
                it.remove();
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(ManagePerson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
