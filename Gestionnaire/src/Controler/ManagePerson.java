/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.io.*;

/**
 *
 * @author Mathieu Stivanin
 * Classe permettant de vérifier le bon déroulement des méthodes de Person.
 */
public class ManagePerson implements ManageData {

    @Override
    public void readData() {
        String csvFile = "projectJava/liste_personnel.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] test = line.split(cvsSplitBy);

                System.out.println("Test [nom= " + test[1] + " , prenom=" + test[2] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void writeData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
