/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Usuario
 */
public class GestionEditorial extends javax.swing.JFrame {

    /**
     * Creates new form GestionEditorial
     */
    public GestionEditorial() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtIdEditorial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblMostrarEditorial = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jtxtNombreEditorial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbtnMostrarEditorial = new javax.swing.JButton();
        jbtnGuardarEditorial = new javax.swing.JButton();
        jbtnActualizarEditorial = new javax.swing.JButton();
        jbtnEliminarEditorial = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnSalire = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LIBROOOOOOASA.png"))); // NOI18N
        jButton1.setText("Libros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 170, 40));

        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Autores.png"))); // NOI18N
        jButton7.setText("Autores");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 170, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editorial.png"))); // NOI18N
        jLabel1.setText("Editorial");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Id.Editorial:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        jtxtIdEditorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtIdEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdEditorialActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtIdEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 170, 40));

        jtblMostrarEditorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblMostrarEditorial);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 300, 240));

        jPanel5.setBackground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        jtxtNombreEditorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtNombreEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreEditorialActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtNombreEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 170, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre :  ");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 30));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 760, 320));

        jbtnMostrarEditorial.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtnMostrarEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Mostrar.png"))); // NOI18N
        jbtnMostrarEditorial.setText("Mostrar");
        jbtnMostrarEditorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnMostrarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarEditorialActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnMostrarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 150, 50));

        jbtnGuardarEditorial.setBackground(new java.awt.Color(51, 102, 255));
        jbtnGuardarEditorial.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtnGuardarEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Guardar.png"))); // NOI18N
        jbtnGuardarEditorial.setText("Guardar");
        jbtnGuardarEditorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnGuardarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarEditorialActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnGuardarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 150, 50));

        jbtnActualizarEditorial.setBackground(new java.awt.Color(153, 255, 102));
        jbtnActualizarEditorial.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtnActualizarEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actualizar.png"))); // NOI18N
        jbtnActualizarEditorial.setText("Actualizar");
        jbtnActualizarEditorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnActualizarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarEditorialActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnActualizarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 160, 50));

        jbtnEliminarEditorial.setBackground(new java.awt.Color(255, 51, 51));
        jbtnEliminarEditorial.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtnEliminarEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Eliminar.png"))); // NOI18N
        jbtnEliminarEditorial.setText("Eliminar");
        jbtnEliminarEditorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnEliminarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarEditorialActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnEliminarEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 150, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LOGODECOLEGIO.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, -10, 230, 170));

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editorial.png"))); // NOI18N
        jButton2.setText("Editorial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 170, 40));

        btnSalire.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnSalire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salirasdas.png"))); // NOI18N
        btnSalire.setText("Salir");
        btnSalire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSalire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalireActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalire, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 130, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 940, 530));

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 990, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Gestion newframe = new Gestion();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         GestionAutores newframe = new GestionAutores();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jtxtIdEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIdEditorialActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSalireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalireActionPerformed
        MenuAdmin newframe = new MenuAdmin ();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalireActionPerformed

    private void jtxtNombreEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreEditorialActionPerformed

    private void jbtnGuardarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGuardarEditorialActionPerformed

    private void jbtnActualizarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnActualizarEditorialActionPerformed

    private void jbtnEliminarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEliminarEditorialActionPerformed

    private void jbtnMostrarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnMostrarEditorialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionEditorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSalire;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtnActualizarEditorial;
    public javax.swing.JButton jbtnEliminarEditorial;
    public javax.swing.JButton jbtnGuardarEditorial;
    public javax.swing.JButton jbtnMostrarEditorial;
    public javax.swing.JTable jtblMostrarEditorial;
    public javax.swing.JTextField jtxtIdEditorial;
    public javax.swing.JTextField jtxtNombreEditorial;
    // End of variables declaration//GEN-END:variables
}
