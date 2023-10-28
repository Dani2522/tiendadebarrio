package org.example;
import java.util.Scanner;

public class menu {
    Product product = new Product();

    private void handleUserChoice(int choice) {
        switch (choice) {
            case 1 : product.addNewProduct();
                    break;
            case 2 : removeProduct();
                    break;
            case 3 : updateProduct();
                    break;
            case 4 : product.getAllProducts();
                    break;
            case 5 : System.out.println("Saliendo...");
                    break;
            default : System.out.println("Opción invalida. Por favor intenta de nuevo.");

        }

    }

    private void displayMenu() {

        System.out.println(
                """
                        |o|                         /////////////\\\\\\
                        |o|                        (((((((((((((   \\\\\\
                        |o|                        ))) ~      ~   (((
                        |o|                        ((( ()     ()  )))
                        |o|                        )))     <        (((\s
                        |o|                        ((( '\\__/`   )))\s
                        |o|                        )))\\_____/(((\s
                        |o|                        (((   )  (    )))\s\s
                        |o|                              /\\__/\\""");

        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio    |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Eliminar producto                     |");
        System.out.println("3. Actualizar producto                   |");
        System.out.println("4. Ver todos los productos               |");
        System.out.println("5. Salir                                  |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 5)  ");
    }

    public void addProduct() {
        System.out.println("futura implementación de addProduct");
    }

    public void removeProduct() {
        System.out.println("futura implementación de removeProduct");
    }

    public void updateProduct() {
        System.out.println("futura implementación de updateProduct");
    }


    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            handleUserChoice(choice);
        } while (choice != 5);
    }


}
