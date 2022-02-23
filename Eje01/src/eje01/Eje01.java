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
public class Eje01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        System.out.println("Carga de persona 1: ");
        persona1.crearPersona();
        System.out.println("Carga de persona 2: ");
        persona2.crearPersona();
        System.out.println("Carga del perro 1: ");
        perro1.crearPerro();
        System.out.println("Carga del perro 2: ");
        perro2.crearPerro();
        persona1.asociarPerro(perro1);
        persona2.asociarPerro(perro2);
        System.out.println("Informacion de la persona 1: ");
        System.out.println(persona1.toString());
        System.out.println("Informacion de la persona 2: ");
        System.out.println(persona2.toString());
    }
    
}
