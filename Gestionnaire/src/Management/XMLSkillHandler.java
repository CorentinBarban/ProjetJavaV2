/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

/**
 *
 * @author MathieuSTIVANIN
 */
import API.Company;
import API.Person;
import API.Skill;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
   
   public XMLSkillHandler(Company c){
       this.c = c;
   }


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

   @Override
   public void endElement(String uri, 
   String localName, String qName) throws SAXException {
      if (qName.equalsIgnoreCase("skill")) {
          Skill s = new Skill(id, nameFr, nameEn);
          c.addSkill(s);
      }
   }

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