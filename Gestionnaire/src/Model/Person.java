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
 * @author Mathieu Stivanin
 * Cette classe représente une personne.
 */
public class Person {
    
    private int idPerson;
    private String firstName;
    private String lastName;
    private Date dateOfHire;
    private HashMap<String,Skill> skillList;
    private ArrayList<Mission> onMissions;
    
    /**
     * Constructeur d'une personne.
     * @param id représente son identifiant
     * @param ln représente son nom
     * @param fn représente son prénom
     * @param bd représente ssa date d'entrée dans l'entreprise, au format jj/mm/aaaa
     * @throws ParseException afin de retourner une exception si erreur lors du formatage du texte en date
     */
    public Person(int id,String ln, String fn, String bd) throws ParseException{
        this.idPerson = id;
        this.lastName = ln;
        this.firstName = fn;
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date hDate = formatter.parse(bd); // Conversion du texte en date selon le format vu au dessus
        this.dateOfHire = hDate;
    }
    
    /**
     * Assignation de la personne à une/des mission(s)
     * @param m représente la mission
     */
    public void addMission(Mission m){
        this.onMissions.add(m);
    }
    
    /**
     * Assignation de compétence(s) à la personne
     * @param s représente la compétence à assigner
     */
    public void addSkill(Skill s){
        this.skillList.put(s.getId(), s);
    }

    /**
     * Getter de l'identifiant 
     * @return idPerson
     */
    public int getId() {
        return idPerson;
    }

    /**
     * Setter de l'identifiant
     * @param idPerson représente le nouvel identifiant
     */
    public void setId(int idPerson) {
        this.idPerson = idPerson;
    }

    /**
     * Getter de nom
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter de nom
     * @param lastName représente le nouveau nom
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter de prénom
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter de prénom
     * @param firstName représente le nouveau prénom
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter de date d'entrée
     * @return dateOfHire
     */
    public Date getDateOfHire() {
        return dateOfHire;
    }
}
