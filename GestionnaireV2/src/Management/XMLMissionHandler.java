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
import API.Requirement;
import java.text.ParseException;
import java.util.ArrayList;
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
   boolean bPerson = false;
   boolean bReq = false;
   boolean bSkillReq = false;
   boolean bPersonReq = false;
   
   String id;
   String name;
   String duration;
   String startDate;
   Etat state;
   String idPerson;
   String idReq;
   String idSkillReq;
   String idPersonReq;
   ArrayList <String> listIdPersons = new ArrayList<>();
   ArrayList <Integer> listIdRequirements = new ArrayList<>();
   ArrayList <String> listIdPersonsReq = new ArrayList<>();
   ArrayList <String> listIdSkillsReq = new ArrayList<>();
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
      } else if (qName.equalsIgnoreCase("idPerson")) {
         bPerson = true;
      } else if (qName.equalsIgnoreCase("idRequirement")) {
         bReq = true;
      } else if (qName.equalsIgnoreCase("idPersonReq")) {
         bPersonReq = true;
      } else if (qName.equalsIgnoreCase("idSkillReq")) {
         bSkillReq = true;
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
           for (int i=0; i<listIdPersons.size();i++){
                m.addPerson(c.listePerson.get(listIdPersons.get(i)));
           }
           listIdPersons.removeAll(listIdPersons);
           
           for (int i=0; i<listIdRequirements.size();i++){
              Requirement r = new Requirement(listIdRequirements.get(i), listIdPersonsReq.size(), c.listeSkill.get(listIdSkillsReq.get(i)));
              for(int y=0; y<listIdPersonsReq.size(); y++){
                  try {
                      r.addPerson(c.listePerson.get(listIdPersonsReq.get(y)));
                      //System.out.println("Suppression "+listIdSkillsReq.get(i)+" "+y+ " : "+listIdPersonsReq.get(y));
                      listIdPersonsReq.remove(y);
                  } catch (Exception ex) {
                      Logger.getLogger(XMLMissionHandler.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
              m.addRequirement(r);
           }
           listIdRequirements.removeAll(listIdRequirements);
           listIdPersonsReq.removeAll(listIdPersonsReq);

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
      } else if (bPerson) {
        idPerson = new String(ch, start, length);
        bPerson = false;
        listIdPersons.add(idPerson);
      } else if (bReq) {
        idReq = new String(ch, start, length);
        bReq = false;
        listIdRequirements.add(Integer.parseInt(idReq));        
      } else if (bSkillReq) {
        idSkillReq = new String(ch, start, length);
        bSkillReq = false;
        listIdSkillsReq.add(idSkillReq);
      } else if (bPersonReq) {
        idPersonReq = new String(ch, start, length);
        bPersonReq = false;
        listIdPersonsReq.add(idPersonReq);
      }
   }
}