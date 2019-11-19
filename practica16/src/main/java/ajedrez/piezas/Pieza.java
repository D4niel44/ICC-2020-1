package ajedrez.piezas;

import java.util.List;
import java.io.Serializable;

public abstract class Pieza implements Serializable {

    private Color color;
    private Posicion posicion;

    public Pieza(Color color, Posicion posicion) {
        this.color = color;
        this.posicion = posicion;
    }
    
    public abstract List<Posicion> obtenerJugadasLegales();

    public boolean esJugadaLegal(int fila, int columna) {
        return obtenerJugadasLegales().
                contains(new Posicion(fila, columna));
    }

    public Color obtenerColor() {
        return color;
    }

    public Posicion obtenerPosicion() {
        return posicion;
    }

    public void asignarPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pieza otra = (Pieza) obj;
        return color == otra.color && posicion.equals(otra.obtenerPosicion());
    }

}