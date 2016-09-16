/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoUsuario;
import java.util.List;
import model.Usuario;
import org.hibernate.HibernateException;

/**
 *
 * @author Bruno
 */
public class CtrManterUsuario {
    
    DaoUsuario context;
    
    public CtrManterUsuario()
    {
        context = new DaoUsuario();
    }
    
    public int gravarUsuario (Usuario usuario)
    {
        try
        {
            context.gravar(usuario);
            return 1;
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarUsuarios()
    {
        try
        {
            return context.carregarTudoOrdenado(Usuario.class, "tx_nome");
        }
        catch(HibernateException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean alterarUsuario(Usuario usuario)
    {
        try
        {
            context.alterar(usuario);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
}
