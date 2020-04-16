/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.gestion;

import alquilervehiculo.modelo.TipoUsuario;
import alquilervehiculo.modelo.Usuario;
import alquilervehiculo.utilidades.LeerArchivoPlano;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo
 */
public class GestionUsuario
{
    private TipoUsuario[] tipoUsuarios;
    //Cambiar por una collección java.util
    // Set, List, HashTable 
    //ArrayList - Polimorfismo
    private List<Usuario> usuarios;    
    

    public GestionUsuario() {
        llenarTiposUsuario();
        llenarUsuarios();
    }
    
    private void llenarTiposUsuario()
    {
        tipoUsuarios = new TipoUsuario[3]; 
        tipoUsuarios[0] = new TipoUsuario((byte)1, "Administrador");
        tipoUsuarios[1] = new TipoUsuario((byte)2, "Usuario");
        tipoUsuarios[2] = new TipoUsuario((byte)3, "Otro");

//         tipoUsuarios = new TipoUsuario[3]; 
//        tipoUsuarios[0] = new TipoUsuario("adm", "Administrador");
//        tipoUsuarios[1] = new TipoUsuario("usr", "Usuario");
//        tipoUsuarios[2] = new TipoUsuario("otro", "Otro");
 
    }
        private void llenarUsuarios()
    {
        //cargar el csv
        usuarios=LeerArchivoPlano.cargarUsuarios(tipoUsuarios);
        
    }
    
    public Usuario validarUsuario(String correo, String password)
    {
        for(Usuario usuarioValidado: usuarios)
        {
            if(usuarioValidado.getCorreoElectronico().compareTo(correo)==0 &&
                    usuarioValidado.getPasswd().compareTo(password)==0)
            {
                return usuarioValidado;
            }
        }
        
        return null;
    }
}
