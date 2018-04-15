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
public class PersonToMissionTableModel extends AbstractTableModel {

    public final List<Person> personList;

    private final String[] columnNames = new String[]{
        "Nom", "Prénom", "Nombre de projet", "Ajouter"
    };
    private final Class[] columnClass = new Class[]{
        String.class, String.class, Integer.class , Boolean.class
    };

    public PersonToMissionTableModel(List<Person> personList) {
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
    public boolean isCellEditable(int row, int col) {
        if (col==3){
            return true;
        } else {
            return false;
        }
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person row = personList.get(rowIndex);
        if (0 == columnIndex) {
            return row.getLastName();
        } else if (1 == columnIndex) {
            return row.getFirstName();
        } else if (2 == columnIndex) {
            return row.getNbMissions();
        } else if (3 == columnIndex) {
             return false;
        } 
        return null;
    }    
}


