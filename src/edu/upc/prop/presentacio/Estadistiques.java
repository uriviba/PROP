package edu.upc.prop.presentacio;

import java.util.List;
import java.util.StringTokenizer;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class Estadistiques extends javax.swing.JPanel {

    private DefaultMutableTreeNode arrel;
    private DefaultTreeCellRenderer render;

    /**
     * Creates new form Estadistiques
     */
    public Estadistiques(List<String> estadistiques, String params) {
        initComponents();
        render = new DefaultTreeCellRenderer();
        arrel = new DefaultMutableTreeNode("Estadístiques");

        for (String patro : estadistiques) {
            arrel.add(creaPatro(patro));
        }
        jTree1.setModel(new DefaultTreeModel(arrel));
        render.setOpenIcon(null);
        render.setClosedIcon(null);
        render.setLeafIcon(null);
        jTree1.setCellRenderer(render);

        String parametres = "Q: ";
        parametres += params.substring(0, params.indexOf(':'));
        params = params.substring(params.indexOf(':') + 1);
        parametres += "  |  Error: ";
        double error = Double.parseDouble(params.substring(0, params.indexOf(':'))) * 100;
        parametres += error;
        params = params.substring(params.indexOf(':') + 1);
        parametres += "%  |  Longitud Mínima: ";
        parametres += params.substring(0, params.indexOf(':'));
        params = params.substring(params.indexOf(':') + 1);
        parametres += "  |  Longitud Màxima: ";
        parametres += params;
        jLabelParametres.setText(parametres);
        jLabelParametres.setVisible(true);
        this.revalidate();
        this.repaint();
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
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jLabelParametres = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        jLabelParametres.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelParametres)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelParametres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelParametres;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables

    private MutableTreeNode creaPatro(String patro) {
        String nom = patro.substring(0, patro.indexOf(":"));
        patro = patro.substring(patro.indexOf(":") + 1);
        DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(nom);
        StringTokenizer st = new StringTokenizer(patro, ":");
        for (int i = 0; i < 6; i++) {
            String node;
            switch (i) {
                case 0:
                    node = "Trobat en " + st.nextToken() + " sequencies";
                    break;
                case 1:
                    node = "Trobat " + st.nextToken() + " vegades";
                    break;
                case 2:
                    node = "Nombre d'aparicions minima -> " + st.nextToken();
                    break;
                case 3:
                    node = "Nombre d'aparicions mitj -> " + st.nextToken();
                    break;
                case 4:
                    node = "Nombre d'aparicions maxima -> " + st.nextToken();
                    break;
                case 5:
                    node = "Error mitj del patro -> " + st.nextToken();
                    break;
                default:
                    node = "";
            }
            nodo.add(new DefaultMutableTreeNode(node));
        }
        return nodo;
    }
}
