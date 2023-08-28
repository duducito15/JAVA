public class LecturaDatos {
    //Lectura de Datos
    /*
     * System, libreria contiene las funciones requridas que trabajan
     * con la lectura de datos
     */
    public static void main(String[] args) {
        String nombre;
        //System.console().readLine()
        System.out.println("Ingresa tu nombre");
        nombre = System.console().readLine();
        System.out.println("Hola "+nombre+", mucho gusto!!!!");
    }
}
