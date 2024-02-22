
package healthcare;
import java.sql.*;
import javax.swing.JOptionPane;


public class doctorlogin extends javax.swing.JFrame {
Connection con=null;
PreparedStatement pr=null;


    public doctorlogin() {
        initComponents();
        con=connectionclass.connectDB();
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        docName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        specialist = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        docContact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        docAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        docEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        docUsername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        docGender = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        docPassword = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 27, 193));
        jLabel1.setText("For doctors' only!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 6, 400, -1));

        jLabel11.setForeground(new java.awt.Color(255, 0, 102));
        jLabel11.setText("*password must be atleast 8 character");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 448, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 103, -1));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Cancle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("Make new Doctor's Profile Here");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        docName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(docName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 292, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Specialist ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        specialist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Internal Medicine", "Pediatrician", "Obstetricians", "Gynecologist ", "Cardiologist", "Oncologist", "ENT", "Gastroenterologist", "Pulmonologist", "Infectious disease", "Nephrologist", "Endocrinologist", "Ophthalmologist", "Otolaryngologist", "Dermatologist", "Psychiatrist", "Neurologist", "Radiologist", "Anesthesiologist", " " }));
        jPanel1.add(specialist, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 290, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Contact no.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        docContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(docContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 292, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        docAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(docAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 292, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        docEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(docEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 292, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("User name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        docUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(docUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 292, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Set Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        docGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(docGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 292, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Gender");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, 30));

        docPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(docPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 292, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 490, 500));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/doc.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{
        String sql = "insert into doctor(docName,docGender,specialist,docContact,docAddress,docEmail,docUsername,docPassword) values(?,?,?,?,?,?,?,?)";
            pr = con.prepareStatement(sql);
            
            
            pr.setString(1, docName.getText());
            pr.setString(2, docGender.getText());
            pr.setString(3, specialist.getSelectedItem().toString());
            pr.setString(4, docContact.getText());
            pr.setString(5, docAddress.getText());
            pr.setString(6, docEmail.getText());
            pr.setString(7, docUsername.getText());
            pr.setString(8, docPassword.getText());
            pr.execute();
            JOptionPane.showMessageDialog(null, "Inserted successfully!");
    }                                                       
catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    new adminDashboard().setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new adminDashboard().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(doctorlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctorlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctorlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctorlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctorlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField docAddress;
    private javax.swing.JTextField docContact;
    private javax.swing.JTextField docEmail;
    private javax.swing.JTextField docGender;
    private javax.swing.JTextField docName;
    private javax.swing.JPasswordField docPassword;
    private javax.swing.JTextField docUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JComboBox<String> specialist;
    // End of variables declaration//GEN-END:variables
}
