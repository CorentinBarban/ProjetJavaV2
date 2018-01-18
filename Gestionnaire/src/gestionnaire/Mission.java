/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnaire;

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
    
    public Mission(String n, Date sd, int md){
        this.missionName = n;
        this.startDate = sd;
        this.missionDuration = md;
        this.missionType = this.tabTypes[0];
    }
    
    public void addSkill(Skill s){
        this.requiredSkills.put(s.getId(), s);
    }
    
    public void addPerson(Person p){
        this.personOnMission.put(p.getId(), p);
    }
    
    public void skillCheck(){
        // Cette classe doit vérifier si les skills apportés par les personnes présentes sur la mission remplissent les besoins. Si c'est le cas, alors le type de la mission passe à "plannifié".
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
