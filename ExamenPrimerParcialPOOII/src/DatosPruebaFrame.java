/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jakeg
 */
import javax.swing.*;
public class DatosPruebaFrame extends JFrame {
    int puntos,numValores,numColores;
    public DatosPruebaFrame() {
        setTitle("Registro de Datos");
        //setSize(400, 250);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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

        datosPanel = new javax.swing.JPanel();
        registroDatosLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        puntosAMedirField = new javax.swing.JTextField();
        registrarPuntosButton = new javax.swing.JButton();
        valoresButton = new javax.swing.JButton();
        coloresButton = new javax.swing.JButton();
        valoresLabel = new javax.swing.JLabel();
        valoresField = new javax.swing.JTextField();
        coloresLabel = new javax.swing.JLabel();
        coloresField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datosPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registroDatosLabel.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        registroDatosLabel.setText("Registro de Datos");
        datosPanel.add(registroDatosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 240, 40));

        jLabel1.setText("Puntos a medir:");
        datosPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        datosPanel.add(puntosAMedirField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 120, 30));

        registrarPuntosButton.setText("Registrar");
        registrarPuntosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPuntosButtonActionPerformed(evt);
            }
        });
        datosPanel.add(registrarPuntosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 150, 30));

        valoresButton.setText("Ingresar Valores");
        valoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valoresButtonActionPerformed(evt);
            }
        });
        datosPanel.add(valoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 150, 30));

        coloresButton.setText("Ingresar Colores");
        datosPanel.add(coloresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 150, 30));

        valoresLabel.setText("Valores a ingresar:");
        datosPanel.add(valoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        datosPanel.add(valoresField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, 30));

        coloresLabel.setText("Colores a Ingresar:");
        datosPanel.add(coloresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        datosPanel.add(coloresField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(datosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(datosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarPuntosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPuntosButtonActionPerformed
        puntos = Integer.parseInt(puntosAMedirField.getText());
        puntosAMedirField.setText("");
        
        
    }//GEN-LAST:event_registrarPuntosButtonActionPerformed

    private void valoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valoresButtonActionPerformed
        
    }//GEN-LAST:event_valoresButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coloresButton;
    private javax.swing.JTextField coloresField;
    private javax.swing.JLabel coloresLabel;
    private javax.swing.JPanel datosPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField puntosAMedirField;
    private javax.swing.JButton registrarPuntosButton;
    private javax.swing.JLabel registroDatosLabel;
    private javax.swing.JButton valoresButton;
    private javax.swing.JTextField valoresField;
    private javax.swing.JLabel valoresLabel;
    // End of variables declaration//GEN-END:variables
}
