/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.gestion;

import alquilervehiculo.excepciones.VehiculoExcepcion;
import alquilervehiculo.modelo.AbstractVehiculo;
import alquilervehiculo.modelo.Coche;
import alquilervehiculo.modelo.Furgoneta;
import alquilervehiculo.modelo.Moto;
import alquilervehiculo.utilidades.LeerArchivoPlano;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo
 */
public class GestionVehiculo implements Serializable
{
   private List<AbstractVehiculo> vehiculos;

    public List<AbstractVehiculo> getVehiculos()
    {
        return vehiculos;
    }

    public void setVehiculos(List<AbstractVehiculo> vehiculos)
    {
        this.vehiculos = vehiculos;
    }
  
    
    public GestionVehiculo () {
        llenarVehiculos();
    }
    
    public void llenarVehiculos (){
        vehiculos = new ArrayList<>();
        
        vehiculos.add(new Moto("abc123", 10, true, 15, true));
        vehiculos.add(new Furgoneta("cba321", 20, true, 123, (short)12));
        vehiculos.add(new Coche("qwe123", 30, true, 254, true));
    }
    
       public void adicionarVehiculo(AbstractVehiculo vehiculo) throws VehiculoExcepcion
    {
        if(validarExistenciaVehiculo(vehiculo))
        {

            throw new VehiculoExcepcion("El vehiculo con matricula: "+ vehiculo.getMatricula() + 
                    " ya existe");
        }
        else
        {            
          
            vehiculos.add(vehiculo);
          
        }
    }
    
    private boolean validarExistenciaVehiculo(AbstractVehiculo vehiculo)
    {
        for(AbstractVehiculo vehi: this.vehiculos)
        {
            if(vehi.getMatricula().compareTo(vehiculo.getMatricula())==0)
            {
                return true;
            }
        }        
        return false;
    }
    
}
