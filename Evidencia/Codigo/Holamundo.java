import java.util.Scanner;
public class Holamundo {
public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("¡Hola Mundo!");
        System.out.println("Bienvenido a mi primer programa en Java.");
        System.out.print("Escribe tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Hola, " + nombre + ". ¡Mucho gusto!");
        entrada.close();

    }
}
