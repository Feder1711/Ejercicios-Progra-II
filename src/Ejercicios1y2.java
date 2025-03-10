public class Ejercicios1y2 {

    // Ejercicio 1: Explicación
    // Un método recursivo es aquel que se llama a sí mismo para resolver un problema en subproblemas más pequeños.

    // Ejercicio 2.1: Suma de los primeros n números naturales
    public static int suma(int n) {
        if (n == 0) return 0;
        return n + suma(n - 1);
    }

    // Ejercicio 2.2: Factorial de un número
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // Ejercicio 2.3: Potencia n-ésima de un número
    public static int potencia(int base, int exponente) {
        if (exponente == 0) return 1;
        return base * potencia(base, exponente - 1);
    }

    // Ejercicio 2.4: Suma de los elementos de una lista
    public static int sumaLista(int[] lista, int index) {
        if (index == lista.length) return 0;
        return lista[index] + sumaLista(lista, index + 1);
    }

    // Ejercicio 2.5: Media aritmética de una lista de números
    public static double mediaLista(int[] lista, int index) {
        if (index == lista.length) return 0;
        return (double) lista[index] / lista.length + mediaLista(lista, index + 1);
    }

    // Ejercicio 2.6: Desviación típica de una lista de números
    public static double desviacionTipica(int[] lista, int index, double media) {
        if (index == lista.length) return 0;
        double varianza = Math.pow(lista[index] - media, 2) / lista.length;
        return varianza + desviacionTipica(lista, index + 1, media);
    }

    // Ejercicio 2.7: Suma de los primeros números pares hasta n (n ≥ 2)
    public static int sumaPares(int n) {
        if (n < 2) return 0;
        if (n % 2 != 0) n--; // Asegurar que sea par
        if (n == 2) return 2;
        return n + sumaPares(n - 2);
    }

    // Ejercicio 2.8: Suma de los elementos pares de una lista
    public static int sumaParesLista(int[] lista, int index) {
        if (index == lista.length) return 0;
        return (lista[index] % 2 == 0 ? lista[index] : 0) + sumaParesLista(lista, index + 1);
    }

    // Ejercicio 2.9: Lista de los primeros números pares hasta n
    public static void listaPar(int n, int actual) {
        if (actual > n) return;
        System.out.print(actual + " ");
        listaPar(n, actual + 2);
    }

    // Ejercicio 2.10: Producto escalar de dos listas
    public static int productoEscalar(int[] lista1, int[] lista2, int index) {
        if (index == lista1.length) return 0;
        return lista1[index] * lista2[index] + productoEscalar(lista1, lista2, index + 1);
    }

    // Ejercicio 2.11: Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Ejercicio 2.12: Cociente entre el décimo y tercer término de Fibonacci
    public static double cocienteFibonacci() {
        return (double) fibonacci(10) / fibonacci(3);
    }

    // Ejercicio 2.13: Torres de Hanói
    public static void torresDeHanoi(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        torresDeHanoi(n - 1, origen, destino, auxiliar);
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        torresDeHanoi(n - 1, auxiliar, origen, destino);
    }

    public static void main(String[] args) {
        int[] datos = {1, 2, 3, 4};
        int[] datos2 = {2, 3, 4, 5};

        System.out.println("Suma de 10: " + suma(10));
        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("2^5: " + potencia(2, 5));
        System.out.println("Suma de lista {1,2,3,4}: " + sumaLista(datos, 0));
        System.out.println("Media lista {1,2,3,4}: " + mediaLista(datos, 0));

        double media = mediaLista(datos, 0);
        double desviacion = Math.sqrt(desviacionTipica(datos, 0, media));
        System.out.println("Desviación típica: " + desviacion);

        System.out.println("Suma de pares hasta 10: " + sumaPares(10));
        System.out.println("Suma de pares en {1,2,3,4}: " + sumaParesLista(datos, 0));

        System.out.print("Lista de pares hasta 10: ");
        listaPar(10, 2);
        System.out.println();

        System.out.println("Producto escalar de {1,2,3,4} y {2,3,4,5}: " + productoEscalar(datos, datos2, 0));

        System.out.println("Fibonacci de 10: " + fibonacci(10));
        System.out.println("Cociente entre Fibonacci(10) y Fibonacci(3): " + cocienteFibonacci());

        System.out.println("Torres de Hanói con 3 discos:");
        torresDeHanoi(3, 'A', 'B', 'C');
    }
}
