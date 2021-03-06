package edu.upc.prop.presentacio;

import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Khalid Mahyou
 */
public class PanelResultats extends javax.swing.JPanel {

    public static final int GRAFICS_VISTA = 0;
    public static final int ESTADISTIQUES_VISTA = 1;
    public static final int CONCLUSIONS_VISTA = 2;
    private ControladorPresentacioEstudis controladorPresentacioEstudis;
    private int focus;
    private int indexActual;
    private boolean esExecucioActual;
    private ConclusionsAutomatiques conclusions;
    private Estadistiques estadistiques;
    private Grafica grafica;
    private DefaultListModel resultat;

    /**
     * Creates new form PanelResultats
     */
    public PanelResultats(ControladorPresentacioEstudis controladorPresentacioEstudis) {
        conclusions = null;
        estadistiques = null;
        grafica = null;
        this.controladorPresentacioEstudis = controladorPresentacioEstudis;
        initComponents();
        resultat = new DefaultListModel();
        for (String res : controladorPresentacioEstudis.getNomResultats()) {
            resultat.addElement(res);
        }
        jList1.setModel(resultat);
        focus = -1;
        indexActual = -1;
        jButton1.setVisible(false);
        esExecucioActual = false;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanelButtons = new javax.swing.JPanel();
        jToggleButtonGrafica = new javax.swing.JToggleButton();
        jToggleButtonEstadistica = new javax.swing.JToggleButton();
        jToggleButtonConclusions = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jPanelContingut = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        buttonGroup1.add(jToggleButtonGrafica);
        jToggleButtonGrafica.setText("Gràfica");
        jToggleButtonGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonGraficaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButtonEstadistica);
        jToggleButtonEstadistica.setText("Estadística");
        jToggleButtonEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEstadisticaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButtonConclusions);
        jToggleButtonConclusions.setText("Conclusions Automàtiques");
        jToggleButtonConclusions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonConclusionsActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addComponent(jToggleButtonGrafica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonEstadistica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonConclusions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jToggleButtonGrafica)
                .addComponent(jToggleButtonEstadistica)
                .addComponent(jToggleButtonConclusions)
                .addComponent(jButton1))
        );

        jPanelContingut.setLayout(new javax.swing.BoxLayout(jPanelContingut, javax.swing.BoxLayout.LINE_AXIS));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelContingut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(225, 225, 225)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(668, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelContingut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonGraficaActionPerformed
        if (focus == GRAFICS_VISTA) {
            jToggleButtonGrafica.setSelected(true);
        } else {
            focus = GRAFICS_VISTA;
            int index = jList1.getSelectedIndex();
            if (index != -1) {
                omplePanel(jList1.getModel().getElementAt(index).toString());
            }
        }
    }//GEN-LAST:event_jToggleButtonGraficaActionPerformed

    private void jToggleButtonEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEstadisticaActionPerformed
        if (focus == ESTADISTIQUES_VISTA) {
            jToggleButtonEstadistica.setSelected(true);
        } else {
            focus = ESTADISTIQUES_VISTA;
            int index = jList1.getSelectedIndex();
            if (index != -1) {
                omplePanel(jList1.getModel().getElementAt(index).toString());
            }
        }
    }//GEN-LAST:event_jToggleButtonEstadisticaActionPerformed

    private void jToggleButtonConclusionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonConclusionsActionPerformed
        if (focus == CONCLUSIONS_VISTA) {
            jToggleButtonConclusions.setSelected(true);
        } else {
            focus = CONCLUSIONS_VISTA;
            int index = jList1.getSelectedIndex();
            if (index != -1) {
                omplePanel(jList1.getModel().getElementAt(index).toString());
            }
        }
    }//GEN-LAST:event_jToggleButtonConclusionsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardarResultat();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        canviaResultat();
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            canviaResultat();
        }
    }//GEN-LAST:event_jList1KeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelContingut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButtonConclusions;
    private javax.swing.JToggleButton jToggleButtonEstadistica;
    private javax.swing.JToggleButton jToggleButtonGrafica;
    // End of variables declaration//GEN-END:variables

    private void omplePanel(String nom) {
        switch (focus) {
            case GRAFICS_VISTA:
                try {
                    grafica = new Grafica(nom, controladorPresentacioEstudis);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de I/O", JOptionPane.ERROR_MESSAGE);
                }
                conclusions = null;
                estadistiques = null;
                jPanelContingut.removeAll();
                focus = -1;
                if (grafica != null) {
                    focus = GRAFICS_VISTA;
                    jPanelContingut.add(grafica);
                }
                break;
            case CONCLUSIONS_VISTA:
                try {
                    conclusions = new ConclusionsAutomatiques(controladorPresentacioEstudis, controladorPresentacioEstudis.getConclusionsResultat(0, nom), controladorPresentacioEstudis.getConclusionsResultat(1, nom), controladorPresentacioEstudis.getMatriu(nom));

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de I/O", JOptionPane.ERROR_MESSAGE);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error intern", JOptionPane.ERROR_MESSAGE);
                }
                grafica = null;
                estadistiques = null;
                jPanelContingut.removeAll();
                focus = -1;
                if (conclusions != null) {
                    focus = CONCLUSIONS_VISTA;
                    jPanelContingut.add(conclusions);
                }
                break;
            case ESTADISTIQUES_VISTA:
                try {
                    String params = controladorPresentacioEstudis.getParametres(nom);
                    estadistiques = new Estadistiques(controladorPresentacioEstudis.getEstadistiques(nom), params);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de I/O", JOptionPane.ERROR_MESSAGE);
                    focus = -1;
                }
                grafica = null;
                conclusions = null;
                jPanelContingut.removeAll();
                if (estadistiques != null) {
                    focus = ESTADISTIQUES_VISTA;
                    jPanelContingut.add(estadistiques);
                }
                break;
            default:
                jToggleButtonGrafica.setSelected(false);
                jToggleButtonEstadistica.setSelected(false);
                jToggleButtonConclusions.setSelected(false);
                grafica = null;
                conclusions = null;
                estadistiques = null;
                jPanelContingut.removeAll();
                focus = -1;
                break;
        }
        touch();
    }
    /** Inserta el nom de una execució a la llista.
     * 
     * @param execucio el nom de l'execucio a insertar
     */
    public void insertaResultat(String execucio) {
        resultat.add(0, execucio);
        indexActual = 0;
        jList1.setSelectedIndex(0);
        focus = ESTADISTIQUES_VISTA;
        jToggleButtonEstadistica.setSelected(true);
        omplePanel(execucio);
        jButton1.setVisible(true);
        esExecucioActual = true;
    }

    private void canviaResultat() {
        int index = jList1.getSelectedIndex();
        if (index != indexActual) {
            if (esExecucioActual) {
                String msg = "Si consultes un altre Resultat sense guardar, es descartarà el resultat de l'estudi actual. Vols guardar els resultats d'aquest estudi?";
                String title = "No has guardat els resultats!";
                int optionType = JOptionPane.YES_NO_CANCEL_OPTION;
                int msgType = JOptionPane.QUESTION_MESSAGE;
                int opcio = JOptionPane.showConfirmDialog(this, msg, title, optionType, msgType);
                if (opcio == JOptionPane.CANCEL_OPTION) {
                    jList1.setSelectedIndex(indexActual);
                    return;
                } else if (opcio == JOptionPane.YES_OPTION) {
                    guardarResultat();
                }
            }
            indexActual = index;
            omplePanel(jList1.getModel().getElementAt(indexActual).toString());
            esExecucioActual = false;
        }
    }

    private void guardarResultat() {
        JFileChooser dialogArchiu = new JFileChooser("Genome/Resultats/");
        dialogArchiu.setFileSelectionMode(JFileChooser.FILES_ONLY);
        dialogArchiu.setAcceptAllFileFilterUsed(false);
        dialogArchiu.showSaveDialog(this);
        String ruta = dialogArchiu.getSelectedFile().getAbsolutePath();
        String nomActual = jList1.getModel().getElementAt(jList1.getSelectedIndex()).toString();
        try {
            controladorPresentacioEstudis.guardaDisc(nomActual, ruta);
            resultat.set(0, ruta.substring(ruta.lastIndexOf("/") + 1));
            jButton1.setVisible(false);
            esExecucioActual = false;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de escriptura a disc", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void touch() {
        jPanelContingut.revalidate();
        jPanelContingut.repaint();
    }
}
