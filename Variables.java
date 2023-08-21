public class Variables {
    //Variables
    /* Es un contenedor que sirve para almacenar un valor
     * tiene un nombre (identificador), tipo de valores numeros enteros
     * numeros decimales, caracteres, cadena de caracteres (palabra o frase)
     * las variables pueden cambiar durante al ejecucion del programa.
     * 
     * Java las variables son fuertemente tipadas.
     * Sintaxis: 
     * tipoDato nombreVariable = Valor;
     * 
     * x = vip3 * Werrrty - zxc;
     * 
     * precioTotal = cantidad * precio - descuento;
     * 
     * La escritura del identificador de las variables se conoce como 
     * lowerCamelCase: edadMinima
     *  
     */
     public static void main(String[] args) {
        
        /* Tipo de dato entero:
         * int
         * short
         * long
         * Tipo de datos decimales:
         * float
         * double
         * Tipo de dato Booleano:
         * boolean
         * Tipo de dato caracter:
         * char
         */
        int numero;
        numero = 5;
        System.out.println("El valor de mi variable es: " + numero);

        numero = 18;
        System.out.println("y ahora es: " + numero);

        float nota1;
        float nota2;
        float promedio;

        nota1 = 12.5f;
        nota2 = 16.00f;
        promedio = (nota1 + nota2)/2;

        System.out.println("Nota 1 vale: "+ nota1);
        System.out.println("Nota 2 vale: "+ nota2);
        System.out.println("Promedio vale: "+ promedio);

        String cadenaCaracteres = "Eduardo Chavez Vasquez";
        String otraCadena = "";
        System.out.println("Esto es una cadena de caracteres: "+ cadenaCaracteres);
     }
}
