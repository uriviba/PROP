package edu.upc.prop.presentacio;

import javax.swing.DefaultListModel;

public class PanelPacientConsulta extends javax.swing.JPanel {

    private ControladorPresentacioPacients controladorPacients;
    private DefaultListModel modelSimptomes;
    private DefaultListModel modelMalalties;
    private DefaultListModel modelHistorial;
    private static final String NIF_ASSOCIATION = "TRWAGMYFPDXBNJZSQVHLCKE";

    /**
     * Creates new form PanelPacientConsulta
     */
    public PanelPacientConsulta(String dni, ControladorPresentacioPacients controladorPacients) {
        this.controladorPacients = controladorPacients;
        modelSimptomes = new DefaultListModel();
        modelMalalties = new DefaultListModel();
        modelHistorial = new DefaultListModel();

        initComponents();

        jListSimptomes.setModel(modelSimptomes);
        jListMalalties.setModel(modelMalalties);
        jListHistorial.setModel(modelHistorial);

        omplirCamps(dni);

        jTextFieldADN.setEditable(false);
        jTextFieldCognoms.setEditable(false);
        jTextFieldDNI.setEditable(false);
        jTextFieldDataNaix.setEditable(false);
        jTextFieldNom.setEditable(false);
        jRadioButtonFemeni.setEnabled(false);
        jRadioButtonMasculi.setEnabled(false);
        
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButtonMasculi = new javax.swing.JRadioButton();
        jRadioButtonFemeni = new javax.swing.JRadioButton();
        jTextFieldADN = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSimptomes = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListMalalties = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListHistorial = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCognoms = new javax.swing.JTextField();
        jTextFieldDataNaix = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setText("Sexe:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setText("ADN:");

        buttonGroup1.add(jRadioButtonMasculi);
        jRadioButtonMasculi.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jRadioButtonMasculi.setText("Masculí");
        jRadioButtonMasculi.setFocusable(false);

        buttonGroup1.add(jRadioButtonFemeni);
        jRadioButtonFemeni.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jRadioButtonFemeni.setText("Femení");
        jRadioButtonFemeni.setFocusable(false);

        jTextFieldADN.setBackground(new java.awt.Color(239, 242, 249));
        jTextFieldADN.setEditable(false);
        jTextFieldADN.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Símptomes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(153, 326));

        jListSimptomes.setBackground(new java.awt.Color(239, 242, 249));
        jListSimptomes.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jScrollPane1.setViewportView(jListSimptomes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Malalties", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(153, 326));

        jListMalalties.setBackground(new java.awt.Color(239, 242, 249));
        jListMalalties.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jScrollPane2.setViewportView(jListMalalties);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jListHistorial.setBackground(new java.awt.Color(239, 242, 249));
        jListHistorial.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jScrollPane3.setViewportView(jListHistorial);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel1.setText("Nom:");

        jTextFieldNom.setBackground(new java.awt.Color(239, 242, 249));
        jTextFieldNom.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setText("Cognoms:");

        jTextFieldCognoms.setBackground(new java.awt.Color(239, 242, 249));
        jTextFieldCognoms.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        jTextFieldDataNaix.setBackground(new java.awt.Color(239, 242, 249));
        jTextFieldDataNaix.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel5.setText("Data Naixement:");

        jTextFieldDNI.setBackground(new java.awt.Color(239, 242, 249));
        jTextFieldDNI.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setText("NIF:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonMasculi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonFemeni)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNom)
                                    .addComponent(jTextFieldCognoms))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldDataNaix, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDNI)))
                            .addComponent(jTextFieldADN))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldDataNaix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCognoms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRadioButtonMasculi)
                    .addComponent(jRadioButtonFemeni)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldADN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jListHistorial;
    private javax.swing.JList jListMalalties;
    private javax.swing.JList jListSimptomes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonFemeni;
    private javax.swing.JRadioButton jRadioButtonMasculi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldADN;
    private javax.swing.JTextField jTextFieldCognoms;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDataNaix;
    private javax.swing.JTextField jTextFieldNom;
    // End of variables declaration//GEN-END:variables

    private void omplirCamps(String dni) {

        String nif;
        int num;
        if (dni.startsWith("X")) {
            num = (int) (Long.valueOf(dni.substring(1))%23);
        } else if (dni.startsWith("Y")) {
            num = (int) (Long.valueOf(dni.substring(1))%23) + 1;
        } else if (dni.startsWith("Z")) {
            num = (int) (Long.valueOf(dni.substring(1))%23) + 2;
        } else {
            num = (int) (Long.valueOf(dni)%23);
        }
        nif = dni + NIF_ASSOCIATION.charAt(num);
        jTextFieldDNI.setText(nif);
        jTextFieldNom.setText(controladorPacients.getNom(dni));
        jTextFieldCognoms.setText(controladorPacients.getCognom(dni));
        jTextFieldADN.setText(controladorPacients.getAdn(dni));
        jTextFieldDataNaix.setText(controladorPacients.getDataNaixement(dni));

        boolean masculi = controladorPacients.getSexe(dni) == 'M';
        jRadioButtonMasculi.setSelected(masculi);
        jRadioButtonFemeni.setSelected(!masculi);

        for (String mal : controladorPacients.getMalalties(dni)) {
            modelMalalties.addElement(mal);
        }

        for (String simp : controladorPacients.getSimptomes(dni)) {
            modelSimptomes.addElement(simp);
        }

        for (String hist : controladorPacients.getHistorial(dni)) {
            modelHistorial.addElement(hist);
        }
    }
}