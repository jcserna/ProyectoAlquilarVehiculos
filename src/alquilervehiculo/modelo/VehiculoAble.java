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
public interface VehiculoAble
{
    public void alquilar();
    public void devolver (int kmFinal);
    public double calcularAlquiler(int dias);
    public Object mostrarDatos( ); // Cambio String a Object por facilidad de mostrar en la vista 
}
