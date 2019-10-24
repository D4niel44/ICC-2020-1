package ajedrez.piezas;

import ajedrez.piezas.Peon;
import ajedrez.piezas.Dama;
import ajedrez.piezas.Posicion;
import ajedrez.Tablero;

/**
 * Clase de prueba de movimientos posibles de la clase peon.
 * 
 */
public class Prueba {
    /**
     * metodo main.
     * 
     * @param args Recibe tres parametros: String color("b" para blanco cualquier
     *             otra cadena para negro), int fila, int columna.
     */
    public static void main(String[] args) {
        Tablero tab = Tablero.obtenerInstancia();
        Pieza dama = tab.obtenerPieza(7, 3);
        for (Posicion p : dama.obtenerJugadasLegales()) {
            System.out.println("(" + p.obtenerFila() + ", " + p.obtenerColumna() + ")");
        }    
        //System.out.println(tab.obtenerPieza(7, 3).obtenerJugadasLegales().toString());
        /*if (args[3] == "1") {
            Peon peon = new Peon((args[0].toUpperCase().equals("B")) ? Color.BLANCO : Color.NEGRO,
                    new Posicion(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            for (Posicion p : peon.obtenerJugadasLegales()) {
                System.out.println("(" + p.obtenerFila() + ", " + p.obtenerColumna() + ")");
            }
        }*/
    }
}