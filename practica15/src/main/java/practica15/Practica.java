package practica15;

import java.util.stream.Stream;
import java.util.function.Supplier;
import java.util.List;
import java.util.LinkedList;
import java.util.Comparator;
import java.util.Random;

/**
 * Clse de la practica15
 */
public class Practica {
    /**
     * Método que genera un stream infinito a partir de una cadena donde cada
     * elemento es la cadena concatenada n veces. Ejemplo para la cadena "abc"
     * genera Stream.of("", "abc", "abcabc", ...)
     * 
     * @param s La cadena de entrada
     * @return Stream de cadenas donde cada elemento es la cadena concatenada n
     *         veces empezando en ""
     */
    public static Stream<String> generarCadenaInfinita(String s) {
        return Stream.generate(new Supplier<String>() {
            int i = 0;

            public String get() {
                return s.repeat(i++);
            }
        });
    }

    /**
     * Ordena una lista de String por el tamaño de cada String en orden descendente
     * 
     * @param ls lista de String
     * @return Stream de la lista en orden descendente
     */
    public static Stream<String> ordenar(List<String> ls) {
        return ls.stream().sorted(
                (String s1, String s2) -> (s1.length() > s2.length()) ? -1 : (s1.length() == s2.length()) ? 0 : 1);
    }

    /**
     * Filtra los elementos de un stream y elimina los que no se encuentren en el
     * rango [0, 9]
     * 
     * @param st Stream de enteros
     * @return Stream con la representacion en español de los elementos en el rango
     *         [0, 9]
     */
    public static Stream<String> filtrar(Stream<Integer> st) {
        return st.filter(i -> (i >= 0 && i <= 9)).map(Practica::intToString);
    }

    /**
     * Genera números aleatorios en el rango [1, 1000) que no sean multiplo de k
     * 
     * @param k entero para filtrar sus multiplos
     * @return lista con los primeros 50 elementos del Stream generado
     */
    public static List<String> aleatorio(int k) {
        Random n = new Random();
        LinkedList<String> retorno = new LinkedList<>();
        n.ints(1, 1000).filter(i -> (i % k != 0)).limit(50).forEach(i -> retorno.add(Integer.toString(i)));
        return retorno;
    }

    /**
     * Devuelve un String con la representacion en español de un digito de l 0 al 9
     * 
     * @param a entero en el rango [0, 9]
     * @return Cadena con la representacion en español del entero
     */
    public static String intToString(int a) {
        String entero = "";
        switch (a) {
        case 0:
            entero = "cero";
            break;
        case 1:
            entero = "uno";
            break;
        case 2:
            entero = "dos";
            break;
        case 3:
            entero = "tres";
            break;
        case 4:
            entero = "cuatro";
            break;
        case 5:
            entero = "cinco";
            break;  
        case 6:
            entero = "seis";
            break;
        case 7:
            entero = "siete";
            break;
        case 8:
            entero = "ocho";
            break;
        case 9:
            entero = "nueve";
            break;
        default:
            break;
        }
        return entero;
    }

}