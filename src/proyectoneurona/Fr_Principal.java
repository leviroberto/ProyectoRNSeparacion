/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoneurona;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Fr_Principal extends javax.swing.JFrame {

    private List<Entradas> listaEntrdas = new ArrayList<Entradas>();

    int[][] listaNuuronasEntradas = {
        {1, 1, 1, 1, 1},
        {1, 1, 1, 0, 1},
        {1, 1, 0, 1, 1},
        {1, 1, 0, 0, 0},
        {1, 0, 1, 1, 1},
        {1, 0, 1, 0, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 0, 0},
        {0, 1, 1, 1, 1},
        {0, 1, 1, 0, 0},
        {0, 1, 0, 1, 0},
        {0, 1, 0, 0, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 0, 1, 0},
        {0, 0, 0, 0, 0}
    };

    double w1, w2, w3, w4;
    double O = -0.4;//umbral
    double neurona = 0;
    final double E = 0.6;//FACTOR DE APRENDIZAJE
    double net = 0;

    public Fr_Principal() {
        initComponents();

        inicializadores();
        // llenarListaEntradas();
    }

    void inicializadores() {
        w1 = 0.5;//valores proximos a cero
        w2 = 0.3;//valores proximos a cero
        w3 = 0.4;//valores proximos a cero
        w4 = 0.5;//valores proximos a cero

    }

    void llenarListaEntradas() {
        Entradas e1 = new Entradas(1, 1, 1, 1);
        Entradas e2 = new Entradas(1, 1, 0, 1);
        Entradas e3 = new Entradas(1, 0, 1, 1);
        Entradas e4 = new Entradas(1, 0, 0, 0);
        Entradas e5 = new Entradas(0, 1, 1, 1);
        Entradas e6 = new Entradas(0, 1, 0, 0);
        Entradas e7 = new Entradas(0, 0, 1, 0);
        Entradas e8 = new Entradas(0, 0, 0, 0);
        listaEntrdas.add(e1);
        listaEntrdas.add(e2);
        listaEntrdas.add(e3);
        listaEntrdas.add(e4);
        listaEntrdas.add(e5);
        listaEntrdas.add(e6);
        listaEntrdas.add(e7);
        listaEntrdas.add(e8);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setText("Entrenar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Equipo psicologico");

        rb1.setText("Ingreso economico bajo");

        rb2.setText("Vivienda alquilada");

        rb3.setText("Alguno de ellos es divociado");

        rb4.setText("Desigual nivel de estudios");

        jButton4.setText("Verificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb2)
                            .addComponent(rb1)
                            .addComponent(rb3)
                            .addComponent(rb4)
                            .addComponent(jButton4))))
                .addContainerGap(745, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(rb1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(rb2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb3)
                .addGap(13, 13, 13)
                .addComponent(rb4)
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        entrenar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        buscarDatosNeurona();
    }//GEN-LAST:event_jButton4ActionPerformed

    void buscarDatosNeurona() {
        int[][] listaIndiceNotas = obtenerIndiceNotas();
        if (listaIndiceNotas != null) {
            net = Math.tanh((listaIndiceNotas[0][0] * w1)
                    + ((listaIndiceNotas[0][1] * w2))
                    + ((listaIndiceNotas[0][2] * w3))
                    + ((listaIndiceNotas[0][3] * w4))
                    + (-1 * O)
            );
            net = (net >= O) ? 1 : -1;
            if (net >= 1) {
                int estado = obtenerEstadoNota(listaIndiceNotas[0][0], listaIndiceNotas[0][1], listaIndiceNotas[0][2], listaIndiceNotas[0][3]);
                if (estado == 1) {
                    JOptionPane.showMessageDialog(null, "Las personas podrian divorsirse");
                } else {
                    JOptionPane.showMessageDialog(null, "Las personas no podrian divorsiarse");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Se desconoce esa funcion para ejecutar");

            }
        }

    }

    private int obtenerEstadoNota(int x1, int x2, int x3, int x4) {
        int salida = -1;
        for (int i = 0; i < listaNuuronasEntradas.length; i++) {
            if (listaNuuronasEntradas[i][0] == x1 && listaNuuronasEntradas[i][1] == x2 && listaNuuronasEntradas[i][2] == x3 && listaNuuronasEntradas[i][3] == x4) {
                salida = listaNuuronasEntradas[i][4];
            }
        }

        return salida;
    }

    int[][] obtenerIndiceNotas() {
        int[][] listaNotas = new int[1][4];

        if (rb1.isSelected()) {
            listaNotas[0][0] = 1;
        } else {
            listaNotas[0][0] = 0;

        }

        if (rb2.isSelected()) {
            listaNotas[0][1] = 1;
        } else {
            listaNotas[0][1] = 0;

        }

        if (rb3.isSelected()) {
            listaNotas[0][2] = 1;
        } else {
            listaNotas[0][2] = 0;

        }

        if (rb4.isSelected()) {
            listaNotas[0][3] = 1;
        } else {
            listaNotas[0][3] = 0;

        }

        return listaNotas;
    }

    void entrenar() {
        int i = 0;
        int cont = 1;
        while (i < listaNuuronasEntradas.length && cont < 100) {
            net = Math.tanh(
                    (listaNuuronasEntradas[i][0] * w1)
                    + (listaNuuronasEntradas[i][1] * w2)
                    + (listaNuuronasEntradas[i][2] * w3)
                    + (listaNuuronasEntradas[i][3] * w4)
                    + (-1 * O)
            );
            net = (net >= O) ? 1 : -1;
            if (net == listaNuuronasEntradas[i][4]) {
                i++;
            } else {
                //regla delta generalizada
                w1 = w1 + 2 * E * listaNuuronasEntradas[i][4] * listaNuuronasEntradas[i][0];
                w2 = w2 + 2 * E * listaNuuronasEntradas[i][4] * listaNuuronasEntradas[i][1];
                w3 = w3 + 2 * E * listaNuuronasEntradas[i][4] * listaNuuronasEntradas[i][2];
                w4 = w4 + 2 * E * listaNuuronasEntradas[i][4] * listaNuuronasEntradas[i][3];

                O = O * 2 * E * listaNuuronasEntradas[i][4] * (-1);
                cont++;
                i = 0;
            }
        }

        if (cont < 9999) {
            JOptionPane.showMessageDialog(null, "Fase de aprendizaje termino con exito");

        } else {
            JOptionPane.showMessageDialog(null, "Fase de aprendizaje ha fallado");

        }
    }

    Entradas verificarSiExisteValores(int x1, int x2, int x3) {
        Entradas entradass = null;

        for (Entradas entradas : listaEntrdas) {
            if (entradas.getY1() == x1 && entradas.getY2() == x2 && entradas.getY3() == x3) {
                entradass = entradas;
            }
        }

        return entradass;
    }

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
            java.util.logging.Logger.getLogger(Fr_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    // End of variables declaration//GEN-END:variables
}
