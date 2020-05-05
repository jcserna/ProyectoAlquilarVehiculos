/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.modelo;

import java.io.Serializable;

/**
 *
 * @author Camilo
 */
public class Usuario implements Serializable
{
    public String cedula;
    public String nombre;
    public String correoElectronico;
    // correo electronico en lugar de login
    public String passwd;
    public TipoUsuario tipoUsuario;
 
    // En el diagrama de clases hace falta Tipo de Usuario, sin él no habría composición. 
    // ¿tiene sentido usar set en atributos publicos?

    public Usuario(String cedula, String nombre, String correoElectronico, String passwd, TipoUsuario tipoUsuario)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.passwd = passwd;
        this.tipoUsuario = tipoUsuario;
    }

    public String getCedula()
    {
        return cedula;
    }

    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getCorreoElectronico()
    {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico)
    {
        this.correoElectronico = correoElectronico;
    }

    public String getPasswd()
    {
        return passwd;
    }

    public void setPasswd(String passwd)
    {
        this.passwd = passwd;
    }

    public TipoUsuario getTipoUsuario()
    {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario)
    {
        this.tipoUsuario = tipoUsuario;
    }
                
    @Override
    public String toString()
    {
        return nombre;
    }
   

     public Object[] obtenerArregloObjeto(){
        Object[] dato={getNombre(), getCorreoElectronico(), getCedula(), getTipoUsuario().toString()};
        return dato;
    }
 

    
}
