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
import java.text.ParseException;
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
   
   String id;
   String fName;
   String lName;
   String date;
   Company c;
   
   public XMLPersonHandler(Company c){
       this.c = c;
   }


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
      }
   }

   @Override
   public void endElement(String uri, 
   String localName, String qName) throws SAXException {
      if (qName.equalsIgnoreCase("person")) {
         try {
           Person p = new Person(Integer.parseInt(id), lName, fName, date);
           c.addPerson(p);
           
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
      } else if (bFirstName) {
        fName = new String(ch, start, length);
        bFirstName = false;
      } else if (bLastName) {
        lName = new String(ch, start, length);
        bLastName = false;
      } else if (bDate) {
        date = new String(ch, start, length);
        bDate = false;
      }
   }
}