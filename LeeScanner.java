import java.util.Scanner;

public class LeeScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un nombre: ");
        String nombre = s.nextLine();

        System.out.println("Ingrese tu edad: ");
        int edad = Integer.parseInt(s.nextLine());

        System.out.println("Hola " + nombre + " tu edad es: " + edad);
        s.close();
    }
}