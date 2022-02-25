/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje03;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mirod
 */
public class Baraja {

    private final int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> cartasMonton = new ArrayList();

    public Baraja() {
        this.baraja = new ArrayList();
    }

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public void llenarBaraja() {
        for (Palo palo : Palo.values()) {
            for (int numero : numeros) {
                Carta carta = new Carta(numero, palo);
                baraja.add(carta);
            }
        }
    }

    public void barajar() {
        Collections.shuffle(baraja);
        System.out.println("Mezclado");
    }

    public Carta siguienteCarta() {
        /*siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
         *más o se haya llegado al final, se indica al usuario que no hay más cartas.
         */
        Carta carta = null;
        if (baraja.isEmpty()) {
            System.out.println("No hay más cartas.");
        } else {
            carta = baraja.get(baraja.size() - 1);
        }
        return carta;
    }

    public int cartasDisponibles() {
        /*cartasDisponibles(): indica el número de cartas que aún se puede repartir.
         */
        int cantidadCartas = baraja.size();
        return cantidadCartas;
    }

    public ArrayList<Carta> darCartas(int cantidadSolicitada) {
        /*darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
        *de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
        *nada, pero debemos indicárselo al usuario.
         */
        ArrayList<Carta> cartas = new ArrayList();
        int tamanio = cartasDisponibles();
        if (tamanio >= cantidadSolicitada) {
            cartas = new ArrayList(baraja.subList(tamanio - cantidadSolicitada, tamanio));
            for (Carta carta : cartas) {
                baraja.remove(carta);
                cartasMonton.add(carta);
            }
        } else if (tamanio == 0) {
            System.out.println("No hay más cartas en la baraja.");
        } else {
            System.out.println("Cantidad insuficiente de cartas en la baraja.");
            System.out.println("Cartas disponibles: " + cartasDisponibles());
        }
        return cartas;
    }

    public void cartasMonton() {
        /*mostramos aquellas cartas que ya han salido, si no ha salido ninguna
        indicárselo al usuario*/
        if (cartasMonton.size() > 0) {
            System.out.print("Cartas repartidas: ");
            for (Carta carta : cartasMonton) {
                System.out.print(carta);            
            }
            System.out.println();
        } else {
            System.out.println("No se ha repartido ninguna carta.");
        }
        
    }

    public void mostrarBaraja() {
        /*mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
        y luego se llama al método, este no mostrara esa primera carta.*/
        if (baraja.size() > 0) {
            System.out.print("Cartas en la baraja: ");
            for (Carta carta : baraja) {
                System.out.print(carta);
            }
            System.out.println();
        } else {
            System.out.println("No quedan cartas en la baraja.");
        }

    }

}
