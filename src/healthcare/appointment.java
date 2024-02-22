
package healthcare;
import java.sql.*;
import javax.swing.JOptionPane;

public class appointment extends javax.swing.JFrame {
Connection con=null;
PreparedStatement pr=null;

    public appointment() {
        initComponents();
        con=connectionclass.connectDB();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patientname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        appDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        presentCondition = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        desease = new javax.swing.JTextField();
        saveAppointment = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        docType = new javax.swing.JComboBox<>();
        appTime = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Book an appointment here");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1200, 50));

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Patient Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        patientname.setBackground(new java.awt.Color(233, 254, 254));
        patientname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(patientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 408, -1));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Doctor Type");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 110, -1));

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Appointment Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 20));

        appDate.setBackground(new java.awt.Color(230, 254, 254));
        appDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(appDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 408, 29));

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Appointment Time");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, 30));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Present condition of health");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 450, 37));

        presentCondition.setBackground(new java.awt.Color(225, 254, 254));
        presentCondition.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(presentCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 589, 66));

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Suffered from any vital desease before? ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        desease.setBackground(new java.awt.Color(230, 254, 254));
        desease.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(desease, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 589, 66));

        saveAppointment.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        saveAppointment.setForeground(new java.awt.Color(0, 153, 51));
        saveAppointment.setText("Save");
        saveAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(saveAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 120, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Cancle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 111, -1));

        docType.setBackground(new java.awt.Color(224, 254, 254));
        docType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        docType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Internal Medicine", "Pediatrician", "Obstetricians", "Gynecologist ", "Cardiologist", "Oncologist", "ENT", "Gastroenterologist", "Pulmonologist", "Infectious disease", "Nephrologist", "Endocrinologist", "Ophthalmologist", "Otolaryngologist", "Dermatologist", "Psychiatrist", "Neurologist", "Radiologist", "Anesthesiologist", " ", " " }));
        getContentPane().add(docType, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 410, -1));

        appTime.setBackground(new java.awt.Color(235, 254, 254));
        appTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        appTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Evening" }));
        getContentPane().add(appTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 410, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/doctor's.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAppointmentActionPerformed
try{
        String sql = "insert into appointment(patientName,docType,appDate,appTime,presentCondition,desease) values(?,?,?,?,?,?)";
            pr = con.prepareStatement(sql);
            pr.setString(1, patientname.getText());
            pr.setString(2, docType.getSelectedItem().toString());
            pr.setString(3, appDate.getText());
            pr.setString(4, appTime.getSelectedItem().toString());
            pr.setString(5, presentCondition.getText());
            pr.setString(6, desease.getText());
            
            pr.execute();
            JOptionPane.showMessageDialog(null, "Inserted successfully!");
    }                                                       
catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    new patientDashboard().setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_saveAppointmentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new patientDashboard().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField appDate;
    private javax.swing.JComboBox<String> appTime;
    private javax.swing.JTextField desease;
    private javax.swing.JComboBox<String> docType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField patientname;
    private javax.swing.JTextField presentCondition;
    private javax.swing.JButton saveAppointment;
    // End of variables declaration//GEN-END:variables
}
