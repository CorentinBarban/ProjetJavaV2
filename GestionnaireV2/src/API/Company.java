/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Cette classe représente une entreprise
 *
 * @author Mathieu Stivanin
 */
public class Company {

    public final HashMap<String, Skill> listeSkill;
    public final HashMap<String, Person> listePerson;
    public final HashMap<Integer, Mission> listeMission;
    public String companyName;

    /**
     * Constructeur d'une entreprise
     *
     * @param companyName représente le nom de l'entreprise
     */
    public Company(String companyName) {
        this.companyName = companyName;
        this.listeSkill = new HashMap();
        this.listePerson = new HashMap();
        this.listeMission = new HashMap();
    }

    /**
     * Ajout de mission dans la liste de l'entreprise
     *
     * @param m représente la mission à ajouter
     */
    public void addMission(Mission m) {
        listeMission.put(listeMission.size() + 1, m);
    }

    /**
     * Ajout de personne dans la liste de l'entreprise
     *
     * @param p représente la personne à ajouter dans la HashMap (p.getId()
     * représente la clé basée sur l'identifiant de la personne passée en
     * paramètre)
     */
    public void addPerson(Person p) {
        listePerson.put(p.getId(), p);
    }

    /**
     * Ajout de compétence dans la lite de l'entreprise
     *
     * @param s représente la compétence à ajouter
     */
    public void addSkill(Skill s) {
        listeSkill.put(s.getId(), s);
    }

    /**
     * Méthode permettant de remplir la liste des compétences
     */
    public void displaySkills() {

        Iterator skillIterator = listeSkill.entrySet().iterator();
        while (skillIterator.hasNext()) {
            System.out.println(skillIterator.next().toString());
        }
    }

    /**
     * Méthode permettant de remplir la liste des personnes
     */
    public void displayPerson() {
        Set entrySet = listePerson.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getValue().toString());
        }
    }

    /**
     * Méthode permettant de remplir la liste des missions
     */
    public void displayMissions() {
        Set entrySet = listeMission.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getValue().toString());
        }
    }

    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }

}
