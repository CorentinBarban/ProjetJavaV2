/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author MathieuSTIVANIN
 */
public class Requirement {
    private int idRequirement;
    private String description;
    private final int nbTotalPerson;
    private Skill requiredSkill;
    private final List<Person> listPersonnes = new ArrayList<>();
    
    /**
     * Constructeur Requirement
     * @param id ID du besoin
     * @param nbTotalPerson nombre total de personnes qui peuvent être sur le besoin
     */
    public Requirement(int id, int nbTotalPerson, Skill skill){
        this.idRequirement = id;
        this.nbTotalPerson=nbTotalPerson;
        this.requiredSkill = skill;
    }
    
    /**
     * Retourne la compétence necessaire au besoin
     * @return requiredSkill
     */
    public Skill getRequiredSkill(){
        return this.requiredSkill;
    }
    
    /**
     * Retourne l'ID du besoin
     * @return requiredSkill
     */
    public int getIdRequirement() {
        return idRequirement;
    }

    /**
     * Récupere l'id d'un besoin
     * @param idRequirement ID d'un besoin
     */
    public void setIdRequirement(int idRequirement) {
        this.idRequirement = idRequirement;
    }

    public List<Person> getListPersonnes() {
        return listPersonnes;
    }
    
    /**
     *
     * @return nbTotalPerson Le nombre requis de personnes sur le besoin
     */
    public int getNbTotalPersonnes(){
        return nbTotalPerson;
    }
    
    /**
     *
     * @return Le nombre de personnes actuel sur le besoin
     */
    public int getNbPersonnesActuel(){
        return listPersonnes.size();
    }
    /**
     * Ajout d'une personne à un besoin
     * Le nombre de personnes ne doit pas depasser le nombre total de personnes
     * @param p Personne
     * @throws Exception Out of bounds
     */
    public void addPerson(Person p) throws Exception{
        if(this.listPersonnes.size() < nbTotalPerson ){
            //if(checkSkill(p)){
                this.listPersonnes.add(p);
            //} else {
            //   throw new Exception("La personne ne possède pas la compétence correspondant à ce besoin"); 
            //}
        }else{
            throw new Exception("Le nombre de personnes maximal est déjà atteint");
        }
        
    }
    
    public String toString(){
        return "Req : "+idRequirement+" "+nbTotalPerson+" "+requiredSkill.toString()+" "+listPersonnes.size();
    }
    
    public boolean checkSkill(Person p){ // Méthode permettant de vérifier si la personne en param possède la compétence requise
        HashMap<String, Skill> liste = p.getSkillList();
        return liste.containsValue(requiredSkill);
    }
}
