/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.modelo;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

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

    public void mostrarDatos()
    {
      String mensaje = "Tiene "+getCapacidad()+" de capcidad";
        JOptionPane.showMessageDialog(null, "Tipo de Vehiculo: " + getClass().getSimpleName()
                + "\nMatricula: " + getMatricula()
                + "\nKilometraje: " + getKm() + "\n"+mensaje
       );
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
        setEstado(true);
        int kilometrajeUsado = kmFinal-getKm();       
      String mensaje= "El usuario ha recorrido "+kilometrajeUsado+" kilometros"+
              "\nEl vheículo ha sido devuelto, su nuevo kilometraje es "+kmFinal;
         setKm(kmFinal);
        JOptionPane.showMessageDialog(null, mensaje);
    }


    @Override
    public void alquilar()
    {
        setEstado(false);
    }

 
    
}
