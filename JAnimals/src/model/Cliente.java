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
public class Cliente extends Pessoa{
    
    private int id_cliente;
    private Usuario usuario;
    
    public Cliente (){
        
        this.id_cliente = 0;
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
        this.usuario = new Usuario();
    }
    
    /**
     * @return the id_cliente
     */
    public int getIDCliente() {
        return id_cliente;
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
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
