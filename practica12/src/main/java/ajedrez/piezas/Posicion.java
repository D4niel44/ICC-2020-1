package ajedrez.piezas;

/**
 * Clase que representa la posición en el tablero de las piezas
 */
public class Posicion {

    private int fila;
    private int columna;

    /**
     * Constructor de la clase
     * 
     * @param fila    Fila del tablero
     * @param columna Columna del tablero
     */
    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    /**
     * Metodo para obtener la fila de una pieza
     * 
     * @return la fila de la pieza
     */
    public int obtenerFila() {
        return fila;
    }

    /**
     * Metodo para obtener la columna de la pieza
     * 
     * @return columna de la pieza
     */
    public int obtenerColumna() {
        return columna;
    }

    /**
     * Compara dos posiciones del tablero
     * 
     * @return true si las posiciones son iguales
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Posicion otra = (Posicion) obj;
        return fila == otra.fila && columna == otra.columna;
    }
}