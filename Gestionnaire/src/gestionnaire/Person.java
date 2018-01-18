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
    private ArrayList<Skill> skillList;
    private ArrayList<Mission> onMissions;
    
    public Person(int id,String ln, String fn, Date bd){
        this.idPerson = id;
        this.lastName = ln;
        this.firstName = fn;
        this.birthDate = bd;
    }
}
