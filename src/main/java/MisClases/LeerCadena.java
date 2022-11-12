/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author CHATARA_II
 */
//EL io se encarga de manipular las funciones de ingreso y salida de teclado//
import java.io.*;
public class LeerCadena {
    //CUANDO PONGO STATIC YA NO NECESITO INSTANCIAR PARA LLAMAR AL METODO//
    public static String lectura(){
        String cadena=null;
        try {
            BufferedReader dato=new BufferedReader(new InputStreamReader(System.in));
            cadena=dato.readLine();
        } catch (Exception e) {
        }
        return cadena;
    }
}
