/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Visao;

import com.mycompany.Dao.DaoDespesas;
import com.mycompany.Ferramentas.Constantes;
import com.mycompany.Ferramentas.DadosTemporarios;
import com.mycompany.Ferramentas.Formularios;
import com.mycompany.Modelo.ModDespesas;
import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author mileny.1948
 */
public class Despesas extends javax.swing.JFrame {

    private Object id;

    /**
     * Creates new form Despesas
     */
    public Despesas() {
        initComponents();
        
         if(!existeDadosTemporarios()){
             DaoDespesas daoDespesas = new DaoDespesas();

            int id = daoDespesas.buscarProximoId(); 
            if (id > 0)
                tfId.setText(String.valueOf(id));
            
            btnAcao.setText(Constantes.BTN_SALVAR_TEXT);
            btnExcluir.setVisible(false);
        }else{
            btnAcao.setText(Constantes.BTN_ALTERAR_TEXT);
            btnExcluir.setVisible(true);
        }
         tfId.setVisible(false);
    }
    
     private Boolean existeDadosTemporarios(){        
        if(DadosTemporarios.tempObject instanceof ModDespesas){
            int id = ((ModDespesas) DadosTemporarios.tempObject).getId();
            Date data = ((ModDespesas) DadosTemporarios.tempObject).getData();
            String descricao = ((ModDespesas) DadosTemporarios.tempObject).getDescricao();
            String categoria = ((ModDespesas) DadosTemporarios.tempObject).getCategoria();
            int quantidade = ((ModDespesas) DadosTemporarios.tempObject).getQuantidade();
            int valor = ((ModDespesas) DadosTemporarios.tempObject).getValor(); 
            int total = ((ModDespesas) DadosTemporarios.tempObject).getTotal(); 
            
            tfId.setText(String.valueOf(id));
            tfData.setText(String.valueOf(String.valueOf(data)));
            taDescricao.setText(String.valueOf(descricao));
            tfCategoria.setText(categoria);
            tfQuantidade.setText(String.valueOf(quantidade));
            tfValor.setText(String.valueOf(valor));
            tfValorTotal.setText(String.valueOf(total));
            
            DadosTemporarios.tempObject = null;
            
            return true;
        }else
            return false;
        }

       private void inserir(int data, String descricao, String categoria, int quantidade, int valor, int total){
        DaoDespesas daoDespesas = new DaoDespesas();
        
        if (daoDespesas.alterar(Integer.parseInt(tfId.getText()), Integer.parseInt(tfData.getText()), Integer.parseInt(tfQuantidade.getText()), Integer.parseInt(tfValor.getText()), Integer.parseInt(tfValorTotal.getText()), taDescricao.getText(), tfCategoria.getText())){
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
            tfId.setText(String.valueOf(id));
            tfData.setText(String.valueOf(String.valueOf(data)));
            taDescricao.setText(String.valueOf(descricao));
            tfCategoria.setText(categoria);
            tfQuantidade.setText(String.valueOf(quantidade));
            tfValor.setText(String.valueOf(valor));
            tfValorTotal.setText(String.valueOf(total));
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível salvar!");
        }
       }
       
        private void alterar(int data, String descricao, String categoria, int quantidade, int valor, int total){
       DaoDespesas daoDespesas = new DaoDespesas();
        
        if (daoDespesas.alterar(Integer.parseInt(tfId.getText()), Integer.parseInt(tfData.getText()), Integer.parseInt(tfQuantidade.getText()), Integer.parseInt(tfValor.getText()), Integer.parseInt(tfValorTotal.getText()), taDescricao.getText(), tfCategoria.getText())){
            JOptionPane.showMessageDialog(null, "Categoria alterada com sucesso!");
            
             tfId.setText(String.valueOf(id));
            tfData.setText(String.valueOf(String.valueOf(data)));
            taDescricao.setText(String.valueOf(descricao));
            tfCategoria.setText(categoria);
            tfQuantidade.setText(String.valueOf(quantidade));
            tfValor.setText(String.valueOf(valor));
            tfValorTotal.setText(String.valueOf(total));
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível alterar!");
        }
        
        ((ListDespesas) Formularios.Listdespesas).listarTodos();
        
        dispose();
    }       

       private void excluir(int data, String descricao, String categoria, int quantidade, int valor, int total){
        DaoDespesas daoDespesas = new DaoDespesas();
        
        if (daoDespesas.excluir(Integer.parseInt(tfId.getText()))){
            JOptionPane.showMessageDialog(null, "Despesa " + taDescricao.getText() + " excluída com sucesso!");
            
            tfId.setText(String.valueOf(id));
            tfData.setText(String.valueOf(String.valueOf(data)));
            taDescricao.setText(String.valueOf(descricao));
            tfCategoria.setText(categoria);
            tfQuantidade.setText(String.valueOf(quantidade));
            tfValor.setText(String.valueOf(valor));
            tfValorTotal.setText(String.valueOf(total));
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível excluir!");
        }
        
        ((ListDespesas) Formularios.Listdespesas).listarTodos();
        
        dispose();
    }
       
       private void calculaTotalCompra(int valor, int quantidade){
        int total = valor * quantidade;
        
        tfValorTotal.setText(String.valueOf(total));
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        tfCategoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        tfValorTotal = new javax.swing.JTextField();
        btnAcao = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        tfQuantidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Data");

        jLabel3.setText("Descrição");

        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        jScrollPane1.setViewportView(taDescricao);

        jLabel4.setText("Categoria");

        jLabel5.setText("Valor");

        jLabel6.setText("Total");

        btnAcao.setText("SALVAR");
        btnAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcaoActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel7.setText("Quantidade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAcao)
                        .addGap(113, 113, 113)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(tfCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcao)
                    .addComponent(btnExcluir)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcaoActionPerformed
           if (btnAcao.getText() == Constantes.BTN_SALVAR_TEXT)
            inserir();
        else if (btnAcao.getText() == Constantes.BTN_ALTERAR_TEXT)
            alterar();
    }//GEN-LAST:event_btnAcaoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int escolha =
              JOptionPane.showConfirmDialog(null,
                      "Deseja realmente excluir?" + taDescricao.getText() + "?");
      
      if(escolha == JOptionPane.YES_OPTION)
          excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Despesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Despesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Despesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Despesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Despesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcao;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTextField tfCategoria;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfValor;
    private javax.swing.JTextField tfValorTotal;
    // End of variables declaration//GEN-END:variables

    private void inserir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void alterar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
