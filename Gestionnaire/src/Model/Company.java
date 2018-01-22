/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.*;
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
    
    private final ArrayList<Skill> listeSkill = new ArrayList();
    private final HashMap<Integer,Person> listePerson = new HashMap();
    private final ArrayList<Mission> listeMission = new ArrayList();
    
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
        listeSkill.add(s);
    }
    
    /**
     * Méthode permettant de remplir la liste des compétences
     */
    public void displaySkills(){
        Iterator<Skill> skillIterator = listeSkill.iterator();
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
