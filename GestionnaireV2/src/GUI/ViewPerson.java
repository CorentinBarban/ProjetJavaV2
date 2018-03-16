/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import API.Company;
import API.Person;
import API.Skill;
import Management.ManageData;
import Management.ManagePerson;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author corentin
 */
public class ViewPerson extends javax.swing.JPanel {

    /**
     * Creates new form EditOrModPerson
     */
    private Person pSelected;
    private Company myCompany;
    private final JList<Person> myJlistPerson;
    
    public ViewPerson(Company c,Person pSelected, JList jListPerson) {
        this.pSelected=pSelected;
        this.myCompany=c;
        initComponents();
        this.myJlistPerson=jListPerson;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFormattedTextFieldDatePerson = new javax.swing.JFormattedTextField();
        jTextFieldNomPerson = new javax.swing.JTextField();
        jTextFieldPrenomPerson = new javax.swing.JTextField();
        jLabelDateEPerson = new javax.swing.JLabel();
        jLabelPrenomPerson = new javax.swing.JLabel();
        jLabeNomPerson = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DefaultListModel<Skill> modelMySkill = new DefaultListModel();
        jListMyskill = new javax.swing.JList<>();
        jButtonRemovePerson = new javax.swing.JButton();
        jButtonModify = new javax.swing.JButton();

        setBackground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(669, 332));

        jPanel1.setBackground(java.awt.Color.white);

        jFormattedTextFieldDatePerson.setEditable(false);
        jFormattedTextFieldDatePerson.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));
        jFormattedTextFieldDatePerson.setValue(pSelected.getDateOfHire());

        jTextFieldNomPerson.setText(pSelected.getFirstName());
        jTextFieldNomPerson.setEditable(false);

        jTextFieldPrenomPerson.setText(pSelected.getLastName());
        jTextFieldPrenomPerson.setEditable(false);

        jLabelDateEPerson.setText("Date d'embauche :");

        jLabelPrenomPerson.setText("Prenom: ");

        jLabeNomPerson.setText("Nom :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelDateEPerson)
                        .addComponent(jLabelPrenomPerson, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabeNomPerson))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPrenomPerson)
                    .addComponent(jFormattedTextFieldDatePerson, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jTextFieldNomPerson))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeNomPerson)
                    .addComponent(jTextFieldNomPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrenomPerson)
                    .addComponent(jTextFieldPrenomPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldDatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDateEPerson))
                .addContainerGap())
        );

        jPanel2.setBackground(java.awt.Color.white);

        jScrollPane1.setBackground(java.awt.Color.white);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Compétences"));

        jListMyskill.setModel(modelMySkill);
        jScrollPane1.setViewportView(jListMyskill);
        jListMyskill.setCellRenderer(new SkillRenderer());
        Set entrySetSkill = pSelected.getSkillList().entrySet();
        Iterator it = entrySetSkill.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry)it.next();
            modelMySkill.addElement(pSelected.getSkillList().get(me.getKey()));

        }
        jScrollPane1.setViewportView(jListMyskill);

        jButtonRemovePerson.setText("Supprimer");
        jButtonRemovePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovePersonActionPerformed(evt);
            }
        });

        jButtonModify.setText("Modifier");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRemovePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1)
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jButtonRemovePerson)
                .addGap(91, 91, 91)
                .addComponent(jButtonModify)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemovePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovePersonActionPerformed
        DefaultListModel<Person> myModel = (DefaultListModel<Person>) myJlistPerson.getModel();
        myModel.remove(myJlistPerson.getSelectedIndex());
        myCompany.listePerson.remove(pSelected.getId());
        ManageData mPerson = new ManagePerson();
        mPerson.writeData(myCompany);
    }//GEN-LAST:event_jButtonRemovePersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonModify;
    private javax.swing.JButton jButtonRemovePerson;
    private javax.swing.JFormattedTextField jFormattedTextFieldDatePerson;
    private javax.swing.JLabel jLabeNomPerson;
    private javax.swing.JLabel jLabelDateEPerson;
    private javax.swing.JLabel jLabelPrenomPerson;
    private javax.swing.JList<Skill> jListMyskill;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNomPerson;
    private javax.swing.JTextField jTextFieldPrenomPerson;
    // End of variables declaration//GEN-END:variables
}
