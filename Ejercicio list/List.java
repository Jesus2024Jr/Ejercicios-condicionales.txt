import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> personas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Crear persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Listar personas");
            System.out.println("4. Buscar persona");
            System.out.println("5. Salir");

            System.out.print("Ingrese la opción deseada: ");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la persona: ");
                    String nombre = entrada.nextLine();
                    personas.add(nombre);
                    System.out.println("Persona agregada con éxito. Lista actual: " + personas);
                    break;
                case 2:
                    if (!personas.isEmpty()) {
                        System.out.println("Lista de personas:");
                        for (int i = 0; i < personas.size(); i++) {
                            System.out.println((i + 1) + ". " + personas.get(i));
                        }
                        System.out.print("Ingrese el índice de la persona a eliminar: ");
                        int indice = entrada.nextInt() - 1;
                        if (0 <= indice && indice < personas.size()) {
                            personas.remove(indice);
                            System.out.println("Persona eliminada con éxito. Lista actual: " + personas);
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    } else {
                        System.out.println("No hay personas en la lista.");
                    }
                    break;
                case 3:
                    if (!personas.isEmpty()) {
                        System.out.println("Lista de personas: " + personas);
                    } else {
                        System.out.println("No hay personas en la lista.");
                    }
                    break;
                case 4:
                    if (!personas.isEmpty()) {
                        System.out.print("Ingrese el nombre de la persona a buscar: ");
                        String buscar = entrada.nextLine();
                        if (personas.contains(buscar)) {
                            System.out.println("La persona fue encontrada.");
                        } else {
                            System.out.println("La persona no fue encontrada.");
                        }
                    } else {
                        System.out.println("No hay personas en la lista.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
        }
    }
}