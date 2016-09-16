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
public class Tarefa {
    
    private int id_tarefa;
    private String tx_nome;
    private Usuario usuario;
    private Animal animal;
    private Servico servico;
    private Date dt_tarefa;
    
    public Tarefa(){
        
        this.id_tarefa = 0;
        this.tx_nome = "";
        this.usuario = new Usuario();
        this.animal = new Animal();
        this.servico = new Servico();
        this.dt_tarefa = new Date();
    }

    /**
     * @return the id_tarefa
     */
    public int getIDTarefa() {
        return id_tarefa;
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

    /**
     * @return the animal
     */
    public Animal getAnimal() {
        return animal;
    }

    /**
     * @param animal the animal to set
     */
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    /**
     * @return the servico
     */
    public Servico getServico() {
        return servico;
    }

    /**
     * @param servico the servico to set
     */
    public void setServico(Servico servico) {
        this.servico = servico;
    }

    /**
     * @return the dt_tarefa
     */
    public Date getDataTarefa() {
        return dt_tarefa;
    }

    /**
     * @param dt_tarefa the dt_tarefa to set
     */
    public void setDataTarefa(Date dt_tarefa) {
        this.dt_tarefa = dt_tarefa;
    }

    
}
