    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
     */
    package systembooking;
    
    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import com.mysql.cj.x.protobuf.MysqlxCursor;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.RowFilter;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.table.TableRowSorter;
    /**
     *
     * @author annamea
     */
    public class student_data extends javax.swing.JFrame {

        Connection con;
        PreparedStatement pst;
        ResultSet rs;


        /**
         * Creates new form student_data
         */
        public student_data() {
            initComponents();
            con = Connect();
            fetchUnusedData();
            fetchStudentData();

             // Add MouseListener to jTable1
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });

        // Add MouseListener to jTable3
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });

        }



        public Connection Connect(){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");
                con.setAutoCommit(false);  // Enable transaction control
                return con;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(clienlogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(student_data.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }



        public void fetchUnusedData() {
            try {
                pst = con.prepareStatement("SELECT * FROM systembooking");
                rs = pst.executeQuery();

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);

                while (rs.next()) {
                    String fullname = rs.getString("Full_name");
                    String idnumber = rs.getString("ID_Number");
                    String courseyear = rs.getString("Course & Year");
                    String section = rs.getString("Section");
                    String phonenumber = rs.getString("Phone_Number");
                    String email = rs.getString("E-mail_Address");
                    String gender = rs.getString("Gender");
                    String date = rs.getString("Date");
                    String purpose = rs.getString("Purpose");


                    model.addRow(new Object[]{fullname, idnumber, courseyear, section, phonenumber, email, gender, date, purpose});
                
                 
                }
            } catch (SQLException ex) {
                Logger.getLogger(student_data.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        private void deleteRecentBookingData(String idnumber) throws SQLException {
    con = Connect();
    pst = con.prepareStatement("DELETE FROM systembooking WHERE ID_Number=?");
    pst.setString(1, idnumber);
    pst.executeUpdate();

    con.commit();
    pst.close();
}

        public void fetchStudentData() {
        try {
            // Fetch data from studentdata table
            pst = con.prepareStatement("SELECT * FROM systembooking");
            rs = pst.executeQuery();

            DefaultTableModel unusedDataModel = (DefaultTableModel) jTable3.getModel();
            unusedDataModel.setRowCount(0);

            while (rs.next()) {
                String idNumber = rs.getString("ID_Number");
                String fullName = rs.getString("Full_Name");
                String Date = rs.getString("Date");
                String purpose = rs.getString("Purpose");

                // Add more columns as needed

                unusedDataModel.addRow(new Object[]{idNumber, fullName, Date, purpose});
            }
            
             // Refresh the view after deletion
            fetchUnusedData();
            
        } catch (SQLException ex) {
            Logger.getLogger(student_data.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
    }
        private void deleteUnusedData() {
            try {
                
                int selectedRow = jTable3.getSelectedRow();
                if (selectedRow != -1) {
                    String idNumber = jTable3.getValueAt(selectedRow, 0).toString();

                    // Perform deletion based on the selected criteria
                    pst = con.prepareStatement("DELETE FROM studentdata WHERE ID_Number = ?");
                    pst.setString(1, idNumber);
                    pst.executeUpdate();
                    
                    // Commit the transaction to make the deletion permanent
                     con.commit();

                    JOptionPane.showMessageDialog(this, "Unused data is successfully deleted");


                     // Refresh the view after deletion
                    fetchUnusedData();
                } else {
                    JOptionPane.showMessageDialog(this, "Please select a row to delete", "Warning", JOptionPane.WARNING_MESSAGE);
                }   
            } catch (SQLException ex) {
                Logger.getLogger(student_data.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error deleting unused data", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfullname = new javax.swing.JTextField();
        txtidnumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCourseYear = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        txtSection = new javax.swing.JTextField();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPurpose = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Full_Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ID_Number:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));

        txtfullname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtfullname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 55, 183, -1));

        txtidnumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtidnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidnumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtidnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 85, 183, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Insert");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 327, 92, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Update");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 328, 84, 30));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 327, 84, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Course & Year:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Section:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Phone_Number:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("E-Mail Address:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 206, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Gender:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 267, -1, -1));

        txtCourseYear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCourseYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCourseYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 115, 183, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 175, 183, -1));

        txtEmailAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEmailAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 205, 183, -1));

        txtSection.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 145, 183, -1));

        jRadioButtonMale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jRadioButtonMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 266, -1, -1));

        jRadioButtonFemale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonFemale.setText("Female");
        jPanel1.add(jRadioButtonFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 265, -1, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setText("WELCOME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Purpose:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 236, -1, -1));

        txtPurpose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPurpose.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtPurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 235, 183, -1));

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Logout");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setMaximumSize(new java.awt.Dimension(33, 20));
        jButton5.setMinimumSize(new java.awt.Dimension(33, 20));
        jButton5.setPreferredSize(new java.awt.Dimension(33, 20));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 398, 150, 27));

        jButton8.setBackground(new java.awt.Color(51, 255, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("See Updates");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 398, 145, 27));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systembooking/download (1).jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setMaximumSize(new java.awt.Dimension(330, 440));
        jLabel12.setMinimumSize(new java.awt.Dimension(330, 440));
        jLabel12.setPreferredSize(new java.awt.Dimension(330, 440));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 440));

        jTabbedPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedPane1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full_name", "ID_Number", "Course & Year", "Section", "Phone_Number", "E-mail_Address", "Gender", "Date", "Purpose"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Student Profile`s", jScrollPane1);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setBackground(new java.awt.Color(204, 204, 204));
        jTable3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Number", "Full_Name", "Date", "Purpose"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton7.setBackground(new java.awt.Color(248, 56, 94));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Delete");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student Data`s", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 830, 310));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 370, 30));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Search");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 80, 30));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systembooking/Back-Clipart-Vector-Vector-Back (2).png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 30, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systembooking/Untitled.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 830, 130));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new clienlogin().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String ID_number = txtidnumber.getText();
        String Full_Name = txtfullname.getText();
        
        try {
            
            // Get the current date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String theDate = getCurrentDate();
        
         // Add the date and time directly to the table
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.addRow(new Object[]{Full_Name, ID_number, theDate});
            
        // Check if ID_Number follows the specified format (xxxx-xxxx)
        if (!ID_number.matches("\\d{4}-\\d{4}")) {
            JOptionPane.showMessageDialog(this, "ID_Number should follow the format xxxx-xxxx.", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Exit the method without proceeding
        }
        
        
        
        try {
            String fullname = txtfullname.getText();
            String idnumber = txtidnumber.getText();
            String courseyear = txtCourseYear.getText();
            String section = txtSection.getText();
            String phonenumber = txtPhoneNumber.getText();
            String email = txtEmailAddress.getText();
            String purpose = txtPurpose.getText();
            
            
             // Check if phone number exceeds the allowed length (for example, 11 characters)
        int maxPhoneNumberLength = 11;
        if (phonenumber.length() > maxPhoneNumberLength) {
            JOptionPane.showMessageDialog(this, "Phone number exceeds the maximum allowed length of " + maxPhoneNumberLength + " characters.", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Exit the method without proceeding
        }
        
        // Check if ID_Number is below the minimum allowed length (for example, 9 characters)
        int minIDLength = 9;
        if (ID_number.length() < minIDLength) {
            JOptionPane.showMessageDialog(this, "ID_Number should be at least " + minIDLength + " characters.", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Exit the method without proceeding
        }
        
        // Check if ID_Number exceeds the allowed length (for example, 9 characters)
        int maxIDLength = 9;
        if (ID_number.length() > maxIDLength) {
            JOptionPane.showMessageDialog(this, "ID_Number exceeds the maximum allowed length of " + maxIDLength + " characters.", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Exit the method without proceeding
        }
        
            
            String gender;
        if (jRadioButtonMale.isSelected()) {
            gender = "Male";
        } else if (jRadioButtonFemale.isSelected()) {
            gender = "Female";
        } else {
            gender = ""; // Handle the case where neither radio button is selected
        }
        
            
            pst = con.prepareStatement("INSERT INTO systembooking(Full_name,ID_Number,`Course & Year`,Section,`Phone_Number`,`E-mail_Address`,Gender, Purpose, Date) values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, fullname);
            pst.setString(2, idnumber);
            pst.setString(3, courseyear);
            pst.setString(4, section);
            pst.setString(5, phonenumber);
            pst.setString(6, email);
            pst.setString(7, gender);
            pst.setString(8, purpose);
            pst.setString(9, theDate);
            
                
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"studentdata is successfully Inserted");
                
            txtidnumber.setText("");
            txtfullname.setText("");
            txtCourseYear.setText("");
            txtSection.setText("");
            txtPhoneNumber.setText("");
            txtEmailAddress.setText("");
            
            txtPurpose.setText("");
            
            // You might want to clear radio button selection here as well
            
            // Refresh the table
            fetchUnusedData();
            // Call fetchStudentData() after inserting data
            fetchStudentData();
        } catch (SQLException ex) {
            
            Logger.getLogger(student_data.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (Exception e) {
    e.printStackTrace(); // Add this line to print the exception details to the console
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       try {
           
           
        String fullname = txtfullname.getText();
        String idnumber = txtidnumber.getText();
        String courseyear = txtCourseYear.getText();
        String section = txtSection.getText();
        String phonenumber = txtPhoneNumber.getText();
        String email = txtEmailAddress.getText();
        String purpose = txtPurpose.getText();
        
         // Check if any of the required fields are empty
        if (fullname.isEmpty() || idnumber.isEmpty() || courseyear.isEmpty() || section.isEmpty()
                || phonenumber.isEmpty() || email.isEmpty() || purpose.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Exit the method without proceeding
        }
        
        

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking", "root", "");
        
        // Update query modified to match your table structure
        pst = con.prepareStatement("UPDATE systembooking SET Full_name=?, ID_Number=?, `Course & Year`=?, Section=?, `Phone_Number`=?, `E-mail_Address`=?, Gender=?, Purpose=? WHERE ID_Number=?");

        pst.setString(1, fullname);
        pst.setString(2, idnumber);
        pst.setString(3, courseyear);
        pst.setString(4, section);
        pst.setString(5, phonenumber);
        pst.setString(6, email);
        pst.setString(7, jRadioButtonMale.isSelected() ? "Male" : "Female"); // Assuming Gender is a String column
        pst.setString(8, purpose);
       
        // Set the ID_Number parameter for the WHERE clause
        pst.setString(9, idnumber);
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Student data is successfully updated");
        
         
        // Update the Date column in jTable3 with the current date
        int selectedRow= jTable3.getSelectedRow();
        if (selectedRow != -1) {
            jTable3.setValueAt(purpose, selectedRow, 3); // Assuming Date column is at index 7
        }
        
        // Call fetch() to refresh jTable3 with the updated data
        fetchUnusedData();
        fetchStudentData();
    
    } catch (SQLException | ClassNotFoundException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating data", "Error", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try {
        // Get the selected row index
        int selectedRow = jTable1.getSelectedRow();

        // Check if any row is selected
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Exit the method without proceeding
        }
        
        // Ask for confirmation before deleting
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (option == JOptionPane.YES_OPTION) {
            // User clicked Yes, proceed with deletion
        

        // Get the ID_Number from the selected row
        String idnumber = jTable1.getValueAt(selectedRow, 1).toString();

        // Delete the row from the database
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking", "root", "");
        pst = con.prepareStatement("DELETE FROM systembooking WHERE ID_Number=?");
        pst.setString(1, idnumber);
        pst.executeUpdate();

        // Remove the selected row from jTable3
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(selectedRow);
        
        
        JOptionPane.showMessageDialog(this, "Student data is successfully deleted");
        }
        // Call fetch() to refresh jTable3 with the updated data
        fetchUnusedData();
        fetchStudentData();
    } catch (SQLException | ClassNotFoundException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error deleting data", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2AncestorAdded

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to Logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        String searchText = jTextField1.getText().trim();

    // Filter jTable1
    DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
    TableRowSorter<DefaultTableModel> sorter1 = new TableRowSorter<>(model1);
    jTable1.setRowSorter(sorter1);
    RowFilter<DefaultTableModel, Object> rowFilter1 = RowFilter.regexFilter("(?i)" + searchText); // Case-insensitive search
    sorter1.setRowFilter(rowFilter1);

    // Filter jTable3
    DefaultTableModel model3 = (DefaultTableModel) jTable3.getModel();
    TableRowSorter<DefaultTableModel> sorter3 = new TableRowSorter<>(model3);
    jTable3.setRowSorter(sorter3);
    RowFilter<DefaultTableModel, Object> rowFilter3 = RowFilter.regexFilter("(?i)" + searchText); // Case-insensitive search
    sorter3.setRowFilter(rowFilter3);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextField1ActionPerformed(evt); // Call the search functionality
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtidnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidnumberActionPerformed

    private void jTabbedPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedPane1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1AncestorAdded

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
       try { int selectedRow = jTable3.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            String idnumber = jTable3.getValueAt(selectedRow, 0).toString();
            deleteRecentBookingData(idnumber);

            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Student data is successfully deleted from Tab2");

            fetchUnusedData();
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error deleting data", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:

        int selectedRow = jTable3.getSelectedRow();
        if (selectedRow != -1) {
            // Get data from the selected row
            String idNumber = jTable3.getValueAt(selectedRow, 0).toString();
            String fullName = jTable3.getValueAt(selectedRow, 1).toString();
            String Date = jTable3.getValueAt(selectedRow, 2).toString();
            String purpose = jTable3.getValueAt(selectedRow, 3).toString();
            // Populate text fields
            // Assuming you have text fields for idNumber, fullName, date, and purpose
            // Set the text fields accordingly
            txtidnumber.setText(idNumber);
            txtfullname.setText(fullName);
            txtPurpose.setText(purpose);
            // Continue setting other text fields...
        }

    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            // Get data from the selected row
            String fullname = jTable1.getValueAt(selectedRow, 0).toString();
            String idnumber = jTable1.getValueAt(selectedRow, 1).toString();
            String courseyear = jTable1.getValueAt(selectedRow, 2).toString();
            String Section = jTable1.getValueAt(selectedRow, 3).toString();
            String PhoneNumber = jTable1.getValueAt(selectedRow, 4).toString();
            String email = jTable1.getValueAt(selectedRow, 5).toString();
            String gender = jTable1.getValueAt(selectedRow, 6).toString();
            String date = jTable1.getValueAt(selectedRow, 7).toString();
            String Purpose = jTable1.getValueAt(selectedRow, 8).toString();
            // Continue getting other data...

            // Populate text fields
            txtfullname.setText(fullname);
            txtidnumber.setText(idnumber);
            txtCourseYear.setText(courseyear);
            txtSection.setText(Section);
            txtPhoneNumber.setText(PhoneNumber);
            txtEmailAddress.setText(email);

            txtPurpose.setText(Purpose);
            // Continue setting other text fields...
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorMoved

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
    StudentUpdate studentUpdateFrame = new StudentUpdate();
    studentUpdateFrame.setVisible(true);
    this.dispose(); // Close the current frame (student_data)
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(student_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        try {
            new student_data().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCourseYear;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPurpose;
    private javax.swing.JTextField txtSection;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txtidnumber;
    // End of variables declaration//GEN-END:variables

    private String getCurrentDate() {
         // Get the current date
    LocalDate currentDate = LocalDate.now();

    // Format the date as a string
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = currentDate.format(formatter);

    return formattedDate;
    }
}
