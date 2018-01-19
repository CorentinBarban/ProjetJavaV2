/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.*;
import java.util.*;
import Controler.*;

/**
 *
 * @author Mathieu Stivanin
 * Cette classe représente une mission.
 */
public class Mission {
    private String missionName;
    private HashMap<String,Skill> requiredSkills; // Si besoin de 3x la compétence blablabla, la mettre trois fois dans la map.
    private HashMap<Integer,Person> personOnMission;
    private Date startDate;
    private int missionDuration;
    private String[] tabTypes =  {"enPreparation", "plannifiee", "enCours"};
    private String missionType;
    private ManageMission manager = new ManageMission(); // Création d'un objet ManageMission permettant d'utiliser les méthodes de vérification de cette dernière. 
    
    public Mission(String n, String sd, int md) throws ParseException{
        this.missionName = n;
        this.startDate = manager.dateCheck(sd); //Appel  de la méthode dateCheck qui vérifie si la date est bonne
        this.missionDuration = md;
        this.missionType = this.tabTypes[0]; // Lorsqu'une mission est créée, son statut est "en préparation"
    }
    
    public void addSkill(Skill s){
        this.requiredSkills.put(s.getId(), s);
    }
    
    public void addPerson(Person p){
        this.personOnMission.put(p.getId(), p);
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
