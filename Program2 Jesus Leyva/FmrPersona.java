/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;

import clases.persona;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus03
 */
public class FmrPersona extends javax.swing.JFrame {

    /**
     * Creates new form FmrPersona
     */
    public FmrPersona() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        DIRECCION = new javax.swing.JLabel();
        EDAD = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        GUARDAR = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        btnGuardar2 = new javax.swing.JToggleButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario");

        jLabel1.setText("Administracion de persona");

        NOMBRE.setText("Nombre:");

        apellido.setText("Apellido:");

        DIRECCION.setText("Direccion:");

        EDAD.setText("Edad:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        GUARDAR.setText("imprimir");
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });

        lblNombre.setText("N:");

        lblApellido.setText("A:");

        lblDireccion.setText("D:");

        lblEdad.setText("E:");

        btnGuardar2.setText("Guardar");
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });

        lblResultado.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NOMBRE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(apellido))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DIRECCION)
                            .addComponent(EDAD))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(txtApellido)
                            .addComponent(txtDireccion)
                            .addComponent(txtNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(90, 90, 90)
                                .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GUARDAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar2)))))
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NOMBRE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DIRECCION)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EDAD)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblResultado))
                .addGap(14, 14, 14)
                .addComponent(lblApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEdad)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GUARDAR)
                    .addComponent(btnGuardar2))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>                        

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        String Nombre = txtNombre.getText();
        String Apellido = txtApellido.getText();
        String Direccion = txtDireccion.getText();
        String Edad = txtEdad.getText();
        
        lblNombre.setText(Nombre);
        lblApellido.setText(Apellido);
        lblDireccion.setText(Direccion);
        lblEdad.setText(Edad);
        
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtEdad.setText("");
        txtNombre.requestFocus();
    }                                       

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        String Nombre = txtNombre.getText();
        String Apellido = txtApellido.getText();
        String Direccion = txtDireccion.getText();
        String Edad = txtEdad.getText();
        
        persona.agregar(Nombre, Apellido, Direccion, Edad);
        lblResultado.setText("Se a guardado a:"+persona.obtenerLista());
    }                                           

    
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
            java.util.logging.Logger.getLogger(FmrPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel DIRECCION;
    private javax.swing.JLabel EDAD;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JLabel apellido;
    private javax.swing.JToggleButton btnGuardar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration                   
}
