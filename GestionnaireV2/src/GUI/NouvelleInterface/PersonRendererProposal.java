/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.NouvelleInterface;
import API.Person;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author corentin
 */
public class PersonRendererProposal extends JLabel implements ListCellRenderer<Person> {
    
    public PersonRendererProposal() {
        setOpaque(true);
    }
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Person> list, Person person, int index,boolean isSelected, boolean cellHasFocus) {
        setText(person.getFirstName()+" "+person.getLastName()+" | Nombre de missions :"+person.getNbMissions());
        if (isSelected) {
            setBackground(Color.LIGHT_GRAY);
            setForeground(Color.BLACK);            
        } else {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }
        return this;
    }    
}
