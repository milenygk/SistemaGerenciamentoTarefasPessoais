/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Visao;

import com.mycompany.Dao.DaoDespesas;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.getStatement;
import com.mycompany.Ferramentas.Formularios;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mileny.1948
 */
public class ListDespesas extends javax.swing.JFrame {

    /**
     * Creates new form ListDespesas
     */
    public ListDespesas() {
        initComponents();
        
         setLocationRelativeTo(null);
        
        listarTodos();
    }
    
     public void listarTodos(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableDespesas.getModel();
            
            tableDespesas.setModel(defaultTableModel);

            DaoDespesas daoDespesas = new DaoDespesas();

            ResultSet resultSet = daoDespesas.listarTodos();
                        
            defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String data = resultSet.getString(1);
                String descricao = resultSet.getString(2);
                String categoria = resultSet.getString(3);
                String quantidade = resultSet.getString(4);
                String valor = resultSet.getString(5);
                String total = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{data, descricao, categoria, quantidade, valor, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
     
      public void listarPorDataDespesaIgualA(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableDespesas.getModel();
            
            tableDespesas.setModel(defaultTableModel);

            DaoDespesas daoDespesas = new DaoDespesas();

            ResultSet resultSet = daoDespesas.listarPorData(tfFiltro.getText());
            
          defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String data = resultSet.getString(1);
                String descricao = resultSet.getString(2);
                String categoria = resultSet.getString(3);
                String quantidade = resultSet.getString(4);
                String valor = resultSet.getString(5);
                String total = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{data, descricao, categoria, quantidade, valor, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
      
        public void listarPorDescricao(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableDespesas.getModel();

            tableDespesas.setModel(defaultTableModel);

            DaoDespesas daoDespesas = new DaoDespesas();

            ResultSet resultSet = daoDespesas.listarPorDescricao(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String data = resultSet.getString(1);
                String descricao = resultSet.getString(2);
                String categoria = resultSet.getString(3);
                String quantidade = resultSet.getString(4);
                String valor = resultSet.getString(5);
                String total = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{data, descricao, categoria, quantidade, valor, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
        
        public void listarPorCategoria(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableDespesas.getModel();
            
            tableDespesas.setModel(defaultTableModel);

            DaoDespesas daoDespesas = new DaoDespesas();

            ResultSet resultSet = daoDespesas.listarPorCategoria(tfFiltro.getText());
            
           defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String data = resultSet.getString(1);
                String descricao = resultSet.getString(2);
                String categoria = resultSet.getString(3);
                String quantidade = resultSet.getString(4);
                String valor = resultSet.getString(5);
                String total = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{data, descricao, categoria, quantidade, valor, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
        
         public void listarPorQuantidade(int pQuantidade){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableDespesas.getModel();
            
            tableDespesas.setModel(defaultTableModel);

            DaoDespesas daoDespesas = new DaoDespesas();

            ResultSet resultSet = daoDespesas.listarPorCategoria(pQuantidade);
            
           defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String data = resultSet.getString(1);
                String descricao = resultSet.getString(2);
                String categoria = resultSet.getString(3);
                String quantidade = resultSet.getString(4);
                String valor = resultSet.getString(5);
                String total = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{data, descricao, categoria, quantidade, valor, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
        
         public void listarPorValor(int pValor){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableDespesas.getModel();
            
            tableDespesas.setModel(defaultTableModel);

            DaoDespesas daoDespesas = new DaoDespesas();

            ResultSet resultSet = daoDespesas.listarPorValor(pValor);
            
            defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String data = resultSet.getString(1);
                String descricao = resultSet.getString(2);
                String categoria = resultSet.getString(3);
                String quantidade = resultSet.getString(4);
                String valor = resultSet.getString(5);
                String total = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{data, descricao, categoria, quantidade, valor, total});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
         
          public void listarPorTotal(int pTotal){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableDespesas.getModel();
            
            tableDespesas.setModel(defaultTableModel);

            DaoDespesas daoDespesas = new DaoDespesas();

            ResultSet resultSet = daoDespesas.listarPorTotal(pTotal);
            
            defaultTableModel.setRowCount(0);
           while (resultSet.next()){
                String data = resultSet.getString(1);
                String descricao = resultSet.getString(2);
                String categoria = resultSet.getString(3);
                String quantidade = resultSet.getString(4);
                String valor = resultSet.getString(5);
                String total = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{data, descricao, categoria, quantidade, valor, total});
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
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
        tableDespesas = new javax.swing.JTable();
        tfFiltro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tableDespesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Descrição", "Categoria", "Quantidade", "Valor", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDespesas);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Data ", "Descrição ", "Categoria", "Valor", "Total", " ", " " }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("LISTA DE DESPESAS");

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrar.setText("CADASTRAR DESPESA");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfFiltro))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnBuscar))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorDataDespesaIgualA();
                break;
            case 2:
                listarPorDescricao();
                break;
            case 3:
                listarPorCategoria();
                break;
            case 4:
                listarPorQuantidade(Integer.parseInt(tfFiltro.getText()));
                break;
            case 5:
                listarPorValor(Integer.parseInt(tfFiltro.getText()));
                break;
            case 6:
                listarPorTotal(Integer.parseInt(tfFiltro.getText()));
                break;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
          if (Formularios.despesas == null)
            Formularios.despesas = new Despesas();

        Formularios.despesas.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(ListDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListDespesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tableDespesas;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
