package interfaces;

import classes.Informacoes;
import classes.Negativo;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class FrmColetarInfo extends javax.swing.JFrame {

    FrmInfo form = new FrmInfo();
    Informacoes infor = form.getInfo();
    public boolean negat = false;

    public FrmColetarInfo() {
        initComponents();
        setLocationRelativeTo(null);
        ocultar();
        URL url = this.getClass().getResource("/imgs/pingoAgua.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }

    public final void limpar() {
        txtPrivada.setValue(0);
        txtPrivada.setValue(0);
        txtPrivada.setValue(0);
        txtPrivada.setValue(0);
        txtMaquinaL.setValue(0);
        txtPrivada.setValue(0);
        txtTanque.setValue(0);
        txtPiaC.setValue(0);
        txtMaquinaLL.setValue(0);
        chuveiro.setSelected(false);
        rbnAp.setSelected(false);
        rbnCasa.setSelected(false);
        Descarga.setSelected(false);
        PiaBanheiro.setSelected(false);
        maquinaRoupa.setSelected(false);
        tanqueRoupa.setSelected(false);
        piaCozinha.setSelected(false);
        maquinaLouca.setSelected(false);
        ocultar();
    }

    public final void ocultar() {
        rbnCasa.setVisible(false);
        rbnAp.setVisible(false);
        txtAp.setVisible(false);
        txtCasa.setVisible(false);
        txtMaquinaLL.setVisible(false);
        txtPrivada.setVisible(false);
        txtMaquinaL.setVisible(false);
        txtPiaC.setVisible(false);
        txtPiaB.setVisible(false);
        txtTanque.setVisible(false);
    }

    public void verificaNegativo(int valor) {
        if (valor <= 0) {
            negat = true;
        }
    }

    public void verificaInfo() {
        infor.setPessoas(Integer.parseInt(txtCasa.getValue().toString()));
        if (chuveiro.isSelected()) {
            form.Chuv();//faz aparecer no Jframe2 o campo chuveiro
            if (rbnCasa.isSelected()) {
                int casa = Integer.parseInt(txtCasa.getValue().toString());
                verificaNegativo(casa);
                infor.setChuveiro(infor.calcularChuveiroC(casa));
            } else {
                int ap = Integer.parseInt(txtAp.getValue().toString());
                verificaNegativo(ap);
                infor.setChuveiro(infor.calcularChuveiroA(ap));
            }
        }
        if (Descarga.isSelected()) {
            form.Desc();//faz aparecer no Jframe2 o campo privada/descarga
            int descarga = Integer.parseInt(txtPrivada.getValue().toString());
            verificaNegativo(descarga);
            infor.setPrivada(infor.calcularPrivada(descarga));
        }
        if (PiaBanheiro.isSelected()) {
            form.PiaBanho();//faz aparecer no Jframe2 o campo pia do banheiro
            int piaB = Integer.parseInt(txtPiaB.getValue().toString());
            verificaNegativo(piaB);
            infor.setPiaB(infor.calcularPiaB(piaB));
        }
        if (maquinaRoupa.isSelected()) {
            form.MaquiR();//faz aparecer no Jframe2 o campo maquina de lavar roupa
            int maquinaL = Integer.parseInt(txtMaquinaL.getValue().toString());
            verificaNegativo(maquinaL);
            infor.setMaquinaR(infor.calcularMaquinaR(maquinaL));
        }
        if (tanqueRoupa.isSelected()) {
            form.Tanque();//faz aparecer no Jframe2 o campo tanque
            int tanque = Integer.parseInt(txtTanque.getValue().toString());
            verificaNegativo(tanque);
            infor.setTanque(infor.calcularTanque(tanque));
        }
        if (piaCozinha.isSelected()) {
            form.PiaCoz();//faz aparecer no Jframe2 o campo pia da cozinha
            int piaC = Integer.parseInt(txtPiaC.getValue().toString());
            verificaNegativo(piaC);
            infor.setPiaC(infor.calcularPiaC(piaC));
        }
        if (maquinaLouca.isSelected()) {
            form.MaquiL();//faz aparecer no Jframe2 o campo maquina de louça
            int maquinaL = Integer.parseInt(txtMaquinaLL.getValue().toString());
            verificaNegativo(maquinaL);
            infor.setMaquinaL(infor.calcularMaquinaL(maquinaL));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        Selecione = new javax.swing.JLabel();
        chuveiro = new javax.swing.JCheckBox();
        Descarga = new javax.swing.JCheckBox();
        PiaBanheiro = new javax.swing.JCheckBox();
        maquinaRoupa = new javax.swing.JCheckBox();
        tanqueRoupa = new javax.swing.JCheckBox();
        piaCozinha = new javax.swing.JCheckBox();
        maquinaLouca = new javax.swing.JCheckBox();
        btnVoltar = new javax.swing.JButton();
        lblPessoas = new javax.swing.JLabel();
        txtPrivada = new javax.swing.JSpinner();
        btnLimpar = new javax.swing.JButton();
        lblQtdPessoa = new javax.swing.JLabel();
        rbnAp = new javax.swing.JRadioButton();
        rbnCasa = new javax.swing.JRadioButton();
        btnProximo = new javax.swing.JButton();
        txtPessoas = new javax.swing.JSpinner();
        txtCasa = new javax.swing.JSpinner();
        txtAp = new javax.swing.JSpinner();
        txtPiaB = new javax.swing.JSpinner();
        txtMaquinaL = new javax.swing.JSpinner();
        txtTanque = new javax.swing.JSpinner();
        txtPiaC = new javax.swing.JSpinner();
        txtMaquinaLL = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coletando Informações - Calculo de Conta de Água");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Vamos verificar quantos você gasta?");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 10, 470, -1));

        Selecione.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Selecione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Selecione.setText("Indique a quantidade que uma pessoa utiliza por um dia");
        jPanel1.add(Selecione, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 480, -1));

        chuveiro.setBackground(new java.awt.Color(173, 216, 230));
        chuveiro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chuveiro.setText("Chuveiro");
        chuveiro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chuveiroItemStateChanged(evt);
            }
        });
        chuveiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chuveiroActionPerformed(evt);
            }
        });
        jPanel1.add(chuveiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        Descarga.setBackground(new java.awt.Color(173, 216, 230));
        Descarga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Descarga.setText("Privada (Vezes)");
        Descarga.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DescargaItemStateChanged(evt);
            }
        });
        jPanel1.add(Descarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        PiaBanheiro.setBackground(new java.awt.Color(173, 216, 230));
        PiaBanheiro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PiaBanheiro.setText("Pia do banheiro (Minutos)");
        PiaBanheiro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PiaBanheiroItemStateChanged(evt);
            }
        });
        jPanel1.add(PiaBanheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        maquinaRoupa.setBackground(new java.awt.Color(173, 216, 230));
        maquinaRoupa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        maquinaRoupa.setText("Maquina de lavar roupa (Vezes)");
        maquinaRoupa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                maquinaRoupaItemStateChanged(evt);
            }
        });
        jPanel1.add(maquinaRoupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        tanqueRoupa.setBackground(new java.awt.Color(173, 216, 230));
        tanqueRoupa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tanqueRoupa.setText("Tanque de lavar roupa (Minutos)");
        tanqueRoupa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tanqueRoupaItemStateChanged(evt);
            }
        });
        jPanel1.add(tanqueRoupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        piaCozinha.setBackground(new java.awt.Color(173, 216, 230));
        piaCozinha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        piaCozinha.setText("Pia da cozinha (Minutos)");
        piaCozinha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                piaCozinhaItemStateChanged(evt);
            }
        });
        piaCozinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piaCozinhaActionPerformed(evt);
            }
        });
        jPanel1.add(piaCozinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        maquinaLouca.setBackground(new java.awt.Color(173, 216, 230));
        maquinaLouca.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        maquinaLouca.setText("Maquina de lavar louça (Vezes)");
        maquinaLouca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                maquinaLoucaItemStateChanged(evt);
            }
        });
        jPanel1.add(maquinaLouca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        btnVoltar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        lblPessoas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lblPessoas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 89, -1));

        txtPrivada.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtPrivada, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 120, -1));

        btnLimpar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        lblQtdPessoa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblQtdPessoa.setText("Quantas pessoas moram em sua casa/ap: ");
        jPanel1.add(lblQtdPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        rbnAp.setBackground(new java.awt.Color(173, 216, 230));
        rbnAp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbnAp.setText("Apartamento");
        rbnAp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbnApItemStateChanged(evt);
            }
        });
        rbnAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnApActionPerformed(evt);
            }
        });
        jPanel1.add(rbnAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        rbnCasa.setBackground(new java.awt.Color(173, 216, 230));
        rbnCasa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbnCasa.setText("Casa");
        rbnCasa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbnCasaItemStateChanged(evt);
            }
        });
        rbnCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnCasaActionPerformed(evt);
            }
        });
        jPanel1.add(rbnCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        btnProximo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, -1));

        txtPessoas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtPessoas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 120, -1));

        txtCasa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 120, -1));

        txtAp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 120, -1));

        txtPiaB.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtPiaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 120, -1));

        txtMaquinaL.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtMaquinaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 120, -1));

        txtTanque.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtTanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 120, -1));

        txtPiaC.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtPiaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 120, -1));

        txtMaquinaLL.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtMaquinaLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chuveiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chuveiroActionPerformed

    }//GEN-LAST:event_chuveiroActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        FrmIniciar f = new FrmIniciar();
        f.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    /*
        Apartir desta parte são metodos gerados pelo prorpio netbeans. Que possiblita a mudança de algo se ocorer alguma moddficação na checkBox.
        Isso permitiu que eu pudesse dar mais interação com o usuario fazendo aparecer e desaparecer os campos de digitação.
    
        setVisible é o comando que permite essa aparição do campo de texto.
     */

    private void chuveiroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chuveiroItemStateChanged
        if (chuveiro.isSelected()) {
            rbnCasa.setVisible(true);
            rbnAp.setVisible(true);
        } else {
            rbnCasa.setVisible(false);
            rbnAp.setVisible(false);
            txtAp.setVisible(false);
            txtCasa.setVisible(false);
        }
    }//GEN-LAST:event_chuveiroItemStateChanged

    private void DescargaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DescargaItemStateChanged
        if (Descarga.isSelected()) {
            txtPrivada.setVisible(true);
        } else {
            txtPrivada.setVisible(false);
        }
    }//GEN-LAST:event_DescargaItemStateChanged

    private void PiaBanheiroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PiaBanheiroItemStateChanged
        if (PiaBanheiro.isSelected()) {
            txtPiaB.setVisible(true);
        } else {
            txtPiaB.setVisible(false);
        }
    }//GEN-LAST:event_PiaBanheiroItemStateChanged

    private void maquinaRoupaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_maquinaRoupaItemStateChanged
        if (maquinaRoupa.isSelected()) {
            txtMaquinaL.setVisible(true);
        } else {
            txtMaquinaL.setVisible(false);
        }
    }//GEN-LAST:event_maquinaRoupaItemStateChanged

    private void tanqueRoupaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tanqueRoupaItemStateChanged
        if (tanqueRoupa.isSelected()) {
            txtTanque.setVisible(true);
        } else {
            txtTanque.setVisible(false);
        }
    }//GEN-LAST:event_tanqueRoupaItemStateChanged

    private void piaCozinhaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_piaCozinhaItemStateChanged
        if (piaCozinha.isSelected()) {
            txtPiaC.setVisible(true);
        } else {
            txtPiaC.setVisible(false);
        }
    }//GEN-LAST:event_piaCozinhaItemStateChanged

    private void maquinaLoucaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_maquinaLoucaItemStateChanged
        if (maquinaLouca.isSelected()) {
            txtMaquinaLL.setVisible(true);
        } else {
            txtMaquinaLL.setVisible(false);
        }
    }//GEN-LAST:event_maquinaLoucaItemStateChanged

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void rbnCasaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbnCasaItemStateChanged
        if (rbnCasa.isSelected()) {
            txtCasa.setVisible(true);
        } else {
            txtCasa.setVisible(false);
        }
    }//GEN-LAST:event_rbnCasaItemStateChanged

    private void rbnApItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbnApItemStateChanged
        if (rbnAp.isSelected()) {
            txtAp.setVisible(true);
        } else {
            txtAp.setVisible(false);
        }
    }//GEN-LAST:event_rbnApItemStateChanged

    private void rbnCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnCasaActionPerformed
        rbnAp.setSelected(false);
    }//GEN-LAST:event_rbnCasaActionPerformed

    private void rbnApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnApActionPerformed
        rbnCasa.setSelected(false);
    }//GEN-LAST:event_rbnApActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        int pessoa = Integer.parseInt(txtPessoas.getValue().toString());
        verificaNegativo(pessoa);
        verificaInfo();
        try {
            if (negat) {
                negat = false;
                throw new Negativo();
            }
            this.setVisible(false);
            form.mostrarValores();
            form.setVisible(true);
        } catch (Negativo e) {
            JOptionPane.showMessageDialog(null, "Favor verificar as inforrmações, possuem dados negativos ou zerados!", "Erro de dados!", ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnProximoActionPerformed

    private void piaCozinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piaCozinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_piaCozinhaActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo infor : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(infor.getName())) {
                    javax.swing.UIManager.setLookAndFeel(infor.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmColetarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmColetarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmColetarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmColetarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmColetarInfo().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Descarga;
    private javax.swing.JCheckBox PiaBanheiro;
    private javax.swing.JLabel Selecione;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox chuveiro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPessoas;
    private javax.swing.JLabel lblQtdPessoa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JCheckBox maquinaLouca;
    private javax.swing.JCheckBox maquinaRoupa;
    private javax.swing.JCheckBox piaCozinha;
    private javax.swing.JRadioButton rbnAp;
    private javax.swing.JRadioButton rbnCasa;
    private javax.swing.JCheckBox tanqueRoupa;
    private javax.swing.JSpinner txtAp;
    private javax.swing.JSpinner txtCasa;
    private javax.swing.JSpinner txtMaquinaL;
    private javax.swing.JSpinner txtMaquinaLL;
    private javax.swing.JSpinner txtPessoas;
    private javax.swing.JSpinner txtPiaB;
    private javax.swing.JSpinner txtPiaC;
    private javax.swing.JSpinner txtPrivada;
    private javax.swing.JSpinner txtTanque;
    // End of variables declaration//GEN-END:variables
}
