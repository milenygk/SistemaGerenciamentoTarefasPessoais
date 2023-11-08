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
            sql =   " SELECT                              " +
                    "FIN.ID as ID,                        " +
                    "FIN.data as DATA_COMPRA              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA    " +
                    "FIN.VALOR as VALOR_PRODUTO           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL  " +
                    "FROM                                 " +
                    "FINANCEIRO FIN                       ";
                    
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
                    "FIN.ID as ID,                        " +
                    "FIN.data as DATA_COMPRA              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA    " +
                    "FIN.VALOR as VALOR_PRODUTO           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL  " +
                    "FROM                                 " +
                    "FINANCEIRO FIN                       " +
                    "WHERE                                " +
                    "FIN.ID LIKE ?                        "; 
                    
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
            sql =   " SELECT                              " + 
                    "FIN.ID as ID                         " +
                    "FIN.data as DATA_COMPRA              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA    " +
                    "FIN.VALOR as VALOR_PRODUTO           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL  " +
                    "FROM                                 " +
                    "FIANANCEIRO FIN                      " +
                    "WHERE                                " +
                    "FIN.DATA  like ?                     "; 
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
            sql =   " SELECT                              " + 
                    "FIN.ID as ID                         " +
                    "FIN.data as DATA_COMPRA              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA    " +
                    "FIN.VALOR as VALOR_PRODUTO           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL  " +
                    "FROM                                 " +
                    "FIANANCEIRO FIN                      " +
                    "WHERE                                " +
                    "FIN.DESCRICAO  like ?                "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, descricao + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
     public ResultSet listarPorCategoria(String categoria){
        try{
            sql =   " SELECT                              " + 
                    "FIN.ID as ID                         " +
                    "FIN.data as DATA_COMPRA              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA    " +
                    "FIN.VALOR as VALOR_PRODUTO           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL  " +
                    "FROM                                 " +
                    "FIANANCEIRO FIN                      " +
                    "WHERE                                " +
                    "FIN.CATEGORIA  like ?                "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, categoria + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
     
     public ResultSet listarPorValor(int valor){
        try{
            sql =   " SELECT                              " + 
                    "FIN.ID as ID                         " +
                    "FIN.data as DATA_COMPRA              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA    " +
                    "FIN.VALOR as VALOR_PRODUTO           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL  " +
                    "FROM                                 " +
                    "FIANANCEIRO FIN                      " +
                    "WHERE                                " +
                    "FIN.VALOR  like     ?                "; 
            
             setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, valor);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
     
     public ResultSet listarPorTotal(int total){
        try{
            sql =   " SELECT                              " + 
                    "FIN.ID as ID                         " +
                    "FIN.data as DATA_COMPRA              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA    " +
                    "FIN.VALOR as VALOR_PRODUTO           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL  " +
                    "FROM                                 " +
                    "FIANANCEIRO FIN                      " +
                    "WHERE                                " +
                    "FIN.QUANTIDADE * FIN.VALOR = ?        "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, total);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
             
}
