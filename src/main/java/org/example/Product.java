package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Product {
    Scanner sc = new Scanner (System.in);
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
        return "\nid: "+id+"\nname: "+name+"\ndescription: "+description+"\ncategory: "+category+"\nlabel: "+label+"\nprice: "+price+"\nPhoto: "+photoUrl;
    }

    public  void addNewProduct (){

        System.out.println( " Ingresar codigo ");
        int _id = sc.nextInt();
        System.out.println( " Ingresar nombre");
        String _name = sc.next();
        System.out.println( " Ingresar descripción");
        String _description = sc.nextLine();
        System.out.println( " Ingresar categoria");
        String _category = sc.nextLine();
        System.out.println( " Ingresar etiqueta");
        String _label = sc.nextLine();
        System.out.println( " Agregrar precio");
        Double _price = sc.nextDouble();
        System.out.println( " Agregar cantidad");
        int _quantity = sc.nextInt();

        id.add(_id);
        name.add(_name);
        description.add(_description);
        category.add(_category);
        label.add(_label);
        price.add(_price);
        quantity.add(_quantity);


        for (int i = 0; i< id.size(); i++) {
            System.out.println(id.get(i) + " | " + name.get(i) + " | " + price.get(i) + " | " + quantity.get(i));
        }

    }
    public void getAllProducts(){

        for (int i = 0; i< id.size(); i++) {
            System.out.println(id.get(i) + " | " + name.get(i) + " | " + price.get(i) + " | " + quantity.get(i)); // Tarea agregar los otros campos //
        }

    }
}


