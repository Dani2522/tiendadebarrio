package org.example;

public class producto {
    Integer id;
    String name;
    String description;
    String category;
    String label;
    double price;
    String photoUrl;

    producto(Integer _id, String _name, String _description, String _category, String _label, double _price, String _photoUrl){
        this.id = _id;
        this.name = _name;
        this.description = _description;
        this.category = _category;
        this.label = _label;
        this.price = _price;
        this.photoUrl = _photoUrl;
    }

    @Override
    public String toString() {
        return "\nid: "+id+"\nname: "+name+"\ndescription: "+description+"\ncategory: "+category+"\nlabel: "+label+"\nprice: "+price+"\nPhoto: "+photoUrl;
    }

}