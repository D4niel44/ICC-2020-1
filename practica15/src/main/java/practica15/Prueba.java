package practica15;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.List;
import java.util.LinkedList;
import practica15.Practica;
/**
 * Clase de prueba de la clase Practica
 */
public class Prueba {
    public static void main(String[] args) {
        
        //Prueba generarCadena Infinita
        System.out.println("Prueba de generar cadena infinita: \n");
        Practica.generarCadenaInfinita("abc")
                .limit(10)
                .forEach(s -> System.out.println(s));
        
        //Prueba ordenar lista
        System.out.println("\nPrueba de ordenar lista:");
        LinkedList<String> lista = new LinkedList<>();
        Stream.of("abc", "xyz", "h", "", "qwerty", "mn")
              .forEach(s -> lista.add(s));
        Practica.ordenar(lista)
                .forEachOrdered(s -> System.out.println(s));
        
        //Prueba de filtrar los elementos de un stream
        System.out.println("\nPrueba de filtrar los elementos de un stream");
        Practica.filtrar(Stream.of(1, 2, 3, 15, 4, -5, 5, 6, 7, 8, 99, 9, 999))
                .forEach(s -> System.out.println(s));
        
        //Prueba de generar numeros aleatorios
        System.out.println("\nPrueba de generar numeros aleatorios");
        List<String> listaNumeros = Practica.aleatorio(2);
        int c = 1;
        for (String numero : listaNumeros) {
            System.out.print(numero + ((c++ % 5 == 0) ? "\n" : " "));
        }
        System.out.println();
    }
}