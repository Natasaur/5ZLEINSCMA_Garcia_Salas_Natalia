/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jakeg
 */
import javax.swing.*;
import java.util.*;

public class DatosEncabezadoFrame extends JFrame {
    
    int numReporte,numMuestras,puntos;
    double total = 0;
    String modelo;
    String[] colores = new String[10];
    double[] valores = new double[11];
    ArrayList<Lista> listadedatos = new ArrayList();
    ArrayList<Tabla> tablas = new ArrayList();
    
    public DatosEncabezadoFrame() {
        initComponents();
    }

    
    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        numReporteLabel = new javax.swing.JLabel();
        modeloLabel = new javax.swing.JLabel();
        numMuestreoLabel = new javax.swing.JLabel();
        puntosAMedirLabel = new javax.swing.JLabel();
        numReporteField = new javax.swing.JTextField();
        modeloField = new javax.swing.JTextField();
        numMuestreoField = new javax.swing.JTextField();
        numPuntosAMedirField = new javax.swing.JTextField();
        guardarButton = new javax.swing.JButton();
        borrarButton = new javax.swing.JButton();
        agregarTablaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));

        principalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        titleLabel.setText("Plantilla Inspección de Medidas");
        principalPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        numReporteLabel.setText("No. de Reporte:");
        principalPanel.add(numReporteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        modeloLabel.setText("Modelo: ");
        principalPanel.add(modeloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        numMuestreoLabel.setText("Muestreo de Prendas:");
        principalPanel.add(numMuestreoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        puntosAMedirLabel.setText("Puntos a medir:");
        principalPanel.add(puntosAMedirLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        numReporteField.setPreferredSize(new java.awt.Dimension(150, 30));
        principalPanel.add(numReporteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 30));
        principalPanel.add(modeloField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 30));
        principalPanel.add(numMuestreoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, 30));
        principalPanel.add(numPuntosAMedirField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, 30));

        guardarButton.setText("Guardar Parámetros");
        guardarButton.setPreferredSize(new java.awt.Dimension(150, 70));
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });
        principalPanel.add(guardarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 160, 70));

        borrarButton.setText("Borrar");
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });
        principalPanel.add(borrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 160, 70));

        agregarTablaButton.setText("Agregar Tabla");
        agregarTablaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTablaButtonActionPerformed(evt);
            }
        });
        principalPanel.add(agregarTablaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 160, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        numReporte = Integer.parseInt(numReporteField.getText());
        numMuestras = Integer.parseInt(numMuestreoField.getText());
        puntos = Integer.parseInt(numPuntosAMedirField.getText());
        modelo = modeloField.getText();
        borrar();
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void borrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed
        borrar();
    }//GEN-LAST:event_borrarButtonActionPerformed

    private void agregarTablaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTablaButtonActionPerformed
        String[] puntosAMedir = new String[puntos];
        for(int i = 0; i < numMuestras;i++){
            for(int n = 0;n < 10;n++){
                colores[n] = JOptionPane.showInputDialog("Ingrese el color de la columna " + (n+1));
            }
            for(int j = 0;j < puntos;j++){
                puntosAMedir[j] = JOptionPane.showInputDialog("Ingrese los puntos a medir del muestreo No. " + (j+1));
                total = 0;
                for(int m = 0;m < 10;m++){
                    valores[m] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor " + (m+1)));
                    total = total + valores[m];
                }
                valores[10] = total;
                Lista newfila = new Lista();
                newfila.setFila(valores);
                listadedatos.add(newfila);
            }
            Tabla newtabla = new Tabla();
            newtabla.setColores(colores);
            newtabla.setPuntosAMedir(puntosAMedir);
            newtabla.setValores(listadedatos);
            tablas.add(newtabla);
        }
        Tabla pruebatabla = new Tabla();
        pruebatabla = tablas.get(0);
        String[] pruebacolores = pruebatabla.getColores();
        String[] pruebapuntos = pruebatabla.getPuntosAMedir();
            for(int n = 0;n < 10;n++){
                System.out.print(pruebacolores[n] + "   ");
            }
            System.out.println();
            for(String a: pruebapuntos){
                System.out.print(a + "   ");
            }
            System.out.println();
            
            pruebatabla = tablas.get(1);
            pruebacolores = pruebatabla.getColores();
            pruebapuntos = pruebatabla.getPuntosAMedir();
            for(int n = 0;n < 10;n++){
                System.out.print(pruebacolores[n] + "   ");
            }
            System.out.println();
            for(String a: pruebapuntos){
                System.out.print(a + "   ");
            }
            System.out.println();
        
        
        //Probar si los datos están bien guardados
        /**
         * Crea una copia de la primera posición del ArrayList en la variable 
         *          imptabla de tipo "Tabla" para acceder a sus elementos 
         * 
         * ArrayList:
         * Posición 0: contiene el primer objeto tipo "Tabla" ingresado
         * Posición 1: contiene el segundo objeto tipo "Tabla" ingresado
         * Posición 2: etc.....
         * 
         * Primer Objeto Tipo Tabla (imptabla):
         * Posición 0: contiene un vector de tipo String[] que contiene los
         *              encabezados de los colores
         * Posición 1: contiene un vector de tipo String[] que contiene las 
         *              primeras posiciones de las filas en donde se colocan los
         *              datos (puntos a medir)
         * Posición 2: contiene un ArrayList de tipo "Lista", de la cual se crea
         *              una copia en la variable implista para acceder a sus 
         *              elementos
         * 
         * Primer Objeto Tipo Lista (implista): -> tiene tantos vectores como
         *              puntos a medir se hayan ingresado
         * Posición 0: contiene un vector con 11 datos ingresados por el usuario
         *              para el primer punto a medir
         * Posición 1: contiene un vector con 11 datos ingresados por el usuario
         *              para el segundo punto a medir
         * Posición 2: etc........
         **/
        String[] encabezado = new String[];
        for(int i = 0;i < tablas.size();i++){
           Tabla imptabla = tablas.get(i);
           //String[] encabezado = imptabla.getColores();
           String[] titulospuntos = imptabla.getPuntosAMedir();
           ArrayList <Lista> listas = imptabla.getValores();
           System.out.print("  Puntos a medir   ");
           for(int a = 0;a < titulospuntos.length;a++){
               System.out.print(encabezado[a] + "    ");
           }
           System.out.println();
           for(int j = 0;j < listas.size();j++){
               Lista implista = listas.get(j);
               double[] listavalores = implista.getFila();
               for(int k = 0;k < titulospuntos.length;k++){
                   System.out.print(titulospuntos[k] + "   ");
                   for(int m = 0;m < listavalores.length;m++){
                       System.out.print(listavalores[m] + "");
                   }
                   System.out.println();
                }
           }
           System.out.println();
           System.out.println();
        }
    }//GEN-LAST:event_agregarTablaButtonActionPerformed

    public void borrar(){
        numReporteField.setText("");
        numMuestreoField.setText("");
        numPuntosAMedirField.setText("");
        modeloField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarTablaButton;
    private javax.swing.JButton borrarButton;
    private javax.swing.JButton guardarButton;
    private javax.swing.JTextField modeloField;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JTextField numMuestreoField;
    private javax.swing.JLabel numMuestreoLabel;
    private javax.swing.JTextField numPuntosAMedirField;
    private javax.swing.JTextField numReporteField;
    private javax.swing.JLabel numReporteLabel;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JLabel puntosAMedirLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    
}
