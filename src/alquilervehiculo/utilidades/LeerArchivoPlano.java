/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.utilidades;

import alquilervehiculo.gestion.GestionUsuario;
import alquilervehiculo.modelo.AbstractVehiculo;
import alquilervehiculo.modelo.Cliente;
import alquilervehiculo.modelo.Coche;
import alquilervehiculo.modelo.Furgoneta;
import alquilervehiculo.modelo.Moto;
import alquilervehiculo.modelo.TipoUsuario;
import alquilervehiculo.modelo.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo
 */
public class LeerArchivoPlano
{   
    
    
    public static List<Usuario> cargarUsuarios(TipoUsuario[] tipos)
    {
        
        List<Usuario> listado = new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try
        {
            archivo = new File("src/usuariosVehiculosString.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero            
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null)
            {

                String[] datos = linea.split(";");
                String codigo = datos[4];
              
             
           byte  numeroTipo =convertirTipoUsr(codigo);
//                byte numeroTipo=0;
//                
//                switch (codigo){
//                    case "adm":
//                        numeroTipo=0;
//                        break;
//                    case "usr":
//                        numeroTipo=1;
//                        break;
//                    case "clt":
//                        numeroTipo=3;
//                        break;
//                }
//                
                
                
                
                Usuario usuario = new Usuario(datos[0], datos[1], datos[2], datos[3], tipos[(byte)numeroTipo]);
                listado.add(usuario);

            }
        }
        catch (Exception e)
        {
            System.out.println("El archivo no existe = "  + e.getMessage());
        }
        finally
        {
            try
            {
                if (null != fr)
                {
                    fr.close();
                }
            }
            catch (Exception e2)
            {
                e2.printStackTrace();
            }
        }

        return listado;
    }

          public static List<Cliente> cargarClientes()
    {
        List<Cliente> listado = new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try
        {
            archivo = new File("src/clientes.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null)
            {

                String[] datos = linea.split(";");

                Cliente cliente = new Cliente(datos[0], datos[1]);
                listado.add(cliente);

            }
        }
        catch (Exception e)
        {
            System.out.println("El archivo no existe = " + e.getMessage());
        }
        finally
        {
            try
            {
                if (null != fr)
                {
                    fr.close();
                }
            }
            catch (Exception e2)
            {
                e2.printStackTrace();
            }
        }
        return listado;
    
    }
        
          
    
    public static List<AbstractVehiculo> cargarVehiculos()
    {
        List<AbstractVehiculo> listadoVehiculos = new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try
        {
            archivo = new File("src/listaVehiculos.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null)
            {

                String[] datos = linea.split(";");
                String tipoVehiculo = datos[0].toLowerCase();
                boolean disponibilidad = false;
                if (datos[3].toLowerCase().equals("disponible"))
                {
                    disponibilidad = true;
                }
                
                       switch (tipoVehiculo){
                    case "moto":
                {
                    boolean casco = false;
                    if (datos[5].toLowerCase().equals("si"))
                {
                    casco = true;
                }
                    Moto moto = new Moto(datos[1], Integer.parseInt(datos[2]),disponibilidad, Double.parseDouble(datos[4]), true);
                   listadoVehiculos.add(moto);
                }
                        break;
                        
                   case "furgoneta":
                {
          
                    Furgoneta furgoneta = new Furgoneta(datos[1], Integer.parseInt(datos[2]),disponibilidad, Double.parseDouble(datos[4]), Short.parseShort(datos[5]));
                   listadoVehiculos.add(furgoneta);
                }
                        break;
                        
                    case "coche":
                {
                    boolean extras = false;
                    if (datos[5].toLowerCase().equals("si"))
                {
                    extras = true;
                }
                    Coche coche = new Coche(datos[1], Integer.parseInt(datos[2]),disponibilidad, Double.parseDouble(datos[4]), true);
                   listadoVehiculos.add(coche);
                }
                        break;

                }
                
                
//                           AbstractVehiculo vehiculo = new AbstractVehiculo();
                //como inicializar vehiculo
                //         listadoVehiculos.add(vehiculo);
            }
        }
        catch (Exception e)
        {
            System.out.println("El archivo no existe = " + e.getMessage());
        }
        finally
        {
            try
            {
                if (null != fr)
                {
                    fr.close();
                }
            }
            catch (Exception e2)
            {
                e2.printStackTrace();
            }
        }
        return listadoVehiculos;
    }
    
        public static byte convertirTipoUsr(String codigo)
    {
        byte numeroTipo = 0;

        switch (codigo)
        {
            case "adm":
                numeroTipo = 0;
                break;
            case "usr":
                numeroTipo = 1;
                break;
            case "clt":
                numeroTipo = 3;
                break;
        }
        return numeroTipo;
    }
}
