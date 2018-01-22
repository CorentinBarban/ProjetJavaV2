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
/**
 *
 * @author maths
 */
public class Company {
    
    private final ArrayList<Skill> listeSkill = new ArrayList();
    private final HashMap<Integer,Person> listePerson = new HashMap();
    private final ArrayList<Mission> listeMission = new ArrayList();
    
    
    public void addMission(Mission m){
        listeMission.add(m);
    }
    
    public void addPerson(Person p){
        listePerson.put(p.getId(), p);
    }
    
    public void addSkill(Skill s){
        listeSkill.add(s);
    }
    
    public void displaySkills(){
        Iterator<Skill> skillIterator = listeSkill.iterator();
        while (skillIterator.hasNext()) {
            System.out.println(skillIterator.next().toString());
	}
    }
    
}
