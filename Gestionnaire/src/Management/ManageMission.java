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

/**
 *
 * @author Mathieu Stivanin Classe permettant de vérifier le bon déroulement des
 * méthodes de Mission.
 */
public class ManageMission implements ManageData {

    private static final String CSV_FILE_PATH = "liste_missions.csv";
    private static final String CSV_FILE_PATH2 = "liste_missions.ares";

    public Date dateCheck(String d) throws ParseException { // Cette classe doit vérifier si la date de départ assignée lors de la création d'une mission est valide.
        Date today = Calendar.getInstance().getTime(); // Stockage de la date d'ajd
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date newDate = formatter.parse(d); // Conversion du texte passé en param en date selon le format vu au dessus
        if (newDate.before(today)) { // Si la date entrée est inférieure à la date d'ajd
            throw new ParseException("La date entrée ne doit pas être inférieur à la date d'aujourd'hui.", 1);
        } else {
            return newDate;
        }
    }
    
    public boolean checkNbPersonRequiredSkill(Requirement r){
       Skill s = r.getRequiredSkill();
       return true;
    }

    public void skillCheck() {  // Cette classe doit vérifier si les compétences apportées par les personnes présentes sur la mission remplissent les besoins. Si c'est le cas, alors le type de la mission passe à "plannifié".

    }

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
                /*for (int i = 3; i < row.length; i++) {
                    mMission.addPerson(c.listePerson.get(row[i]));      Il sert à quoi ce bout de code ?
                }*/
                c.addMission(mMission);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void writeData(Company c) {
        try {
            FileWriter writer = new FileWriter(CSV_FILE_PATH2);
            Set entrySet = c.listeMission.entrySet();
            Iterator it = entrySet.iterator();
            writer.append("<?xml version=\"1.0\"?>\n<!DOCTYPE mission SYSTEM \"mission.ares\">\n");

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
