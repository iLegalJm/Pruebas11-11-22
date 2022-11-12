/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author CHATARA_II
 */
public class Persona {

    //ATRIBUTOS//
    private String nombre;
    private String apellidos;
    private String dni;
    private String genero;

    //METODOS//
    public void cambiarNombre(String nombreCambiar) {
        String cambiarN;
        cambiarN = cambiarAMayuscula(nombreCambiar);
        this.nombre = cambiarN;
    }

    public void cambiarApellido(String apellidoCambiar) {
        String cambiarA;
        cambiarA = cambiarAMayuscula(apellidoCambiar);
        this.apellidos = cambiarA;
    }

    public void cambiarGenero(String generoCambiar) {
        String cambiarG;
        cambiarG = cambiarAMinuscula(generoCambiar);
        this.genero = cambiarG;
    }

    public void cambiarDNI(String cambiarDNI) {
        String cambioDNI;
        cambioDNI = cambiarAMinuscula(cambiarDNI);
        this.dni = cambioDNI;
    }

    public String devolverNombre() {
        return this.nombre;
    }

    public String devolverApellidos() {
        return this.apellidos;
    }

    public String devolverGenero() {
        return this.genero;
    }

    public String devolverDNI() {
        return this.dni;
    }

    private String cambiarAMayuscula(String valorMayuscula) {
        return valorMayuscula.toUpperCase();
    }

    private String cambiarAMinuscula(String valorMinuscula) {
        return valorMinuscula.toLowerCase();
    }
}
