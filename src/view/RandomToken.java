/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Random;
import randomtoken.function;

/**
 *
 * @author Gusma
 */
public class RandomToken extends javax.swing.JInternalFrame {

    /**
     * Creates new form RandomToken
     */
    public RandomToken() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regeneratnt ed by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button1 = new javax.swing.JButton();
        isi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tarea = new javax.swing.JTextArea();

        setClosable(true);
        setForeground(java.awt.Color.orange);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Random Token");
        setName(""); // NOI18N

        Button1.setText("Acak");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        isi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiActionPerformed(evt);
            }
        });

        Tarea.setColumns(20);
        Tarea.setRows(5);
        jScrollPane1.setViewportView(Tarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isi, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(isi))
                    .addComponent(Button1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Memanggil function file dalam package randomtoken
     * Meinstansiasi function dengan nama random1
     * Memanggil fungsi pada function dengan data tipe integer diconvert menjadi data tipe String
     * @param evt 
     */
    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        function random1 = new function();
        Tarea.setText(random1.token(Integer.parseInt(isi.getText())));
        
    }//GEN-LAST:event_Button1ActionPerformed

    private void isiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JTextArea Tarea;
    private javax.swing.JTextField isi;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
