/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.*;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author maths
 */
public class Company {
    
    private ArrayList<Skill> listeSkill = new ArrayList();
    private HashMap<Integer,Person> listePerson = new HashMap();
    private ArrayList<Mission> listeMission = new ArrayList();
    
    
    public void addMission(Mission m){
        listeMission.add(m);
    }
    
    public void addPerson(Person p){
        listePerson.put(p.getId(), p);
    }
    
    public void addSkill(Skill s){
        listeSkill.add(s);
    }
}
