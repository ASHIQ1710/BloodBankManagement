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
public class DeleteBloodBank extends javax.swing.JFrame {

    /**
     * Creates new form DeleteBloodBank
     */
    public DeleteBloodBank() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        SEARCHFIELD = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NAMEFIELD = new javax.swing.JTextField();
        ADDRESSFIELD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CITYFIELD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DISTRICTFIELD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        STATEFIELD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MAILFIELD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        MOBILEFIELD = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        VALIDITYFIELD = new javax.swing.JTextField();
        TESTFIELD = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        STORAGEFIELD = new javax.swing.JTextField();
        DELETE = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DeleteBloodBank");
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("DELETE BLOOD BANK");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(655, 26, 455, 48);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(6, 80, 1588, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 156, 1580, 10);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/save.png"))); // NOI18N
        jLabel2.setText("License Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(206, 102, 175, 36);

        SEARCHFIELD.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        SEARCHFIELD.setForeground(new java.awt.Color(255, 51, 0));
        getContentPane().add(SEARCHFIELD);
        SEARCHFIELD.setBounds(488, 102, 218, 36);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/search1.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(799, 102, 156, 36);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Bank Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 191, 131, 33);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Bank Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 264, 131, 33);

        NAMEFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        NAMEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(NAMEFIELD);
        NAMEFIELD.setBounds(374, 192, 321, 32);

        ADDRESSFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ADDRESSFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDRESSFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(ADDRESSFIELD);
        ADDRESSFIELD.setBounds(374, 266, 321, 33);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("City");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 339, 131, 33);

        CITYFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        CITYFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CITYFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(CITYFIELD);
        CITYFIELD.setBounds(374, 341, 321, 33);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("District");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 414, 131, 33);

        DISTRICTFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        DISTRICTFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISTRICTFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(DISTRICTFIELD);
        DISTRICTFIELD.setBounds(374, 416, 321, 33);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("State");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 489, 131, 33);

        STATEFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        STATEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STATEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(STATEFIELD);
        STATEFIELD.setBounds(374, 491, 321, 33);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Email");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 564, 131, 33);

        MAILFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        MAILFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAILFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(MAILFIELD);
        MAILFIELD.setBounds(374, 566, 321, 33);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("Mobile");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 639, 131, 33);

        MOBILEFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        MOBILEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOBILEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(MOBILEFIELD);
        MOBILEFIELD.setBounds(374, 641, 321, 33);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(1586, 156, 8, 549);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 711, 1600, 11);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Validity");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(906, 191, 137, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setText("Test Facilities");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(906, 265, 137, 30);

        VALIDITYFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        VALIDITYFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VALIDITYFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(VALIDITYFIELD);
        VALIDITYFIELD.setBounds(1122, 193, 298, 30);

        TESTFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TESTFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TESTFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(TESTFIELD);
        TESTFIELD.setBounds(1122, 267, 298, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel12.setText("Storage Unit");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(906, 340, 137, 30);

        STORAGEFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        STORAGEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STORAGEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(STORAGEFIELD);
        STORAGEFIELD.setBounds(1122, 342, 298, 30);

        DELETE.setBackground(new java.awt.Color(255, 153, 153));
        DELETE.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        DELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/delete.png"))); // NOI18N
        DELETE.setText("Delete");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(DELETE);
        DELETE.setBounds(335, 770, 115, 40);

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/Update details.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(747, 770, 115, 40);

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/Exit application.png"))); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1099, 770, 115, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/back9.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 1600, 970);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
//            AZBXNq3V6
                NAMEFIELD.setText("");
                ADDRESSFIELD.setText("");
                CITYFIELD.setText("");
                DISTRICTFIELD.setText("");
                STATEFIELD.setText("");
                MAILFIELD.setText("");
                MOBILEFIELD.setText("");
                VALIDITYFIELD.setText("");
                TESTFIELD.setText("");
                STORAGEFIELD.setText("");
            String id = SEARCHFIELD.getText();
            if(id.length()>=1){
             ConnectionProvider connectionProvider = new ConnectionProvider();
            Connection con = connectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("select * from bloodbanks where license ='"+id+"'");
            if(rs.next()){
                NAMEFIELD.setText(rs.getString(2));
                ADDRESSFIELD.setText(rs.getString(3));
                CITYFIELD.setText(rs.getString(4));
                DISTRICTFIELD.setText(rs.getString(5));
                STATEFIELD.setText(rs.getString(6));
                MAILFIELD.setText(rs.getString(7));
                MOBILEFIELD.setText(rs.getString(8));
                VALIDITYFIELD.setText(rs.getString(10));
                TESTFIELD.setText(rs.getString(11));
                STORAGEFIELD.setText(rs.getString(12));
                
                NAMEFIELD.setEditable(false);
                ADDRESSFIELD.setEditable(false);
                CITYFIELD.setEditable(false);
                DISTRICTFIELD.setEditable(false);
                STATEFIELD.setEditable(false);
                MAILFIELD.setEditable(false);
                MOBILEFIELD.setEditable(false);
                VALIDITYFIELD.setEditable(false);
                TESTFIELD.setEditable(false);
                STORAGEFIELD.setEditable(false);
            }
            else {
                JOptionPane.showMessageDialog(null,"Blood Bank is not available");
            }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Enter License Number to Search");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Blood Bank is not available");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NAMEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEFIELDActionPerformed

    private void ADDRESSFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDRESSFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDRESSFIELDActionPerformed

    private void CITYFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CITYFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CITYFIELDActionPerformed

    private void DISTRICTFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISTRICTFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DISTRICTFIELDActionPerformed

    private void STATEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STATEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STATEFIELDActionPerformed

    private void MAILFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAILFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MAILFIELDActionPerformed

    private void MOBILEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOBILEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MOBILEFIELDActionPerformed

    private void VALIDITYFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VALIDITYFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VALIDITYFIELDActionPerformed

    private void TESTFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TESTFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TESTFIELDActionPerformed

    private void STORAGEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STORAGEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STORAGEFIELDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new DeleteBloodBank().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // TODO add your handling code here:
        try{
            String id = SEARCHFIELD.getText();
            if(id.length()>=1){
            int a = JOptionPane.showConfirmDialog(null, "Press Confirm to delete","Do you really want to delete",JOptionPane.YES_NO_OPTION);
            if(a==0)
            {
                
                
                ConnectionProvider connectionProvider = new ConnectionProvider();
                Connection con = connectionProvider.getCon();
                Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                st.executeUpdate("delete from bloodbanks where license = '"+id+"'");
                JOptionPane.showMessageDialog(null,"Data Has been Deleted Successfully,Thanks for Using our App");
                setVisible(false);
                new DeleteBloodBank().setVisible(true);
            }
            }
            else {
                JOptionPane.showMessageDialog(null,"Enter License Number to Search");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Deletion Unsuccessful");
        }
        
    }//GEN-LAST:event_DELETEActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteBloodBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteBloodBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteBloodBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteBloodBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteBloodBank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADDRESSFIELD;
    private javax.swing.JTextField CITYFIELD;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField DISTRICTFIELD;
    private javax.swing.JTextField MAILFIELD;
    private javax.swing.JTextField MOBILEFIELD;
    private javax.swing.JTextField NAMEFIELD;
    private javax.swing.JTextField SEARCHFIELD;
    private javax.swing.JTextField STATEFIELD;
    private javax.swing.JTextField STORAGEFIELD;
    private javax.swing.JTextField TESTFIELD;
    private javax.swing.JTextField VALIDITYFIELD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}