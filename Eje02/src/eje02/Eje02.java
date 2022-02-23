/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje02;

import java.util.ArrayList;

/**
 *
 * @author mirod
 */
public class Eje02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juego = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList();
        Revolver revolver = new Revolver();
        jugadores = juego.cargarJugadores();
        revolver.llenarRevolver();
        juego.llenarJuego(jugadores, revolver);
        juego.partida();
    }  
}
