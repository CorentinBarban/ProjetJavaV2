/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import API.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author MathieuSTIVANIN
 */
public class ViewHome extends javax.swing.JPanel {
        private final MyFrame homeFrame;
        private Company myCompany;
        private AddPerson ap;
        private ViewPerson vePerson;
        private AddMission am;
    /**
     * Creates new form ViewHomeNew
     * @param homeFrame
     * @param myCompany
     */
    public ViewHome(MyFrame homeFrame,Company myCompany) {
        this.homeFrame = homeFrame;
        this.myCompany = myCompany;
        initComponents();
        this.ap = new AddPerson(myCompany,jListPerson);
        this.am = new AddMission();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        nameApplication = new javax.swing.JLabel();
        jPanelLeft = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DefaultListModel<Person> modelPerson = new DefaultListModel();
        jListPerson = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        DefaultListModel<Mission> modelMission = new DefaultListModel();
        jListMission = new javax.swing.JList<>();
        jButtonAddMission = new javax.swing.JButton();
        jButtonAddPerson = new javax.swing.JButton();
        jPanelCenter = new javax.swing.JPanel();

        setBackground(java.awt.Color.white);
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanelHeader.setBackground(new java.awt.Color(153, 204, 255));

        nameApplication.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        nameApplication.setForeground(java.awt.Color.white);
        nameApplication.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameApplication.setText("Arès");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(nameApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameApplication)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLeft.setBackground(java.awt.Color.white);

        jScrollPane1.setBackground(java.awt.Color.white);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Personnes"));

        jListPerson.setModel(modelPerson);
        jListPerson.setCellRenderer(new GUI.PersonRenderer());
        Set entrySet = myCompany.listePerson.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry)it.next();
            modelPerson.addElement(myCompany.listePerson.get(me.getKey()));

        }
        jListPerson.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListPerson.setSelectionBackground(java.awt.Color.white);
        jListPerson.setValueIsAdjusting(true);
        jListPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListPersonMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jListPerson);

        jScrollPane2.setBackground(java.awt.Color.white);
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Missions"));

        jListMission.setModel(modelMission);
        jListMission.setCellRenderer(new GUI.MissionRenderer());
        Set entrySetMission = myCompany.listeMission.entrySet();
        Iterator itMission = entrySetMission.iterator();
        while (itMission.hasNext()) {
            Map.Entry meMission = (Map.Entry)itMission.next();
            modelMission.addElement(myCompany.listeMission.get(meMission.getKey()));

        }
        jScrollPane2.setViewportView(jListMission);

        jButtonAddMission.setText("Ajouter Mission");
        jButtonAddMission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMissionActionPerformed(evt);
            }
        });

        jButtonAddPerson.setText("Ajouter Personne");
        jButtonAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLeftLayout = new javax.swing.GroupLayout(jPanelLeft);
        jPanelLeft.setLayout(jPanelLeftLayout);
        jPanelLeftLayout.setHorizontalGroup(
            jPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftLayout.createSequentialGroup()
                .addGroup(jPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLeftLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButtonAddMission))
                    .addGroup(jPanelLeftLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButtonAddPerson)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelLeftLayout.createSequentialGroup()
                .addGroup(jPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelLeftLayout.setVerticalGroup(
            jPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddPerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddMission)
                .addGap(10, 10, 10))
        );

        jPanelCenter.setBackground(java.awt.Color.white);
        jPanelCenter.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPersonActionPerformed
        jPanelCenter.removeAll();
        jPanelCenter.add(ap);
        jPanelCenter.repaint();
        jPanelCenter.revalidate();
    }//GEN-LAST:event_jButtonAddPersonActionPerformed

    private void jButtonAddMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMissionActionPerformed
       jPanelCenter.removeAll();
        jPanelCenter.add(am);
        jPanelCenter.repaint();
        jPanelCenter.revalidate();
    }//GEN-LAST:event_jButtonAddMissionActionPerformed

    private void jListPersonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPersonMouseReleased
        JList<Person> theListPerson = (JList)evt.getSource();
        int index = theListPerson.locationToIndex(evt.getPoint());
        Person personSelected = theListPerson.getModel().getElementAt(index);
        this.vePerson = new ViewPerson(myCompany,personSelected,theListPerson);
        jPanelCenter.removeAll();
        jPanelCenter.add(vePerson);
        jPanelCenter.repaint();
        jPanelCenter.revalidate();
    }//GEN-LAST:event_jListPersonMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddMission;
    private javax.swing.JButton jButtonAddPerson;
    public javax.swing.JList<Mission> jListMission;
    public javax.swing.JList<Person> jListPerson;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelLeft;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameApplication;
    // End of variables declaration//GEN-END:variables
}
