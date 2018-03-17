/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.NouvelleInterface;

import API.Person;
import API.Skill;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author maths
 */
public class PersonTableModel extends AbstractTableModel {
   
    public final List<Person> personList;

    private final String[] columnNames = new String[]{
        "Id", "Nom", "Prénom", "Date d'embauche", "Compétences", "Details"
    };
    private final Class[] columnClass = new Class[]{
        Integer.class, String.class, String.class, Date.class, Skill.class , String.class
    };

    public PersonTableModel(List<Person> personList) {
        this.personList = personList;
    }
    
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return personList.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person row = personList.get(rowIndex);
        if (0 == columnIndex) {
            return row.getId();
        } else if (1 == columnIndex) {
            return row.getLastName();
        } else if (2 == columnIndex) {
            return row.getFirstName();
        } else if (3 == columnIndex) {
            return row.getDateOfHire();
        } else if (4 == columnIndex) {
            // Besoin d'afficher le nom Fr du skill, et non le toString()
            List<Skill> skillsList = new ArrayList<Skill>(row.getSkillList().values());
            for (int i=0;i<skillsList.size();i++){
                return skillsList.get(i).getSkillNameFr();
            }
        } else if (5 == columnIndex) {
            return "Détails";
        }
        return null;
    }    
}


