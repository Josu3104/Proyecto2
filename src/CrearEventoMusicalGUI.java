

import java.util.Date;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Josue Gavidia
 */
public class CrearEventoMusicalGUI extends javax.swing.JFrame {

    /**
     * Creates new form CrearEventoMusicalGUI
     */
    public CrearEventoMusicalGUI() {
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
        jLabel1 = new javax.swing.JLabel();
        CODIGO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TITULO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DESCRIPCION = new javax.swing.JTextArea();
        BACK2TYPESELECC = new javax.swing.JButton();
        EVENTCREATED = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CANTPERSONAS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        REGGEATON = new javax.swing.JButton();
        ROCK = new javax.swing.JButton();
        RAP = new javax.swing.JButton();
        CLASICA = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        POP = new javax.swing.JButton();
        OTRO = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fechita = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        MONTO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo del evento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 30));
        jPanel1.add(CODIGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 240, -1));

        jLabel3.setText("Titulo del evento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 30));
        jPanel1.add(TITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 240, -1));

        jLabel4.setText("Descripcion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 90, 30));

        DESCRIPCION.setColumns(20);
        DESCRIPCION.setRows(5);
        jScrollPane1.setViewportView(DESCRIPCION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 630, 220));

        BACK2TYPESELECC.setText("Salir");
        BACK2TYPESELECC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK2TYPESELECCActionPerformed(evt);
            }
        });
        jPanel1.add(BACK2TYPESELECC, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 580, -1, -1));

        EVENTCREATED.setText("Crear Evento");
        EVENTCREATED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVENTCREATEDActionPerformed(evt);
            }
        });
        jPanel1.add(EVENTCREATED, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, -1, -1));

        jLabel2.setText("EVENTO MUSICAL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabel5.setText("Cantidad de personas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, 30));
        jPanel1.add(CANTPERSONAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 240, -1));

        jLabel9.setText("TIPO DE MUSICA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        REGGEATON.setText("REGGEATON");
        REGGEATON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGGEATONActionPerformed(evt);
            }
        });
        jPanel1.add(REGGEATON, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, -1, -1));

        ROCK.setText("ROCK");
        ROCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROCKActionPerformed(evt);
            }
        });
        jPanel1.add(ROCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        RAP.setText("RAP");
        RAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAPActionPerformed(evt);
            }
        });
        jPanel1.add(RAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        CLASICA.setText("CLASICA");
        CLASICA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLASICAActionPerformed(evt);
            }
        });
        jPanel1.add(CLASICA, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));

        jLabel10.setText("Datos");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        POP.setText("POP");
        POP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POPActionPerformed(evt);
            }
        });
        jPanel1.add(POP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        OTRO.setText("OTRO");
        OTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OTROActionPerformed(evt);
            }
        });
        jPanel1.add(OTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        jLabel6.setText("Fecha");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 70, 30));
        jPanel1.add(fechita, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 140, -1));

        jLabel12.setText("Renta");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 70, 30));

        MONTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MONTOActionPerformed(evt);
            }
        });
        jPanel1.add(MONTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     static int year;
      static int month;
      static int day;
      static int code;
      static double monto;
      static String titulo;
      static int cantidad;
      static String tipoMusic;
      static String desc;
      static String autor;
    
    
    
    
    
    
    private void BACK2TYPESELECCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK2TYPESELECCActionPerformed
        SeleccionTipoEventoGUI event = new  SeleccionTipoEventoGUI();
        event.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BACK2TYPESELECCActionPerformed

    private void CLASICAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLASICAActionPerformed
      tipoMusic="clasica";
    }//GEN-LAST:event_CLASICAActionPerformed

    private void EVENTCREATEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVENTCREATEDActionPerformed
        Date fecha = fechita.getDate();
        
         year = fecha.getYear()+1900;
        month = fecha.getMonth();
         day = fecha.getDay();
         
      code = Integer.parseInt(CODIGO.getText());
      titulo=TITULO.getText();
      cantidad = Integer.parseInt(CANTPERSONAS.getText());
      desc= DESCRIPCION.getText();
      monto =Double.parseDouble(MONTO.getText());
      autor = Login.user;
      
      Heaven.CrearMusic(code, titulo, desc, monto, autor, cantidad, tipoMusic, day, month, year);
      
         JOptionPane.showMessageDialog(rootPane, "Evento creado exitosamente");
         SeleccionTipoEventoGUI selecc = new SeleccionTipoEventoGUI();
         selecc.setVisible(true);
         selecc.setLocationRelativeTo(null);
        this.dispose();
        System.out.println(autor);
      
      
    }//GEN-LAST:event_EVENTCREATEDActionPerformed

    private void MONTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MONTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MONTOActionPerformed

    private void POPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POPActionPerformed
        tipoMusic="pop";
    }//GEN-LAST:event_POPActionPerformed

    private void ROCKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROCKActionPerformed
        tipoMusic="rock";
    }//GEN-LAST:event_ROCKActionPerformed

    private void RAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAPActionPerformed
        tipoMusic="rap";
    }//GEN-LAST:event_RAPActionPerformed

    private void OTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OTROActionPerformed
        tipoMusic="otro";
    }//GEN-LAST:event_OTROActionPerformed

    private void REGGEATONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGGEATONActionPerformed
       tipoMusic="reggeaton";
    }//GEN-LAST:event_REGGEATONActionPerformed

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
            java.util.logging.Logger.getLogger(CrearEventoMusicalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearEventoMusicalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearEventoMusicalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearEventoMusicalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearEventoMusicalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK2TYPESELECC;
    private javax.swing.JTextField CANTPERSONAS;
    private javax.swing.JButton CLASICA;
    private javax.swing.JTextField CODIGO;
    private javax.swing.JTextArea DESCRIPCION;
    private javax.swing.JButton EVENTCREATED;
    private javax.swing.JTextField MONTO;
    private javax.swing.JButton OTRO;
    private javax.swing.JButton POP;
    private javax.swing.JButton RAP;
    private javax.swing.JButton REGGEATON;
    private javax.swing.JButton ROCK;
    private javax.swing.JTextField TITULO;
    private com.toedter.calendar.JDateChooser fechita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
