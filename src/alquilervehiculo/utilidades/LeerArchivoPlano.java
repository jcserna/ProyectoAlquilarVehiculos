/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculo.utilidades;

import alquilervehiculo.modelo.AbstractVehiculo;
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
        public static List<Usuario> cargarUsuarios(TipoUsuario[] tipos) {
        List<Usuario> listado= new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("src/usuariosVehiculos.csv");
          //  archivo = new File("src/usuariosVehiculosString.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;            
            br.readLine();
            while ((linea = br.readLine()) != null) {
               
               String[] datos= linea.split(";");
              
               //String tipUs = datos[4] ;
           //    Usuario usuario= new Usuario(datos[0], datos[1], datos[2], datos[3], tipos[Integer.parseInt(datos[4])-1]);               
           //Crear un Switch para String 
           //Como elegir en qué posicion está el 
           
                Usuario usuario= new Usuario(datos[0], datos[1], datos[2], datos[3], tipos[Integer.parseInt(datos[4])-1]);               
               listado.add(usuario);
                       
            }
        } catch (Exception e) {
            System.out.println("El archivo no existe = " + e.getMessage());
        } finally {            
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return listado;
    }

            public static List<AbstractVehiculo> cargarVehiculos() {
        List<AbstractVehiculo> listadoVehiculos= new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("src/listaVehiculos.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;            
            //br.readLine();
            while ((linea = br.readLine()) != null) {
               
               String[] datos= linea.split(";");
               
    //           AbstractVehiculo vehiculo = new AbstractVehiculo();
    //como inicializar vehiculo
      //         listadoVehiculos.add(vehiculo);
                       
            }
        } catch (Exception e) {
            System.out.println("El archivo no existe = " + e.getMessage());
        } finally {            
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return listadoVehiculos;
    }
    
}
