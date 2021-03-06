/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminarguimain;

import javax.swing.JComboBox;

/**
 *
 * @author Leyla
 */
public class SEARCHGUI extends javax.swing.JFrame {

    /**
     * Creates new form SEARCHGUI
     */
    public SEARCHGUI(SeminarMain f) {
        initComponents();
        
    }

    public JComboBox getCmbID() {
        return cmbID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbID = new javax.swing.JComboBox();
        lblSelect = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JScrollPane();
        txtAreaSearch = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(cmbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 180, 40));

        lblSelect.setText("Select Seminar Title:");
        getContentPane().add(lblSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 160, 20));

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        txtAreaSearch.setColumns(20);
        txtAreaSearch.setRows(5);
        txtSearch.setViewportView(txtAreaSearch);

        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       Seminar s = SeminarList.getSeminar(cmbID.getSelectedItem().toString());
        if (s != null) {
            txtAreaSearch.setText("Here is the seminar you were looking for...\n" + s.toString());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmbID;
    private javax.swing.JLabel lblSelect;
    private javax.swing.JTextArea txtAreaSearch;
    private javax.swing.JScrollPane txtSearch;
    // End of variables declaration//GEN-END:variables
}
