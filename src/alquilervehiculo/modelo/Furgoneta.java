/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.modelo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Camilo
 */
public class Furgoneta extends AbstractVehiculo 
{
    public short capacidad;

    public Furgoneta(String matricula, int km, boolean estado, double valorAlquiler, short capacidad)
    {
        super(matricula, km, estado, valorAlquiler);
        this.capacidad = capacidad;
    }

    public Furgoneta(String matricula, int km, boolean estado, double valorAlquiler)
    {
        super(matricula, km, estado, valorAlquiler);
    }

    public short getCapacidad()
    {
        return capacidad;
    }
    
      @Override
    public Object getOtro()
    {
        String mensaje = "Tiene "+getCapacidad()+" de capcidad";
        
        return mensaje;
    }

    @Override
    public Object mostrarDatos()
    {
        return obtenerArregloVehiculo();
    }

    @Override
    public double calcularAlquiler(int dias)
    {
                double precio = dias*valorAlquiler;
        return precio;
    }

    @Override
    public void devolver(int kmFinal)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alquilar()
    {
        setEstado(false);
    }

 
    
}
