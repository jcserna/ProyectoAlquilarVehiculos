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
// ¿Es implements o extends?
public abstract class AbstractVehiculo implements VehiculoAble
{
    public String matricula;
    public int km;
    public boolean estado;
    public double valorAlquiler;
    




   
    @Override
    public void alquilar()
    {
    }
    
    @Override
    public void devolver(int kmFinal)
    {
    }

    @Override
    public abstract double calcularAlquiler(int km);

    
    @Override
    public abstract String mostrarDatos();
    //En el diagrma de clases aparece void para ésta clase
}
