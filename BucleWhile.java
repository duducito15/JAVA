public class BucleWhile {
    public static void main(String[] args) {
        // Bucle While: se utiliza para repetir un conjunto de instrucciones que 
        // cumpla una determinada condición
        /*
        * while(candicion){
        *  instrucciones a repetir
        * }
        */

        int i = 1;

        while (i < 11) {
            System.out.println(i);
            i++;
        }
        // Ej.2.Programa que cuenta y suma los numeros que se van introduciendo
        // por teclado, el programa termina cuando se introduce un numero
        // negativo
        int numeroIntroducido = 0;
        int cuentaNumero = 0;
        int suma = 0;

        while (numeroIntroducido >= 0) {
            numeroIntroducido = Integer.parseInt(System.console().readLine());
            cuentaNumero++;
            suma = suma + numeroIntroducido;            
        }

        System.out.println("Has introducido "+ (cuentaNumero-1) + " numeros positivos");
        System.out.println("La suma total es "+ (suma - numeroIntroducido));





    }
}
