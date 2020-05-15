/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Informacoes;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.DecimalFormat;

/**
 *
 * @author Erick hayakawa
 */
public class FrmInfo extends javax.swing.JFrame {

    /**
     * Creates new form teste2
     */
    Informacoes info = new Informacoes();

    public Informacoes getInfo() {
        return info;
    }

    public void setInfo(Informacoes info) {
        this.info = info;
    }

    public FrmInfo() {
        initComponents();
        setLocationRelativeTo(null);
        URL url = this.getClass().getResource("/imgs/pingoAgua.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
        escondeComp();
    }

    public void escondeComp() {
        //coloca tds os campos de digitação sem visibilidade para o usuario
        //Chuveiro
        chuveiro.setVisible(false);
        lblChuveiro.setVisible(false);
        //Descarga
        lbldescarga.setVisible(false);
        descarga.setVisible(false);
        //Pia do Banheiro
        lblpiaB.setVisible(false);
        piaBanheiro.setVisible(false);
        //maquina de lavar Roupa
        maquinaRoupa.setVisible(false);
        lblmaquiR.setVisible(false);
        //tanque
        lbltanque.setVisible(false);
        TanqueRoupa.setVisible(false);
        //maquina de lavar louça
        lblmaquiL.setVisible(false);
        maquinaLouca.setVisible(false);
        //pia da cozinha
        lblpiaC.setVisible(false);
        piaCozinha.setVisible(false);
    }

    public void calcularValor() {
//        int metros = (int) info.getTotalm3();
//        double valor = 0.0;//cria a variavel para o calculo do valor em Reais
//
//        if (metros <= 10) {//se o m³ for menor ou igual a 10 o valor da conta é unico não precisa de conta
//            valor = valor + 26.18;
//        } else if (metros > 10) {//se o m³ for maior que 10 é necessario retirar 10 do total de metros gastos e multiplicar o resto com a tarifa e adicionar a tarifa de 10M³
//
//            metros -= 10;
//            valor = valor + 26.18 + (metros * 3.65);
//
//        } else if (metros > 20) {//se o m³ for maior que 20 é necessario retirar 20 do total de metros gastos e multiplicar o resto com a tarifa e adicionar a tarifa de 10M³ e da de 20M³
//
//            metros -= 20;
//            valor = valor + 26.18 + 36.5 + (metros * 5.61);
//
//        } else if (metros > 30) {//se o m³ for maior que 30 é necessario retirar 30 do total de metros gastos e multiplicar o resto com a tarifae adicionar a tarifa de 10M³ e da de 20M³ e da de 30M³
//
//            metros -= 30;
//            valor = valor + 26.18 + 36.5 + 56.1 + (metros * 5.61);
//
//        } else if (metros > 50) {//se o m³ for maior que 50 é necessario retirar 50 do total de metros gastos e multiplicar o resto com a tarifae adicionar a tarifa de 10M³ e da de 20M³ e da de 30M³ e a de 50M³
//
//            metros -= 50;
//            valor = valor + 26.18 + 36.5 + 56.1 + 56.1 + (metros * 6.71);
//
//        }
        int metros = (int) info.getTotalm3();
        double[] valorComp = {26.18, 26.18, 62.68, 118.78, 174.88};
        double[] valorComp2 = {0, 3.65, 5.61, 5.61, 6.71};
        int cont = 0;
        while (metros < 10) {
            metros -= 10;
            cont = 0;
        }
        if (cont > 5){
            cont = 5;
        }
        info.setValorRS(valorComp[cont] + metros * valorComp2[cont]);
    }

    public void mostrarValores() {
        lblChuveiro.setText(String.valueOf(info.getChuveiro()));
        lbldescarga.setText(String.valueOf(info.getPrivada()));
        lblmaquiL.setText(String.valueOf(info.getMaquinaL()));
        lblmaquiR.setText(String.valueOf(info.getMaquinaR()));
        lbltanque.setText(String.valueOf(info.getTanque()));
        lblpiaB.setText(String.valueOf(info.getPiaB()));
        lblpiaC.setText(String.valueOf(info.getPiaC()));
        info.calcularTotal();
        lblTotal.setText(String.valueOf(info.getTotal()));
        lbltotalM.setText(String.valueOf(info.getTotalm3()));
    }

    // metodos para setar o valor enviado de litros para cada objeto
    public void setLbltotalM(String lbltotalM) {
        this.lbltotalM.setText(lbltotalM);
    }

    public void setLblTotal(String lblTotal) {
        this.lblTotal.setText(lblTotal);
    }

    public void setLblChuveiro(String lblChuveiro) {
        this.lblChuveiro.setText(lblChuveiro);
    }

    public void setLbldescarga(String lbldescarga) {
        this.lbldescarga.setText(lbldescarga);
    }

    public void setLblmaquiL(String lblmaquiL) {
        this.lblmaquiL.setText(lblmaquiL);
    }

    public void setLblmaquiR(String lblmaquiR) {
        this.lblmaquiR.setText(lblmaquiR);
    }

    public void setLbltanque(String lbltanque) {
        this.lbltanque.setText(lbltanque);
    }

    public void setLblpiaB(String lblpiaB) {
        this.lblpiaB.setText(lblpiaB);
    }

    public void setLblpiaC(String lblpiaC) {
        this.lblpiaC.setText(lblpiaC);
    }

    //metodos utilizados para habilitar a visualização de um objeto ou a não visualização
    public void Chuv() {
        chuveiro.setVisible(true);
        lblChuveiro.setVisible(true);
    }

    public void Desc() {
        lbldescarga.setVisible(true);
        descarga.setVisible(true);
    }

    public void PiaBanho() {
        lblpiaB.setVisible(true);
        piaBanheiro.setVisible(true);
    }

    public void MaquiR() {
        maquinaRoupa.setVisible(true);
        lblmaquiR.setVisible(true);
    }

    public void Tanque() {
        lbltanque.setVisible(true);
        TanqueRoupa.setVisible(true);
    }

    public void MaquiL() {
        lblmaquiL.setVisible(true);
        maquinaLouca.setVisible(true);
    }

    public void PiaCoz() {
        lblpiaC.setVisible(true);
        piaCozinha.setVisible(true);
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
        Quantas = new javax.swing.JLabel();
        chuveiro = new javax.swing.JLabel();
        descarga = new javax.swing.JLabel();
        piaBanheiro = new javax.swing.JLabel();
        maquinaRoupa = new javax.swing.JLabel();
        TanqueRoupa = new javax.swing.JLabel();
        piaCozinha = new javax.swing.JLabel();
        maquinaLouca = new javax.swing.JLabel();
        Proximo = new javax.swing.JButton();
        lblChuveiro = new javax.swing.JLabel();
        lbldescarga = new javax.swing.JLabel();
        lblpiaB = new javax.swing.JLabel();
        lblmaquiR = new javax.swing.JLabel();
        lbltanque = new javax.swing.JLabel();
        lblpiaC = new javax.swing.JLabel();
        lblmaquiL = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        TotalM = new javax.swing.JLabel();
        lbltotalM = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resultado - Calculo de Conta de Água");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Quantas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Quantas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Quantas.setText("Total de agua gasta em Litros e M³");
        jPanel1.add(Quantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 375, -1));

        chuveiro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chuveiro.setText("Chuveiro");
        jPanel1.add(chuveiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        descarga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        descarga.setText("Descarga");
        jPanel1.add(descarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        piaBanheiro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        piaBanheiro.setText("lavar as mão");
        jPanel1.add(piaBanheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        maquinaRoupa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        maquinaRoupa.setText("Maquina de lavar Roupa");
        jPanel1.add(maquinaRoupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        TanqueRoupa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TanqueRoupa.setText("Tanque de lavar");
        jPanel1.add(TanqueRoupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        piaCozinha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        piaCozinha.setText("Pia da cozinha");
        jPanel1.add(piaCozinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        maquinaLouca.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        maquinaLouca.setText("Maquina de lavar louça");
        jPanel1.add(maquinaLouca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        Proximo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Proximo.setText("Próximo");
        Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProximoActionPerformed(evt);
            }
        });
        jPanel1.add(Proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        lblChuveiro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lblChuveiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 71, 14));

        lbldescarga.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lbldescarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 71, 14));

        lblpiaB.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lblpiaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 71, 14));

        lblmaquiR.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lblmaquiR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 71, 14));

        lbltanque.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lbltanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 71, 14));

        lblpiaC.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lblpiaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 71, 14));

        lblmaquiL.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lblmaquiL, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 71, 14));

        Total.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Total.setText("TOTAL em Litros");
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        lblTotal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 71, 14));

        TotalM.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TotalM.setText("TOTAL em M³");
        jPanel1.add(TotalM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        lbltotalM.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lbltotalM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 71, 14));

        btnVoltar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProximoActionPerformed
        this.setVisible(false);
        calcularValor();
        FrmResultado form = new FrmResultado();//instancia o Jframe3
        form.setarValores(info);
        form.setVisible(true);//deixa visivel o 3º JFrame
    }//GEN-LAST:event_ProximoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        FrmColetarInfo f = new FrmColetarInfo();
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
            java.util.logging.Logger.getLogger(FrmInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proximo;
    private javax.swing.JLabel Quantas;
    private javax.swing.JLabel TanqueRoupa;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalM;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel chuveiro;
    private javax.swing.JLabel descarga;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblChuveiro;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lbldescarga;
    private javax.swing.JLabel lblmaquiL;
    private javax.swing.JLabel lblmaquiR;
    private javax.swing.JLabel lblpiaB;
    private javax.swing.JLabel lblpiaC;
    private javax.swing.JLabel lbltanque;
    private javax.swing.JLabel lbltotalM;
    private javax.swing.JLabel maquinaLouca;
    private javax.swing.JLabel maquinaRoupa;
    private javax.swing.JLabel piaBanheiro;
    private javax.swing.JLabel piaCozinha;
    // End of variables declaration//GEN-END:variables
}
