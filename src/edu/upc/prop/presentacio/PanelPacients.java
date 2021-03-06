package edu.upc.prop.presentacio;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class PanelPacients extends javax.swing.JPanel {

    private DefaultListModel llistaPacients;
    private ControladorPresentacioPacients controladorPacients;
    private ControladorPresentacioSimptomes controladorSimptomes;
    private ControladorPresentacioMalalties controladorMalalties;
    private PanelPacientConsulta panelConsulta;
    private PanelPacientDades panelDades;
    private boolean modificant;
    private int indexActual;

    public PanelPacients(ControladorPresentacioPacients controladorPacients,
            ControladorPresentacioSimptomes controladorSimptomes, ControladorPresentacioMalalties controladorMalalties) {
        this.controladorPacients = controladorPacients;
        this.controladorMalalties = controladorMalalties;
        this.controladorSimptomes = controladorSimptomes;
        this.controladorPacients.setPanelPacients(this);

        llistaPacients = new DefaultListModel();

        initComponents();

        jListPacients.setModel(llistaPacients);

        omplirModel();

        modificant = false;
        indexActual = -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListPacients = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        jListPacients.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListPacients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPacientsMouseClicked(evt);
            }
        });
        jListPacients.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListPacientsKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jListPacients);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jListPacientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPacientsMouseClicked
        canviaPacient();
    }//GEN-LAST:event_jListPacientsMouseClicked

    private void jListPacientsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListPacientsKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            canviaPacient();
        }
    }//GEN-LAST:event_jListPacientsKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jListPacients;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public boolean nouPacient() {
        if (modificant) {
            String msg = "Si crees un nou Pacient sense guardar, es descartaran els canvis actuals. Vols continuar?";
            String title = "No has guardat els canvis!";
            int optionType = JOptionPane.OK_CANCEL_OPTION;
            int msgType = JOptionPane.QUESTION_MESSAGE;
            int opcio = JOptionPane.showConfirmDialog(this, msg, title, optionType, msgType);
            if (opcio == JOptionPane.CANCEL_OPTION) {
                return false;
            }
        }

        jPanel2.removeAll();
        jListPacients.clearSelection();
        indexActual = -1;
        panelDades = new PanelPacientDades(controladorPacients, controladorSimptomes,
                controladorMalalties, true);
        jPanel2.add(panelDades);
        touch();
        return true;
    }

    public boolean modificarPacient() {
        jPanel2.removeAll();

        int index = jListPacients.getSelectedIndex();
        if (index != -1) {
            String pacient = getDni(index);
            panelDades = new PanelPacientDades(controladorPacients, controladorSimptomes,
                    controladorMalalties, pacient, false);
            jPanel2.add(panelDades);
            indexActual = index;
            touch();
            return true;
        } else {
            String msg = "Has de seleccionar un pacient";
            String title = "Modificació pacient";
            JOptionPane.showMessageDialog(this, msg, title, JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean esborraPacient() {
        int index = jListPacients.getSelectedIndex();
        String title = "Esborrar pacient";
        String msg;

        if (index != -1) {
            msg = "Segur que vols esborrar el pacient seleccionat";
            int option = JOptionPane.showConfirmDialog(this, msg, title, JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                controladorPacients.esborrarPacient(getDni(index));
                llistaPacients.remove(index);

                jPanel2.removeAll();
                jListPacients.clearSelection();
                indexActual = -1;
                modificant = false;
                touch();
                return true;
            }
        } else {
            msg = "Ha de seleccionar un pacient";
            JOptionPane.showMessageDialog(this, msg, title, JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public boolean seleccioBuida() {
        return jListPacients.isSelectionEmpty();
    }

    public void redibuixar(String dni, boolean forcePaint) {
        if (!forcePaint) {
            llistaPacients.addElement(controladorPacients.getDniNomCognomPacient(dni));
        } else {
            refresh();
            omplirModel();
        }
    }

    public void seleccionaPacient(String dni) {
        jPanel2.removeAll();
        indexActual = quinIndex(dni);
        jListPacients.setSelectedIndex(indexActual);
        panelConsulta = new PanelPacientConsulta(dni, controladorPacients);
        jPanel2.add(panelConsulta);
        modificant = false;

        controladorPacients.enableButtonsMainForm();
        touch();
    }

    public void cancelar() {
        jPanel2.removeAll();

        int index = jListPacients.getSelectedIndex();
        if (index != -1) {
            String pacient = getDni(index);
            panelConsulta = new PanelPacientConsulta(pacient, controladorPacients);
            jPanel2.add(panelConsulta);
            controladorPacients.enableButtonsMainForm();
        }
        modificant = false;
        indexActual = index;
        touch();
    }

    public void refresh() {
        omplirModel();
    }

    private void touch() {
        jPanel2.revalidate();
        jPanel2.repaint();
    }

    private String getDni(int index) {
        String pac = (String) jListPacients.getModel().getElementAt(index);
        return pac.substring(0, pac.indexOf(":"));
    }

    private void canviaPacient() {
        int index = jListPacients.getSelectedIndex();
        if (index != -1) {
            if (modificant && index != indexActual) {
                String msg = "Si consultes un altre Pacient sense guardar, es descartaran els canvis actuals. Vols continuar?";
                String title = "No has guardat els canvis!";
                int optionType = JOptionPane.OK_CANCEL_OPTION;
                int msgType = JOptionPane.QUESTION_MESSAGE;
                int opcio = JOptionPane.showConfirmDialog(this, msg, title, optionType, msgType);
                if (opcio == JOptionPane.CANCEL_OPTION) {
                    if (indexActual == -1) {
                        jListPacients.clearSelection();
                    } else {
                        jListPacients.setSelectedIndex(indexActual);
                    }
                    return;
                }
            }
            if (!(modificant && index == indexActual)) {
                String pacient = getDni(index);
                jPanel2.removeAll();
                panelConsulta = new PanelPacientConsulta(pacient, controladorPacients);
                jPanel2.add(panelConsulta);
                modificant = false;
                indexActual = index;
                controladorPacients.enableButtonsMainForm();
            }
            touch();
        }
    }

    private int quinIndex(String dni) {
        for (int i = 0; i < jListPacients.getModel().getSize(); i++) {
            if (jListPacients.getModel().getElementAt(i).toString().startsWith(dni)) {
                return i;
            }
        }
        return -1;
    }

    private void omplirModel() {
        llistaPacients.clear();

        for (String str : controladorPacients.getDniNomCognomPacients()) {
            llistaPacients.addElement(str);
        }
    }

    public void setModificant() {
        modificant = true;
    }
}
