/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author user
 */
import clases.*;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        txtparteentera1.requestFocusInWindow();
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
        jLabel1 = new javax.swing.JLabel();
        txtparteentera1 = new javax.swing.JTextField();
        txtparteimaginaria1 = new javax.swing.JTextField();
        cmbopc = new javax.swing.JComboBox<>();
        txtparteimaginaria2 = new javax.swing.JTextField();
        txtparteentera2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtre = new javax.swing.JTextField();
        txtri = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnumr = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtdenr = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmdcalcular = new javax.swing.JButton();
        cmdlimpiar = new javax.swing.JButton();
        txtnumi = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtdeni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("OPERACIONES CON NUMEROS COMPLEJOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 270, 40));

        txtparteentera1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtparteentera1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtparteentera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, 30));
        jPanel1.add(txtparteimaginaria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 80, 30));

        cmbopc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumado", "Restado", "Multiplicado", "Dividido" }));
        jPanel1.add(cmbopc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 100, 30));

        txtparteimaginaria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtparteimaginaria2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtparteimaginaria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 80, 30));
        jPanel1.add(txtparteentera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 80, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("i");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("i");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("+");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("+");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Z");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Z");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        txtre.setEditable(false);
        jPanel1.add(txtre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 80, 30));

        txtri.setEditable(false);
        txtri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtriActionPerformed(evt);
            }
        });
        jPanel1.add(txtri, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("i");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 10, 20));

        txtnumr.setEditable(false);
        txtnumr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumrActionPerformed(evt);
            }
        });
        jPanel1.add(txtnumr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 90, 10));

        txtdenr.setEditable(false);
        txtdenr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdenrActionPerformed(evt);
            }
        });
        jPanel1.add(txtdenr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("+");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 20, 20));

        cmdcalcular.setText("Calcular");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 123, 100, 30));

        cmdlimpiar.setText("Limpiar");
        cmdlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 100, 30));

        txtnumi.setEditable(false);
        jPanel1.add(txtnumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 80, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 90, 10));

        txtdeni.setEditable(false);
        jPanel1.add(txtdeni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 80, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("+");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("i");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 10, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("i");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 10, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Resultado Division: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtparteentera1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtparteentera1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtparteentera1ActionPerformed

    private void txtparteimaginaria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtparteimaginaria2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtparteimaginaria2ActionPerformed

    private void txtriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtriActionPerformed

    private void txtdenrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdenrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdenrActionPerformed

    private void txtnumrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumrActionPerformed

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed

        try {
        int opc, pr1, pr2, pi1, pi2,den;
        Complejos c1, c2, c3;
        opc = cmbopc.getSelectedIndex();
        pr1 = Integer.parseInt(txtparteentera1.getText());
        pr2 = Integer.parseInt(txtparteentera2.getText());
        pi1 = Integer.parseInt(txtparteimaginaria1.getText());
        pi2 = Integer.parseInt(txtparteimaginaria2.getText());

        c1 = new Complejos(pr1, pr2);
        c2 = new Complejos(pi1, pi2);

        switch (opc) {
            case 0:
                c3 = c1.sumar(c2);
                txtre.setText("" + c3.getPartereal());
                txtri.setText("" + c3.getParteI());
                break;
            case 1:
                c3 = c1.restar(c2);
                txtre.setText("" + c3.getPartereal());
                txtri.setText("" + c3.getParteI());
                break;
            case 2:
                c3 = c1.Multiplicar(c2);
                txtre.setText("" + c3.getPartereal());
                txtri.setText("" + c3.getParteI());
                break;
            case 3:
                c3 = c1.Dividir(c2);
                txtre.setText("");
                txtri.setText("");
                den =((c2.getPartereal() * c2.getPartereal()) + (c2.getParteI() * c2.getParteI()));
                txtnumr.setText("" + c3.getPartereal());
                txtnumi.setText("" + c3.getParteI());
                txtdeni.setText(""+ den);
                txtdenr .setText("" + den);
                break;
        }
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Escriba bien los numeros", "Error", JOptionPane.ERROR_MESSAGE);
           txtparteentera1.requestFocusInWindow();
            txtdenr.setText("");
            txtdeni.setText("");
            txtnumi.setText("");
            txtnumr.setText("");
            txtparteentera1.setText("");
            txtparteentera2.setText("");
            txtparteimaginaria1.setText("");
            txtparteimaginaria2.setText("");
            txtre.setText("");
            txtri.setText("");
        }


    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void cmdlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdlimpiarActionPerformed
    txtparteentera1.requestFocusInWindow();
            txtdenr.setText("");
            txtdeni.setText("");
            txtnumi.setText("");
            txtnumr.setText("");
            txtparteentera1.setText("");
            txtparteentera2.setText("");
            txtparteimaginaria1.setText("");
            txtparteimaginaria2.setText("");
            txtre.setText("");
            txtri.setText("");
    }//GEN-LAST:event_cmdlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbopc;
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JButton cmdlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtdeni;
    private javax.swing.JTextField txtdenr;
    private javax.swing.JTextField txtnumi;
    private javax.swing.JTextField txtnumr;
    private javax.swing.JTextField txtparteentera1;
    private javax.swing.JTextField txtparteentera2;
    private javax.swing.JTextField txtparteimaginaria1;
    private javax.swing.JTextField txtparteimaginaria2;
    private javax.swing.JTextField txtre;
    private javax.swing.JTextField txtri;
    // End of variables declaration//GEN-END:variables
}
