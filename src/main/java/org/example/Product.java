package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Product {
    Scanner sc = new Scanner(System.in);
    private List<Integer> id = new ArrayList<>();
    private List<String> name = new ArrayList<>();
    private List<String> description = new ArrayList<>();
    private List<String> category = new ArrayList<>();
    private List<String> label = new ArrayList<>();
    private List<Integer> quantity = new ArrayList<>();
    private List<Double> price = new ArrayList<>();
    private List<String> photoUrl = new ArrayList<>();

    @Override
    public String toString() {
        return "\nid: " + id + "\nname: " + name + "\ndescription: " + description + "\ncategory: " + category + "\nlabel: " + label + "\nprice: " + price + "\nPhoto: " + photoUrl;
    }

    public void addNewProduct() {

        System.out.println(" Ingresar codigo");
        int _id = sc.nextInt();
        sc.nextLine();
        System.out.println(" Ingresar nombre");
        String _name = sc.nextLine();
        System.out.println(" Ingresar descripción");
        String _description = sc.nextLine();
        System.out.println(" Ingresar categoria");
        String _category = sc.nextLine();
        System.out.println(" Ingresar etiqueta");
        String _label = sc.nextLine();
        System.out.println(" Agregrar precio");
        Double _price = sc.nextDouble();
        sc.nextLine();
        System.out.println(" Agregar cantidad");
        int _quantity = sc.nextInt();


        id.add(_id);
        name.add(_name);
        description.add(_description);
        category.add(_category);
        label.add(_label);
        price.add(_price);
        quantity.add(_quantity);


        for (int i = 0; i < id.size(); i++) {
            System.out.println(id.get(i) + " | " + name.get(i) + " | " + price.get(i) + " | " + quantity.get(i));
        }

    }

    public void getAllProducts() {
        System.out.println("\n **Estos son los productos de tu inventario:**");

        for (int i = 0; i < id.size(); i++) {
            System.out.println(id.get(i) + " | " + name.get(i) + " | " + price.get(i) + " | " + quantity.get(i)  + " | " + description.get(i) + " | " + category.get(i) + " | " + label.get(i));
        }

    }

    public void removeProduct() {
        System.out.println("Ingrese el id del producto que desea eliminar");
        int _id = sc.nextInt();
        int index = id.indexOf(_id);

        id.remove(index);
        name.remove(index);
        description.remove(index);
        category.remove(index);
        label.remove(index);
        price.remove(index);
        quantity.remove(index);
    }

    public void updateProduct() {

        System.out.println("Ingrese el id del producto que desea Actualizar");
        int _id = sc.nextInt();
        sc.nextLine();
        int index = id.indexOf(_id);

        System.out.println(id.get(index) + " | " + name.get(index) + " | " + description.get(index) + " | " + price.get(index) + " | " + quantity.get(index));
        boolean response = willUpdateParameter("nombre");
        if (response){
            System.out.println( "Ingrese el nuevo nombre");
            String _name = sc.nextLine();
            name.set(index, _name);
        }
        response = willUpdateParameter("descrpción");
        if (response){
            System.out.println( "Ingrese la nueva descripción");
            String _description = sc.nextLine();
            description.set(index, _description);
        }
        response = willUpdateParameter("precio");
        if (response){
            System.out.println( "Ingrese  el nuevo precio");
            double _price = sc.nextDouble();
            sc.nextLine();
            price.set(index, _price);
        }
        response = willUpdateParameter("cantidad");
        if (response){
            System.out.println( "Ingrese la nueva cantidad");
            int _quantity = sc.nextInt();
            sc.nextLine();
            quantity.set(index, _quantity);
        }


    }

    private Boolean willUpdateParameter(String parameter) {
        System.out.println(" ¿Desea actualizar " + parameter + "? (si/no)");
        String answer = sc.nextLine();

        answer = answer.toLowerCase();

        boolean response = false;

        switch (answer){
            case "si": response = true;
            break;
            case  "no": response = false;
            break;
            default:
                System.out.println(" Opcion invalida, digite solo si o no");
        }
        return response;
    }

}


