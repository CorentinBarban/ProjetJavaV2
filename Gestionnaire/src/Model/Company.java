/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author Mathieu Stivanin
 */
public class Company {
    
    public final HashMap<String,Skill> listeSkill = new HashMap();
    public final HashMap<String,Person> listePerson = new HashMap();
    public final ArrayList<Mission> listeMission = new ArrayList();
    
    /**
     * Ajout de mission dans la liste de l'entreprise
     * @param m représente la mission à ajouter
     */
    public void addMission(Mission m){
        listeMission.add(m);
    }
    
    /**
     * Ajout de personne dans la liste de l'entreprise
     * @param p représente la personne à ajouter dans la HashMap (p.getId() représente la clé basée sur l'identifiant de la personne passée en paramètre)
     */
    public void addPerson(Person p){
        listePerson.put(p.getId(), p);
    }
    
    /**
     * Ajout de compétence dans la lite de l'entreprise
     * @param s représente la compétence à ajouter
     */
    public void addSkill(Skill s){
        listeSkill.put(s.getId(), s);
    }
    
    /**
     * Méthode permettant de remplir la liste des compétences
     */
    public void displaySkills(){
        
        Iterator skillIterator = listeSkill.entrySet().iterator();
        while (skillIterator.hasNext()) {
            System.out.println(skillIterator.next().toString());
	}
    }
    
    /**
     * Méthode permettant de remplir la liste des personnes
     */
    public void displayPerson(){
        Set entrySet = listePerson.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry)it.next();
            System.out.println(me.getValue().toString());
        }
    }
    
    /**
     * Méthode permettant de remplir la liste des missions
     */
    public void displayMissions(){
        Iterator<Mission> missionIterator = listeMission.iterator();
        while (missionIterator.hasNext()) {
            System.out.println(missionIterator.next().toString());
	}
    }
    
}
