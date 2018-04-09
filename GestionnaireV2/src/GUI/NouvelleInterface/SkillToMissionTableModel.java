package GUI.NouvelleInterface;


import API.Skill;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author corentin
 */
public class SkillToMissionTableModel extends AbstractTableModel {

    public final List<Skill> skillList;

    private final String[] columnNames = new String[]{
        "Compétences", "Ajouter"
    };
    private final Class[] columnClass = new Class[]{
       String.class, String.class
    };

    public SkillToMissionTableModel(List<Skill> skillList) {
        this.skillList = skillList;
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
        return skillList.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Skill row = skillList.get(rowIndex);
        if (0 == columnIndex) {
            return row.getSkillNameFr();
        } 
        else if (1 == columnIndex) {
            return null;
        }
        return null;
    }
}
 