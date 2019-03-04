/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leyla
 */
public class Lab4_2 extends javax.swing.JFrame {

    /**
     * Creates new form Lab4_2
     */
    public Lab4_2() {
        initComponents();
        setSize(400,400);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblStuInfo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        lblStat = new javax.swing.JLabel();
        rdSatis = new javax.swing.JRadioButton();
        rdUnSatis = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaStu = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Frame");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStuInfo.setText("Student INFO");
        getContentPane().add(lblStuInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, -1));

        lblName.setText("Name:");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel1.setText("Surname:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 180, -1));
        getContentPane().add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 180, -1));

        lblStat.setText("Status:");
        getContentPane().add(lblStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        buttonGroup1.add(rdSatis);
        rdSatis.setText("Satisfactory");
        getContentPane().add(rdSatis, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        buttonGroup1.add(rdUnSatis);
        rdUnSatis.setSelected(true);
        rdUnSatis.setText("UnSatisfactory");
        getContentPane().add(rdUnSatis, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        txtAreaStu.setColumns(20);
        txtAreaStu.setRows(5);
        jScrollPane1.setViewportView(txtAreaStu);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 330, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String output="Student INFORMATION\n";
        if(rdSatis.isSelected())
        {
            output += txtName.getText()+" "+ txtSurname.getText()+"\n";
            output += "SATISFACTORY";
        }
        else if(rdUnSatis.isSelected())
        {
            output += txtName.getText()+" "+ txtSurname.getText()+"\n";
            output += "UNSATISFACTORY";
        }
        txtAreaStu.setText(output);
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(Lab4_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab4_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab4_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab4_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab4_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStat;
    private javax.swing.JLabel lblStuInfo;
    private javax.swing.JRadioButton rdSatis;
    private javax.swing.JRadioButton rdUnSatis;
    private javax.swing.JTextArea txtAreaStu;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}