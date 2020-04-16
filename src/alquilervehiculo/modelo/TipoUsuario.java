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
public class TipoUsuario implements Serializable
{
   // private byte codigo;
    private  byte codigo;
    private String descripcion;

//    public TipoUsuario(String codigo, String descripcion)
//    {
//        this.codigo = codigo;
//        this.descripcion = descripcion;
//    }

//    public String getCodigo()
//    {
//        return codigo;
//    }
//
//    public void setCodigo(String codigo)
//    {
//        this.codigo = codigo;
//    }
//
//    
//    public String getDescripcion()
//    {
//        return descripcion;
//    }
//
//    public void setDescripcion(String descripcion)
//    {
//        this.descripcion = descripcion;
//    }
//    
    // ¿Debo utilizar toString si todos los atributos son de tipo String?

    public TipoUsuario(byte codigo, String descripcion)
    {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public byte getCodigo()
    {
        return codigo;
    }

    public void setCodigo(byte codigo)
    {
        this.codigo = codigo;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    
    
}
