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
public class Perro {
    
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamaño=" + tamanio + '}';
    }
    
    public void crearPerro(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el nombre del perro: ");
        nombre = leer.next();
        System.out.println("Ingrese la raza: ");
        raza = leer.next();
        System.out.println("Ingrese la edad: ");
        edad = leer.nextInt();
        System.out.println("Ingrese el tamaño: ");
        tamanio = leer.next();
    }
    
}
