/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.NouvelleInterface;

import API.Requirement;
import API.Skill;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author corentin
 */
public class requirementRenderer extends JLabel implements ListCellRenderer<Requirement> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Requirement> list, Requirement requirementList, int index, boolean isSelected, boolean cellHasFocus) {
        this.setText(requirementList.getRequiredSkill().getSkillNameFr());
        
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
