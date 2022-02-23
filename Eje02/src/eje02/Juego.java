/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje02;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
        this.jugadores = new ArrayList();
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    
    public ArrayList<Jugador> cargarJugadores(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Ingrese la cantidad de jugadores, entre 1 y 6");
        int cantJugadores = leer.nextInt();
        if (cantJugadores < 1 || cantJugadores > 6){
            cantJugadores = 6;
        }
        for (int i = 0; i < cantJugadores; i++) {
            Jugador jugador = new Jugador();
            jugador.setId(i+1);
            jugador.setMojado(false);
            jugador.setNombre("jugador"+jugador.getId());
            jugadores.add(jugador);
        }
        return jugadores;
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        this.jugadores = jugadores;
        this.revolver = r;
    }
    
    public Jugador ronda(){
        for (Jugador jugador : this.jugadores) {
            System.out.println("Jugador en turno: " + jugador.getNombre());
            if(jugador.disparo(this.revolver)){
                return jugador;
            }
        }
        return null; 
    }
    
    public void partida(){
        int ronda = 0;
        Jugador jugadorMojado;
        do {
            ronda++;
            System.out.println("Ronda: " + ronda);
            jugadorMojado = ronda();   
        } while (jugadorMojado == null);  
        System.out.println("El jugador mojado es: " + jugadorMojado.getNombre());
    }
}
