import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*
         * Arrays
         * es tipo de dato estructurado, este permite almacenar varios valores
         * a la vez, se utiliza para agrupar un conjunto de datos parecidos
         * Edades: 17, 21, 18, 18, 11, 20, ....
         * 
         * matematicamente son un vector
         * Array de una dimension
         * 
         */
        // int suma;
        // int[] numeros; // declara un array de una dimensión
        // numeros = new int[4]; // reserva de espacio en memoria

        // int[] x = new int[5];

        // numeros[0] = 26;
        // numeros[1] = 6;
        // numeros[2] = 2;
        // numeros[3] = 13;
        // suma = numeros[0] + numeros[1] + numeros[2] + numeros[3];
        // System.out.println(suma);

        // recorrido de un array de una dimension
        // for (int i = 0; i < numeros.length; i++) {
        //     // System.out.println(numeros[i]);
        // }
        // Ejercicio 1: Define un array de 12 numeros enteros con nombre num y
        // asigna valores aleatorios, muestre el contenido de todos los
        // elementos del array

        // int[] num = new int[12];
        // for (int i = 0; i < num.length; i++) {
        //     num[i] = (int) (Math.random() * (100 - 1 + 1)) + 1;
        //     System.out.println(num[i]);
        // }

        // char[] caracteres = new char[6];
        // caracteres[0] = 'B';
        // caracteres[1] = '%';
        // caracteres[2] = '+';
        // caracteres[3] = '*';
        // caracteres[4] = 'A';
        // caracteres[5] = '2';
        // for (int i = 0; i < caracteres.length; i++) {
        //     System.out.println(caracteres[i]);
        // }
        /*
         * Ejercicio 2: Define un array de 10 caracteres con nombre simbolo y 
         * asigna valores aleatoriamente de la A - Z, muestra el contenido 
         * de los elementos del array.
         */

        //  char[] simbolo = new char[10];

        //  for (int i = 0; i < simbolo.length; i++) {

        //     simbolo[i] =  (char)(Math.random()*(90-65+1)+65);
        //     System.out.println(simbolo[i]);
            
        //  }
         /*
          * Escribe un programa que pida 10 numeros ingresados por teclado y
          los almacene en un array, rota los elementos de ese array, es decir, 
          el elemento de la posicion 0 debe pasar a la posicion 1, el de la 1 a la 2, 
          etc. El numero que se encuentra en la ultima posicion debe pasar a la 
          posicion 0, muestre el contenido del array
          */

          


 
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int lastNum = numbers[9];

        for (int i = 8; i >= 0; i--) {
            numbers[i + 1] = numbers[i];
        }

        numbers[0] = lastNum;

        System.out.println("Contenido del array después de rotar:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}




