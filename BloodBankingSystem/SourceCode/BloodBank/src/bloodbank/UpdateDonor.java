/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodbank;
import java.sql.*;
import DataBaseConnections.ConnectionProvider;
import javax.swing.JOptionPane;
/**
 *
 * @author SHIVA KRISHNA
 */
public class UpdateDonor extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDonor
     */
    public UpdateDonor() {
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

        TITLE = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        SEARCHFIELD = new javax.swing.JTextField();
        SEARCH = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        NAME = new javax.swing.JLabel();
        NAMEFIELD = new javax.swing.JTextField();
        AGE = new javax.swing.JLabel();
        AGEFIELD = new javax.swing.JTextField();
        FATHER = new javax.swing.JLabel();
        FNAMEFIELD = new javax.swing.JTextField();
        MOTHER = new javax.swing.JLabel();
        MNAMEFIELD = new javax.swing.JTextField();
        ADDRESS = new javax.swing.JLabel();
        ADDRESSFIELD = new javax.swing.JTextField();
        CITY = new javax.swing.JLabel();
        CITYFIELD = new javax.swing.JTextField();
        DISTRICT = new javax.swing.JLabel();
        DISTFIELD = new javax.swing.JTextField();
        PINCODE = new javax.swing.JLabel();
        PINFIELD = new javax.swing.JTextField();
        MOBILE = new javax.swing.JLabel();
        MOBILEFIELD = new javax.swing.JTextField();
        BLOODGROUP = new javax.swing.JLabel();
        GENDER = new javax.swing.JLabel();
        BLOODFIELD = new javax.swing.JComboBox<>();
        GENDERFIELD = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        UPDATE = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setUndecorated(true);
        getContentPane().setLayout(null);

        TITLE.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        TITLE.setText("UPDATE DONOR DETAILS");
        getContentPane().add(TITLE);
        TITLE.setBounds(612, 42, 427, 48);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 96, 1594, 10);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Mobile Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(361, 144, 160, 25);

        SEARCHFIELD.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        SEARCHFIELD.setForeground(new java.awt.Color(255, 0, 0));
        SEARCHFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(SEARCHFIELD);
        SEARCHFIELD.setBounds(590, 141, 135, 31);

        SEARCH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SEARCH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/search1.png"))); // NOI18N
        SEARCH.setText("Search");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });
        getContentPane().add(SEARCH);
        SEARCH.setBounds(808, 141, 124, 32);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 221, 1600, 10);

        NAME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NAME.setText("Full Name");
        getContentPane().add(NAME);
        NAME.setBounds(247, 267, 101, 31);

        NAMEFIELD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NAMEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(NAMEFIELD);
        NAMEFIELD.setBounds(450, 270, 256, 31);

        AGE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AGE.setText("Age");
        getContentPane().add(AGE);
        AGE.setBounds(247, 331, 101, 31);

        AGEFIELD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AGEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(AGEFIELD);
        AGEFIELD.setBounds(450, 334, 256, 31);

        FATHER.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FATHER.setText("Father Name");
        getContentPane().add(FATHER);
        FATHER.setBounds(247, 395, 118, 31);

        FNAMEFIELD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FNAMEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNAMEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(FNAMEFIELD);
        FNAMEFIELD.setBounds(450, 398, 256, 31);

        MOTHER.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MOTHER.setText("Mother Name");
        getContentPane().add(MOTHER);
        MOTHER.setBounds(247, 462, 128, 31);

        MNAMEFIELD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MNAMEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNAMEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(MNAMEFIELD);
        MNAMEFIELD.setBounds(450, 459, 256, 31);

        ADDRESS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ADDRESS.setText("Street Address");
        getContentPane().add(ADDRESS);
        ADDRESS.setBounds(247, 528, 128, 31);

        ADDRESSFIELD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ADDRESSFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDRESSFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(ADDRESSFIELD);
        ADDRESSFIELD.setBounds(450, 531, 256, 31);

        CITY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CITY.setText("City");
        getContentPane().add(CITY);
        CITY.setBounds(247, 592, 128, 31);

        CITYFIELD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CITYFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CITYFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(CITYFIELD);
        CITYFIELD.setBounds(450, 595, 256, 31);

        DISTRICT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DISTRICT.setText("District");
        getContentPane().add(DISTRICT);
        DISTRICT.setBounds(870, 270, 128, 31);

        DISTFIELD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DISTFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISTFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(DISTFIELD);
        DISTFIELD.setBounds(1010, 270, 256, 31);

        PINCODE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PINCODE.setText("Pin Code");
        getContentPane().add(PINCODE);
        PINCODE.setBounds(859, 331, 128, 31);

        PINFIELD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PINFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PINFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(PINFIELD);
        PINFIELD.setBounds(1005, 334, 256, 31);

        MOBILE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MOBILE.setText("Mobile");
        getContentPane().add(MOBILE);
        MOBILE.setBounds(859, 395, 128, 31);

        MOBILEFIELD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MOBILEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOBILEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(MOBILEFIELD);
        MOBILEFIELD.setBounds(1005, 398, 256, 31);

        BLOODGROUP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BLOODGROUP.setText("Blood Group");
        getContentPane().add(BLOODGROUP);
        BLOODGROUP.setBounds(859, 462, 128, 31);

        GENDER.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GENDER.setText("Gender");
        getContentPane().add(GENDER);
        GENDER.setBounds(859, 528, 128, 31);

        BLOODFIELD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BLOODFIELD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(BLOODFIELD);
        BLOODFIELD.setBounds(1005, 459, 256, 36);

        GENDERFIELD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GENDERFIELD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        GENDERFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENDERFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(GENDERFIELD);
        GENDERFIELD.setBounds(1005, 525, 256, 36);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 650, 1600, 10);

        UPDATE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UPDATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/save.png"))); // NOI18N
        UPDATE.setText("Update");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        getContentPane().add(UPDATE);
        UPDATE.setBounds(400, 700, 160, 37);

        RESET.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RESET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/Dec.png"))); // NOI18N
        RESET.setText("Reset");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });
        getContentPane().add(RESET);
        RESET.setBounds(760, 700, 170, 37);

        EXIT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/Exit application.png"))); // NOI18N
        EXIT.setText("Exit");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        getContentPane().add(EXIT);
        EXIT.setBounds(1160, 700, 150, 37);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/back62.jpg"))); // NOI18N
        jLabel14.setAutoscrolls(true);
        jLabel14.setMaximumSize(new java.awt.Dimension(1600, 900));
        jLabel14.setMinimumSize(new java.awt.Dimension(1600, 900));
        jLabel14.setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(-10, 0, 1600, 990);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SEARCHFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEARCHFIELDActionPerformed

    private void NAMEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEFIELDActionPerformed

    private void AGEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AGEFIELDActionPerformed

    private void FNAMEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNAMEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNAMEFIELDActionPerformed

    private void MNAMEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNAMEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MNAMEFIELDActionPerformed

    private void ADDRESSFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDRESSFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDRESSFIELDActionPerformed

    private void CITYFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CITYFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CITYFIELDActionPerformed

    private void DISTFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISTFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DISTFIELDActionPerformed

    private void PINFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PINFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PINFIELDActionPerformed

    private void MOBILEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOBILEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MOBILEFIELDActionPerformed

    private void GENDERFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENDERFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GENDERFIELDActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_EXITActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new UpdateDonor().setVisible(true);
    }//GEN-LAST:event_RESETActionPerformed

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        // TODO add your handling code here:
        try{
            String id = SEARCHFIELD.getText();
            if(id.length()>=1){
             ConnectionProvider connectionProvider = new ConnectionProvider();
            Connection con = connectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("select * from donors where mobile='"+id+"'");
            if(rs.next()){
//                rs.beforeFirst();
                NAMEFIELD.setText(rs.getString(2));
                AGEFIELD.setText(rs.getString(3));
                FNAMEFIELD.setText(rs.getString(4));
                MNAMEFIELD.setText(rs.getString(5));
                ADDRESSFIELD.setText(rs.getString(6));
                CITYFIELD.setText(rs.getString(7));
                DISTFIELD.setText(rs.getString(8));
                PINFIELD.setText(rs.getString(9));
                BLOODFIELD.setEditable(true);
                MOBILEFIELD.setText(rs.getString(11));
                GENDERFIELD.setEditable(true);
                SEARCHFIELD.setEditable(false);
                MOBILEFIELD.setEditable(false);
            }
            else {
                JOptionPane.showMessageDialog(null,"Donor is not available");
            }
            }
            else {
                JOptionPane.showMessageDialog(null,"Enter Id to Search");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Donor is not available");
        }
    }//GEN-LAST:event_SEARCHActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        // TODO add your handling code here:
        String donorId = SEARCHFIELD.getText();
        String name = NAMEFIELD.getText();
        String age = AGEFIELD.getText();
        String father = FNAMEFIELD.getText();
        String mother = MNAMEFIELD.getText();
        String address = ADDRESSFIELD.getText();
        String city = CITYFIELD.getText();
        String dist = DISTFIELD.getText();
        String pin = PINFIELD.getText();
        String mobile = MOBILEFIELD.getText();
        String bloodgroup = BLOODFIELD.getSelectedItem().toString();
        String gender = GENDERFIELD.getSelectedItem().toString();
        
        try{
            ConnectionProvider connectionProvider = new ConnectionProvider();
            Connection con = connectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            st.executeUpdate("update donors set name='"+name+"',age='"+age+"', fatherName='"+father+"', motherName='"+mother+"', streetAddress='"+address+"', city='"+city+"', district='"+dist+"', pinCode='"+pin+"', bloodGroup='"+bloodgroup+"', mobile='"+mobile+"', gender='"+gender+"' where donorId='"+donorId+"'");
            JOptionPane.showMessageDialog(null,"Data Has been Updated Successfully");
            setVisible(false);
            new UpdateDonor().setVisible(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UPDATEActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADDRESS;
    private javax.swing.JTextField ADDRESSFIELD;
    private javax.swing.JLabel AGE;
    private javax.swing.JTextField AGEFIELD;
    private javax.swing.JComboBox<String> BLOODFIELD;
    private javax.swing.JLabel BLOODGROUP;
    private javax.swing.JLabel CITY;
    private javax.swing.JTextField CITYFIELD;
    private javax.swing.JTextField DISTFIELD;
    private javax.swing.JLabel DISTRICT;
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel FATHER;
    private javax.swing.JTextField FNAMEFIELD;
    private javax.swing.JLabel GENDER;
    private javax.swing.JComboBox<String> GENDERFIELD;
    private javax.swing.JTextField MNAMEFIELD;
    private javax.swing.JLabel MOBILE;
    private javax.swing.JTextField MOBILEFIELD;
    private javax.swing.JLabel MOTHER;
    private javax.swing.JLabel NAME;
    private javax.swing.JTextField NAMEFIELD;
    private javax.swing.JLabel PINCODE;
    private javax.swing.JTextField PINFIELD;
    private javax.swing.JButton RESET;
    private javax.swing.JButton SEARCH;
    private javax.swing.JTextField SEARCHFIELD;
    private javax.swing.JLabel TITLE;
    private javax.swing.JButton UPDATE;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
