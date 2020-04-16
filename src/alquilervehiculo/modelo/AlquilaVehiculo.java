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
public class AlquilaVehiculo
{
    public AbstractVehiculo vehiculo;
    public Usuario usuario;

    public AlquilaVehiculo(AbstractVehiculo vehiculo, Usuario usuario)
    {
        this.vehiculo = vehiculo;
        this.usuario = usuario;
    }
    
    
    
}
