/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.modelo;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;



public class Moto extends AbstractVehiculo 
{

public boolean casco;

    public Moto(String matricula, int km, boolean estado, double valorAlquiler, boolean casco)
    {
        super(matricula, km, estado, valorAlquiler);
        this.casco= casco;
    }

    public Moto(String matricula, int km, boolean estado, double valorAlquiler)
    {
        super(matricula, km, estado, valorAlquiler);
    }

    public boolean isCasco()
    {
        return casco;
    }

    @Override
    public Object getOtro()
    {
        String mensaje;
        
        if (isCasco()== true){
        mensaje = "La moto tiene casco";
                }
        else {
        mensaje = "La moto no tiene casco";
        }
        return mensaje;
    }
    

    @Override
    public Object mostrarDatos()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        int kilometraje = getKm()+kmFinal;
      String mensaje= "El vheículo ha sido devuelto, su nuevo kilometraje es "+kilometraje;
        JOptionPane.showMessageDialog(null, mensaje);
    }

    @Override
    public void alquilar()
    {
        setEstado(false);
    }



}
