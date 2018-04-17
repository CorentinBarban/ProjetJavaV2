/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.NouvelleInterface;

import API.Mission;
import API.Skill;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author MathieuSTIVANIN
 */
public class MissionRenderer extends JLabel implements ListCellRenderer<Mission> {

    public MissionRenderer() {
        setOpaque(true);
        setHorizontalAlignment(JLabel.LEFT);
        setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Mission> list, Mission m, int index, boolean isSelected, boolean cellHasFocus) {

        try {
            this.setText(m.getMissionName());
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
