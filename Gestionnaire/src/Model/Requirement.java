/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;

/**
 *
 * @author MathieuSTIVANIN
 */
public class Requirement {
    private int idRequirement;
    private Skill requiredSkill;
    private HashMap<String,Integer> nbPersonRequiredSkill;
    
    public Requirement(int id){
        this.idRequirement = id;
    }
    
    public Skill getRequiredSkill(){
        return this.requiredSkill;
    }

    public int getIdRequirement() {
        return idRequirement;
    }

    public void setIdRequirement(int idRequirement) {
        this.idRequirement = idRequirement;
    }

    public void setNbPersonRequiredSkill(int nbPerson, String idSkill ) {
        nbPersonRequiredSkill.put(idSkill, nbPerson);
    }

    public int getNbPersonRequiredSkill(String idSkill) {
        return nbPersonRequiredSkill.get(idSkill);
    }
    
    public String toString(){ // To string servant à l'écriture dans le CSV
        return idRequirement + ";";
    }
    
    public String affichage(){ // To string traditionnel
        return "Requirement "+ idRequirement;
    }
    
}
