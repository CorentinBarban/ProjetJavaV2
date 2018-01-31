/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author corentin
 */
public class ViewAddMission extends javax.swing.JPanel {

    /**
     * Creates new form ViewAddMission
     */
    public ViewAddMission() {
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

        viewAddMission = new javax.swing.JPanel();
        EnteteAddMission = new javax.swing.JPanel();
        labelAddMission = new javax.swing.JLabel();
        corpsAddMission = new javax.swing.JPanel();
        jPanelUpperAddMission = new javax.swing.JPanel();
        jPanelUpLeft = new javax.swing.JPanel();
        jLabelMissionName = new javax.swing.JLabel();
        jLabelMissionStartDate = new javax.swing.JLabel();
        jTextFieldMissionStartDate = new javax.swing.JTextField();
        jTextFieldMissionName = new javax.swing.JTextField();
        jPanelUpRight = new javax.swing.JPanel();
        jPanelLowerAddMission = new javax.swing.JPanel();
        jButtonAnnuler = new javax.swing.JButton();
        jButtonAjouter = new javax.swing.JButton();

        viewAddMission.setBackground(java.awt.Color.white);
        viewAddMission.setPreferredSize(new java.awt.Dimension(788, 554));

        EnteteAddMission.setBackground(new java.awt.Color(45, 118, 232));

        labelAddMission.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        labelAddMission.setForeground(java.awt.Color.white);
        labelAddMission.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddMission.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/play-outlined-button-of-two-triangles.png"))); // NOI18N
        labelAddMission.setText("Ajouter une mission");

        javax.swing.GroupLayout EnteteAddMissionLayout = new javax.swing.GroupLayout(EnteteAddMission);
        EnteteAddMission.setLayout(EnteteAddMissionLayout);
        EnteteAddMissionLayout.setHorizontalGroup(
            EnteteAddMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAddMission, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        EnteteAddMissionLayout.setVerticalGroup(
            EnteteAddMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAddMission, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );

        corpsAddMission.setBackground(java.awt.Color.white);

        jPanelUpperAddMission.setBackground(java.awt.Color.white);

        jLabelMissionName.setText("Nom de la mission");

        jLabelMissionStartDate.setText("Date de début");

        jTextFieldMissionStartDate.setText("jTextField1");

        jTextFieldMissionName.setText("jTextField1");

        javax.swing.GroupLayout jPanelUpLeftLayout = new javax.swing.GroupLayout(jPanelUpLeft);
        jPanelUpLeft.setLayout(jPanelUpLeftLayout);
        jPanelUpLeftLayout.setHorizontalGroup(
            jPanelUpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUpLeftLayout.createSequentialGroup()
                        .addComponent(jLabelMissionName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldMissionName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUpLeftLayout.createSequentialGroup()
                        .addComponent(jLabelMissionStartDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldMissionStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelUpLeftLayout.setVerticalGroup(
            jPanelUpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMissionName)
                    .addComponent(jTextFieldMissionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelUpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMissionStartDate)
                    .addComponent(jTextFieldMissionStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelUpRightLayout = new javax.swing.GroupLayout(jPanelUpRight);
        jPanelUpRight.setLayout(jPanelUpRightLayout);
        jPanelUpRightLayout.setHorizontalGroup(
            jPanelUpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelUpRightLayout.setVerticalGroup(
            jPanelUpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelUpperAddMissionLayout = new javax.swing.GroupLayout(jPanelUpperAddMission);
        jPanelUpperAddMission.setLayout(jPanelUpperAddMissionLayout);
        jPanelUpperAddMissionLayout.setHorizontalGroup(
            jPanelUpperAddMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpperAddMissionLayout.createSequentialGroup()
                .addComponent(jPanelUpLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelUpRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelUpperAddMissionLayout.setVerticalGroup(
            jPanelUpperAddMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelUpLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelUpRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButtonAnnuler.setText("Annuler");

        jButtonAjouter.setText("Ajouter");

        javax.swing.GroupLayout jPanelLowerAddMissionLayout = new javax.swing.GroupLayout(jPanelLowerAddMission);
        jPanelLowerAddMission.setLayout(jPanelLowerAddMissionLayout);
        jPanelLowerAddMissionLayout.setHorizontalGroup(
            jPanelLowerAddMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLowerAddMissionLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButtonAnnuler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAjouter)
                .addGap(136, 136, 136))
        );
        jPanelLowerAddMissionLayout.setVerticalGroup(
            jPanelLowerAddMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLowerAddMissionLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelLowerAddMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnuler)
                    .addComponent(jButtonAjouter))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout corpsAddMissionLayout = new javax.swing.GroupLayout(corpsAddMission);
        corpsAddMission.setLayout(corpsAddMissionLayout);
        corpsAddMissionLayout.setHorizontalGroup(
            corpsAddMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpsAddMissionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(corpsAddMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelUpperAddMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLowerAddMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        corpsAddMissionLayout.setVerticalGroup(
            corpsAddMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpsAddMissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelUpperAddMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLowerAddMission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout viewAddMissionLayout = new javax.swing.GroupLayout(viewAddMission);
        viewAddMission.setLayout(viewAddMissionLayout);
        viewAddMissionLayout.setHorizontalGroup(
            viewAddMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EnteteAddMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(corpsAddMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        viewAddMissionLayout.setVerticalGroup(
            viewAddMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAddMissionLayout.createSequentialGroup()
                .addComponent(EnteteAddMission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corpsAddMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(viewAddMission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(viewAddMission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EnteteAddMission;
    private javax.swing.JPanel corpsAddMission;
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JLabel jLabelMissionName;
    private javax.swing.JLabel jLabelMissionStartDate;
    private javax.swing.JPanel jPanelLowerAddMission;
    private javax.swing.JPanel jPanelUpLeft;
    private javax.swing.JPanel jPanelUpRight;
    private javax.swing.JPanel jPanelUpperAddMission;
    private javax.swing.JTextField jTextFieldMissionName;
    private javax.swing.JTextField jTextFieldMissionStartDate;
    private javax.swing.JLabel labelAddMission;
    private javax.swing.JPanel viewAddMission;
    // End of variables declaration//GEN-END:variables
}
