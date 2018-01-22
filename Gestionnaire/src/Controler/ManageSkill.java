/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Company;
import Model.Skill;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Mathieu Stivanin
 * Classe permettant de vérifier le bon déroulement des méthodes de Skill.
 */
public class ManageSkill implements ManageData {
    
    private static final String CSV_FILE_PATH = "liste_competences.csv";
    
    /**
     * @autor corentin
     * @param c passage de la Company en parametre
     */
    @Override
    public void readData(Company c){
        String csvFile = CSV_FILE_PATH;
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
    }

    @Override
    public void writeData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
