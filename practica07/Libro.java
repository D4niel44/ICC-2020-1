

/**
 * Descripción de la clase libro
 * @author Linares Gil, Daniel
 * @version 11.0
 */
public class Libro {

 	private String titulo;
 	private String autor;
 	private int anioPublicacion;

 	/**
	 * Constructor por defecto de la clase libro.
	 */
 	public Libro () {
 
  		this.titulo = "";
 		this.autor = "";
 		this.anioPublicacion = 1900;
 	}

 	/**
	 * Constructor de la clase libro.
	 * @param titulo Titulo del libro.
	 * @param autor Autor del libro.
	 * @param anioPublicacion Año de publicación del libro
 	 */
 	public Libro (String titulo, String autor, int anioPublicacion) {
 
  		this.titulo = titulo;
 		this.autor = autor;
 		this.anioPublicacion = anioPublicacion;
 	}

 	/**
 	 * Asigna un nuevo titulo
 	 * @param titulo nuevo titulo
 	 */
 	public void asignarTitulo(String titulo) {

 		this.titulo = titulo;
 	}

 	/**
 	 * Asigna un nuevo autor
 	 * @param autor nuevo autor
 	 */
 	public void asignarAutor(String autor) {

 		this.autor = autor;
 	}

 	/**
 	 * Asigna un nuevo año de publicacion
 	 * @param anioPublicacion nuevo año de publicacion 
 	 */
 	public void asignarAnioPublicacion(int anioPublicacion) {

 		this.anioPublicacion = anioPublicacion;
 	}

 	/**
 	 * Devuelve el titulo
 	 * @return el titulo
 	 */
 	public String obtenerTitulo() {

 		return titulo;
 	}

 	/**
 	 * Devuelve el autor
 	 * @return el autor
 	 */
 	public String obtenerAutor() {

 		return autor;
 	}

 	/**
 	 * Devuelve el año de publicación
 	 * @return el año de publicación
 	 */
 	public int obtenerAnioPublicacion() {

 		return anioPublicacion;
 	}


 }