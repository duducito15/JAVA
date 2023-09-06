/**
 * SentenciaSwitch
 */
public class SentenciaSwitch {
    // Se usa para comparar el valor de una variable con una serie de valores
    /*
     * switch(varaible){
     * case valor1:
     * sentencias
     * break;
     * case valor2:
     * sentencias
     * break;
     * .
     * ...
     * ...
     * default:
     * sentencias
     * }
     */
    public static void main(String[] args) {
        int dia;
        System.out.println("Por favor, ingresa un numero de día");
        dia = Integer.parseInt(System.console().readLine());
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No existe ese día");
                break;
        }

    }
}