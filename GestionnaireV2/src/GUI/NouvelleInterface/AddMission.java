/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.NouvelleInterface;

import API.Company;
import API.Person;
import API.Requirement;
import API.Skill;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author corentin
 */
public class AddMission extends javax.swing.JPanel {

    /**
     * Creates new form AddMission
     */
    private Company myCompany;
    private home myFrame;
    public AddMission(Company myCompany, home myFrame) {
        
        this.myCompany=myCompany;
        this.myFrame=myFrame;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader2 = new javax.swing.JPanel();
        jLabelTitle2 = new javax.swing.JLabel();
        jLabelReturn2 = new javax.swing.JLabel();
        jPanelContainerMission = new javax.swing.JPanel();
        jPanelLeftDetail = new javax.swing.JPanel();
        jLabelNameMission = new javax.swing.JLabel();
        jLabelFireDateMission = new javax.swing.JLabel();
        jLabelDurationMission = new javax.swing.JLabel();
        jLabelNbPersonMission = new javax.swing.JLabel();
        jLabelStateMission = new javax.swing.JLabel();
        jTextFieldNameMission = new javax.swing.JTextField();
        jTextFieldDurationMission = new javax.swing.JTextField();
        jTextFieldNbPersonMission = new javax.swing.JTextField();
        jFormattedTextFieldFireDate = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelRightDetail = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ArrayList<Person> PersonList = new ArrayList<Person>(myCompany.listePerson.values());
        jTablePerson = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ArrayList<Skill> SkillList = new ArrayList<Skill>(myCompany.listeSkill.values());
        jTableSkill = new javax.swing.JTable();
        jLabelSkill = new javax.swing.JLabel();
        jLabelPerson = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(246, 246, 246));

        jPanelHeader2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTitle2.setFont(new java.awt.Font("Roboto", 0, 40));
        jLabelTitle2.setForeground(new java.awt.Color(48, 51, 58));
        jLabelTitle2.setText("Ajouter une mission");

        jLabelReturn2.setFont(new java.awt.Font("Roboto", 0, 20));
        jLabelReturn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/ic_arrow_back_black_48dp.png"))); // NOI18N
        jLabelReturn2.setText("Retour");
        jLabelReturn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelReturn2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeader2Layout = new javax.swing.GroupLayout(jPanelHeader2);
        jPanelHeader2.setLayout(jPanelHeader2Layout);
        jPanelHeader2Layout.setHorizontalGroup(
            jPanelHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeader2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReturn2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(jLabelTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addGap(157, 157, 157))
        );
        jPanelHeader2Layout.setVerticalGroup(
            jPanelHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeader2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelReturn2)
                    .addComponent(jLabelTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelContainerMission.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContainerMission.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanelLeftDetail.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLeftDetail.setPreferredSize(new java.awt.Dimension(280, 424));

        jLabelNameMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNameMission.setText("Nom de la mission :");

        jLabelFireDateMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelFireDateMission.setText("Date de début :");

        jLabelDurationMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDurationMission.setText("Durée :");

        jLabelNbPersonMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNbPersonMission.setText("Nombre de personnes :");

        jLabelStateMission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelStateMission.setText("Etat de la mission :");

        jFormattedTextFieldFireDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "En préparation", "En cours", "Planifiée" }));
        jComboBox1.setEnabled(false);

        javax.swing.GroupLayout jPanelLeftDetailLayout = new javax.swing.GroupLayout(jPanelLeftDetail);
        jPanelLeftDetail.setLayout(jPanelLeftDetailLayout);
        jPanelLeftDetailLayout.setHorizontalGroup(
            jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNbPersonMission)
                    .addComponent(jLabelStateMission)
                    .addComponent(jLabelDurationMission)
                    .addComponent(jLabelFireDateMission)
                    .addComponent(jLabelNameMission))
                .addGap(10, 10, 10)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNameMission)
                    .addComponent(jTextFieldDurationMission)
                    .addComponent(jTextFieldNbPersonMission)
                    .addComponent(jFormattedTextFieldFireDate)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLeftDetailLayout.setVerticalGroup(
            jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftDetailLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNameMission)
                    .addComponent(jTextFieldNameMission, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFireDateMission)
                    .addComponent(jFormattedTextFieldFireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDurationMission)
                    .addComponent(jTextFieldDurationMission, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNbPersonMission)
                    .addComponent(jTextFieldNbPersonMission, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanelLeftDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStateMission)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanelRightDetail.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRightDetail.setPreferredSize(new java.awt.Dimension(280, 280));

        PersonToMissionTableModel modelPerson = new PersonToMissionTableModel(PersonList);
        jTablePerson.setModel(modelPerson);
        jTablePerson.setAutoCreateRowSorter(true);
        jTablePerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePersonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePerson);

        SkillToMissionTableModel skillModel = new SkillToMissionTableModel(SkillList);
        jTableSkill.setModel(skillModel);
        jTablePerson.setAutoCreateRowSorter(true);
        jScrollPane2.setViewportView(jTableSkill);

        jLabelSkill.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSkill.setText("Compétences :");

        jLabelPerson.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPerson.setText("Personnes :");

        javax.swing.GroupLayout jPanelRightDetailLayout = new javax.swing.GroupLayout(jPanelRightDetail);
        jPanelRightDetail.setLayout(jPanelRightDetailLayout);
        jPanelRightDetailLayout.setHorizontalGroup(
            jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                        .addComponent(jLabelPerson)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                        .addComponent(jLabelSkill)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelRightDetailLayout.createSequentialGroup()
                        .addGroup(jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(23, 23, 23))))
        );
        jPanelRightDetailLayout.setVerticalGroup(
            jPanelRightDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRightDetailLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabelSkill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(jLabelPerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContainerMissionLayout = new javax.swing.GroupLayout(jPanelContainerMission);
        jPanelContainerMission.setLayout(jPanelContainerMissionLayout);
        jPanelContainerMissionLayout.setHorizontalGroup(
            jPanelContainerMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerMissionLayout.createSequentialGroup()
                .addComponent(jPanelLeftDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRightDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelContainerMissionLayout.setVerticalGroup(
            jPanelContainerMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLeftDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
            .addComponent(jPanelRightDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
            .addGroup(jPanelContainerMissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Valider");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jPanelContainerMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanelContainerMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePersonMouseClicked
        PersonToMissionTableModel model = (PersonToMissionTableModel) jTablePerson.getModel();
        int row = jTablePerson.getSelectedRow();
        int col = jTablePerson.columnAtPoint(evt.getPoint());

    }//GEN-LAST:event_jTablePersonMouseClicked

    private void jLabelReturn2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReturn2MouseReleased
        myFrame.jPanelContainer.removeAll();
        myFrame.jPanelContainer.add(new MissionList(myCompany,myFrame));
        myFrame.repaint();
        myFrame.revalidate();
    }//GEN-LAST:event_jLabelReturn2MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextFieldFireDate;
    private javax.swing.JLabel jLabelDurationMission;
    private javax.swing.JLabel jLabelFireDateMission;
    private javax.swing.JLabel jLabelNameMission;
    private javax.swing.JLabel jLabelNbPersonMission;
    private javax.swing.JLabel jLabelPerson;
    public javax.swing.JLabel jLabelReturn2;
    private javax.swing.JLabel jLabelSkill;
    private javax.swing.JLabel jLabelStateMission;
    public javax.swing.JLabel jLabelTitle2;
    private javax.swing.JPanel jPanelContainerMission;
    private javax.swing.JPanel jPanelHeader2;
    private javax.swing.JPanel jPanelLeftDetail;
    private javax.swing.JPanel jPanelRightDetail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTablePerson;
    private javax.swing.JTable jTableSkill;
    private javax.swing.JTextField jTextFieldDurationMission;
    private javax.swing.JTextField jTextFieldNameMission;
    private javax.swing.JTextField jTextFieldNbPersonMission;
    // End of variables declaration//GEN-END:variables
}
