/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import API.Company;
import API.Mission;
import API.Requirement;
import API.Skill;
import java.text.*;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 *
 * @author Mathieu Stivanin Classe permettant de vérifier le bon déroulement des
 * méthodes de Mission.
 */
public class ManageMission implements ManageData {

    private static final String CSV_FILE_PATH = "liste_missions.csv";
    private static final String ARES_FILE_PATH = "liste_missions.ares";
    
    /* LECTURE CSV SAVE
    @Override
    public void readData(Company c) {
        String csvFile = CSV_FILE_PATH;
        String line = "\r";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] row = line.split(cvsSplitBy);
                Mission mMission = new Mission(Integer.parseInt(row[0]), row[1], row[2], Integer.parseInt(row[3]));
                for (int i = 3; i < row.length; i++) {
                    mMission.addPerson(c.listePerson.get(row[i]));      Il sert à quoi ce bout de code ?
                }
                c.addMission(mMission);

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
         XMLMissionHandler userhandler = new XMLMissionHandler(c);
         saxParser.parse(inputFile, userhandler);     
      } catch (Exception e) {
         e.printStackTrace();
      }    
    }

    @Override
    public void writeData(Company c) {
        try {
            FileWriter writer = new FileWriter(ARES_FILE_PATH);
            Set entrySet = c.listeMission.entrySet();
            Iterator it = entrySet.iterator();
            writer.append("<?xml version=\"1.0\"?>\n<!DOCTYPE mission SYSTEM \"mission.ares\">\n<list>\n");

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
