/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;

/**
 *
 * @author Mathieu Stivanin
 * Cette classe représente une compétence.
 */
public class Skill {
    private String idSkill; // Les id des compétences sont de type texte dans le CSV
    private String skillNameFr;
    private String skillNameEn;

    /**
     * Constructeur d'une compétence
     * @param id représente l'identifiant de la compétence (les id des compétences étant de type String dans le CSV)
     * @param nEn représente le nom de la compétence en anglais
     * @param nFr représente le nom de la compétence en français
     */
    public Skill(String id,String nEn, String nFr){
    this.idSkill = id;
    this.skillNameEn = nEn;
    this.skillNameFr = nFr;
}

    /**
     * Getter de l'identifiant de la compétence
     * @return idSkill
     */
    public String getId(){
        return this.idSkill;
    }

    /**
     * Setter de l'identifiant de la compétence
     * @param idSkill représente l'id que doit avoir la compétence
     */
    public void setId(String idSkill) {
        this.idSkill = idSkill;
    }

    /**
     * Getter du nom français de la compétence
     * @return skillNameFr
     */
    public String getSkillNameFr() {
        return skillNameFr;
    }

    /**
     * Setter du nom français de la compétence
     * @param skillNameFr représente le nom français que doit avoir la compétence
     */
    public void setSkillNameFr(String skillNameFr) {
        this.skillNameFr = skillNameFr;
    }

    /**
     * Getter du nom anglais de la compétence
     * @return skillNameEn
     */
    public String getSkillNameEn() {
        return skillNameEn;
    }

    /**
     * Setter du nom anglais de la compétence
     * @param skillNameEn représente le nom anglais que doit avoir la compétence
     */
    public void setSkillNameEn(String skillNameEn) {
        this.skillNameEn = skillNameEn;
    }

}
