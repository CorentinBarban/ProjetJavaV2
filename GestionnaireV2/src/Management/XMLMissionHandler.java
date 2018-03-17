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
import API.Mission;
import API.Mission.Etat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLMissionHandler extends DefaultHandler {

   boolean bDuration = false;
   boolean bName = false;
   boolean bId = false;
   boolean bDate = false;
   boolean bState = false;
   
   String id;
   String name;
   String duration;
   String startDate;
   Etat state;
   Company c;
   
   public XMLMissionHandler(Company c){
       this.c = c;
   }


   @Override
   public void startElement(String uri, 
   String localName, String qName, Attributes attributes) throws SAXException {

      if (qName.equalsIgnoreCase("id")) {
          bId = true;
      } else if (qName.equalsIgnoreCase("name")) {
         bName = true;
      } else if (qName.equalsIgnoreCase("startDate")) {
         bDate = true;
      } else if (qName.equalsIgnoreCase("duration")) {
         bDuration = true;
      } else if (qName.equalsIgnoreCase("state")) {
         bState = true;
      }
   }

   @Override
   public void endElement(String uri, 
   String localName, String qName) throws SAXException {
      if (qName.equalsIgnoreCase("mission")) {
         try {
             
           Mission m = new Mission(Integer.parseInt(id), name, startDate, Integer.parseInt(duration),state);
           m.setEtat(state);
           c.addMission(m);
           
       } catch (ParseException ex) {
           
           Logger.getLogger(XMLPersonHandler.class.getName()).log(Level.SEVERE, null, ex);
       }
      }
   }

   @Override
   public void characters(char ch[], int start, int length) throws SAXException {
      
       if (bId) {
        id = new String(ch, start, length);
        bId = false;
      } else if (bName) {
        name = new String(ch, start, length);
        bName = false;
      } else if (bDate) {
        startDate = new String(ch, start, length);
        bDate = false;
      } else if (bDuration) {
        duration = new String(ch, start, length);
        bDuration = false;
      } else if (bState) {
        state = Etat.valueOf(new String(ch, start, length));
        bState = false;
      }
   }
}