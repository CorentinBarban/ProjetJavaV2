/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import Management.ManageMission;
import java.text.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author Mathieu Stivanin Cette classe représente une mission.
 */
public class Mission {

    /**
     * Enumeration des différents état de la mission
     */
    public enum Etat {
        enPreparation, plannifiee, enCours, terminee
    }

    private int idMission;
    private String missionName;
    private int nbTotalPerson;
    private HashMap<Integer, Requirement> requirements;
    private HashMap<String, Person> personOnMission;
    private Date startDate;
    private int missionDuration;
    
    public Etat etat;
    private ManageMission manager = new ManageMission(); // Création d'un objet ManageMission permettant d'utiliser les méthodes de vérification de cette dernière. 

    /**
     * Constructeur d'une mission
     *
     * @param id représente l'id de la mission
     * @param n représente le nom de la mission
     * @param sd représente la date de début de la mission
     * @param md représente la durée de la mission
     * @param state represente l'état de la mission
     * @throws ParseException Erreur sur le format de la date
     */
    public Mission(int id, String n, String sd, int md, Etat state) throws ParseException {
        this.idMission = id;
        this.missionName = n;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date sDate = formatter.parse(sd);// Conversion du texte en date selon le format vu au dessus
        this.startDate = sDate;
        this.missionDuration = md;
        this.etat = state;
        this.personOnMission = new HashMap();
        this.requirements = new HashMap();
    }

    /**
     * Getter de l'état de la mission
     *
     * @return etat
     */
    public Etat getEtat() {
        return etat;
    }

    /**
     * Change l'etat de la mission
     *
     * @param e Etat de la mission
     */
    public void setEtat(Etat e) {
        this.etat = e;
    }

    /**
     * Getter de l'identifiant de la mission
     *
     * @return idMission
     */
    public int getIdMission() {
        return idMission;
    }

    /**
     * Ajout de compétences requises pour la mission
     *
     * @param r représente la compétence à ajouter
     */
    public void addRequirement(Requirement r) {
        this.requirements.put(r.getIdRequirement(), r);
    }

    /**
     * Ajout du nombre de personnes requises pour que la mission débute
     *
     * @param p représente la personne à ajouter.
     */
    public void addPerson(Person p) {
        this.personOnMission.put(p.getId(), p);
    }

    /**
     * Getter du nom de la mission
     *
     * @return missionName
     */
    public String getMissionName() {
        return missionName;
    }

    /**
     * Setter du nom de la mission
     *
     * @param missionName représente le nouveau nom de la mission
     */
    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    /**
     * Getter de la date de début de la mission
     *
     * @return startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Setter de la date de début de la mission
     *
     * @param startDate représente la nouvelle date de début de la mission
     * @throws ParseException La date n'est pas sous le bon format
     */
    public void setStartDate(String startDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date sDate = formatter.parse(startDate);// Conversion du texte en date selon le format vu au dessus
        this.startDate = sDate;
    }

    /**
     * Getter de la durée de la mission
     *
     * @return missionDuration
     */
    public int getMissionDuration() {
        return missionDuration;
    }

    /**
     * Setter de la durée de la mission
     *
     * @param missionDuration représente la nouvelle durée de la mission
     */
    public void setMissionDuration(int missionDuration) {
        this.missionDuration = missionDuration;
    }

    /**
     * Getter nombre de personnes sur la mission
     *
     * @return nbTotalPerson
     */
    public int getNbTotalPerson() {
        return nbTotalPerson;
    }

    /**
     * Setter nombre de personnes sur la mission
     *
     * @param nbTotalPerson nb total de personne sur la mission
     */
    public void setNbTotalPerson(int nbTotalPerson) {
        this.nbTotalPerson = nbTotalPerson;
    }

    /**
     * Getter des besoins de la mission
     *
     * @return requirements
     */
    public HashMap<Integer, Requirement> getRequirements() {
        return this.requirements;
    }
    
    /**
     * Getter liste des personnes sur la mission
     *
     * @return personOnMission
     */
    public HashMap<String, Person> getPersonOnMission() {
        return this.personOnMission;
    }
    
    public void verification(){
        int nb = 0;
        System.out.println("Vérification :");
        
        switch(this.etat){
            case enPreparation :
                System.out.println("L'état de la mission est bien en préparation, passage à la suite.");
                if(infoRemplies()){// SI toutes les infos

                    if(personOnMission.size() == nbTotalPerson){ // Vérifie si le nombre total de personnes sur la mission est égal au nombre requis
                        System.out.println("Le nombre requis de personnes sur la mission est de "+personOnMission.size()+", le nombre de personnes actuel est de : "+nbTotalPerson+". Passage à la suite.");

                        Set entrySet = requirements.entrySet(); // Création d'un itérateur sur la liste des besoins de la mission
                        Iterator itReq = entrySet.iterator();

                        while (itReq.hasNext()) {
                            Map.Entry mapEntry = (Map.Entry) itReq.next();
                            Requirement r = requirements.get((Integer)mapEntry.getKey());

                            int nbPersonActuel = r.getNbPersonnesActuel(); // Récupération du nombre de personnes actuellement sur le besoin
                            int nbPersonRequis = r.getNbTotalPersonnes(); // Récupération du nb de personnes requis
                            List<Person> listPerson = r.getListPersonnes();

                            if(nbPersonActuel == nbPersonRequis){ // Si il y a le nb souhaité de personnes sur le besoin
                            System.out.println("Le nombre de personnes requis sur le besoin "+r.getIdRequirement()+" est de : "+nbPersonRequis+", le nombre actuel est de : "+nbPersonActuel+". Passage à la suite.");

                                for(int i=0; i<listPerson.size();i++){
                                    Person p = listPerson.get(i);
                                    nb += checkSkill(p, r); // Vérifie si la personne possède la compétence requise par le besoin
                                }
                            } else {
                                System.out.println("Il n'y a pas le nb de personnes souhaité sur le besoin.");
                            }
                        }
                        if(nb == getNbTotalPerson()){
                            System.out.println("La mission peut passer en plannifiée.");
                            this.etat = Etat.plannifiee;
                        } else {
                            System.out.println("Nombre de personnes possédant la compétence requise par le besoin : "+nb+", nb ne la possédant pas : "+(getNbTotalPerson()-nb));
                        }
                    } else {
                        System.out.println("Le nb total de personnes actuellement sur la mission ne correspond pas au nombre requis.");
                    }
                }
                
                break;
            case plannifiee:
                System.out.println("Mission plannifiée.");
                
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Récupération de la date d'auj et conversion au format jj/mm/aaaa.
                LocalDate localDate = LocalDate.now();
                System.out.println(dtf.format(localDate));
                Date dateAuj = java.sql.Date.valueOf(localDate); // Conversion d'un obj localdate a date.
                
                if (dateAuj.after(startDate)) {
                    System.out.println("La date de début est passée. La mission devient en cours.");
                    this.etat = Etat.enCours;
                }
                break;
                
            case enCours:
                break;
        }
    }
    
    public boolean infoRemplies(){
        if(missionName != null && startDate != null && !personOnMission.isEmpty() && nbTotalPerson > 0 && !requirements.isEmpty()){// SI toutes les infos
            System.out.println("Toutes les informations de la mission sont renseignées, passage à la suite.");
            return true;
        } else {
            return false;
        }
    }
    
 public int checkSkill(Person p, Requirement r){
     int nb = 0;
        if(p.getSkillList().containsValue(r.getRequiredSkill())){ 
            nb++; // Augmentation du compteur de nombre de personnes remplissant le besoin auquel elle est affectée.
            System.out.println("La personne "+p.getId()+" possède la compétence '"+r.getRequiredSkill().getSkillNameFr()+"' du besoin "+r.getIdRequirement());
        } else {
            System.out.println("La personne "+p.getId()+" ne possède pas la compétence '"+r.getRequiredSkill().getSkillNameFr()+"' du besoin "+r.getIdRequirement());
        }
        return nb;
    }


    /**
     * Affichage de la mission selon ses attributs
     *
     * @return Retourn sous le format XML la mission
     */
    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String StartDate = formatter.format(this.startDate);
        //TODO boucle de parcours pour affichage
        String message = "<mission>\n     <id>" + idMission + "</id>\n     <name>" + missionName + "</name>\n     <startDate>" + StartDate + "</startDate>\n     <duration>" + missionDuration + "</duration>\n     <state>" + etat.toString() + "</state>\n     <nbPersonOnMission>" + nbTotalPerson + "</nbPersonOnMission>\n     <persons_list>\n";
        
        Iterator personIterator = personOnMission.entrySet().iterator();
        
        while (personIterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) personIterator.next();
            message = message + "          <idPerson>"+mapEntry.getKey() + "</idPerson>\n";
	}
        message = message + "     </persons_list>\n     <requirements_list>\n          <requirement>\n";
        
        Iterator reqIterator = requirements.entrySet().iterator();
        
        while (reqIterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) reqIterator.next();
            Requirement r = requirements.get(mapEntry.getKey());
            message = message + "          <idRequirement>"+r.getIdRequirement()+ "</idRequirement>\n";
            message = message + "          <idSkillReq>"+r.getRequiredSkill().getId()+ "</idSkillReq>\n";
            message = message + "          <nbPersonTotalReq>"+r.getNbTotalPersonnes()+ "</nbPersonTotalReq>\n";
            for(int i=0; i<r.getListPersonnes().size(); i++){
                message = message + "          <idPersonReq>"+r.getListPersonnes().get(i).getId()+ "</idPersonReq>\n";
            }
	}
        message = message + "          </requirement>\n     </requirements_list>\n</mission>\n";
        
        return message;
    }
}
