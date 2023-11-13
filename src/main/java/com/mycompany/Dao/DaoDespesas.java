/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Dao;

import com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.getConexao;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.getResultado;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.getStatement;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.setResultado;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.setStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author mileny.1948
 */
public class DaoDespesas {
    private String sql;
    
    public Boolean inserir(int id, int idcategoria, String data, String descricao, String categoria,
            int valor, int total, int quantidade){
        try{
            sql = "INSERT INTO FINANCEIRO (ID, ID_CATEGORIA, DATA, DESCRICAO, "
                    + "CATEGORIA, VALOR, TOTAL, QUANTIDADE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
          setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(1, id);
           getStatement().setInt(2, idcategoria);
           getStatement().setString(3, data);
           getStatement().setString(4, descricao);
           getStatement().setString(5, categoria);
           getStatement().setInt(6, valor);
           getStatement().setInt(7, total);
           getStatement().setInt(8, quantidade);
             
             
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        }
    
    public Boolean alterar(int id, int idcategoria, String data, String descricao, String categoria,
            int valor, int total, int quantidade){
         
          try{
            sql = "UPDATE FINACEIRO SET DATA = ?, DESCRICAO = ?,"
                    + " CATEGORIA = ?, VALOR = ?, TOTAL = ?, QUANTIDADE = ? WHERE ID = ?";
            
             setStatement(getConexao().prepareStatement(sql));
             
           getStatement().setInt(6, id);
           getStatement().setString(1, data);
           getStatement().setString(2, descricao);
           getStatement().setString(3, categoria);
           getStatement().setInt(4, valor);
           getStatement().setInt(5, total);
           getStatement().setInt(8, quantidade);
           
           getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
     
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM FINANCEIRO WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
      
    public ResultSet listarTodos(){
        try{
            sql =   " SELECT                               " +
                    "FIN.ID as ID,                         " +
                    "FIN.data as DATA_COMPRA,              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA,    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA,    " +
                    "FIN.VALOR as VALOR_PRODUTO,           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO, " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL   " +
                    "FROM                                  " +
                    "FINANCEIRO FIN                        ";
                    
        setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }  
       
    public ResultSet listarPorId(int id){
        try{
            sql =   " SELECT                              " +
                    "FIN.ID as ID,                         " +
                    "FIN.data as DATA_COMPRA,              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA,    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA,    " +
                    "FIN.VALOR as VALOR_PRODUTO,           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO, " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL   " +
                    "FROM                                  " +
                    "FINANCEIRO FIN                        " +
                    "WHERE                                 " +
                    "FIN.ID = ?                            "; 
                    
         setStatement(getConexao().prepareStatement(sql));
            
         getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
   public ResultSet listarPorData(String data){
        try{ 
            sql =   " SELECT                               " + 
                    "FIN.ID as ID,                         " +
                    "FIN.data as DATA_COMPRA,              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA,    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA,    " +
                    "FIN.VALOR as VALOR_PRODUTO,           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO, " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL   " +
                    "FROM                                  " +
                    "FIANANCEIRO FIN                       " +
                    "WHERE                                 " +
                    "FIN.DATA  LIKE ?                      "; 
        setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, data);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDescricao(String descricao){
        try{
            sql =   " SELECT                               " + 
                    "FIN.ID as ID,                         " +
                    "FIN.data as DATA_COMPRA,              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA,    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA,    " +
                    "FIN.VALOR as VALOR_PRODUTO,           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO, " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL   " +
                    "FROM                                  " +
                    "FIANANCEIRO FIN                       " +
                    "WHERE                                 " +
                    "FIN.DESCRICAO  LIKE ?                 "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, descricao + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
     public ResultSet listarPorCategoria(String pCategoria){
        try{
            sql =   " SELECT                               " + 
                    "FIN.ID as ID,                         " +
                    "FIN.data as DATA_COMPRA,              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA,    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA,    " +
                    "FIN.VALOR as VALOR_PRODUTO,           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO, " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL   " +
                    "FROM                                  " +
                    "FIANANCEIRO FIN                       " +
                    "WHERE                                 " +
                    "FIN.CATEGORIA  LIKE ?                 "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, pCategoria + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
     
      public ResultSet listarPorQuantidade(int pQuantidade){
        try{
            sql =   " SELECT                               " + 
                    "FIN.ID as ID,                         " +
                    "FIN.data as DATA_COMPRA,              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA,    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA,    " +
                    "FIN.VALOR as VALOR_PRODUTO,           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO, " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL   " +
                    "FROM                                  " +
                    "FIANANCEIRO FIN                       " +
                    "WHERE                                 " +
                    "FIN.QUANTIDADE = ?                    "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
             getStatement().setInt(1, pQuantidade);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
     
     public ResultSet listarPorValor(int pValor){
        try{
            sql =   " SELECT                               " + 
                    "FIN.ID as ID,                         " +
                    "FIN.data as DATA_COMPRA,              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA,    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA,    " +
                    "FIN.VALOR as VALOR_PRODUTO,           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO, " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL   " +
                    "FROM                                  " +
                    "FIANANCEIRO FIN                       " +
                    "WHERE                                 " +
                    "FIN.VALOR = ?                         "; 
            
             setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, pValor);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
     
     public ResultSet listarPorTotal(int pTotal){
        try{
            sql =   " SELECT                               " + 
                    "FIN.ID as ID,                         " +
                    "FIN.data as DATA_COMPRA,              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA,    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA,    " +
                    "FIN.VALOR as VALOR_PRODUTO,           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO, " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL   " +
                    "FROM                                  " +
                    "FIANANCEIRO FIN                       " +
                    "WHERE                                 " +
                    "FIN.QUANTIDADE * FIN.VALOR = ?         "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, pTotal);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
     public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT MAX(ID) + 1 FROM FINANCEIRO";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next();
            
            id = getResultado().getInt(1); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;        
     }

    public boolean alterar(int parseInt, int parseInt0, int parseInt1, int parseInt2, int parseInt3, String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ResultSet listarPorCategoria(int quantidade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean inserir(int parseInt, int parseInt0, int parseInt1, int parseInt2, int parseInt3, String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
