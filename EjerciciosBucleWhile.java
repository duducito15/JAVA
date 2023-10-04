public class EjerciciosBucleWhile {
    // Ejericio 2.
    public static void main(String[] args) {
        // Ejericio 2
        int numeroIntroducido = 0;
        int cuentaNumero = 0;
        int maximoPar = 0;
        int sumaImpar = 0;
        int numerosImpares = 0;

        while (numeroIntroducido >= 0) {
            numeroIntroducido = Integer.parseInt(System.console().readLine());
            cuentaNumero++;
            if (numeroIntroducido >= 0) {
                if (numeroIntroducido % 2 == 0) {
                    if (numeroIntroducido > maximoPar) {
                        maximoPar = numeroIntroducido;
                    }
                } else {
                    sumaImpar = sumaImpar + numeroIntroducido;
                    numerosImpares++;
                }
            }
        }
        System.out.println("Ha introducido " + (cuentaNumero - 1) + " de elementos");
        System.out.println("La media de los impares es " + sumaImpar / numerosImpares);
        System.out.println("El mayor par es " + maximoPar);
    }
}
