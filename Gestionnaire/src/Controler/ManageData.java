/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Company;

/**
 *
 * @author Mathieu Stivanin
 * Classe permettant le la lecture et l'écriture d'un fichier CSV afin de manipuler les données présentes à l'intérieur.
 */
public interface ManageData {
    
    public void readData(Company c);
    
    public void writeData();
}
