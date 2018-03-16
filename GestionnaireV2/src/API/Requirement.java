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
    private Skill requiredSkill;
    private final List<Person> listPersonnes = new ArrayList<>();
    
    
    public Requirement(int id, int nbTotalPerson){
        this.idRequirement = id;
        this.nbPersonRequiredSkill=nbTotalPerson;   
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
