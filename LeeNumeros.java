public class LeeNumeros {
    public static void main(String[] args) {
        String linea;

        System.out.println("Ingrese un numero: ");
        int primerNumero = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese otro numero: ");
        linea = System.console().readLine();
        int segundoNumero;
        segundoNumero = Integer.parseInt(linea);

        int total = (primerNumero * 2) + segundoNumero;

        System.out.println("El primer numero ingresado es: "+primerNumero);
        System.out.println("El segundo numero ingresado es: "+segundoNumero);
        System.out.println("El total es: "+total);


    }
}
