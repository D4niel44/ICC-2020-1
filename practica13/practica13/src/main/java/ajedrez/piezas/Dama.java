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

        int i = 0;
        int j = 0;
        for (int c = 0; c < 8; c++) {
            if (c % 4 == 0) {
                i = -1;
                j = -1;
            }
            if (c % 4 == 1) {
                i = -1;
                j = 0;
            }
            if (c % 4 == 2) {
                i = 1;
                j = -1;
            }
            if (c % 4 == 3) {
                i = 0;
                j = 1;
            }
            if (c >= 4) {
                i = -i;
                j = -j;
            }
            for (int fila = obtenerPosicion().obtenerFila() + i, columna = obtenerPosicion().obtenerColumna() + j; fila >= 0
                    && fila <= 7 && columna >= 0 && columna <= 7; fila += i, columna += j) {
                if (tab.obtenerPieza(fila, columna) != null) {
                    if (tab.obtenerPieza(fila, columna).obtenerColor() != this.obtenerColor()) {
                        jugadas.add(new Posicion(fila, columna));
                    }
                    break;
                } else {
                    jugadas.add(new Posicion(fila, columna));
                }
            }
        }
        return jugadas;
    }
}