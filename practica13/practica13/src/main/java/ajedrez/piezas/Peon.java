package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;

/**
 * Clase que modela peones. Subclase de la clase Pieza
 * 
 */
public class Peon extends Pieza {

    /**
     * Constructor de la clase
     * 
     * @param color    Color del peon
     * @param posicion Posicion del peon
     */
    public Peon(Color color, Posicion posicion) {
        super(color, posicion);
    }

    @Override
    public List<Posicion> obtenerJugadasLegales() {
        LinkedList<Posicion> jugadas = new LinkedList<>();
        int fila = obtenerPosicion().obtenerFila();
        int columna = obtenerPosicion().obtenerColumna();
        int c = 1;
        if (this.obtenerColor() == Color.BLANCO) {
            c -= 2;
        }
        if (c == -1 && fila == 6) {
            jugadas.add(new Posicion(fila - 2, columna));
        }
        if (c == 1 && fila == 1) {
            jugadas.add(new Posicion(fila + 2, columna));
        }
        if (fila + c >= 0 && fila + c <= 7) {
            for (int i = -1; i < 2; i++) {
                if (columna + i >= 0 && columna + i <= 7) {
                    jugadas.add(new Posicion(fila + c, columna + i));
                }
            }
        }
        return jugadas;
    }
}