/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.prop.presentacio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author oriol
 */
public class ConclusionsAutomatiques extends javax.swing.JPanel {

    private ControladorPresentacioEstudis controladorEstudis;
    private DefaultListModel mAparicions;
    private DefaultListModel mRepeticions;
    private DefaultListModel mMalalts;

    public ConclusionsAutomatiques(ControladorPresentacioEstudis controladorEstudis,
            List<String> aparicions, List<String> repeticions, String[][] malaltons) {

        this.controladorEstudis = controladorEstudis;

        initComponents();

        String[] pacients = new String[malaltons.length - 1];
        for (int i = 1; i < malaltons.length; i++) {
            pacients[i - 1] = malaltons[i][0] + "->";
        }
        for (int i = 1; i < malaltons.length; i++) {
            for (int j = 1; j < malaltons[0].length; j++) {
                if (malaltons[i][j] != null && malaltons[i][j].equals("true")) {
                    pacients[i - 1] += malaltons[0][j] + ",";
                }
            }
        }
        List<String> malalts = new ArrayList<String>();
        for (int i = 0; i < pacients.length; i++) {
            if (pacients[i].charAt(pacients[i].length() - 1) != '>') {
                malalts.add(pacients[i].substring(0, pacients[i].length() - 1));
            }
        }

        mMalalts = new DefaultListModel();
        for (int i = 0; i < malalts.size(); i++) {
            mMalalts.addElement(malalts.get(i));
        }

        mAparicions = new DefaultListModel();
        for (int i = 0; i < aparicions.size(); i++) {
            String ap = aparicions.get(i);
            mAparicions.addElement(ap.substring(0, ap.indexOf(":")).trim());
        }

        mRepeticions = new DefaultListModel();
        for (int i = 0; i < repeticions.size(); i++) {
            String rep = repeticions.get(i);
            mRepeticions.addElement(rep.substring(0, rep.indexOf(":")).trim());
        }

        jListLlistes.setModel(mAparicions);
        jListMalalts.setModel(mMalalts);



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListLlistes = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListMalalts = new javax.swing.JList();
        jRadioButtonAparicions = new javax.swing.JRadioButton();
        jRadioButtonRepeticions = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        jListLlistes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListLlistes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListLlistesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListLlistes);

        jListMalalts.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Malalties potencials per pacient", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        jListMalalts.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListMalalts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMalaltsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jListMalalts);

        buttonGroup1.add(jRadioButtonAparicions);
        jRadioButtonAparicions.setSelected(true);
        jRadioButtonAparicions.setText("Quantitat de seqüències on surt");
        jRadioButtonAparicions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAparicionsActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonRepeticions);
        jRadioButtonRepeticions.setText("Nombre d'aparicions per seqüència  ");
        jRadioButtonRepeticions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRepeticionsActionPerformed(evt);
            }
        });

        jLabel1.setText("Signals potencials ordenats segons:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jRadioButtonRepeticions)
                    .addComponent(jRadioButtonAparicions)
                    .addComponent(jLabel1)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jRadioButtonAparicions, jRadioButtonRepeticions});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jRadioButtonAparicions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonRepeticions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonAparicionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAparicionsActionPerformed
        jListLlistes.setModel(mAparicions);
    }//GEN-LAST:event_jRadioButtonAparicionsActionPerformed

    private void jRadioButtonRepeticionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRepeticionsActionPerformed
        jListLlistes.setModel(mRepeticions);
    }//GEN-LAST:event_jRadioButtonRepeticionsActionPerformed

    private void jListMalaltsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListMalaltsMouseClicked
        if (evt.getClickCount() == 2) {
            String title;
            String msg;
            int optionType;
            int msgType;
            int index = jListMalalts.getSelectedIndex();
            String pacientMalalt = (String) mMalalts.get(index);
            title = "Guardar associació";
            msg = "Associació proposada: " + pacientMalalt + "\nVols guardar aquesta associació?";
            optionType = JOptionPane.YES_NO_OPTION;
            msgType = JOptionPane.QUESTION_MESSAGE;
            int opcio = JOptionPane.showConfirmDialog(this, msg, title, optionType, msgType);
            if (opcio == JOptionPane.NO_OPTION) {
                return;
            }

            String pacient = pacientMalalt.substring(0, pacientMalalt.indexOf("->"));
            pacientMalalt = pacientMalalt.substring(pacientMalalt.indexOf("->") + 2, pacientMalalt.length());
            List<String> mals = new ArrayList<String>();
            String mal;
            while (!pacientMalalt.equals("")) {
                if (pacientMalalt.indexOf(",") != -1) {
                    mal = pacientMalalt.substring(0, pacientMalalt.indexOf(","));
                    pacientMalalt = pacientMalalt.substring(pacientMalalt.indexOf(",") + 1, pacientMalalt.length());
                } else {
                    mal = pacientMalalt.substring(0, pacientMalalt.length());
                    pacientMalalt = "";
                }
                mals.add(mal);
            }
            controladorEstudis.afegirMalalties(pacient, mals);
        }

    }//GEN-LAST:event_jListMalaltsMouseClicked

    private void jListLlistesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListLlistesMouseClicked
        if (evt.getClickCount() == 2) {
            int index = jListLlistes.getSelectedIndex();
            String patro = (String) jListLlistes.getModel().getElementAt(index);
            String title;
            String msg;
            int optionType;
            int msgType;
            title = "Guardar patró";
            msg = "Guardar nou patró : " + patro + "\nVols associar-lo a una nova malaltia?";
            optionType = JOptionPane.YES_NO_CANCEL_OPTION;
            msgType = JOptionPane.QUESTION_MESSAGE;
            int opcio = JOptionPane.showConfirmDialog(this, msg, title, optionType, msgType);
            if (opcio == JOptionPane.CANCEL_OPTION) {
                return;
            }

            // crear sequencia patro
            controladorEstudis.novaSequencia(patro);

            if (opcio == JOptionPane.YES_OPTION) {
                title = "Nova malaltia";
                msg = "Introdueix el nom de la nova malaltia que vols associar al patró:";
                msgType = JOptionPane.DEFAULT_OPTION;
                String malaltia = JOptionPane.showInputDialog(this, msg, title, msgType);
                // crear malaltia i associarli la nova sequencia
                controladorEstudis.novaMalaltiaAmbSequencia(malaltia, patro);
            }
        }
    }//GEN-LAST:event_jListLlistesMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jListLlistes;
    private javax.swing.JList jListMalalts;
    private javax.swing.JRadioButton jRadioButtonAparicions;
    private javax.swing.JRadioButton jRadioButtonRepeticions;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
