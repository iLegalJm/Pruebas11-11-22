/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package UTPEjercicio5;

import MisClases.*;
//CUANDO ES DE TIPO STATIC DEBO IMPORTAR CON SU .METODO, EN ESTE CASO LECTURA//
import static MisClases.LeerCadena.lectura;

/**
 *
 * @author CHATARA_II
 */
public class UTPEjercicio5 {

    public static void main(String[] args) {
        //INSTANCIAR//
        String valorNombre;
        String valorApellido;
        String valorGenero;
        String valorDNI;
        Persona objPersona1 = new Persona();
        
        //INGRESO DE VALORES POR TECLADO//
        System.out.print("Ingrese el nombre: ");
        valorNombre=lectura();
        objPersona1.cambiarNombre(valorNombre);
          
        System.out.print("Ingrese el apellido: ");
        valorApellido=lectura();
        objPersona1.cambiarApellido(valorApellido);
        
        System.out.print("Ingrese el genero (M)o (F): ");
        valorGenero=lectura();
        objPersona1.cambiarGenero(valorGenero);
        
        System.out.print("Ingrese su DNI: ");
        valorDNI=lectura();
        objPersona1.cambiarDNI(valorDNI);
        
        //SALIDA VALORES INGRESADOS POR TECLADO//
        System.out.println("El nombre es: " + objPersona1.devolverNombre());
        System.out.println("El apellido es: " + objPersona1.devolverApellidos());
        System.out.println("Es del genero: " + objPersona1.devolverGenero());
        System.out.println("El dni es: " + objPersona1.devolverDNI());

    }

}
