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
public class ModPessoa {
    private int id;
    private int idCategoria;
    private Date data;
    private String rotinaManha;
    private String rotinaTarde;
    private String rotinaNoite;
    private String tarfasPontuais;

    public ModPessoa(int id, int idCategoria, Date data, String rotinaManha, String rotinaTarde, String rotinaNoite, String tarfasPontuais) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.data = data;
        this.rotinaManha = rotinaManha;
        this.rotinaTarde = rotinaTarde;
        this.rotinaNoite = rotinaNoite;
        this.tarfasPontuais = tarfasPontuais;
    }

    public ModPessoa() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getRotinaManha() {
        return rotinaManha;
    }

    public void setRotinaManha(String rotinaManha) {
        this.rotinaManha = rotinaManha;
    }

    public String getRotinaNoite() {
        return rotinaNoite;
    }

    public void setRotinaNoite(String rotinaNoite) {
        this.rotinaNoite = rotinaNoite;
    }

    public String getRotinaTarde() {
        return rotinaTarde;
    }

    public void setRotinaTarde(String rotinaTarde) {
        this.rotinaTarde = rotinaTarde;
    }

    public String getTarfasPontuais() {
        return tarfasPontuais;
    }

    public void setTarfasPontuais(String tarfasPontuais) {
        this.tarfasPontuais = tarfasPontuais;
    }

 @Override
    public String toString() {
        return "ModDespesas{"+ "id=" + id + ", idCategoria=" + idCategoria + ", data=" + data + ", rotinaManha=" + rotinaManha +  ", rotinaNoite=" + rotinaNoite + ",rotinaTarde=" +rotinaTarde + ", tarfasPontuais=" + tarfasPontuais + '}';
    }    
    
}
