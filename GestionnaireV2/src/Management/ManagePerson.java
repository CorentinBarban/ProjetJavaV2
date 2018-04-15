/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import API.Company;
import API.Person;
import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 *
 * @author Mathieu Stivanin 
 * Classe permettant la lecture et l'écriture des différentes personnes et de leurs données via XML
 */
public class ManagePerson implements ManageData {
    
    private static final String CSV_FILE_PATH = "liste_personnel.csv";
    private static final String ARES_FILE_PATH = "liste_personnel.ares";
    

    // LECTURE CSV SAVE
    /*
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
    }*/
    // LECTURE ARES
    
    @Override
    public void readData(Company c){
        try {
         File inputFile = new File(ARES_FILE_PATH);
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser saxParser = factory.newSAXParser();
         XMLPersonHandler userhandler = new XMLPersonHandler(c);
         saxParser.parse(inputFile, userhandler);
         
      } catch (Exception e) {
         e.printStackTrace();
      }    
    }
    
    
    
    @Override
    public void writeData(Company c) {
        try {
            FileWriter writer = new FileWriter(ARES_FILE_PATH);
            Set entrySet = c.listePerson.entrySet();
            Iterator it = entrySet.iterator();
            writer.append("<?xml version=\"1.0\"?>\n<!DOCTYPE person SYSTEM \"person.ares\">\n<list>\n");
            while (it.hasNext()) {
                Map.Entry me = (Map.Entry)it.next();
                writer.append(me.getValue().toString());
                it.remove();
            }
            writer.append("</list>");

            writer.flush();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(ManagePerson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
