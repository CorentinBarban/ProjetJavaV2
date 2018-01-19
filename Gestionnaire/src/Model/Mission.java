/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Mathieu Stivanin
 * Cette classe représente une mission.
 */
public class Mission {
    private String missionName;
    private HashMap<String,Skill> requiredSkills;
    private HashMap<Integer,Person> personOnMission;
    private Date startDate;
    private int missionDuration;
    private String[] tabTypes =  {"enPreparation", "plannifiee", "enCours"};
    private String missionType;
    
    public Mission(String n, String sd, int md) throws ParseException{
        this.missionName = n;
        this.startDate = dateCheck(sd);// Appel de la méthode dateCheck qui vérifie si la date est bonne
        this.missionDuration = md;
        this.missionType = this.tabTypes[0]; // Lorsqu'une mission est créée, son statut est "en préparation"
    }
    
    public void addSkill(Skill s){
        this.requiredSkills.put(s.getId(), s);
    }
    
    public void addPerson(Person p){
        this.personOnMission.put(p.getId(), p);
    }
    
    public Date dateCheck(String d) throws ParseException{ // Cette classe doit vérifier si la date de départ assignée lors de la création d'une mission est valide.
        Date today = Calendar.getInstance().getTime(); // Stockage de la date d'ajd
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
        Date newDate = formatter.parse(d); // Conversion du texte passé en param en date selon le format vu au dessus
        if(newDate.before(today)){ // Si la date entrée est inférieure à la date d'ajd
            throw new ParseException("Problème date", 1);
        } else {
            return newDate;
        }
    }
    
    public void skillCheck(){  // Cette classe doit vérifier si les compétences apportées par les personnes présentes sur la mission remplissent les besoins. Si c'est le cas, alors le type de la mission passe à "plannifié".
        
    }
    
    public ArrayList<String> recommandation(){ // Cette classe permet d'afficher les personnes recommandées par le logiciel pour telle mission.
        return null;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getMissionDuration() {
        return missionDuration;
    }

    public void setMissionDuration(int missionDuration) {
        this.missionDuration = missionDuration;
    }

    public String[] getTabTypes() {
        return tabTypes;
    }

    public void setTabTypes(String[] tabTypes) {
        this.tabTypes = tabTypes;
    }

    public String getMissionType() {
        return missionType;
    }

    public void setMissionType(int i) {
        this.missionType = this.tabTypes[i];
    }
    
}
