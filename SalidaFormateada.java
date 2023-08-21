public class SalidaFormateada {
    public static void main(String[] args) {
        System.out.printf("El numero %d no tiene decimales. \n", 28);
        System.out.printf("El numero %f tiene decimales. \n", 28.0);
        System.out.printf("El numero %.2f tiene 2 decimales. \n", 28.0);

        System.out.println("    ARTICULO    PRECIO  NRO CAJAS");
        System.out.println("---------------------------------");
        System.out.printf("%-10s    %8.2f   %6d\n", "Mazanas",4.5,10);
        System.out.printf("%-10s    %8.2f   %6d\n", "Peras",3.75,200);
        System.out.printf("%-10s    %8.2f   %6d\n", "Naranjas",10.0,6);
    }
}
