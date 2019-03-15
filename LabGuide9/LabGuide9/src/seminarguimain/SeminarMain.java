package seminarguimain;

public class SeminarMain extends javax.swing.JFrame {

    SEARCHGUI search = new SEARCHGUI(this);
    public SeminarMain() {
        setSize(574,536);
        setLocationRelativeTo(null);
        initComponents();
        int id = Seminar.getLastUsedId();
        idField.setText(id+" ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SeminarPanel = new javax.swing.JPanel();
        idField = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtSpeak = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        lblSpeak = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblDur = new javax.swing.JLabel();
        txtDur = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDisplayDuration = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaToDisplay = new javax.swing.JTextArea();
        tfKey = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seminars");
        getContentPane().setLayout(null);

        SeminarPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2), "Seminar"));
        SeminarPanel.setLayout(null);

        idField.setEditable(false);
        SeminarPanel.add(idField);
        idField.setBounds(50, 20, 110, 30);

        lblId.setText("ID:");
        SeminarPanel.add(lblId);
        lblId.setBounds(20, 30, 70, 14);

        lblTitle.setText("Title:");
        SeminarPanel.add(lblTitle);
        lblTitle.setBounds(170, 30, 80, 14);
        SeminarPanel.add(txtTitle);
        txtTitle.setBounds(210, 20, 290, 30);
        SeminarPanel.add(txtSpeak);
        txtSpeak.setBounds(70, 60, 190, 30);

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        SeminarPanel.add(txtDate);
        txtDate.setBounds(320, 60, 170, 30);

        lblSpeak.setText("Speaker:");
        SeminarPanel.add(lblSpeak);
        lblSpeak.setBounds(20, 60, 50, 20);

        lblDate.setText("Date:");
        SeminarPanel.add(lblDate);
        lblDate.setBounds(280, 70, 60, 14);

        lblDur.setText("Duration:");
        SeminarPanel.add(lblDur);
        lblDur.setBounds(20, 110, 70, 14);
        SeminarPanel.add(txtDur);
        txtDur.setBounds(70, 100, 90, 30);

        jLabel1.setText("Place:");
        SeminarPanel.add(jLabel1);
        jLabel1.setBounds(200, 110, 50, 14);
        SeminarPanel.add(txtPlace);
        txtPlace.setBounds(250, 100, 130, 30);

        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        SeminarPanel.add(clearBtn);
        clearBtn.setBounds(110, 160, 90, 23);

        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        SeminarPanel.add(addBtn);
        addBtn.setBounds(280, 160, 90, 23);

        getContentPane().add(SeminarPanel);
        SeminarPanel.setBounds(10, 10, 530, 210);

        btnDisplay.setText("Display All");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(btnDisplay);
        btnDisplay.setBounds(30, 340, 140, 23);

        btnRemove.setText("Remove a Seminar By Id");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove);
        btnRemove.setBounds(20, 250, 180, 23);

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(20, 420, 180, 23);

        btnDisplayDuration.setText("Display Duration");
        btnDisplayDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayDurationActionPerformed(evt);
            }
        });
        getContentPane().add(btnDisplayDuration);
        btnDisplayDuration.setBounds(30, 380, 140, 23);

        TextAreaToDisplay.setColumns(20);
        TextAreaToDisplay.setRows(5);
        jScrollPane1.setViewportView(TextAreaToDisplay);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 250, 340, 210);

        tfKey.setToolTipText("Id or Name");
        getContentPane().add(tfKey);
        tfKey.setBounds(60, 290, 120, 30);

        jLabel5.setText("Id: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 300, 20, 20);

        setSize(new java.awt.Dimension(574, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        idField.setText("");
        txtTitle.setText("");
        txtDate.setText("");
        txtSpeak.setText("");
        txtPlace.setText("");
        txtDur.setText("");
        tfKey.setText("");             
    }//GEN-LAST:event_clearBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        String title = txtTitle.getText();
        String speaker = txtSpeak.getText();
        int duration = Integer.parseInt(txtDur.getText());
        String place = txtPlace.getText();
        String date = txtDate.getText();
        int id = Seminar.getLastUsedId();
        SeminarList.addSeminar(title,speaker, date, duration, place);
        TextAreaToDisplay.setText(title + " is added to the list.");
        idField.setText(id+"");
    }//GEN-LAST:event_addBtnActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
       
        TextAreaToDisplay.setText(SeminarList.display());
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (!SeminarList.removeSeminar(tfKey.getText())) {
            TextAreaToDisplay.setText("That seminar doesn't exist!");
        }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        search.getCmbID().removeAllItems();
        Seminar arr[] = SeminarList.getAll();
        for (int i = 0; i < SeminarList.getCount(); i++) {
                search.getCmbID().addItem(arr[i].getTitle().toString());
            }
        search.setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDisplayDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayDurationActionPerformed
        
        TextAreaToDisplay.append("\n\nSeminar With maximum duration \n" + SeminarList.getMaximumDuration()+ "\n");
    }//GEN-LAST:event_btnDisplayDurationActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

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
            java.util.logging.Logger.getLogger(SeminarMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeminarMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeminarMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeminarMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeminarMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SeminarPanel;
    private javax.swing.JTextArea TextAreaToDisplay;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnDisplayDuration;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDur;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblSpeak;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField tfKey;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDur;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextField txtSpeak;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
