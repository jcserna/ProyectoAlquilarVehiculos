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
public interface VehiculoAble
{
    public void alquilar();
    public void devolver (int kmFinal);
    public double calcularAlquiler(int km);
    public String mostrarDatos();
}
