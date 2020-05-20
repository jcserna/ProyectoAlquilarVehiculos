/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Camilo
 */
public class AlquilaVehiculo
{

    public AbstractVehiculo vehiculo;
//    public Usuario usuarioRegistra;
    public Date fechaAlquiler;
    public Date fechaDevolucion;
    public Cliente cliente;

//    public AlquilaVehiculo(AbstractVehiculo vehiculo, Usuario usuarioRegistra)
//    {
//        this.vehiculo = vehiculo;
//        this.usuarioRegistra = usuarioRegistra;
//    }

    public AlquilaVehiculo(AbstractVehiculo vehiculo, Date fechaAlquiler, Date fechaDevolucion, Cliente cliente)
    {
        this.vehiculo = vehiculo;
//        this.usuarioRegistra = usuarioRegistra;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.cliente = cliente;
    }

    public AbstractVehiculo getVehiculo()
    {
        return vehiculo;
    }

    public void setVehiculo(AbstractVehiculo vehiculo)
    {
        this.vehiculo = vehiculo;
    }

    public Date getFechaAlquiler()
    {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler)
    {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion()
    {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion)
    {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }



    public Object[] obtenerArregloVehiculoAlquilado()
    {
        Object[] dato =
        {
            getVehiculo().getMatricula(), getCliente().cedula, getFechaAlquiler(), getFechaDevolucion()
        };
        return dato;
    }

}
