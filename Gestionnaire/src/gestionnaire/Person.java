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
 * Cette classe représente une personne.
 */
public class Person {
    private int idPerson;
    private String lastName;
    private String firstName;
    private Date birthDate;
    private HashMap<String,Skill> skillList;
    private ArrayList<Mission> onMissions;
    
    public Person(int id,String ln, String fn, Date bd){
        this.idPerson = id;
        this.lastName = ln;
        this.firstName = fn;
        this.birthDate = bd;
    }
    
    public void addMission(Mission m){
        this.onMissions.add(m);
    }
    
    public void addSkill(Skill s){
        this.skillList.put(s.getId(), s);
    }

    public int getId() {
        return idPerson;
    }

    public void setId(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
