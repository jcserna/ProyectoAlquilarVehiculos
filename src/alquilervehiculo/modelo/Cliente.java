/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.modelo;

/**
 *
 * @author Camilo
 */
public class Cliente
{

    public String cedula;
    public String nombre;

    public Cliente(String nombre, String cedula)
    {
        this.nombre = nombre;
        this.cedula = cedula;

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

    public Object[] obtenerArregloCliente()
    {
        Object[] datoC =
        {
            getNombre(), "",getCedula(), "Cliente"
        };
        return datoC;
    }
}
