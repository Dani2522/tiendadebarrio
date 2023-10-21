package org.example;

public class Main {
    public static void main(String[] args) {

        menu m = new menu();
        m.runMenu();

        producto prod1 = new producto(1, "Leche Entera Alpina", "Bolsa x 1.100 ml", "Lacteo/Huevos y refrigerados", "Leches", 3100.00, "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg" );
        producto prod2 = new producto(2, "Leche Alpina Deslactosada ", "Bolsa x 1.100 ml", "Lacteo/Huevos y refrigerados", "Leches", 3400.00, "https://cdn.derematazo.com/wp-content/uploads/2019/08/Leche-Alpina-Deslactosada-Bolsa-x-1100ml-23445.jpg" );

        System.out.println("Instancias de producto:\n");
        System.out.print(prod1);
        System.out.println("\n");
        System.out.print(prod2);

    }

}





