package ajedrez.piezas;

import java.util.List;
import ajedrez.piezas.Posicion;

/**
 * Clase abstracta que modela el comportamiento de las piezas en general.
 */
public abstract class Pieza {

    private Color color;
    private Posicion posicion;

    /**
     * Constructor de la clase
     * 
     * @param color    Color de la pieza
     * @param posicion posicion de la pieza
     */
    public Pieza(Color color, Posicion posicion) {
        this.color = color;
        this.posicion = posicion;
    }

    /**
     * Obtiene las jugadas posibles para una pieza determinadas
     * 
     * @return lista de los movimientos permitidas
     */
    public abstract List<Posicion> obtenerJugadasLegales();

    /**
     * Obtiene el color de la pieza
     * 
     * @return color de la pieza
     */
    public Color obtenerColor() {
        return color;
    }

    /**
     * Obtiene la posición de la pieza
     * 
     * @return posición de la pieza
     */
    public Posicion obtenerPosicion() {
        return posicion;
    }

    /**
     * Asigna una nueva posición a la pieza
     * 
     * @param posicion nueva posición
     */
    public void asignarPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    /**
     * Compara dos piezas
     * 
     * @return true si las piezas son iguales
     */
    @Override
    public boolean equals(Object obj) {

        Pieza otra = (Pieza) obj;
        return color == otra.color && posicion.equals(otra.posicion);
    }
}
