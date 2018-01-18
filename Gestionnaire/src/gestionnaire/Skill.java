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
 * Cette classe représente une compétence.
 */
public class Skill {
    private String idSkill; // Les id des compétences sont de type texte dans le CSV
    private String skillNameFr;
    private String skillNameEn;

public Skill(String id,String nEn, String nFr){
    this.idSkill = id;
    this.skillNameEn = nEn;
    this.skillNameFr = nFr;
}

    public String getId(){
        return this.idSkill;
    }

    public void setId(String idSkill) {
        this.idSkill = idSkill;
    }

    public String getSkillNameFr() {
        return skillNameFr;
    }

    public void setSkillNameFr(String skillNameFr) {
        this.skillNameFr = skillNameFr;
    }

    public String getSkillNameEn() {
        return skillNameEn;
    }

    public void setSkillNameEn(String skillNameEn) {
        this.skillNameEn = skillNameEn;
    }

}
