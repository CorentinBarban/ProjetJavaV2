/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Interface;

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
        "Nom", "Prénom", "Date d'embauche", "Details"
    };
    private final Class[] columnClass = new Class[]{
        String.class, String.class, Date.class, String.class
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
        switch (columnIndex) {
            case 0:
                return row.getLastName();
            case 1:
                return row.getFirstName();
            case 2:
                return row.getDateOfHire();
            case 3:
                return "<html><i><u><b style='color:blue'>Détails</b></u></i></html>";
            default:
                break;
        }
        return null;
    }    
}


