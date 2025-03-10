public class Ejercicios3a8 {

    // Ejercicio 3: Lista de los primeros números pares hasta n
    public static void listaPares(int n, int actual) {
        if (actual > n) return;
        System.out.print(actual + " ");
        listaPares(n, actual + 2);
    }

    // Ejercicio 4: Producto escalar de dos listas
    public static int productoEscalar(int[] lista1, int[] lista2, int index) {
        if (index == lista1.length) return 0;
        return lista1[index] * lista2[index] + productoEscalar(lista1, lista2, index + 1);
    }

    // Ejercicio 5: Fibonacci recursivo
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Ejercicio 6: Cociente entre Fibonacci(10) y Fibonacci(3)
    public static double cocienteFibonacci() {
        return (double) fibonacci(10) / fibonacci(3);
    }

    // Ejercicio 7: Relación entre Fibonacci y la razón áurea
    public static double razonAurea(int n) {
        if (n < 2) return 1;
        return (double) fibonacci(n) / fibonacci(n - 1);
    }

    // Ejercicio 8: Torres de Hanói
    public static void torresDeHanoi(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        torresDeHanoi(n - 1, origen, destino, auxiliar);
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        torresDeHanoi(n - 1, auxiliar, origen, destino);
    }

    // Método main para probar
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Lista de números pares hasta " + n + ": ");
        listaPares(n, 2);
        System.out.println();

        int[] lista1 = {1, 2, 3};
        int[] lista2 = {4, 5, 6};
        System.out.println("Producto escalar: " + productoEscalar(lista1, lista2, 0));

        System.out.println("Fibonacci(10): " + fibonacci(10));

        System.out.println("Cociente Fibonacci(10)/Fibonacci(3): " + cocienteFibonacci());

        System.out.println("Razón áurea en Fibonacci(10): " + razonAurea(10));

        System.out.println("Torres de Hanói con 3 discos:");
        torresDeHanoi(3, 'A', 'B', 'C');
    }
}
