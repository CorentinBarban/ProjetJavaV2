/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import API.Company;
import API.Skill;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
 * Classe permettant de vérifier le bon déroulement des méthodes de Skill.
 */
public class ManageSkill implements ManageData {
    
    private static final String CSV_FILE_PATH_SKILL = "liste_competences.csv";
    private static final String ARES_FILE_PATH = "liste_competences.ares";
    private static final String CSV_FILE_PATH_SKILLTOPERSON = "competences_personnel.csv";
    private static final String ARES_FILE_PATH_SKILLTOPERSON = "competences_personnel.ares";
    /**
     * @autor corentin
     * @param c passage de la Company en parametre
     */
    @Override
    public void readData(Company c){
        // Creation de toutes les competences 
        String csvFile = CSV_FILE_PATH_SKILL;
        String csvFile2 = CSV_FILE_PATH_SKILLTOPERSON;
        String line = "\r";
        String cvsSplitBy = ";";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] row = line.split(cvsSplitBy);
                Skill myskill = new Skill(row[0],row[1],row[2]);
                c.addSkill(myskill);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
         // Affectation des competences aux personnes
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile2))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] row = line.split(cvsSplitBy);
                for(int i=1; i<row.length;i++){
                    //System.out.println(c.listeSkill.get(row[i]));
                    c.listePerson.get(row[0]).addSkill(c.listeSkill.get(row[i]));
                }
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    /*
    
    // LECTURE ARES
    @Override
    public void readData(Company c){
        try {
         File inputFile = new File(ARES_FILE_PATH);
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser saxParser = factory.newSAXParser();
         XMLSkillHandler userhandler = new XMLSkillHandler(c);
         saxParser.parse(inputFile, userhandler);     
      } catch (Exception e) {
         e.printStackTrace();
      }
    }
*/
    @Override
    public void writeData(Company c) {
          /*
        
         /!\ POSSIBLE AJOUT FUTUR
        
        try {
            FileWriter writer = new FileWriter(CSV_FILE_PATH_SKILL);
            FileWriter writer2 = new FileWriter(CSV_FILE_PATH_SKILLTOPERSON);
            Set entrySet = c.listeSkill.entrySet();
            Set entrySet2 = c.listePerson.entrySet();
            Iterator it = entrySet.iterator();
            Iterator it2 = entrySet2.iterator();
            
            while (it.hasNext()) {
                Map.Entry me = (Map.Entry)it.next();
                writer.append(me.getValue().toString());
                it.remove();
            }
            
            writer.flush();
            writer2.flush();
            writer.close();
            writer2.close();
        } catch (IOException ex) {
            Logger.getLogger(ManagePerson.class.getName()).log(Level.SEVERE, null, ex);
        }   */
    }
}
