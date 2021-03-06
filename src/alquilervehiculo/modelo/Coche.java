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
public class Coche extends AbstractVehiculo
{

    public boolean extras;

    public Coche(String matricula, int km, boolean estado, double valorAlquiler, boolean extras)
    {
        super(matricula, km, estado, valorAlquiler);
        this.extras = extras;
    }

    public Coche(String matricula, int km, boolean estado, double valorAlquiler)
    {
        super(matricula, km, estado, valorAlquiler);
    }

    public boolean isExtras()
    {
        return extras;
    }

    @Override
    public Object getOtro()
    {
        String mensaje;

        if (isExtras() == true)
        {
            mensaje = "El coche tiene extras";
        }
        else
        {
            mensaje = "El coche no tiene extras";
        }
        return mensaje;
    }

    @Override
    public void mostrarDatos()
    {
        String mensaje;
        if (isExtras() == true)
        {
            mensaje = "El coche tiene extras";
        }
        else
        {
            mensaje = "El coche no tiene extras";
        }
        JOptionPane.showMessageDialog(null, "Tipo de Vehiculo: " + getClass().getSimpleName()
                + "\nMatricula: " + getMatricula()
                + "\nKilometraje: " + getKm() + "\n" + mensaje
        );
    }

    @Override
    public double calcularAlquiler(int dias)
    {
        double precio = dias * valorAlquiler;
        return precio;
    }

    @Override
    public void devolver(int kmFinal)
    {
        setEstado(true);
        int kilometrajeUsado;
        int kmNuevo;
        if (kmFinal < this.getKm())
        {
            kmNuevo = kmFinal + 999999;
            kilometrajeUsado = kmNuevo - getKm();
            String mensaje = "El usuario ha recorrido " + kilometrajeUsado + " kilometros"
                    + "\nEl vehículo ha sido devuelto, su nuevo kilometraje es " + kmFinal;
            setKm(kmFinal);
            JOptionPane.showMessageDialog(null, mensaje); 
        }
        else
        {

            kilometrajeUsado = kmFinal - getKm();
            String mensaje = "El usuario ha recorrido " + kilometrajeUsado + " kilometros"
                    + "\nEl vehículo ha sido devuelto, su nuevo kilometraje es " + kmFinal;
            setKm(kmFinal);
            JOptionPane.showMessageDialog(null, mensaje);
        }

    }

    @Override
    public void alquilar()
    {
        setEstado(false);
    }

}
