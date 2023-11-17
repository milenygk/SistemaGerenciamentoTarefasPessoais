/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

import java.sql.Date;

/**
 *
 * @author mileny.1948
 */
public class ModDespesas {
    private int id;
    private int idCategoria;
    private Date data;
    private String descricao;
    private String categoria;
    private int valor;
    private int quantidade;
    private int total;

    public ModDespesas() {
    }

    public ModDespesas(int id, int id_categoria, Date data, String descricao, String categoria, int valor, int quantidade, int total) {
        this.id = id;
        this.idCategoria = id_categoria;
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valor = valor;
        this.quantidade = quantidade;
        this.total = total;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_categoria() {
        return idCategoria;
    }

    public void setId_categoria(int id_categoria) {
        this.idCategoria = id_categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
      @Override
    public String toString() {
        return "ModDespesas{"+ "id=" + id + ", idCategoria=" + idCategoria + ", data=" + data + ", descricao=" + descricao +  ", categoria=" + categoria + ",valor=" +valor + ", total=" + total+ ",quantidade=" + quantidade + '}';
    }
}
