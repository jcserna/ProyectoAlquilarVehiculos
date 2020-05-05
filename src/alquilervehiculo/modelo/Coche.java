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
public class Coche extends AbstractVehiculo 
{
public boolean extras;

    public Coche(String matricula, int km, boolean estado, double valorAlquiler, boolean extras)
    {
        super(matricula, km, estado, valorAlquiler);
        this.extras = extras;
    }

// Crear clase interface calcularAlquiler

    @Override
    public String mostrarDatos()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularAlquiler(int km)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void devolver(int kmFinal)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alquilar()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
