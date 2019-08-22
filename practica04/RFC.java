import java.util.Scanner;


public class RFC {

    public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	String nombreCompleto = new String();
	String fechaNacimiento = new String();
	String apellidoP, nombre, apellidoM;

	System.out.print("Introduce tu nombre completo: ");
	nombreCompleto = entrada.nextLine();
	
	System.out.print("Introduce tu fecha de nacimiento en formato dd/mm/aaaa: ");
	fechaNacimiento = entrada.nextLine();

	nombreCompleto = nombreCompleto.trim();

	int indicePrimero = nombreCompleto.indexOf(' ');
	apellidoP = nombreCompleto.substring(indicePrimero + 1, indicePrimero + 3);

	int indiceUltimo = nombreCompleto.lastIndexOf(' ');
	apellidoM = nombreCompleto.substring(indiceUltimo + 1, indiceUltimo + 2);

	nombre = nombreCompleto.substring(0, 1);

	String anno = fechaNacimiento.substring(8, 10);
	String mes = fechaNacimiento.substring(3, 5);
	String dia = fechaNacimiento.substring(0, 2);

	String rfc = apellidoP.concat(apellidoM).concat(nombre).concat(anno).concat(mes).concat(dia);
	rfc = rfc.toUpperCase();

	System.out.println("\nEl RFC de " + nombreCompleto + " es: " + rfc);

    }

}
