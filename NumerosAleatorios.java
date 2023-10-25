public class NumerosAleatorios {
    public static void main(String[] args) {
        // System.out.println("Diez numeros aleatorios");

        /*
         * for (int i = 1; i < 11; i++) {
         * System.out.println(Math.random());
         * }
         */

        /*
         * for (int i = 1; i < 11; i++) {
         * System.out.println((int)(Math.random()*(18-11+1)) + 11);
         * }
         */
        System.out.println("Genera al azar piedra, papel o tijera");
        int mano = (int) (Math.random() * 3);
        switch (mano) {
            case 0:
                System.out.println("piedra " );
                break;
            case 1:
                System.out.println("papel " );
                break;
            case 2:
                System.out.println("tijera ");
                break;
            default:
                System.out.println(mano);
                break;
        }
/*
 * Ejercicio 1: Escribe un programa que muestre la tirada de tres dados. 
 * Se debe mostrar la suma total (los puntos que suman entre los tres dados)
 * 
 * Ejercicio 2: Muestra 50 numeros enteros aleatorios entre 100 y 199 
 * (ambos incluidos) separados por espacios. Muestre tambien el Maximo, 
 * el minimo y la media.
 * 
 * 
 */
    }
}
