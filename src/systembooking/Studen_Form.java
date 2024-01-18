/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systembooking;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author annamea
 */
public class Studen_Form extends javax.swing.JFrame {

    /**
     * Creates new form Studen_Form
     */
    public Studen_Form() {
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

        timePicker1 = new com.raven.swing.TimePicker();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtfullname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtidnumber = new javax.swing.JTextField();
        txtcourseyear = new javax.swing.JTextField();
        txtsection = new javax.swing.JTextField();
        txtphonenumber = new javax.swing.JTextField();
        txtemailadd = new javax.swing.JTextField();
        txtpurpose = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        timetxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        timePicker1.setDisplayText(timetxt);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BOOK NOW");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 190, 30));

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        txtfullname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtfullname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 190, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Full_Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ID_Number:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Course & Year:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Section:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Phone_Number:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("E-mail Address:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Gender:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        txtidnumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtidnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtidnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, -1));

        txtcourseyear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtcourseyear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcourseyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 190, -1));

        txtsection.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtsection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 190, -1));

        txtphonenumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtphonenumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, -1));

        txtemailadd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtemailadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtemailadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 190, -1));

        txtpurpose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtpurpose.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtpurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 190, 20));

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton1.setText("Male");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systembooking/Back-Clipart-Vector-Vector-Back (2).png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setText("Student Booking Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Purpose:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDateChooser1.setPreferredSize(new java.awt.Dimension(64, 18));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 190, 24));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Date:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systembooking/30x30.jpg"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.setMaximumSize(new java.awt.Dimension(73, 22));
        jButton3.setMinimumSize(new java.awt.Dimension(73, 22));
        jButton3.setPreferredSize(new java.awt.Dimension(73, 22));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Time:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Set Time");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, 20));

        timetxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        timetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(timetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 90, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systembooking/Polish_20240116_224545082.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 0, 900, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       new Booking_enterface().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String ID_number = txtidnumber.getText();
        String Phone_Number = txtphonenumber.getText();

        try {
            // Check ID number format
            if (!ID_number.matches("\\d{4}-\\d{4}")) {
                JOptionPane.showMessageDialog(this, "ID_Number should follow the format xxxx-xxxx.", "Warning", JOptionPane.WARNING_MESSAGE);
                return; // Exit the method without proceeding
            }
            // Check if ID_Number exceeds the allowed length
            int maxIDLength = 9;
            if (ID_number.length() > maxIDLength) {
                JOptionPane.showMessageDialog(this, "ID_Number exceeds the maximum allowed length of " + maxIDLength + " characters.", "ID Number Warning", JOptionPane.WARNING_MESSAGE);
                return; // Exit the method without proceeding
            }

            // Check if ID_Number is below the minimum allowed length
            int minIDLength = 9;
            if (ID_number.length() < minIDLength) {
                JOptionPane.showMessageDialog(this, "ID_Number should be at least " + minIDLength + " characters.", "ID Number Warning", JOptionPane.WARNING_MESSAGE);
                return; // Exit the method without proceeding
            }

            // Check phone number length
            int maxPhoneNumberLength = 11;
            if (Phone_Number.length() > maxPhoneNumberLength) {
                JOptionPane.showMessageDialog(this, "Phone number exceeds the maximum allowed length of " + maxPhoneNumberLength + " characters.", "Phone Number Warning", JOptionPane.WARNING_MESSAGE);
                return; // Exit the method without proceeding
            }

            // Check phone number minimum length
            int minPhoneNumberLength = 11;
            if (Phone_Number.length() < minPhoneNumberLength) {
                JOptionPane.showMessageDialog(this, "Phone number must be at least " + minPhoneNumberLength + " characters.", "Phone Number Warning", JOptionPane.WARNING_MESSAGE);
                return; // Exit the method without proceeding
            }

            String fullname=txtfullname.getText();
            String idnumber=txtidnumber.getText();
            String courseyear=txtcourseyear.getText();
            String section=txtsection.getText();
            String phonenumber=txtphonenumber.getText();
            String email=txtemailadd.getText();
            String purpose=txtpurpose.getText();
            
            // Assuming you have a java.util.Date object named selectedDate
            java.util.Date selectedDate = jDateChooser1.getDate();
            java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());
            
             // Check if the selected date is Saturday or Sunday
            java.util.Calendar cal = java.util.Calendar.getInstance();
            cal.setTime(selectedDate);
            int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);

            if (dayOfWeek == java.util.Calendar.SATURDAY || dayOfWeek == java.util.Calendar.SUNDAY) {
                JOptionPane.showMessageDialog(this, "Booking is not available on Saturday or Sunday.", "Date Warning", JOptionPane.WARNING_MESSAGE);
                return; // Exit the method without proceeding
            }
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");
            PreparedStatement ps = con.prepareStatement("insert into systembooking(Full_name,ID_Number,`Course & Year`,Section,`Phone_Number`,`E-mail_Address`,Gender,Date,purpose) values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, fullname);
            ps.setString(2, idnumber);
            ps.setString(3, courseyear);
            ps.setString(4, section);
            ps.setString(5, phonenumber);
            ps.setString(6, email);
            if(jRadioButton1.isSelected()){
                ps.setString(7, jRadioButton1.getText());
            } else {
                ps.setString(7, jRadioButton2.getText());
            }
            ps.setDate(8, sqlDate);
            ps.setString(9, purpose);
            
           // Show confirmation message with receipt details
           String receiptMessage = "Dont Forget To Take a Picture\n\n"
                   + "Full Name: " + fullname + "\n"
                   + "ID Number: " + idnumber + "\n"
                   + "Course & Year: " + courseyear + "\n"
                   + "Section: " + section + "\n"
                   + "Phone Number: " + phonenumber + "\n"
                   + "Email Address: " + email + "\n"
                   + "Gender: " + (jRadioButton1.isSelected() ? jRadioButton1.getText() : jRadioButton2.getText()) + "\n"
                   + "Date: " + sqlDate + "\n"
                   + "Purpose: " + purpose;
           
           JOptionPane.showMessageDialog(this, receiptMessage, "Receipt", JOptionPane.INFORMATION_MESSAGE);

            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Book Successfully");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to Close Application?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        timePicker1.showPopup(this, 350, 60);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Studen_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studen_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studen_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studen_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studen_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private com.raven.swing.TimePicker timePicker1;
    private javax.swing.JTextField timetxt;
    private javax.swing.JTextField txtcourseyear;
    private javax.swing.JTextField txtemailadd;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txtidnumber;
    private javax.swing.JTextField txtphonenumber;
    private javax.swing.JTextField txtpurpose;
    private javax.swing.JTextField txtsection;
    // End of variables declaration//GEN-END:variables
}