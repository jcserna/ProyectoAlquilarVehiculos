/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.gestion;

import alquilervehiculo.excepciones.VehiculoExcepcion;
import alquilervehiculo.modelo.AbstractVehiculo;
import alquilervehiculo.modelo.AlquilaVehiculo;
import alquilervehiculo.modelo.Cliente;
import alquilervehiculo.modelo.Coche;
import alquilervehiculo.modelo.Furgoneta;
import alquilervehiculo.modelo.Moto;
import alquilervehiculo.utilidades.LeerArchivoPlano;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Camilo
 */
public class GestionVehiculo implements Serializable
{

    private List<AbstractVehiculo> vehiculos;
    private  List<AlquilaVehiculo> vehiculosAlquilados;

    public  List<AlquilaVehiculo> getVehiculosAlquilados()
    {
        return vehiculosAlquilados;
    }

    public void setVehiculosAlquilados(List<AlquilaVehiculo> vehiculosAlquilados)
    {
        this.vehiculosAlquilados = vehiculosAlquilados;
    }

    public List<AbstractVehiculo> getVehiculos()
    {
        return vehiculos;
    }

    public void setVehiculos(List<AbstractVehiculo> vehiculos)
    {
        this.vehiculos = vehiculos;
    }

    public GestionVehiculo()
    {
        llenarVehiculos();
    }

    public void llenarVehiculos()
    {
        vehiculos = new ArrayList<>();

//        vehiculos.add(new Moto("abc123", 10, true, 15, true));
//        vehiculos.add(new Furgoneta("cba321", 20, true, 123, (short)12));
//        vehiculos.add(new Coche("qwe123", 30, true, 254, true));
        vehiculos = LeerArchivoPlano.cargarVehiculos();
    }

    public void adicionarVehiculo(AbstractVehiculo vehiculo) throws VehiculoExcepcion
    {
        if (validarExistenciaVehiculo(vehiculo))
        {

            throw new VehiculoExcepcion("El vehiculo con matricula: " + vehiculo.getMatricula()
                    + " ya existe");
        }
        else
        {

            vehiculos.add(vehiculo);

        }
    }

    private boolean validarExistenciaVehiculo(AbstractVehiculo vehiculo)
    {
        for (AbstractVehiculo vehi : this.vehiculos)
        {
            if (vehi.getMatricula().compareTo(vehiculo.getMatricula()) == 0)
            {
                return true;
            }
        }
        return false;
    }

    public AbstractVehiculo encontrarVehiculo(String matricula)
    {
        for (AbstractVehiculo vehiculo : getVehiculos())
        {
            AbstractVehiculo veh;
            if (matricula.equals(vehiculo.getMatricula()))
            {
                veh = vehiculo;
                return veh;
            }

        }
        return null;
    }

    public AlquilaVehiculo adicionarVehiculoAlquilado(AbstractVehiculo vehiculo, Date fechaAlquiler, Date fechaDevolucion, Cliente cliente) throws VehiculoExcepcion
    {
        vehiculosAlquilados = new ArrayList<>();
        AlquilaVehiculo vehiculoAlquilado = new AlquilaVehiculo(vehiculo, fechaAlquiler, fechaDevolucion, cliente);
        vehiculosAlquilados.add(vehiculoAlquilado);
        return vehiculoAlquilado;
    }
    
     public int calcularFecha(Date fecha1, Date fecha2 )
    {
        int dias = -1;
        while (fecha1.before(fecha2)||fecha1.equals(fecha2)){
            dias++;
           
        }
        return dias;
    }
     
         public int calcularDias(Calendar inicio, Calendar fin)
    {
        if (inicio != null && fin != null)
        {
            Calendar fechaEntrega = inicio;
            Calendar fechaDevolucion; 
            int dias = 0;

            while (inicio.before(fin) || inicio.equals(fin))
            {
                dias++;
                fechaEntrega.add(Calendar.DATE, 1);
            }
            return dias;
        }
        return 0;

    }
}
