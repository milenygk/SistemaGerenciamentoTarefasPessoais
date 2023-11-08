/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Dao;

import com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql;
import java.sql.ResultSet;

/**
 *
 * @author mileny.1948
 */
public class DaoPessoa extends ConexaoBancoDeDadosMySql{
    String sql;
    
    public Boolean inserir(int id, String nome, String sobrenome, String cpf, String DataDeNascimento, String genero,
            String telefone, String email, String endereco, String cidade, String estado, String usuario, String senha){
        try{
            sql = "INSERT INTO PESSOA (ID, NOME, SOBRENOME, CPF, DATADENASCIMENTO, GENERO, TELEFONE,"
                    + "EMAIL, ENDERECO, CIDADE, ESTADO, USUARIO, SENHA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setString(9, endereco);
            getStatement().setString(10, cidade);
            getStatement().setString(2, nome);
            getStatement().setString(3, sobrenome);
            getStatement().setString(6, genero);
            getStatement().setString(7, telefone);
            getStatement().setString(8, email);
            getStatement().setString(4, cpf);
            getStatement().setString(5, DataDeNascimento);
            getStatement().setString(11, estado);
            getStatement().setString(12, usuario);
            getStatement().setString(13, senha);
          
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, String nome, String sobrenome, String cpf, String DataDeNascimento, String genero,
            String telefone, String email, String endereco, String cidade, String estado, String usuario, String senha){
        try{
            sql = "UPDATE PESSOA SET NOME = ?, SOBRENOME = ?, CPF = ?, DATADENASCIMENTO = ?,"
                    + " GENERO = ?, TELEFONE = ?, EMAIL = ?, ENDERECO = ?, CIDADE = ?, ESTADO = ?, "
                    + "USUARIO = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(12, id);
            getStatement().setString(8, endereco);
            getStatement().setString(9, cidade);
            getStatement().setString(10, estado);
            getStatement().setString(1, nome);
            getStatement().setString(2, sobrenome);
            getStatement().setString(5, genero);
            getStatement().setString(6, telefone);
            getStatement().setString(7, email);
            getStatement().setString(3, cpf);
            getStatement().setString(4, DataDeNascimento);
            getStatement().setString(11, usuario);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     public Boolean alterarSenha(int id, String novaSenha){
        try{
            sql = "UPDATE PESSOA SET SENHA = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(2, id);
            getStatement().setString(1, novaSenha);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
     
     public Boolean excluir(int id){
        try{
            sql = "DELETE FROM PESSOA WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
     
     public ResultSet recuperaSenha(String usuario){
        try{
            sql = 
                " SELECT                            " +
                "   ID,                             " +
                "   SENHA                           " +
                " FROM                              " +
                "   PESSOA                          " +
                " WHERE USUARIO = ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, usuario);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
}
