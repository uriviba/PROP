package edu.upc.prop.presentacio;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class PanelSequencies extends javax.swing.JPanel {

    private DefaultListModel model;
    private ControladorPresentacioSequencies controladorSequencies;
    private PanelSequenciaDades panelDades;
    private PanelSequenciaConsulta panelConsulta;
    private boolean modificant;
    private int indexActual;

    public PanelSequencies(ControladorPresentacioSequencies controladorSequencies) {
        this.controladorSequencies = controladorSequencies;
        this.controladorSequencies.setPanelSequencies(this);

        initComponents();

        model = new DefaultListModel();
        jListSequencies.setModel(model);

        omplirModel();

        indexActual = -1;
        modificant = false;
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
        jListSequencies = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        jListSequencies.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListSequencies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListSequenciesMouseClicked(evt);
            }
        });
        jListSequencies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListSequenciesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jListSequencies);

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

    private void jListSequenciesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListSequenciesMouseClicked
        canviaSequencia();
    }//GEN-LAST:event_jListSequenciesMouseClicked

    private void jListSequenciesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListSequenciesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            canviaSequencia();
        }
    }//GEN-LAST:event_jListSequenciesKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jListSequencies;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public boolean novaSequencia() {
        if (modificant) {
            String msg = "Si crees una nova Seqüència sense guardar, es descartaran els canvis actuals. Vols continuar?";
            String title = "No has guardat els canvis!";
            int optionType = JOptionPane.OK_CANCEL_OPTION;
            int msgType = JOptionPane.QUESTION_MESSAGE;
            int opcio = JOptionPane.showConfirmDialog(this, msg, title, optionType, msgType);
            if (opcio == JOptionPane.CANCEL_OPTION) {
                return false;
            }
        }

        jPanel2.removeAll();
        jListSequencies.clearSelection();
        indexActual = -1;
        panelDades = new PanelSequenciaDades(controladorSequencies);
        jPanel2.add(panelDades);

        touch();
        return true;
    }

    public boolean esborrarSequencia() {
        int index = jListSequencies.getSelectedIndex();
        String title = "Esborrar sequencia";
        String msg;

        if (index != -1) {
            msg = "Segur que vol esborrar la sequencia seleccionada";
            int option = JOptionPane.showConfirmDialog(this, msg, title, JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                try {
                    if (controladorSequencies.esborrarSequencia(getId(index)) == false) {
                        JOptionPane.showMessageDialog(this, "Segurament està associada amb un pacient o malaltia", "Error al eliminar sequencia", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                    model.remove(index);
                } catch (StackOverflowError sof) {
                    JOptionPane.showMessageDialog(this, "Hi ha hagut un problema", "Error al eliminar sequencia", JOptionPane.ERROR_MESSAGE);
                }

                jPanel2.removeAll();
                indexActual = -1;
                jListSequencies.clearSelection();
                modificant = false;
                
                touch();
                return true;
            }
        } else {
            msg = "Ha de seleccionar una sequencia";
            JOptionPane.showMessageDialog(this, msg, title, JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public boolean seleccioBuida() {
        return jListSequencies.isSelectionEmpty();
    }

    public void redibuixar(long id) {
        model.addElement(controladorSequencies.getIDSequencia(id));
    }

    public void seleccionaSequencia(long id) {
        jPanel2.removeAll();
        int index = getIndex(id);
        jListSequencies.setSelectedIndex(index);

        panelConsulta = new PanelSequenciaConsulta(id, controladorSequencies);
        jPanel2.add(panelConsulta);
        indexActual = index;
        modificant = false;
        controladorSequencies.enableEliminarButtonMainForm();
        touch();
    }

    public void cancelar() {
        jPanel2.removeAll();
        int index = jListSequencies.getSelectedIndex();
        if (index != -1) {
            panelConsulta = new PanelSequenciaConsulta(getId(index), controladorSequencies);
            jPanel2.add(panelConsulta);
            controladorSequencies.enableEliminarButtonMainForm();
        }
        modificant = false;
        indexActual = index;
        touch();
    }

    public void refresh() {
        omplirModel();
    }

    private long getId(int index) {
        String sequencia = (String) jListSequencies.getModel().getElementAt(index);
        String subId = sequencia.substring(0, sequencia.indexOf(":")).trim();

        return Long.parseLong(subId);
    }

    private int getIndex(long id) {
        for (int i = 0; i < model.getSize(); i++) {
            String linia = model.getElementAt(i).toString();
            if (Long.parseLong(linia.substring(0, linia.indexOf(":"))) == id) {
                return i;
            }
        }
        return -1;
    }

    private void touch() {
        jPanel2.revalidate();
        jPanel2.repaint();
    }

    private void canviaSequencia() {
        int index = jListSequencies.getSelectedIndex();
        if (index != -1) {
            if (modificant && index != indexActual) {
                String msg = "Si consultes una altra Seqüència sense guardar, es descartaran els canvis actuals. Vols continuar?";
                String title = "No has guardat els canvis!";
                int optionType = JOptionPane.OK_CANCEL_OPTION;
                int msgType = JOptionPane.QUESTION_MESSAGE;
                int opcio = JOptionPane.showConfirmDialog(this, msg, title, optionType, msgType);
                if (opcio == JOptionPane.CANCEL_OPTION) {
                    if (indexActual == -1) {
                        jListSequencies.clearSelection();
                    } else {
                        jListSequencies.setSelectedIndex(indexActual);
                    }
                    return;
                }
            }
            if (!(modificant && index == indexActual)) {
                jPanel2.removeAll();
                panelConsulta = new PanelSequenciaConsulta(getId(index), controladorSequencies);
                jPanel2.add(panelConsulta);
                indexActual = index;
                modificant = false;
                controladorSequencies.enableEliminarButtonMainForm();
            }
            touch();
        }
    }

    private void omplirModel() {
        model.clear();

        try {
            for (String str : controladorSequencies.getSequencies()) {
                model.addElement(str);
            }
        } catch (StackOverflowError sof) {
            JOptionPane.showMessageDialog(this, "Hi ha hagut un problema", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setModificant() {
        modificant = true;
    }
}