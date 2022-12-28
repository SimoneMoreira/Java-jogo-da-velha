

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simone
 */
public class JogoDaVellha extends javax.swing.JFrame {

    int vez = 1, contador = 0;
    String[][] matriz = new String[3][3];
    String linha1, linha2, linha3, col1, col2, col3, d1, d2, verifica;

    public void ganhador() {
      

        linha1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        linha2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
        linha3 = matriz[2][0] + matriz[2][1] + matriz[2][2];

        col1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
        col2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
        col3 = matriz[0][2] + matriz[1][2] + matriz[2][2];

        d1 = matriz[0][2] + matriz[1][1] + matriz[2][0];
        d2 = matriz[0][0] + matriz[1][1] + matriz[2][2];

        if (contador >= 9) {
            ganha.setText(" NINGUÉM GANHOU");
        }
        if (linha1.equals("XXX") && vez == 2) {

            ganha.setText(" X     VENCEU");
           
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
           
           contador=10;

        }
        if (linha1.equals("OOO") && vez == 1) {

            ganha.setText("O     VENCEU");
           
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
        
            contador=10;
            

        }

        if (linha2.equals("XXX") && vez == 2) {

            ganha.setText(" X     VENCEU");

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            
            contador=10;
        }

        if (linha2.equals("OOO") && vez == 1) {

            ganha.setText(" O     VENCEU");

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            
            contador=10;
        }

        if (linha3.equals("XXX") && vez == 2) {

            ganha.setText(" X     VENCEU");

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            
            contador=10;
        }

        if (linha3.equals("OOO") && vez == 1) {

            ganha.setText(" O     VENCEU");

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            
            contador=10;
        }
        if (col1.equals("XXX") && vez == 2) {

            ganha.setText(" X     VENCEU");

            b2.setEnabled(false);
            b5.setEnabled(false);
            b8.setEnabled(false);
            b3.setEnabled(false);
            b6.setEnabled(false);
            b9.setEnabled(false);
            
            b1.setEnabled(true);
            b4.setEnabled(true);
            b7.setEnabled(true);
            
            contador=10;

        }
        if (col1.equals("OOO") && vez == 1) {

            ganha.setText("0     VENCEU");

            b2.setEnabled(false);
            b5.setEnabled(false);
            b8.setEnabled(false);
            b3.setEnabled(false);
            b6.setEnabled(false);
            b9.setEnabled(false);
            
            b1.setEnabled(true);
            b4.setEnabled(true);
            b7.setEnabled(true);
            
         contador=10;
         
        }

        if (col2.equals("XXX") && vez == 2) {

            ganha.setText(" X     VENCEU");

            b1.setEnabled(false);
            b4.setEnabled(false);
            b7.setEnabled(false);
            b3.setEnabled(false);
            b6.setEnabled(false);
            b9.setEnabled(false);
            
            b2.setEnabled(true);
            b5.setEnabled(true);
            b8.setEnabled(true);
            
            contador=10;
        }

        if (col2.equals("OOO") && vez == 1) {

            ganha.setText(" O     VENCEU");

            b1.setEnabled(false);
            b4.setEnabled(false);
            b7.setEnabled(false);
            b3.setEnabled(false);
            b6.setEnabled(false);
            b9.setEnabled(false);
            
            b2.setEnabled(true);
            b5.setEnabled(true);
            b8.setEnabled(true);
            
            contador=10;
        }

        if (col3.equals("XXX") && vez == 2) {

            ganha.setText(" X     VENCEU");

            b1.setEnabled(false);
            b4.setEnabled(false);
            b7.setEnabled(false);
            b2.setEnabled(false);
            b5.setEnabled(false);
            b8.setEnabled(false);
            
            b3.setEnabled(true);
            b6.setEnabled(true);
            b9.setEnabled(true);
            
            contador=10;
        }

        if (col3.equals("OOO") && vez == 1) {

            ganha.setText(" O     VENCEU");

            b1.setEnabled(false);
            b4.setEnabled(false);
            b7.setEnabled(false);
            b2.setEnabled(false);
            b5.setEnabled(false);
            b8.setEnabled(false);
            
            b3.setEnabled(true);
            b6.setEnabled(true);
            b9.setEnabled(true);
            
            contador=10;
        }
        if (d1.equals("XXX") && vez == 2) {

            ganha.setText(" X    VENCEU");

            b1.setEnabled(false);
            b4.setEnabled(false);
            b2.setEnabled(false);
            b8.setEnabled(false);
            b6.setEnabled(false);
            b9.setEnabled(false);
            
            b3.setEnabled(true);
            b5.setEnabled(true);
            b7.setEnabled(true);
            
            contador=10;
        }
        if (d1.equals("OOO") && vez == 1) {

            ganha.setText(" O    VENCEU");

            b1.setEnabled(false);
            b4.setEnabled(false);
            b2.setEnabled(false);
            b8.setEnabled(false);
            b6.setEnabled(false);
            b9.setEnabled(false);
            
            b3.setEnabled(true);
            b5.setEnabled(true);
            b7.setEnabled(true);
            
            contador=10;
        }
        if (d2.equals("XXX") && vez == 2) {

            ganha.setText(" X    VENCEU");

            b4.setEnabled(false);
            b7.setEnabled(false);
            b2.setEnabled(false);
            b8.setEnabled(false);
            b3.setEnabled(false);
            b6.setEnabled(false);
            
            b1.setEnabled(true);
            b5.setEnabled(true);
            b9.setEnabled(true);
            
            contador=10;
        }
        if (d2.equals("OOO") && vez == 1) {

            ganha.setText(" O    VENCEU");

            b4.setEnabled(false);
            b7.setEnabled(false);
            b2.setEnabled(false);
            b8.setEnabled(false);
            b3.setEnabled(false);
            b6.setEnabled(false);
            
            b1.setEnabled(true);
            b5.setEnabled(true);
            b9.setEnabled(true);
            
            contador=10;
        }

    }

    public JogoDaVellha() {
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

        jPanel1 = new javax.swing.JPanel();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        ganha = new javax.swing.JLabel();
        reinicia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        ganha.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ganha.setText("       X      COMEÇA O JOGO");
        ganha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        reinicia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reinicia.setLabel("REINICIAR");
        reinicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(reinicia, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(ganha, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(ganha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reinicia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

        if (vez == 1 && contador <= 9 ) {
            b2.setText("X");
            matriz[0][1] = "X";

            ganha.setText("   VEZ DO    O");
            vez = 2;
           
        } else if (contador <= 9   ) {
            b2.setText("O");
            matriz[0][1] = "O";

            ganha.setText("   VEZ DO    X");
            vez = 1;
        }
        
        contador = contador + 1;
      
        b2.setEnabled(false);
        ganhador();
        

    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

        if (vez == 1 && contador <= 9) {
            b3.setText("X");
            matriz[0][2] = "X";
            ganha.setText("   VEZ DO    O");
            vez = 2;
        } else if (contador <= 9) {
            b3.setText("O");
            matriz[0][2] = "O";
            ganha.setText("   VEZ DO    X");
            vez = 1;
        }
        contador = contador + 1;
        b3.setEnabled(false);
        ganhador();
        
    }//GEN-LAST:event_b3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed

        if (vez == 1 && contador <= 9) {
            b6.setText("X");
            matriz[1][2] = "X";

            ganha.setText("   VEZ DO    O");
            vez = 2;
        } else if (contador <= 9) {
            b6.setText("O");
            matriz[1][2] = "O";

            ganha.setText("   VEZ DO    X");
            vez = 1;
        }
        contador = contador + 1;
          b6.setEnabled(false);
        ganhador();
       
    }//GEN-LAST:event_b6ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        if (vez == 1 && contador <= 9) {
            b1.setText("X");
            matriz[0][0] = "X";

            ganha.setText("   VEZ DO    O");
            vez = 2;
        } else if (contador <= 9) {
            b1.setText("O");
            matriz[0][0] = "O";

            ganha.setText("   VEZ DO    X");
            vez = 1;
        }
        contador = contador + 1;
        b1.setEnabled(false);
        ganhador();
       

    }//GEN-LAST:event_b1ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed

        if (vez == 1 && contador <= 9) {
            b5.setText("X");
            matriz[1][1] = "X";

            ganha.setText("   VEZ DO    O");
            vez = 2;
        } else if (contador <= 9) {
            b5.setText("O");
            matriz[1][1] = "O";

            ganha.setText("   VEZ DO    X");
            vez = 1;
        }
        contador = contador + 1;
          b5.setEnabled(false);
        ganhador();
       

    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed

        if (vez == 1 && contador <= 9) {
            b4.setText("X");
            matriz[1][0] = "X";

            ganha.setText("   VEZ DO    O");
            vez = 2;
        } else if (contador <= 9) {
            b4.setText("O");
            matriz[1][0] = "O";

            ganha.setText("   VEZ DO    X");
            vez = 1;
        }
        contador = contador + 1;
        b4.setEnabled(false);
        ganhador();
         
    }//GEN-LAST:event_b4ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed

        if (vez == 1 && contador <= 9) {
            b7.setText("X");
            matriz[2][0] = "X";

            ganha.setText("   VEZ DO    O");
            vez = 2;
        } else if (contador <= 9) {
            b7.setText("O");
            matriz[2][0] = "O";

            ganha.setText("   VEZ DO    X");
            vez = 1;
        }
        contador = contador + 1;
        b7.setEnabled(false);
        ganhador();
         
    }//GEN-LAST:event_b7ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed

        if (vez == 1 && contador <= 9) {
            b9.setText("X");
            matriz[2][2] = "X";

            ganha.setText("   VEZ DO    O");
            vez = 2;
        } else if (contador <= 9) {
            b9.setText("O");
            matriz[2][2] = "O";

            ganha.setText("   VEZ DO    X");
            vez = 1;
        }
        contador = contador + 1;
         b9.setEnabled(false);
        ganhador();
        
    }//GEN-LAST:event_b9ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed

        if (vez == 1 && contador <= 9) {
            b8.setText("X");
            matriz[2][1] = "X";

            ganha.setText("   VEZ DO    O");
            vez = 2;
        } else if (contador <= 9) {
            b8.setText("O");
            matriz[2][1] = "O";

            ganha.setText("   VEZ DO    X");
            vez = 1;
        }
        contador = contador + 1;
         b8.setEnabled(false);
        ganhador();
        
    }//GEN-LAST:event_b8ActionPerformed

    private void reiniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciaActionPerformed
        new JogoDaVellha().setVisible(true);
    }//GEN-LAST:event_reiniciaActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVellha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVellha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVellha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVellha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVellha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel ganha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reinicia;
    // End of variables declaration//GEN-END:variables
}
