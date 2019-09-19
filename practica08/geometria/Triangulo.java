
package geometria;

/**
 * Clase triangulo
 * @author Daniel Linares Gil
 * @version 1
 */
public class Triangulo {

	private Punto a;
	private Punto b;
	private Punto c;
	
	/**
	 * triangulo con sus tres lados diferentes
	 */	
	public static final int ESCALENO = 2;

	/**
	 * triangulo con dos lados iguales
	 */
	public static final int ISOSCELES = 1;

	/**
	 * triangulo con sus tres lados iguales
	 */
	public static final int EQUILATERO = 0;

	/**
	 * Constructor por defecto. crea un triangulo de vertices (0, 0), (1, 0) y (0.5, sen(pi) / 3)
	 */
	public Triangulo() {

		a = new Punto(0, 0);
		b = new Punto(1, 0);
		c = new Punto(0.5, Math.sin(Math.PI / 3.0));
	}

	/**
	 * Crea un triangulo a partir de tres puntos.
	 * @param a Primer vertice 
	 * @param b Segundo vertice
	 * @param c tercer vertice
	 */
	public Triangulo(Punto a, Punto b, Punto c) {

		this.a = new Punto(a.getX(), a.getY());
		this.b = new Punto(b.getX(), b.getY());
		this.c = new Punto(c.getX(), c.getY());
	}

	/**
	 * Determina si los tres vertices del triangulo estan alineados
	 * @return True si los tres vertices estan alineados.
	 */
	public boolean tieneVerticesAlineados() {

		return a.estanAlineados(b, c);
	}

	/**
	 * Clasifica el triangulo segun la longitud de sus lados.
	 * @return EQUILATERO si  sus tres lados son iguales.
	 * @return ISOSCELES si dos de sus lados son iguales.
	 * @return ESCALENO si sus tres lados son diferentes.
	 */ 
	public int tipo() {

		if((a.distancia(b) == a.distancia(c)) && (a.distancia(b) == b.distancia(c))) {

			return EQUILATERO;
		} 
		else if((a.distancia(b) == a.distancia(c)) || (a.distancia(b) == b.distancia(c)) || (a.distancia(c) == b.distancia(c))) {

			return ISOSCELES;
		}
		else {

			return ESCALENO;
		}
	}

	public Punto getA() {

		return a;
	}

	public Punto getB() {

		return b;
	}

	public Punto getC() {

		return c;
	}
}