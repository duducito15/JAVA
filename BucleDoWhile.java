public class BucleDoWhile {
    public static void main(String[] args) {
        // El bucle do..While es similar al bucle while, la diferencia es que la
        // ecpresiona a evaluar esta al final.
        /*
         * do{
         * 
         * sentecias a repetir
         * 
         * } while(condicion)
         */

        /*
         * int i = 1;
         * 
         * do {
         * System.out.println(i);
         * i++;
         * } while (i < 11);
         */
        /*
         * Ej. 3
         * programa que va ir leyendo numeros por teclado mientras el numero sea un
         * numero par
         * el programa no va parar, el program temrina cuando ingreso un numero impar.
         * 
         * int numero;
         * 
         * do {
         * System.out.println("Ingrese un número: ");
         * numero = Integer.parseInt(System.console().readLine());
         * if (numero % 2 == 0) {
         * System.out.println("Que bonito es el "+numero);
         * } else {
         * System.out.println("No me gustan los impares, chaufas!!!");
         * }
         * } while (numero % 2 == 0);
         */
        int numero;
        String rpta;
        do {
            System.out.println("Ingrese un número: ");
            numero = Integer.parseInt(System.console().readLine());
            System.out.println("Que bonito es el "+numero);
            System.out.println("¿Quieres continuar? (si/no).");
            rpta = System.console().readLine();
        } while (rpta.equals("si"));

        // ''

    }
}
