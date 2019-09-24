/**
 * Clase para practicar el uso de arreglos y la estructura for.
 */
public class Arreglos {

    /**
     * Regresa el índice de un elemento en el arreglo dado, o -1 si no aparece.
     * @param arr el arreglo en el cual se buscará el parámetro k
     * @param k el entero a buscar
     * @return el índice de k en arr, o -1 si no aparece
     */
    public static int buscar(int[] arr, int k) {
        int  retorno = -1;

        for (int i = 0; i < arr.length && retorno == -1; i++) {

        	if(arr[i] == k) {

        		retorno = i;
        	}
        }
        return retorno;
    }

    /**
     * Regresa el mayor entero de un arreglo. Puedes suponer que arr contiene al menos un elemento.
     * @param arr el arreglo
     * @return el elemento máximo de arr
     */
    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

        	if (max < arr[i]) {
        		max = arr[i];
        	}
        }
        return max;
    }

    /**
     * Determina si existen dos elementos consecutivos en el arreglo dado que sumen a k.
     * @param arr el arreglo en el que se buscará
     * @param k el número a buscar
     * @return true si existen dos elementos consecutivos que sumen a k
     */
    public static boolean consecutivos(int[] arr, int k) {
        boolean a = false;

        for (int i = 0; (i + 1) < arr.length && !a; i++) {

        	if (k == arr[i] + arr[i+1]) {
        		a = true;
        	}
        }
        return a;
    }

    /**
     */
    public static int suma(int[] arr) {
    	int suma = arr[0];

    	for (int i = 1; i < arr.length; i++) {

    		suma += arr[i];
    	}
    	return suma;
    }

    /**
     * Pruebas unitarias para verificar que tus implementaciones son correctas.
     */
    public static void main(String[] args) {
        pruebasDe2a4();
        misPruebas();
        
    }

    private static void pruebasDe2a4() {
        var random = new java.util.Random();
        int COTA = 20, N = 15 + random.nextInt(10);
        var mal = false;
        var arrI = new Integer[N];
        int aPos = 0, bPos = 0;
        while (aPos == bPos) {
            aPos = random.nextInt(arrI.length);
            bPos = random.nextInt(arrI.length);
        }
        arrI[0] = random.nextInt(COTA);
        for (int i = 1; i < arrI.length; i++) {
            arrI[i] = arrI[i - 1] + random.nextInt(COTA) + 1;
        }
        
        java.util.Collections.shuffle(java.util.Arrays.asList(arrI));
        int[] arr = java.util.Arrays.stream(arrI).mapToInt(Integer::intValue).toArray();
        int a = arr[aPos], b = arr[bPos];

        // Buscar
        if (buscar(arr, a) != aPos) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("buscar(arr, %d) debió regresar %d pero regresó %d.\n", a, aPos, buscar(arr, a));
            mal = true;
        }
        if (buscar(arr, b) != bPos) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("buscar(arr, %d) debió regresar %d pero regresó %d.\n", b, bPos, buscar(arr, b));
            mal = true;
        }
        if (buscar(arr, Integer.MIN_VALUE) != -1) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("buscar(arr, %d) debió regresar %d pero regresó %d.\n", 
                Integer.MIN_VALUE, -1, buscar(arr, Integer.MIN_VALUE));
            mal = true;
        }

        // Max
        int max = java.util.Arrays.stream(arr).max().getAsInt();
        if (max(arr) != max) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("max(arr) debió regresar %d pero regresó %d.\n", max, max(arr));
            mal = true;
        }

        // Consecutivos
        if (consecutivos(arr, -10)) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("consecutivos(arr, -10) debió regresar false pero regresó true.\n");   
            mal = true;
        }
        int c = aPos < arr.length - 1 ? aPos : bPos;
        if (!consecutivos(arr, arr[c] + arr[c + 1])) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("consecutivos(arr, %d) debió regresar true pero regresó false.\n",
                arr[c] + arr[c + 1]);
            mal = true;
        }

        if (!mal) {
            System.out.println("Los incisos 2, 3, y 4 están bien.");
        }
    }
    
    private static void imprimir(String format, Object... objs) {
        System.out.println(String.format(format, objs));
    }

    public static void misPruebas() {

    	boolean a;
    	
    	int[] arr1 = new int[]{1,2,3,4,5};
    	int[] arr2 = new int[]{5,4,8,2,1};
    	int[] arr3 = new int[100];

    	for (int i = 0; i < 100; i++) {
    		arr3[i] = i +1;
    	}

    	a = buscar(arr1, 3) == 2;
    	auxiliar(a, 1);

    	a = buscar(arr1, 8) == -1;
    	auxiliar(a, 2);

    	a = max(arr1) == 5;
    	auxiliar(a, 3);

    	a = max(arr2) == 8;
    	auxiliar(a, 4);

    	a = consecutivos(arr1, 9);
    	auxiliar(a, 5);

    	a = consecutivos(arr1, 10);
    	auxiliar(!a, 6);

    	a = suma(arr1) == 15;
    	auxiliar(a, 7);

    	a = suma(arr3) == 5050;
    	auxiliar(a, 8);
    }

    public static void auxiliar(boolean a, int numPrueba) {

    	System.out.println("La prueba " + numPrueba + " termino: " + a);
    }

}