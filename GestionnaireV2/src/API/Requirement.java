/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author MathieuSTIVANIN
 */
public class Requirement {
    private int idRequirement;
    private String description;
    private final int nbPersonRequiredSkill;
    private Skill requiredSkill ;
    private final List<Person> listPersonnes = new ArrayList<>();
    
    /**
     * Constructeur Requirement
     * @param id ID du besoin
     * @param nbTotalPerson nombre total de personnes sur le besoin
     */
    public Requirement(int id, int nbTotalPerson){
        this.idRequirement = id;
        this.nbPersonRequiredSkill=nbTotalPerson;   
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
     *Récupere l'id d'un besoin
     * @param idRequirement ID d'un besoin
     */
    public void setIdRequirement(int idRequirement) {
        this.idRequirement = idRequirement;
    }
    
    /**
     * Ajout une personne à un besoin
     * Le nombre de personne ne doit pas depasser le nombre total de personne
     * @param p Personne
     * @throws Exception Out of bounds
     */
    public void addPerson(Person p) throws Exception{
        if(this.listPersonnes.size() < nbPersonRequiredSkill ){
            this.listPersonnes.add(p);
            
        }else{
            throw new Exception("Le nombre de personnes maximal est déjà atteint");
        }
        
    }
    
    @Override
    public String toString(){ // To string servant à l'écriture dans le CSV
        return idRequirement + ";";
    }
    
    public String affichage(){ // To string traditionnel
        return "Requirement "+ idRequirement;
    }
    
}
