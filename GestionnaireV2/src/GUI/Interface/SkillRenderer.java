/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Interface;

import API.Skill;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author corentin
 */
public class SkillRenderer extends JLabel implements ListCellRenderer<Skill> {

    public SkillRenderer() {
        setOpaque(true);
        setHorizontalAlignment(JLabel.LEFT);
        setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Skill> list, Skill skillList, int index, boolean isSelected, boolean cellHasFocus) {

        try {
            this.setText(skillList.getSkillNameFr());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
