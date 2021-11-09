package igu;

import javax.swing.JOptionPane;
import logica.Cliente;
import logica.Controller;

/**
 *
 * @author Juan E. Chemello <juanchemell@gmail.com>
 */
public class Layout extends javax.swing.JFrame {

    Controller control;

    public Layout(Controller control) {
        this.control = control;
        initComponents();
    }

    private Layout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRace = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblIsAlergic = new javax.swing.JLabel();
        lblHasSpecialNeeds = new javax.swing.JLabel();
        lblOwnerName = new javax.swing.JLabel();
        lblCellphone = new javax.swing.JLabel();
        lblObservations = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtRace = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        comboIsAlergic = new javax.swing.JComboBox<>();
        comboHasSpecialNeeds = new javax.swing.JComboBox<>();
        txtOwnerName = new javax.swing.JTextField();
        txtCellphone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservations = new javax.swing.JTextPane();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Peluquería Canina");

        lblName.setText("Nombre");

        lblRace.setText("Raza");

        lblColor.setText("Color");

        lblIsAlergic.setText("Alérgico");

        lblHasSpecialNeeds.setText("Atención Especial");

        lblOwnerName.setText("Nombre Dueño");

        lblCellphone.setText("Cel. Dueño");

        lblObservations.setText("Observaciones");

        comboIsAlergic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Sí" }));
        comboIsAlergic.setToolTipText("");

        comboHasSpecialNeeds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Sí" }));

        jScrollPane1.setViewportView(txtObservations);

        btnReset.setText("Limpiar");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblRace)
                            .addComponent(lblColor)
                            .addComponent(lblIsAlergic)
                            .addComponent(lblHasSpecialNeeds)
                            .addComponent(lblOwnerName)
                            .addComponent(lblCellphone)
                            .addComponent(lblObservations))
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCellphone)
                            .addComponent(txtOwnerName)
                            .addComponent(comboHasSpecialNeeds, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboIsAlergic, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtColor)
                            .addComponent(txtRace)
                            .addComponent(txtName)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnReset)
                .addGap(74, 74, 74)
                .addComponent(btnSave)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRace)
                    .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIsAlergic)
                    .addComponent(comboIsAlergic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHasSpecialNeeds)
                    .addComponent(comboHasSpecialNeeds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerName)
                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCellphone)
                    .addComponent(txtCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblObservations))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnSave))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtName.setText("");
        txtRace.setText("");
        txtColor.setText("");
        txtOwnerName.setText("");
        txtCellphone.setText("");
        txtObservations.setText("");
        comboIsAlergic.setSelectedIndex(0);
        comboHasSpecialNeeds.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String name = txtName.getText();
        String race = txtRace.getText();
        String color = txtColor.getText();
        Boolean isAlergic = String.valueOf(comboIsAlergic.getSelectedIndex()).equals("1");
        Boolean hasSpecialNeeds = String.valueOf(comboHasSpecialNeeds.getSelectedIndex()).equals("1");
        String ownerName = txtOwnerName.getText();
        String telephone = txtCellphone.getText();
        String observations = txtObservations.getText();

        Cliente c = new Cliente(name, race, color, isAlergic, hasSpecialNeeds, ownerName, telephone, observations);
        control.newCliente(c);

        JOptionPane msg = new JOptionPane();
        msg.showMessageDialog(rootPane, name + " se ha guardado correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        msg.setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Layout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboHasSpecialNeeds;
    private javax.swing.JComboBox<String> comboIsAlergic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCellphone;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblHasSpecialNeeds;
    private javax.swing.JLabel lblIsAlergic;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblObservations;
    private javax.swing.JLabel lblOwnerName;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCellphone;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextPane txtObservations;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtRace;
    // End of variables declaration//GEN-END:variables
}
