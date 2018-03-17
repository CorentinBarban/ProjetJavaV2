/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.NouvelleInterface;

import API.Mission.Etat;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author corentin
 */
class ProgressCellRenderer extends JProgressBar implements TableCellRenderer {

    ProgressCellRenderer() {

        super(JProgressBar.HORIZONTAL);
        setBorderPainted(false);
        setStringPainted(true);

    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {

        switch ((Etat) value) {
            case enPreparation:
                setValue(25);
                UIManager.put("nimbusOrange", new Color(255, 153, 0));
                break;
            case enCours:
                setValue(50);
                UIManager.put("nimbusOrange", new Color(255, 153, 0));
                break;
            case plannifiee:
                setValue(75);
                UIManager.put("nimbusOrange", new Color(51, 153, 51));
                break;
        }
        return this;
    }

}
