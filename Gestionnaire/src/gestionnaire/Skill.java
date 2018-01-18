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
    private int idSkill;
    private String skillNameFr;
    private String skillNameEn;

public Skill(int id,String nEn, String nFr){
    this.idSkill = id;
    this.skillNameEn = nEn;
    this.skillNameFr = nFr;
}

}
