/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.text.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author Mathieu Stivanin
 * Classe permettant de vérifier le bon déroulement des méthodes de Mission.
 */
public class ManageMission implements ManageData {
    
    public ManageMission() {
    }
    
    public Date dateCheck(String d) throws ParseException{ // Cette classe doit vérifier si la date de départ assignée lors de la création d'une mission est valide.
        Date today = Calendar.getInstance().getTime(); // Stockage de la date d'ajd
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
        Date newDate = formatter.parse(d); // Conversion du texte passé en param en date selon le format vu au dessus
        if(newDate.before(today)){ // Si la date entrée est inférieure à la date d'ajd
            throw new ParseException("La date entrée ne doit pas être inférieur à la date d'aujourd'hui.", 1);
        } else {
            return newDate;
        }
    }

    public void skillCheck(){  // Cette classe doit vérifier si les compétences apportées par les personnes présentes sur la mission remplissent les besoins. Si c'est le cas, alors le type de la mission passe à "plannifié".
        
    }
    
    @Override
    public void readData() {
        
    }

    @Override
    public void writeData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}