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

/**
 *
 * @author MathieuSTIVANIN
 */
public class ViewHome extends javax.swing.JPanel {
        private final MyFrame homeFrame;
        private Company myCompany;
    /**
     * Creates new form ViewHomeNew
     * @param homeFrame
     * @param myCompany
     */
    public ViewHome(MyFrame homeFrame,Company myCompany) {
        this.homeFrame = homeFrame;
        this.myCompany = myCompany;
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

        jScrollContent = new javax.swing.JScrollPane();
        jScrollPerson = new javax.swing.JScrollPane();
        DefaultListModel<Person> model = new DefaultListModel();
        jListPerson = new javax.swing.JList<>();
        jScrollMission = new javax.swing.JScrollPane();
        DefaultListModel<Mission> modelMission = new DefaultListModel();
        jListMission = new javax.swing.JList<>();
        jPanelHeader = new javax.swing.JPanel();
        nameApplication = new javax.swing.JLabel();

        jListPerson.setModel(model);
        jListPerson.setCellRenderer(new personRenderer());
        Set entrySet = myCompany.listePerson.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry me =(Map.Entry)it.next();
            model.addElement(myCompany.listePerson.get(me.getKey()));
        }
        jScrollPerson.setViewportView(jListPerson);

        jListMission.setModel(modelMission);
        jListMission.setCellRenderer(new missionRenderer());
        Set entrySetMission = myCompany.listeMission.entrySet();
        Iterator itMission = entrySetMission.iterator();
        while (itMission.hasNext()){
            Map.Entry meMission =(Map.Entry)itMission.next();
            modelMission.addElement(myCompany.listeMission.get(meMission.getKey()));
        }
        jListMission.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListMission.setToolTipText("");
        jScrollMission.setViewportView(jListMission);

        jPanelHeader.setBackground(new java.awt.Color(153, 204, 255));

        nameApplication.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        nameApplication.setForeground(java.awt.Color.white);
        nameApplication.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameApplication.setText("Gestionnaire");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(nameApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameApplication)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollMission, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollContent)
                    .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPerson, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollMission, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollContent))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Mission> jListMission;
    private javax.swing.JList<Person> jListPerson;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollContent;
    private javax.swing.JScrollPane jScrollMission;
    private javax.swing.JScrollPane jScrollPerson;
    private javax.swing.JLabel nameApplication;
    // End of variables declaration//GEN-END:variables
}
