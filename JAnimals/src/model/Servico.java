/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Bruno
 */
public class Servico {
    
    private int id_servico;
    private String tx_nome;
    private Date dt_cadastro;
    private Boolean fl_ativo;

    public Servico (){
        
        this.id_servico = 0;
        this.tx_nome = "";
        this.dt_cadastro = new Date();
        this.fl_ativo = false;
    }
    
    /**
     * @return the id_servico
     */
    public int getIDServico() {
        return id_servico;
    }

    /**
     * @return the tx_nome
     */
    public String getNome() {
        return tx_nome;
    }

    /**
     * @param tx_nome the tx_nome to set
     */
    public void setNome(String tx_nome) {
        this.tx_nome = tx_nome;
    }

    /**
     * @return the dt_cadastro
     */
    public Date getDataCadastro() {
        return dt_cadastro;
    }

    /**
     * @param dt_cadastro the dt_cadastro to set
     */
    public void setDataCadastro(Date dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }

    /**
     * @return the fl_ativo
     */
    public Boolean getAtivo() {
        return fl_ativo;
    }

    /**
     * @param fl_ativo the fl_ativo to set
     */
    public void setAtivo(Boolean fl_ativo) {
        this.fl_ativo = fl_ativo;
    }
}
