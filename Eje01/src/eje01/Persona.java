/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Persona {
    
    private String nombre;    
    private String apellido;
    private Integer edad;
    private Integer documento;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el nombre de la persona: ");
        nombre = leer.next();
        System.out.println("Ingrese el apellido: ");
        apellido = leer.next();
        System.out.println("Ingrese la edad: ");
        edad = leer.nextInt();
        System.out.println("Ingrese el documento");
        documento = leer.nextInt();
    }
    
    public void asociarPerro(Perro perro){
        this.perro = perro;
    }
}
