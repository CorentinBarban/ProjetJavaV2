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
    private ArrayList<Skill> requiredSkills;
    private ArrayList<Person> personOnMission;
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
}
