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
public class Usuario extends Pessoa {
    
    private int id_usuario;
    private String tx_login;
    private String tx_senha;
    private Boolean fl_ativo;
    
    public Usuario (){
        
        this.id_usuario = 0;
        super.tx_nome = "";
        super.tx_cpf = "";
        super.tx_rg = "";
        super.tx_endereco = "";
        super.tx_cidade = "";
        super.tx_bairro = "";
        super.in_numero = 0;
        super.tx_cep = "";
        super.tx_estado = "";
        super.dt_cadastro = new Date();
        this.tx_login = "";
        this.tx_senha = "";
        this.fl_ativo = false;
    }
    
    /**
     * @return the id_usuario
     */
    public int getIDUsuario() {
        return id_usuario;
    }

    /**
     * @return the tx_nome
     */
    public String getNome() {
        return super.tx_nome;
    }

    /**
     * @param tx_nome the tx_nome to set
     */
    public void setNome(String tx_nome) {
        super.tx_nome = tx_nome;
    }

    /**
     * @return the tx_cpf
     */
    public String getCpf() {
        return super.tx_cpf;
    }

    /**
     * @param tx_cpf the tx_cpf to set
     */
    public void setCpf(String tx_cpf) {
        super.tx_cpf = tx_cpf;
    }

    /**
     * @return the tx_rg
     */
    public String getRg() {
        return super.tx_rg;
    }

    /**
     * @param tx_rg the tx_rg to set
     */
    public void setRg(String tx_rg) {
        super.tx_rg = tx_rg;
    }

    /**
     * @return the tx_endereco
     */
    public String getEndereco() {
        return super.tx_endereco;
    }

    /**
     * @param tx_endereco the tx_endereco to set
     */
    public void setEndereco(String tx_endereco) {
        super.tx_endereco = tx_endereco;
    }

    /**
     * @return the tx_cidade
     */
    public String getCidade() {
        return super.tx_cidade;
    }

    /**
     * @param tx_cidade the tx_cidade to set
     */
    public void setCidade(String tx_cidade) {
        super.tx_cidade = tx_cidade;
    }

    /**
     * @return the tx_bairro
     */
    public String getBairro() {
        return super.tx_bairro;
    }

    /**
     * @param tx_bairro the tx_bairro to set
     */
    public void setBairro(String tx_bairro) {
        super.tx_bairro = tx_bairro;
    }

    /**
     * @return the in_numero
     */
    public int getNumero() {
        return super.in_numero;
    }

    /**
     * @param in_numero the in_numero to set
     */
    public void setNumero(int in_numero) {
        super.in_numero = in_numero;
    }

    /**
     * @return the tx_cep
     */
    public String getCep() {
        return super.tx_cep;
    }

    /**
     * @param tx_cep the tx_cep to set
     */
    public void setCep(String tx_cep) {
        super.tx_cep = tx_cep;
    }

    /**
     * @return the tx_estado
     */
    public String getEstado() {
        return super.tx_estado;
    }

    /**
     * @param tx_estado the tx_estado to set
     */
    public void setEstado(String tx_estado) {
        super.tx_estado = tx_estado;
    }

    /**
     * @return the dt_cadastro
     */
    public Date getDataCadastro() {
        return super.dt_cadastro;
    }

    /**
     * @param dt_cadastro the dt_cadastro to set
     */
    public void setDataCadastro(Date dt_cadastro) {
        super.dt_cadastro = dt_cadastro;
    }
    
    /**
     * @return the tx_login
     */
    public String getLogin() {
        return tx_login;
    }

    /**
     * @param tx_login the tx_login to set
     */
    public void setLogin(String tx_login) {
        this.tx_login = tx_login;
    }

    /**
     * @return the tx_senha
     */
    public String getSenha() {
        return tx_senha;
    }

    /**
     * @param tx_senha the tx_senha to set
     */
    public void setSenha(String tx_senha) {
        this.tx_senha = tx_senha;
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
