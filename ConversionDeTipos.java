public class ConversionDeTipos {
public static void main(String[] args) {
    int numero1, numero2;
    double division;
    
    numero1 = 9;
    numero2 = 2;

    division = (double) numero1 / (double) numero2;
    System.out.println("El resultado de dividir es: "+ division);

    /*
     * Ejercicio:
     * 1. Escribe un programa en Java en el que se declaren variables enteras y asiganle los valores 
     * 144 y 999 respectivamente. A continuacin, muestra por pantalla el valor de cada variable
     * la suma, la resta, la división y la multiplicación.
     * 
     * 2. Realiza un conversor de euros a soles. La cantidad de euros que se va a covertir
     * deberá ser almacenada en una variable.
     * 
     * float soles;
     * int euros;
     * 
     * euros = 10;
     * soles = euros * 4.05;
     * System.out.println("El resultado en soles es : "+ soles);
     * 
     * 
     * 
     * 
     */
    float soles;
    int euros;
    
    euros = 1;
    soles = (float) euros * 4.05f;
    System.out.println("El resultado en soles es : "+ soles);
}    
}
