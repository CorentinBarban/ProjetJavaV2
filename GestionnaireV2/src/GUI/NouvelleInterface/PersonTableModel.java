/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.NouvelleInterface;

import API.Mission;
import API.Person;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author maths
 */
public class PersonTableModel extends AbstractTableModel {
   
    public final List<Person> personList;

    private final String[] columnNames = new String[]{
        "Id", "Nom", "Prénom", "Date d'embauche", "Details"
    };
    private final Class[] columnClass = new Class[]{
        Integer.class, String.class, String.class, Date.class, String.class
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
        }
        return null;
    }    
}


