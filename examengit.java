import java.util.Scanner;

public class examengit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción (1-4): ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:


                case 2:


                case 3:


                case 4:
                    System.out.print("¿Estás seguro de que deseas salir? (s/n): ");
                    String confirmacion = scanner.nextLine();
                    if (confirmacion.equalsIgnoreCase("s")) {
                        salir = true;
                        System.out.println("¡Adiós!");
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 4.");
            }
        }

        scanner.close();
    }
}

                    