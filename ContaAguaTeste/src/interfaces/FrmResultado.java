package interfaces;

import classes.Informacoes;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

public final class FrmResultado extends javax.swing.JFrame {
    
    FrmInfo form = new FrmInfo();
    Informacoes infor = form.getInfo();
    public FrmResultado() {
        initComponents();
        setLocationRelativeTo(null);
        URL url = this.getClass().getResource("/imgs/pingoAgua.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }
    
    public void setarValores(Informacoes infor){
        lblM3total.setText(String.valueOf(infor.getTotalm3()));
        lbltotalR.setText(String.valueOf(infor.getValorRS()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Preco = new javax.swing.JLabel();
        lblReasi = new javax.swing.JLabel();
        lbltotalR = new javax.swing.JLabel();
        lblM3 = new javax.swing.JLabel();
        lblM3total = new javax.swing.JLabel();
        btnProximo1 = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resultado em Reais - Calculo de Conta de Água");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Preco.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Preco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Preco.setText("Preço estimado");
        jPanel1.add(Preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, -1));

        lblReasi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblReasi.setText("Total em reais");
        jPanel1.add(lblReasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 18));

        lbltotalR.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lbltotalR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 73, 18));

        lblM3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblM3.setText("Total de M³");
        jPanel1.add(lblM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 18));

        lblM3total.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lblM3total, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 73, 18));

        btnProximo1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnProximo1.setText("Reiniciar");
        btnProximo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnProximo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        btnVoltar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVoltar.setText("Finalizar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximo1ActionPerformed
        this.setVisible(false);
        FrmColetarInfo f = new FrmColetarInfo();
        f.setVisible(true);
    }//GEN-LAST:event_btnProximo1ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        FrmIniciar f = new FrmIniciar();
        f.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmResultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Preco;
    private javax.swing.JButton btnProximo1;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblM3;
    private javax.swing.JLabel lblM3total;
    private javax.swing.JLabel lblReasi;
    private javax.swing.JLabel lbltotalR;
    // End of variables declaration//GEN-END:variables
}
