/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.Map;
import java.util.Iterator;

/**
 * @author Mathieu Stivanin Cette classe représente une personne.
 */
public class Person {

    private int idPerson;
    private String firstName;
    private String lastName;
    private Date dateOfHire;
    private HashMap<String,Skill> skillList;

    /**
     * Constructeur d'une personne.
     *
     * @param id représente son identifiant
     * @param ln représente son nom
     * @param fn représente son prénom
     * @param hd représente sa date d'entrée dans l'entreprise, au format
     * jj/mm/aaaa
     * @throws ParseException afin de retourner une exception si erreur lors du
     * formatage du texte en date
     */
    public Person(int id, String ln, String fn, String hd) throws ParseException {
        this.idPerson = id;
        this.lastName = ln;
        this.firstName = fn;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date hDate = formatter.parse(hd); // Conversion du texte en date selon le format vu au dessus
        this.dateOfHire = hDate;
        skillList=new HashMap();
    }

    /**
     * Constructeur d'une personne.
     *
     */
    public Person(){
        this.idPerson = 0;
        this.lastName = "";
        this.firstName = "";

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date hDate = new Date(); // Conversion du texte en date selon le format vu au dessus
        this.dateOfHire = hDate;
        skillList=new HashMap();
    }

    /**
     * Assignation de compétence(s) à la personne
     *
     * @param s représente la compétence à assigner
     */
    public void addSkill(Skill s) {
        try{
            this.skillList.put(s.getId(),s);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    /**
     * Getter de l'identifiant
     *
     * @return idPerson
     */
    public String getId() {
        return ""+idPerson; // Nécessité de convertir en string pour comparer
    }

    /**
     * Setter de l'identifiant
     *
     * @param idPerson représente le nouvel identifiant
     */
    public void setId(int idPerson) {
        this.idPerson = idPerson;
    }

    /**
     * Getter de nom
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter de nom
     *
     * @param lastName représente le nouveau nom
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter de prénom
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter de prénom
     *
     * @param firstName représente le nouveau prénom
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter de date d'entrée
     *
     * @return dateOfHire
     */
    public Date getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(String dateOfHire) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date hDate = formatter.parse(dateOfHire);
        this.dateOfHire = hDate;
    }
    
    
    /**
     * Affichage de la personne selon ses attibuts
     *
     * @return Retourne sous le format XML une personne
     */

    @Override
    public String toString(){

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String DateOfHire = formatter.format(this.dateOfHire);
        String message="<person>\n     <id>"+idPerson+"</id>\n     <lastName>"+lastName+"</lastName>\n     <firstName>"+firstName+"</firstName>\n     <dateOfHire>"+DateOfHire+"</dateOfHire>\n     <skills_list>\n";
       
       Iterator skillIterator = skillList.entrySet().iterator();
        
        while (skillIterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) skillIterator.next();
            message = message + mapEntry.getValue();
	}
        message = message + "</skills_list>\n</person>\n";
        return message;
    }

    public HashMap<String, Skill> getSkillList() {
        return skillList;
    }

}