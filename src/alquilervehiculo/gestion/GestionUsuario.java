/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.gestion;

import alquilervehiculo.excepciones.VehiculoExcepcion;
import alquilervehiculo.modelo.Cliente;
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
    private List<Usuario> usuarios;
    private List<Cliente> clientes;
    
    
    String codigo;
    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public TipoUsuario[] getTipoUsuarios()
    {
        return tipoUsuarios;
    }

    public void setTipoUsuarios(TipoUsuario[] tipoUsuarios)
    {
        this.tipoUsuarios = tipoUsuarios;
    }

    public List<Usuario> getUsuarios()
    {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios)
    {
        this.usuarios = usuarios;
    }

    public List<Cliente> getClientes()
    {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes)
    {
        this.clientes = clientes;
    }

    

    public GestionUsuario()
    {
        llenarTiposUsuario();
        llenarUsuarios();
        llenarClientes();
    }

    private void llenarTiposUsuario()
    {

        tipoUsuarios = new TipoUsuario[3];
        tipoUsuarios[0] = new TipoUsuario("adm", "Administrador");
        tipoUsuarios[1] = new TipoUsuario("usr", "Usuario");
        tipoUsuarios[2] = new TipoUsuario("otr", "Otro");

    }

    public void llenarUsuarios()
    {
        //cargar el csv
        usuarios = LeerArchivoPlano.cargarUsuarios(tipoUsuarios);

    }
    
        public void llenarClientes()
    {
        //cargar el csv
        clientes = LeerArchivoPlano.cargarClientes();

    }

    public Usuario validarUsuario(String correo, String password)
    {
        for (Usuario usuarioValidado : usuarios)
        {
            if (usuarioValidado.getCorreoElectronico().compareTo(correo) == 0
                    && usuarioValidado.getPasswd().compareTo(password) == 0)
            {
                return usuarioValidado;
            }
        }

        return null;
    }

    public void adicionarUsuario(Usuario usuario) throws VehiculoExcepcion
    {
//        if (validarExistenciaUsuario(usuario))
//        {
//            ///gritar que esa materia ya existe
//            throw new VehiculoExcepcion("El usuario " + usuario.getCedula() + " ya existe");
//        }
//        else
//        {            //agrego a la lista

        usuarios.add(usuario);

        // agregarla en el archivo
//        }
    }

//    private boolean validarExistenciaUsuario(Usuario usuario)
//    {
//        for (Usuario usr : this.usuarios)
//        {
//            if (usr.getCedula().compareTo(usuario.getCedula()) == 0)
//            {
//                return true;
//            }
//        }
//        return false;
//    }
    public void adicionarCliente(Cliente cliente) throws VehiculoExcepcion
    {
//        if (validarExistenciaUsuario(usuario))
//        {
//            ///gritar que esa materia ya existe
//            throw new VehiculoExcepcion("El usuario " + usuario.getCedula() + " ya existe");
//        }
//        else
//        {            //agrego a la lista

        clientes.add(cliente);

        // agregarla en el archivo
//        }
    }
        public Cliente encontrarCliente(String id) 
    {
              for (Cliente cliente : getClientes())
            {
                Cliente cli;
                if (id.equals(cliente.getNombre()))
                {
                    cli = cliente; 
                    return cli;
                }
           
            }
            return null;
    }
}
