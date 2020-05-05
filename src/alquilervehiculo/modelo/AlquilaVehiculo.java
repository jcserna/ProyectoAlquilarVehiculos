/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.modelo;

import java.util.Date;

/**
 *
 * @author Camilo
 */
public class AlquilaVehiculo
{
    public AbstractVehiculo vehiculo;
    public Usuario usuarioRegistra ;
    public Date fechaAlquiler;
    public Date fechaDevolucion;
    public Cliente cliente;

//    public AlquilaVehiculo(AbstractVehiculo vehiculo, Usuario usuarioRegistra)
//    {
//        this.vehiculo = vehiculo;
//        this.usuarioRegistra = usuarioRegistra;
//    }

    public AlquilaVehiculo(AbstractVehiculo vehiculo, Usuario usuarioRegistra, Date fechaAlquiler, Date fechaDevolucion, Cliente cliente)
    {
        this.vehiculo = vehiculo;
        this.usuarioRegistra = usuarioRegistra;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.cliente = cliente;
    }
    
    


    
    
    
}
