/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Dao;

import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.getConexao;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.getResultado;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.getStatement;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.setResultado;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.setStatement;
import java.sql.ResultSet;

/**
 *
 * @author mileny.1948
 */
public class DaoPlanejamentoDiario {
     private String sql;
    
    public Boolean inserir(int id, int idcategoria, String data, String rotinaManha, String rotinaTarde,
           String rotinaNoite, String tarfasPontuais){
        try{
            sql ="INSERT INTO PLANEJAMENTOS (ID, ID_CATEGORIA, DATA, ROTINA_MANHA, "
                    + "ROTINA_TARDE, ROTINA_NOITE, TAREFAS_PONTUAIS) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
           setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(1, id);
           getStatement().setInt(2, idcategoria);
           getStatement().setString(3, data);
           getStatement().setString(4, rotinaManha);
           getStatement().setString(5, rotinaTarde);
           getStatement().setString(6, rotinaNoite);
           getStatement().setString(7, tarfasPontuais);
             
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        }
    
     public Boolean alterar(int id, int idcategoria, String data, String rotinaManha, String rotinaTarde,
           String rotinaNoite, String tarfasPontuais){
        try{ 
            sql = "UPDATE PLANEJAMENTOS SET DATA = ?, ROTINA_MANHA = ?,"
                    + " ROTINA_TARDE = ?, ROTINA_NOITE = ?, TAREFAS_PONTUAIS = ? WHERE ID = ?";
            
             setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(6, id);
           getStatement().setString(1, data);
           getStatement().setString(2, rotinaManha);
           getStatement().setString(3, rotinaTarde);
           getStatement().setString(4, rotinaNoite);
           getStatement().setString(5, tarfasPontuais);
             
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        }
     
     public Boolean excluir(int id){
        try{
            sql = "DELETE FROM PLANEJAMENTOS WHERE ID = ?";
            
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
            sql =   " SELECT                                  " +
                    "PAN.ID AS ID,                            " +
                    "PAN.data AS DATA,                        " +
                    "PAN.ROTINA_MANHA AS ROTINA_MANHA,        " +
                    "PAN.ROTINA_TARDE AS ROTINA_TARDE,        " +
                    "PAN.ROTINA_NOITE AS ROTINA_NOITE,        " +
                    "PAN.TAREFAS_PONTUAIS AS TAREFAS_PONTUAIS " +
                    "FROM                                     " +
                    "PLANEJAMENTOS PAN                        ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }  
     
     public ResultSet listarPorId(int id){
        try{
            sql =   " SELECT                                  " +
                    "PAN.ID AS ID,                            " +
                    "PAN.data AS DATA,                        " +
                    "PAN.ROTINA_MANHA AS ROTINA_MANHA,        " +
                    "PAN.ROTINA_TARDE AS ROTINA_TARDE,        " +
                    "PAN.ROTINA_NOITE AS ROTINA_NOITE,        " +
                    "PAN.TAREFAS_PONTUAIS AS TAREFAS_PONTUAIS " +
                    "FROM                                     " +
                    "PLANEJAMENTOS PAN                        " +
                    "WHERE                                    " +
                    "PAN.ID = ?                               "; 
                   
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
            sql =   " SELECT                                  " +
                    "PAN.ID AS ID,                            " +
                    "PAN.data AS DATA,                        " +
                    "PAN.ROTINA_MANHA AS ROTINA_MANHA,        " +
                    "PAN.ROTINA_TARDE AS ROTINA_TARDE,        " +
                    "PAN.ROTINA_NOITE AS ROTINA_NOITE,        " +
                    "PAN.TAREFAS_PONTUAIS AS TAREFAS_PONTUAIS " +
                    "FROM                                     " +
                    "PLANEJAMENTOS PAN                        " +
                    "WHERE                                    " +
                    "PAN.DATA  LIKE ?                         "; 
            
        setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, data);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
      public ResultSet listarPorRotinaManha(String rotinaManha){
        try{
            sql = 
                    " SELECT                                  " +
                    "PAN.ID AS ID,                            " +
                    "PAN.data AS DATA,                        " +
                    "PAN.ROTINA_MANHA AS ROTINA_MANHA,        " +
                    "PAN.ROTINA_TARDE AS ROTINA_TARDE,        " +
                    "PAN.ROTINA_NOITE AS ROTINA_NOITE,        " +
                    "PAN.TAREFAS_PONTUAIS AS TAREFAS_PONTUAIS " +
                    "FROM                                     " +
                    "PLANEJAMENTOS PAN                        " +
                    "WHERE                                    " +
                    "PAN.ROTINA_MANHA LIKE ?                  "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, rotinaManha + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
      
       public ResultSet listarPorRotinaTarde(String rotinaTarde){
        try{
            sql = 
                    " SELECT                                  " +
                    "PAN.ID AS ID,                            " +
                    "PAN.data AS DATA,                        " +
                    "PAN.ROTINA_MANHA AS ROTINA_MANHA,        " +
                    "PAN.ROTINA_TARDE AS ROTINA_TARDE,        " +
                    "PAN.ROTINA_NOITE AS ROTINA_NOITE,        " +
                    "PAN.TAREFAS_PONTUAIS AS TAREFAS_PONTUAIS " +
                    "FROM                                     " +
                    "PLANEJAMENTOS PAN                        " +
                    "WHERE                                    " +
                    "PAN.ROTINA_TARDE LIKE ?                  "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, rotinaTarde + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
      
       public ResultSet listarPorRotinaNoite(String rotinaNoite){
        try{
            sql = 
                    " SELECT                                  " +
                    "PAN.ID AS ID,                            " +
                    "PAN.data AS DATA,                        " +
                    "PAN.ROTINA_MANHA AS ROTINA_MANHA,        " +
                    "PAN.ROTINA_TARDE AS ROTINA_TARDE,        " +
                    "PAN.ROTINA_NOITE AS ROTINA_NOITE,        " +
                    "PAN.TAREFAS_PONTUAIS AS TAREFAS_PONTUAIS " +
                    "FROM                                     " +
                    "PLANEJAMENTOS PAN                        " +
                    "WHERE                                    " +
                    "PAN.ROTINA_NOITE LIKE ?                  "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, rotinaNoite + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
      
       public ResultSet listarPorTarfasPontuais(String tarfasPontuais){
        try{
            sql = 
                    " SELECT                                  " +
                    "PAN.ID AS ID,                            " +
                    "PAN.data AS DATA,                        " +
                    "PAN.ROTINA_MANHA AS ROTINA_MANHA,        " +
                    "PAN.ROTINA_TARDE AS ROTINA_TARDE,        " +
                    "PAN.ROTINA_NOITE AS ROTINA_NOITE,        " +
                    "PAN.TAREFAS_PONTUAIS AS TAREFAS_PONTUAIS " +
                    "FROM                                     " +
                    "PLANEJAMENTOS PAN                        " +
                    "WHERE                                    " +
                    "PAN.TAREFAS_PONTUAIS LIKE ?              "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, tarfasPontuais + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
       
     public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM PLANEJAMENTOS";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next();
            
            id = getResultado().getInt(1); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;        
     }
}
