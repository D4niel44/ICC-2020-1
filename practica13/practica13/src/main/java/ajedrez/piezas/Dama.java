package ajedrez.piezas;

import ajedrez.Tablero;
import java.util.List;
import java.util.LinkedList;

public class Dama extends Pieza {

    public Dama(Color color, Posicion posicion) {
        super(color, posicion);
    }

    public List<Posicion> obtenerJugadasLegales() {
        LinkedList<Posicion> jugadas = new LinkedList<>();
        Tablero tab = Tablero.obtenerInstancia();

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                for (int fila = obtenerPosicion().obtenerFila() + i, columna = obtenerPosicion().obtenerColumna()
                        + j; fila >= 0 && fila <= 7 && columna >= 0 && columna <= 7; fila += i, columna += j) {
                    if (tab.obtenerPieza(fila, columna) != null) {
                        if (tab.obtenerPieza(fila, columna).obtenerColor() != this.obtenerColor()) {
                            jugadas.add(new Posicion(fila, columna));
                        }
                        break;
                    } else {
                        jugadas.add(new Posicion(fila, columna));
                    }
                }
                if (i == 0) {
                    j++;
                }
            }
        }
        return jugadas;
    }
}