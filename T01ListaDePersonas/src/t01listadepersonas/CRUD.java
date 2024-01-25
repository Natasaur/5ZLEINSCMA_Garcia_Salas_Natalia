package t01listadepersonas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.util.ArrayList;


/**
 *
 * @author jakeg
 */
public class CRUD extends javax.swing.JFrame {
    int id;
    String nombre;
    int edad;
    String resultado = "";
    ArrayList<String> historial;

    /**
     * Creates new form CRUD
     */
    public CRUD() {
        initComponents();
        this.setLocationRelativeTo(null);
        historial = new ArrayList<>();
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
        salirButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        mostrarButton = new javax.swing.JButton();
        registrarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        edadLabel = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmostrar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CRUD - Registro de Personas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 330, 50));

        salirButton.setText("Salir");
        jPanel1.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        mostrarButton.setText("Mostrar");
        mostrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarButtonActionPerformed(evt);
            }
        });

        registrarButton.setText("Registrar");
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });

        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(mostrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 160, 230));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        idLabel.setText("ID:");

        nombreLabel.setText("Nombre:");

        edadLabel.setText("Edad:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 320, 270));

        txtmostrar.setColumns(20);
        txtmostrar.setRows(5);
        jScrollPane1.setViewportView(txtmostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 440, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarButtonActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText(resultado);
    }//GEN-LAST:event_mostrarButtonActionPerformed

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        // TODO add your handling code here:
        id = Integer.parseInt(txtID.getText());
        nombre = txtNombre.getText();
        edad = Integer.parseInt(txtEdad.getText());
        resultado = "ID: " + id + "\t Nombre: " + nombre + "\t Edad: " + edad;
        txtID.setText(null);
        txtEdad.setText(null);
        txtNombre.setText(null);
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
        txtID.setText(null);
        txtNombre.setText(null);
        txtEdad.setText(null);
        txtmostrar.setText(null);

        historial.clear();
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        // TODO add your handling code here:
         int idAModificar = Integer.parseInt(txtID.getText());
        String nuevoNombre = txtNombre.getText();
        int nuevaEdad = Integer.parseInt(txtEdad.getText());

        for (int i = 0; i < historial.size(); i++) {
            String[] partes = historial.get(i).split("\t");
            id = Integer.parseInt(partes[0].replace("ID:", ""));
            if (id == idAModificar) {
                historial.set(i, "ID: " + idAModificar + "\t Nombre: " + nuevoNombre + "\t : " + nuevaEdad);
                break;
            }
        }

        String historialCompleto = "";
        for (String r : historial) {
            historialCompleto += r + "\n";
        }
        txtmostrar.setText(historialCompleto);
    }                                        

    public void enviarMensaje(){
        //txtmostrar.setText(String resultado.getText("ID: " + id + "\t Nombre: " + nombre + "\t : " + edad));
        txtmostrar.setText("ID: " + id + "\t Nombre: " + nombre + "\t : " + edad);
    }//GEN-LAST:event_editarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel edadLabel;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrarButton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JButton registrarButton;
    private javax.swing.JButton salirButton;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtmostrar;
    // End of variables declaration//GEN-END:variables
}
