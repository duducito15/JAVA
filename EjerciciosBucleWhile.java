public class EjerciciosBucleWhile {
    // Ejericio 2.
    public static void main(String[] args) {
        // Ejericio 1.
        int intentos = 4;
        int numeroIntroducido;
        boolean acertado = false;

        while ( (intentos > 0) && (!acertado) ) {
            System.out.println("Introducir la clave de la caja fuerte: ");
            numeroIntroducido = Integer.parseInt(System.console().readLine());

            if (numeroIntroducido == 1234) {
                System.out.println("Ha abierto la caja fuerte");
                acertado = true;
               // break;
            } else {
                System.out.println("Clave incorrecta");
            }
            intentos--;
        }
    }
}
