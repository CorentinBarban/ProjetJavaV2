/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

/**
 * Classe permettant la lecture d'un fichier XML de personnes.
 * @author MathieuSTIVANIN
 */

import API.Company;
import API.Person;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLPersonHandler extends DefaultHandler {

   boolean bFirstName = false;
   boolean bLastName = false;
   boolean bId = false;
   boolean bDate = false;
   boolean bSkill = false;
   boolean bMission = false;
   
   String id;
   String fName;
   String lName;
   String date;
   String idSkill;
   int idMission;
   ArrayList <String> listIdSkills = new ArrayList<>();
    ArrayList<Integer> listIdMissions = new ArrayList<>();
   Company c;
   
   /**
     * Constructeur de lecteur XML
     * @param c l'entreprise concernée
     */
   
   public XMLPersonHandler(Company c){
       this.c = c;
   }
   
    /**
     * Classe permettant de récupérer les balises présentes dans le fichier XML
     * @param uri
     * @param localName
     * @param qName
     * @param attributes
     * @throws SAXException 
     */


   @Override
   public void startElement(String uri, 
   String localName, String qName, Attributes attributes) throws SAXException {

      if (qName.equalsIgnoreCase("id")) {
          bId = true;
      } else if (qName.equalsIgnoreCase("firstName")) {
         bFirstName = true;
      } else if (qName.equalsIgnoreCase("lastName")) {
         bLastName = true;
      } else if (qName.equalsIgnoreCase("dateOfHire")) {
         bDate = true;
      } else if (qName.equalsIgnoreCase("idSkill")) {
         bSkill = true;
      } else if (qName.equalsIgnoreCase("idMission")){
          bMission = true;
      }
   }
   
   /**
     * Classe permettant de créer une personne avec les attributs récupérés à partir des balises existantes
     * @param uri
     * @param localName
     * @param qName
     * @throws SAXException 
     */

   @Override
   public void endElement(String uri, 
   String localName, String qName) throws SAXException {
      if (qName.equalsIgnoreCase("person")) {
         try {
           Person p = new Person(Integer.parseInt(id), lName, fName, date);
           c.addPerson(p);
           for (int i=0; i<listIdSkills.size();i++){
                p.addSkill(c.listeSkill.get(listIdSkills.get(i)));
           }

           listIdSkills.removeAll(listIdSkills);

         } catch (ParseException ex) {
           Logger.getLogger(XMLPersonHandler.class.getName()).log(Level.SEVERE, null, ex);
         }
      }
   }
   
   /**
     * Méthode permettant de récupérer les données contenues dans les balises existantes.
     * @param ch
     * @param start
     * @param length
     * @throws SAXException 
     */

   @Override
   public void characters(char ch[], int start, int length) throws SAXException {
      
       if (bId) {
        id = new String(ch, start, length);
        bId = false;
      } else if (bFirstName) {
        fName = new String(ch, start, length);
        bFirstName = false;
      } else if (bLastName) {
        lName = new String(ch, start, length);
        bLastName = false;
      } else if (bDate) {
        date = new String(ch, start, length);
        bDate = false;
      } else if (bSkill) {
        idSkill = new String(ch, start, length);
        bSkill = false;
        listIdSkills.add(idSkill);
      } else if (bMission) {
        idMission = Integer.parseInt(new String(ch, start, length));
        bMission = false;
        listIdMissions.add(idMission);
      }
   }
}