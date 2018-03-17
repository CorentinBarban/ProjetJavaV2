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
import javax.swing.plaf.basic.BasicProgressBarUI;

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

        setUI(new BasicProgressBarUI() {
            protected Color getSelectionBackground() { return Color.black; }
            protected Color getSelectionForeground() { return Color.black; }
        });
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {

        switch ((Etat) value) {
            case enPreparation:
                setValue(25);
                setForeground(new Color(255,102,102));
                setBackground(Color.white);
                break;
            case plannifiee:
                setValue(50);
                setForeground(new Color(255,255,153));
                setBackground(Color.white);
                break;
            case enCours:
                setValue(75);
                setForeground(new Color(229,255,204));
                setBackground(Color.white);
                break;
            default:
                break;
        }
        return this;
    }
}
