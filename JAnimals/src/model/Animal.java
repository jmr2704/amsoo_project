/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bruno
 */
public class Animal {
    
    private int id_animal;
    private String tx_categoria;
    private String tx_nome;
    private String tx_raca;
    private Cliente cliente;
    
    public Animal () {
        
        this.id_animal = 0;
        this.tx_categoria = "";
        this.tx_nome = "";
        this.tx_raca = "";
        this.cliente = new Cliente();
    }

    /**
     * @return the id_animal
     */
    public int getIDAnimal() {
        return id_animal;
    }

    /**
     * @return the tx_categoria
     */
    public String getCategoria() {
        return tx_categoria;
    }

    /**
     * @param tx_categoria the tx_categoria to set
     */
    public void setCategoria(String tx_categoria) {
        this.tx_categoria = tx_categoria;
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
     * @return the tx_raca
     */
    public String getRaca() {
        return tx_raca;
    }

    /**
     * @param tx_raca the tx_raca to set
     */
    public void setRaca(String tx_raca) {
        this.tx_raca = tx_raca;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
