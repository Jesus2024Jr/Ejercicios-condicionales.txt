import java.util.Scanner;

public class Jesus {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        System.out.print("Ingrese su sexo (Masculino/Femenino): ");
        String sexo = entrada.next();

        if (edad >= 18) {
            System.out.println(nombre + " " + apellido + " es mayor de edad.");
        } else {
            System.out.println(nombre + " " + apellido + " es menor de edad.");
        }

        if (sexo.equalsIgnoreCase("Masculino")) {
            System.out.println("Es un Hombre.");
        } else {
            System.out.println("Es una Mujer.");
        }
    }
}
