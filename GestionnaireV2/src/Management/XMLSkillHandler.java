/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

/**
 * Classe permettant la lecture d'un fichier XML de missions.
 * @author MathieuSTIVANIN
 */

import API.Company;
import API.Skill;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLSkillHandler extends DefaultHandler {

   boolean bId = false;
   boolean bNameEn = false;
   boolean bNameFr = false;
   
   String id;
   String nameEn;
   String nameFr;
   Company c;
   
   /**
     * Constructeur de lecteur XML
     * @param c l'entreprise concernée
     */
   
   public XMLSkillHandler(Company c){
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

      if (qName.equalsIgnoreCase("idSkill")) {
          bId = true;
      } else if (qName.equalsIgnoreCase("nameEn")) {
         bNameEn = true;
      } else if (qName.equalsIgnoreCase("nameFr")) {
         bNameFr = true;
      }
   }
   
   /**
     * Classe permettant de créer une compétence avec les attributs récupérés à partir des balises existantes
     * @param uri
     * @param localName
     * @param qName
     * @throws SAXException 
     */

   @Override
   public void endElement(String uri, 
   String localName, String qName) throws SAXException {
      if (qName.equalsIgnoreCase("skill")) {
          Skill s = new Skill(id, nameEn, nameFr);
          c.addSkill(s);
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
      } else if (bNameEn) {
        nameEn = new String(ch, start, length);
        bNameEn = false;
      } else if (bNameFr) {
        nameFr = new String(ch, start, length);
        bNameFr = false;
      }

   }
   
}