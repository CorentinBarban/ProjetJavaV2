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
    private HashMap<String,Skill> requiredSkill;
    private int nbPersonRequiredSkill;
    
    public Requirement(int id, int nbRequired){
        this.idRequirement = id;
        this.nbPersonRequiredSkill = nbRequired;
    }
    
    public void addRequiredSkill(Skill s){
        this.requiredSkill.put(s.getId(), s);
    }

    public int getIdRequirement() {
        return idRequirement;
    }

    public void setIdRequirement(int idRequirement) {
        this.idRequirement = idRequirement;
    }

    public int getNbPersonRequiredSkill() {
        return nbPersonRequiredSkill;
    }

    public void setNbPersonRequiredSkill(int nbPersonRequiredSkill) {
        this.nbPersonRequiredSkill = nbPersonRequiredSkill;
    }
    
}
