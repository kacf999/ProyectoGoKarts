/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Kevin
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        btnGestionCarreras = new javax.swing.JButton();
        btnGestionKarts = new javax.swing.JButton();
        btnGestionPiloto = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Menu Principal");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        btnGestionCarreras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGestionCarreras.setText("Gestion Carreras");
        btnGestionCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionCarrerasActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionCarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        btnGestionKarts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGestionKarts.setText("Gestion Karts");
        btnGestionKarts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionKartsActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionKarts, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        btnGestionPiloto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGestionPiloto.setText("Gestion Pilotos");
        btnGestionPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionPilotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo 25.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 250, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/karts karts.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionCarrerasActionPerformed
        GestionCarreras ventana = new GestionCarreras();
        ventana.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnGestionCarrerasActionPerformed

    private void btnGestionKartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionKartsActionPerformed
        GestionKarts ventana = new GestionKarts();
        ventana.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnGestionKartsActionPerformed

    private void btnGestionPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionPilotoActionPerformed
        GestionPilotos ventana = new GestionPilotos();
        ventana.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnGestionPilotoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        SistemaGoKarts ventana = new SistemaGoKarts();
        ventana.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionCarreras;
    private javax.swing.JButton btnGestionKarts;
    private javax.swing.JButton btnGestionPiloto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}