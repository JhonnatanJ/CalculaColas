/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.BorderLayout;

/**
 *
 * @author Jhonnatan
 */
public class Principal extends javax.swing.JFrame {
    //PICSM picsm = new pnlPICSM();
    /**
     * Creates new form Principal
     */
    public Principal() {
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

        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlOpciones = new javax.swing.JPanel();
        btnPICS = new javax.swing.JButton();
        btnPFCM = new javax.swing.JButton();
        btnPICM = new javax.swing.JButton();
        btnPFCS = new javax.swing.JButton();
        pnlContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTitulo.setBackground(new java.awt.Color(102, 153, 255));
        pnlTitulo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("CALCULADORA TEORÍA DE COLAS");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(lblTitulo)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        btnPICS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPICS.setText("M/M/1");
        btnPICS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPICSMouseClicked(evt);
            }
        });
        btnPICS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPICSActionPerformed(evt);
            }
        });

        btnPFCM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPFCM.setText("M/M/k/M/M");
        btnPFCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPFCMActionPerformed(evt);
            }
        });

        btnPICM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPICM.setText("M/M/k");
        btnPICM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPICMActionPerformed(evt);
            }
        });

        btnPFCS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPFCS.setText("M/M/1/M/M");
        btnPFCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPFCSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPICS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPFCM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPICM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPFCS, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addComponent(btnPICS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnPICM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnPFCS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnPFCM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pnlContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPICSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPICSActionPerformed
        // TODO add your handling code here:
        pnlPICSM picsm = new pnlPICSM();
        picsm.setSize(982,593);
        picsm.setLocation(8, 8);
        pnlContenedor.removeAll();
        pnlContenedor.add(picsm,BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_btnPICSActionPerformed

    private void btnPICSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPICSMouseClicked
        // TODO add your handling code here:
        pnlPICSM picsm = new pnlPICSM();
        picsm.setSize(982,593);
        picsm.setLocation(8, 8);
        pnlContenedor.removeAll();
        pnlContenedor.add(picsm,BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_btnPICSMouseClicked

    private void btnPICMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPICMActionPerformed
        // TODO add your handling code here:
        pnlPICM picm = new pnlPICM();
        picm.setSize(982,593);
        picm.setLocation(8, 8);
        pnlContenedor.removeAll();
        pnlContenedor.add(picm,BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_btnPICMActionPerformed

    private void btnPFCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPFCSActionPerformed
        // TODO add your handling code here:
        pnlPFCS pfcs = new pnlPFCS();
        pfcs.setSize(982,593);
        pfcs.setLocation(8, 8);
        pnlContenedor.removeAll();
        pnlContenedor.add(pfcs,BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_btnPFCSActionPerformed

    private void btnPFCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPFCMActionPerformed
        // TODO add your handling code here:
        pnlPFCM pfcm = new pnlPFCM();
        pfcm.setSize(982,593);
        pfcm.setLocation(8, 8);
        pnlContenedor.removeAll();
        pnlContenedor.add(pfcm,BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_btnPFCMActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPFCM;
    private javax.swing.JButton btnPFCS;
    private javax.swing.JButton btnPICM;
    private javax.swing.JButton btnPICS;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlTitulo;
    // End of variables declaration//GEN-END:variables
}
