/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import Management.ManageMission;
import java.text.*;
import java.util.*;

/**
 *
 * @author Mathieu Stivanin
 * Cette classe représente une mission.
 */
public class Mission {
    
    public enum Etat {
        enPreparation, plannifiee, enCours
    }
    
    private int idMission;
    private String missionName;
    private int nbTotalPerson;
    private HashMap<Integer,Requirement> requirements;
    private HashMap<String,Person> personOnMission;
    private Date startDate;
    private int missionDuration;
    private Etat etat;
    private ManageMission manager = new ManageMission(); // Création d'un objet ManageMission permettant d'utiliser les méthodes de vérification de cette dernière. 
    
    /**
     * Constructeur d'une mission
     * @param id représente l'id de la mission
     * @param n représente le nom de la mission
     * @param sd représente la date de début de la mission
     * @param md représente la durée de la mission
     * @throws ParseException 
     */
    public Mission(int id,String n, String sd, int md, Etat state) throws ParseException{
        this.idMission = id;
        this.missionName = n;
        this.startDate = manager.dateCheck(sd); //Appel  de la méthode dateCheck qui vérifie si la date est bonne
        this.missionDuration = md;
        this.etat = state; // Lorsqu'une mission est créée, son statut est "en préparation"
        this.personOnMission= new HashMap();
        this.requirements = new HashMap();
    }

    
    /**
     * Getter de l'état de la mission
     * @return etat
     */
    public Etat getEtat() {
        return etat;
    }
    
    public void setEtat(Etat e){
        this.etat = e;
    }
    
    /**
     * Getter de l'identifiant de la mission
     * @return idMission
     */
    public int getIdMission() {
        return idMission;
    }
    
    /**
     * Ajout de compétences requises pour la mission
     * @param r représente la compétence à ajouter
     */
    public void addRequirement(Requirement r){
        this.requirements.put(r.getIdRequirement(), r);
    }
    
    /**
     * Ajout du nombre de personnes requises pour que la mission débute
     * @param p représente la personne à ajouter.
     */
    public void addPerson(Person p){
        this.personOnMission.put(p.getId(), p);
    }

    /**
     * Getter du nom de la mission
     * @return missionName
     */
    public String getMissionName() {
        return missionName;
    }

    /**
     * Setter du nom de la mission
     * @param missionName représente le nouveau nom de la mission
     */
    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    /**
     * Getter de la date de début de la mission
     * @return startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Setter de la date de début de la mission
     * @param startDate représente la nouvelle date de début de la mission
     * @throws ParseException
     */
    public void setStartDate(String startDate)throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date sDate = formatter.parse(startDate);// Conversion du texte en date selon le format vu au dessus
        this.startDate = sDate;
    }
    /**
     * Getter de la durée de la mission
     * @return missionDuration
     */
    public int getMissionDuration() {
        return missionDuration;
    }

    /**
     * Setter de la durée de la mission
     * @param missionDuration représente la nouvelle durée de la mission
     */
    public void setMissionDuration(int missionDuration) {
        this.missionDuration = missionDuration;
    }

    
    /**
     * Getter nombre de personnes sur la mission
     * @return nbTotalPerson
     */
    public int getNbTotalPerson() {
        return nbTotalPerson;
    }
    
    /**
     * Setter nombre de personnes sur la mission
     * @param nbTotalPerson
     */
    public void setNbTotalPerson(int nbTotalPerson) {
        this.nbTotalPerson = nbTotalPerson;
    }


    /**
     * Affichage de la mission selon ses attributs
     * @return
     */
    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String StartDate = formatter.format(this.startDate);
        //TODO boucle de parcours pour affichage
        String message="<mission>\n     <id>"+idMission+"</id>\n     <name>"+missionName+"</name>\n     <startDate>"+StartDate+"</startDate>\n     <duration>"+missionDuration+"</duration>\n     <state>"+etat.toString()+"</state>\n</mission>\n";
        return message;
        //return idMission + ", "+ missionName + ", "+ requirements + ", "+ personOnMission + ", "+ StartDate + ", "+ missionDuration + ", "+tabTypes + ", "+ missionType;
    }
}
