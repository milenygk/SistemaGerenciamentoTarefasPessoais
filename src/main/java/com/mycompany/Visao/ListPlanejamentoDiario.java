/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Visao;

import com.mycompany.Dao.DaoDespesas;
import com.mycompany.Dao.DaoPlanejamentoDiario;
import com.mycompany.Ferramentas.Formularios;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mileny.1948
 */
public class ListPlanejamentoDiario extends javax.swing.JFrame {

    /**
     * Creates new form ListPlanejamentoDiario
     */
    public ListPlanejamentoDiario() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
    }

     public void listarTodos(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePlanejamentoDiario.getModel();
            
            tablePlanejamentoDiario.setModel(defaultTableModel);

            DaoPlanejamentoDiario daoPlanejamentoDiario = new DaoPlanejamentoDiario();

            ResultSet resultSet = daoPlanejamentoDiario.listarTodos();
                        
            defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String data = resultSet.getString(1);
                String rotinaManha = resultSet.getString(2);
                String rotinaTarde = resultSet.getString(3);
                String rotinaNoite = resultSet.getString(4);
                String tarfasPontuais = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{data, rotinaManha, rotinaTarde, rotinaNoite, tarfasPontuais});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
     
      public void listarPorData(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePlanejamentoDiario.getModel();
            
            tablePlanejamentoDiario.setModel(defaultTableModel);

            DaoPlanejamentoDiario daoPlanejamentoDiario = new DaoPlanejamentoDiario();

            ResultSet resultSet = daoPlanejamentoDiario.listarPorData(tfFiltro.getText());
            
          defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String data = resultSet.getString(1);
                String rotinaManha = resultSet.getString(2);
                String rotinaTarde = resultSet.getString(3);
                String rotinaNoite = resultSet.getString(4);
                String tarfasPontuais = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{data, rotinaManha, rotinaTarde, rotinaNoite, tarfasPontuais});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
      
       public void listarPorRotinaManha(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePlanejamentoDiario.getModel();
            
            tablePlanejamentoDiario.setModel(defaultTableModel);

            DaoPlanejamentoDiario daoPlanejamentoDiario = new DaoPlanejamentoDiario();

            ResultSet resultSet = daoPlanejamentoDiario.listarPorRotinaManha(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
           while (resultSet.next()){
               String data = resultSet.getString(1);
                String rotinaManha = resultSet.getString(2);
                String rotinaTarde = resultSet.getString(3);
                String rotinaNoite = resultSet.getString(4);
                String tarfasPontuais = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{data, rotinaManha, rotinaTarde, rotinaNoite, tarfasPontuais});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
        
        public void listarPorRotinaTarde(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePlanejamentoDiario.getModel();
            
            tablePlanejamentoDiario.setModel(defaultTableModel);

            DaoPlanejamentoDiario daoPlanejamentoDiario = new DaoPlanejamentoDiario();
            
            ResultSet resultSet = daoPlanejamentoDiario.listarPorRotinaTarde(tfFiltro.getText());
            
           defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                 String data = resultSet.getString(1);
                String rotinaManha = resultSet.getString(2);
                String rotinaTarde = resultSet.getString(3);
                String rotinaNoite = resultSet.getString(4);
                String tarfasPontuais = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{data, rotinaManha, rotinaTarde, rotinaNoite, tarfasPontuais});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
        
         public void listarPorRotinaNoite(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePlanejamentoDiario.getModel();
            
            tablePlanejamentoDiario.setModel(defaultTableModel);

            DaoPlanejamentoDiario daoPlanejamentoDiario = new DaoPlanejamentoDiario();
            
            ResultSet resultSet = daoPlanejamentoDiario.listarPorRotinaNoite(tfFiltro.getText());
            
           defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                 String data = resultSet.getString(1);
                String rotinaManha = resultSet.getString(2);
                String rotinaTarde = resultSet.getString(3);
                String rotinaNoite = resultSet.getString(4);
                String tarfasPontuais = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{data, rotinaManha, rotinaTarde, rotinaNoite, tarfasPontuais});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
     
         
          public void listarPorTarfasPontuais(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePlanejamentoDiario.getModel();
            
            tablePlanejamentoDiario.setModel(defaultTableModel);

            DaoPlanejamentoDiario daoPlanejamentoDiario = new DaoPlanejamentoDiario();
            
            ResultSet resultSet = daoPlanejamentoDiario.listarPorTarfasPontuais(tfFiltro.getText());
            
           defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                 String data = resultSet.getString(1);
                String rotinaManha = resultSet.getString(2);
                String rotinaTarde = resultSet.getString(3);
                String rotinaNoite = resultSet.getString(4);
                String tarfasPontuais = resultSet.getString(5);
                
                defaultTableModel.addRow(new Object[]{data, rotinaManha, rotinaTarde, rotinaNoite, tarfasPontuais});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePlanejamentoDiario = new javax.swing.JTable();
        tfFiltro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCadastrarPlanejamento = new javax.swing.JButton();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tablePlanejamentoDiario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Rotina Manha", "Rotina Tarde", "Rotina Noite", "Principal(is) Atividade(s) do Dia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePlanejamentoDiario);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCadastrarPlanejamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrarPlanejamento.setText("PALNEJAMENTO DO DIA");
        btnCadastrarPlanejamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPlanejamentoActionPerformed(evt);
            }
        });

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Data", "Rotina Manha", "Rotina Tarde", "Rotina Noite", "Principais Atividades Do Dia" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("LISTA DE PLANEJAMENTOS DE ROTINAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(151, 151, 151))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastrarPlanejamento))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnCadastrarPlanejamento))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorData();
                break;
            case 2:
                listarPorRotinaManha();
                break;
            case 3:
                listarPorRotinaTarde();
                break;
            case 4:
               listarPorRotinaNoite();
                break;
            case 5:
                listarPorTarfasPontuais();
                break;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCadastrarPlanejamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPlanejamentoActionPerformed
        if (Formularios.planejamentoDiario == null)
            Formularios.planejamentoDiario = new PlanejamentoDiario();

        Formularios.planejamentoDiario.setVisible(true);
    }//GEN-LAST:event_btnCadastrarPlanejamentoActionPerformed

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
            java.util.logging.Logger.getLogger(ListPlanejamentoDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPlanejamentoDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListPlanejamentoDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPlanejamentoDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListPlanejamentoDiario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrarPlanejamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tablePlanejamentoDiario;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
