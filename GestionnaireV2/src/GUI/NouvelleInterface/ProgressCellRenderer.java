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
        setBackground(Color.red);
        setForeground(Color.BLUE);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {

        switch ((Etat) value) {
            case enPreparation:
                setValue(25);
                break;
            case enCours:
                setValue(50);
                break;
            case plannifiee:
                setValue(75);
                break;
        }
        return this;
    }
}
