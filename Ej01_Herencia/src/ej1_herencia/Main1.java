package ej1_herencia;

import ej1_herencia.entidades.Animal;
import ej1_herencia.entidades.Caballo;
import ej1_herencia.entidades.Gato;
import ej1_herencia.entidades.Perro;

public class Main1 {

    public static void main(String[] args) {
        //declaro el obejto Perro
        Animal perro = new Perro("Stich", "Carnivoro",15, "Doberman");
        perro.alimentarse();
        
        //declaro otro perro
        Perro perro1 = new Perro("Teddy","Galletas",10,"Chihuahua");
        perro1.alimentarse();//como lo hereda de Animal puedo llamarlo
        
        //Declaro objeto gato
        Animal gato  = new Gato("Michi", "Croquetas", 15 , "Siames");
        gato.alimentarse();
        
        //declaro objeto caballo
        Animal caballo = new Caballo("Spark", "Pasto",25, "Obero");
        caballo.alimentarse();
    }
    

}
