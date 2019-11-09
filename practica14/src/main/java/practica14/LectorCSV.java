package practica14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
/**
 * Clase que lee un archivo de tipo csv
 */
public class LectorCSV {
    /**
     * Metodo que lee un archivo de tipo csv
     * @param ruta Ruta donde se encuentra el archivo .csv a leer
     * @return lista con un arreglo de tipo String para cada línea del archivo
     * @throws IOException
     */
    public static List<String[]> leer(String ruta) throws IOException {
        LinkedList <String[]> retorno = new LinkedList<>();
        List <String> lineas = Files.readAllLines(Paths.get(ruta));
        for(String entrada : lineas) {
            if (!entrada.isBlank()) {
                retorno.add(entrada.split(","));
            }
        }
        for(String[] linea : retorno) {
            for (int i = 0; i < linea.length; i++) {
                linea[i] = linea[i].trim();
            }
        }
        retorno.removeFirst();
        return retorno;
    }
}
