import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        System.out.println("Indica el numero de perfiles que quieres hacer");
        int nuevoPerfil = datos.nextInt();

        String nombre ="";
        String apellido ="";
        int telefono=0;

        for (int i=0; i<perfiles;i++){
            Scanner rellenar = new Scanner(System.in);
            System.out.println("Escribe un nombre");
            try {
                nombre=rellenar.nextLine();
            } catch (InputMismatchException exceptionNombre){
                System.out.println("No has introducido un nombre valido");
                System.out.println(exceptionNombre.getMessage());
            }
            System.out.println("Escribe un apellido");
            try {
                apellido=rellenar.nextLine();
            } catch (InputMismatchException exceptionApellido){
                System.out.println("No has introducido un apellido valido");
                System.out.println(exceptionApellido.getMessage());
            }
            System.out.println("Escribe un numero de telefono");
            try {
                telefono=rellenar.nextInt();
            } catch (InputMismatchException exceptionMovil){
                System.out.println("No has introducido un numero de telefono valido");
                System.out.println(exceptionMovil.getMessage());
            }
            finally {
                System.out.println("Programa finalizado");
            }

            Perfil nuevo = new Perfil(nombre,apellido,telefono);
            System.out.println(datos.toString());
        }
        
        Agenda nuevaAgenda = new Agenda();
        nuevoPerfil.agregarPerfil;
    }
}