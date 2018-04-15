/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import API.Company;

/**
 *
 * @author Mathieu Stivanin
 * Classe permettant la lecture et l'écriture d'un fichier CSV afin de manipuler les données présentes à l'intérieur.
 */
public interface ManageData {
    
    /**
     * Lire les données de l'entreprise
     * @param c Company 
     */
    public void readData(Company c);
    
    /**
     * Ecrire les données pour une entreprise
     * @param c Company
     */
    public void writeData(Company c);
}
