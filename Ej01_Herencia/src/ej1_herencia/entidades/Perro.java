package ej1_herencia.entidades;

/*Perro hereda de Animal*/
public class Perro extends Animal{
 //como es una clase hija no le vuelvo a escribir los atributos
    //solo creo el constructor
    public Perro() {
        super();
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
       
}
