public class EjerciciosBucles {
    public static void main(String[] args) {
        /*
         * 1. Programa en Java que muestre la tabla de multiplicar de un numero
         * ingresado por teclado
         */
        /*
         * int numero;
         * System.out.println("Ingrese un número: ");
         * numero = Integer.parseInt(System.console().readLine());
         * 
         * for (int i = 1; i < 13; i++) {
         * System.out.println(numero + " X " + i + " = " + (numero*i));
         * }
         */
        /*
         * 2. Programa en Java que muestre la media aritmetica de 10 numeros ingresados
         * por teclado
         */
        /*
         * int numero;
         * int suma = 0;
         * float promedio = 0;
         * for (int i = 1; i < 11; i++) {
         * System.out.printf("Ingrese un número %d: ", i);
         * numero = Integer.parseInt(System.console().readLine());
         * suma = suma + numero;
         * }
         * promedio = suma / 10;
         * System.out.println("El promedio de los numeros ingresados es: " + promedio);
         */
        /*
         * 3. Escribe un programa en Java que muestre 3 columnas, el cuadrado y el cubo
         * de los 5 primeros
         * numeros enteros a partir de uno que se introduce por teclado.
         * n = 5
         * 5 25 125
         * 6 36 ***
         * 7 ** ***
         * 8 ** ***
         * 9 ** ***
         */
        int numero;
        System.out.println("Ingrese un número: ");
        numero = Integer.parseInt(System.console().readLine());
        for (int i = numero; i < (numero + 5); i++) {
            System.out.println(i);
        }

    }
}
