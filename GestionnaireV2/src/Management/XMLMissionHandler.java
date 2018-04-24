/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

/**
 * Classe permettant la lecture d'un fichier XML de compétences.
 * @author MathieuSTIVANIN
 */
import API.Company;
import API.Mission;
import API.Mission.Etat;
import API.Person;
import API.Requirement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    boolean bNbTotReq = false;
    boolean bNbTotMission = false;
    boolean check = false; // Boolean permettant de savoir si toutes les infos de la mission sont renseignées

    String id;
    String name;
    String duration;
    String startDate;
    Etat state;
    String idPerson;
    String idReq;
    String idSkillReq;
    String idPersonReq;
    String nbTotalReq;
    String nbTotalMission;
    HashMap<String, List<String>> listNbTotal = new HashMap();
    ArrayList<String> listIdPersons = new ArrayList<>();
    ArrayList<Integer> listIdRequirements = new ArrayList<>();
    HashMap<String, List<String>> listIdPersonsReq = new HashMap();
    ArrayList<String> listIdSkillsReq = new ArrayList<>();
    Company c;
    /**
     * Constructeur de lecteur XML
     * @param c l'entreprise concernée
     */

    public XMLMissionHandler(Company c) {
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
        } else if (qName.equalsIgnoreCase("nbPersonTotalReq")) {
            bNbTotReq = true;
        } else if (qName.equalsIgnoreCase("nbPersonOnMission")) {
            bNbTotMission = true;
        } 
    }
    /**
     * Classe permettant de créer une mission avec les attributs récupérés à partir des balises existantes
     * @param uri
     * @param localName
     * @param qName
     * @throws SAXException 
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("mission")) {
            try {
                Mission m = new Mission(Integer.parseInt(id), name, startDate, Integer.parseInt(duration), state);
                m.setNbTotalPerson(Integer.parseInt(nbTotalMission));
                c.addMission(m);
                for (int i = 0; i < listIdPersons.size(); i++) {
                    //Ajout de la personne sur la mission
                    Person p = c.listePerson.get(listIdPersons.get(i));
                    m.addPerson(p);
                    //Incremente le nombre de missions de la personne
                    p.setNbMissions(p.getNbMissions()+1);
                }
                
                listIdPersons.removeAll(listIdPersons);
                int i =0;
                for (Map.Entry element : listIdPersonsReq.entrySet()) {
                    Requirement r = new Requirement(Integer.parseInt(""+element.getKey()), Integer.parseInt(listNbTotal.get(element.getKey()).get(0)) , c.listeSkill.get(listIdSkillsReq.get(i)));
                    List current = listIdPersonsReq.get(element.getKey());
                    for (int y = 0; y < current.size(); y++) {
                        r.addPerson(c.listePerson.get(current.get(y)));
                    }
                    m.addRequirement(r);
                    i++;
                }
                listIdRequirements.clear();
                listIdPersonsReq.clear();
                listNbTotal.clear();
                m.verification();
            } catch (ParseException ex) {
                Logger.getLogger(XMLPersonHandler.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(XMLMissionHandler.class.getName()).log(Level.SEVERE, null, ex);
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
            listIdPersonsReq.put(idReq, new ArrayList());
            listNbTotal.put(idReq, new ArrayList());
        } else if (bSkillReq) {
            idSkillReq = new String(ch, start, length);
            bSkillReq = false;
            listIdSkillsReq.add(idSkillReq);
        } else if (bPersonReq) {
            idPersonReq = new String(ch, start, length);
            bPersonReq = false;
            listIdPersonsReq.get(idReq).add(idPersonReq);
        } else if (bNbTotReq) {
            nbTotalReq = new String(ch, start, length);
            bNbTotReq = false;
            listNbTotal.get(idReq).add(nbTotalReq);
        } else if (bNbTotMission) {
            nbTotalMission = new String(ch, start, length);
            bNbTotMission = false;
        } else if (id != null && name != null && startDate != null && duration != null && state != null && idPerson != null && idReq != null && idSkillReq != null && idPersonReq != null && nbTotalReq != null && nbTotalMission != null){
            check = true;
        }
    }
}
