package ej2_herencia.entidades;

import java.util.Scanner;

/*Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.*/
public class Electrodomesticos { //padre
    //atributos

    protected Double precio;
    protected String color;
    protected String consumoEnergetico;
    protected Double peso;

    //constructor
    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precio, String color, String consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso; //peso del electrodomestico
    }

    ///////////metodos//////////////////
    public String comprobarConsumoEnergetico(String letra) {
        /* comprueba que la letra es correcta, sino es correcta usara la letra F por defecto.
        Este método se debe invocar al crear el objeto y no será visible.*/

        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B")
                || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D")
                || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("F")) {

            return letra;

        } else {
            letra = "F";
            return letra;
        }
        
    
//        
//        char letr = 'a';
//        Character.toUpperCase(letr); 
//        
    }

    public String comprobarColor(String color) {
        /*Comprueba que el color es correcto, y si no lo es, usa el color blanco por defecto. 
        Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
        está en mayúsculas o en minúsculas. Este método se invocará al crear el
        objeto y no será visible.*/
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro")
                || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul")
                || color.equalsIgnoreCase("gris")) {

            return color;

        } else {
            color = "blanco";
            return color;
        }
    }

    public void crearElectrodomestico() {
        /*Metodo : le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el
    consumo. Al precio se le da un valor base de $1000.*/
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

            // Electrodomesticos electro = new Electrodomesticos(precio, color, consumoEnergetico, peso);
            //en este caso no isntancio el objeto porque estoy en la misma clase  
      //  System.out.println("Ingrese precio $0.0");
      //  setPrecio(leer.nextDouble());
//        
//        if (getPrecio() < 1000.0) {
//            System.out.println("Precio base $1000.0");
//            setPrecio(1000.0); //valor base $1.000    
//        } 
        
//
//        while(getPrecio() < 1000.0){
//            System.out.println("El precio debe ser mayor a $1000, ingrese otro valor");
//            setPrecio(leer.nextDouble());
//        }
        setPrecio(1000.0);

        System.out.println("Ingrese color(blanco, negro, rojo, azul o gris):");
      //  String color = leer.next();
//        this.setColor(leer.next());
//        this.comprobarColor(color);
        setColor(comprobarColor(leer.next()));//compruebo y guardo color

        System.out.println("Ingrese consumo energético (A,B,C,D,E,F):");
//        String consEnerg = leer.next();
//        setConsumoEnergetico(comprobarConsumoEnergetico(consEnerg.toUpperCase())); //compeuebo y guardo
        setConsumoEnergetico(comprobarConsumoEnergetico(leer.next()));

        System.out.println("Ingrese peso (0,0 Kg):");
        setPeso(leer.nextDouble());

    }

    public Double precioFinal() {
        /*según el consumo energético y su tamaño, aumentará el valor del precio.*/
        Double aumentoPorConsumo = 0.0;
        Double aumentoPorTamanio = 0.0;
        
        //System.out.println("Consume: " + consumoEnergetico);

        switch (consumoEnergetico) { //precio por consumo
            case "A":
                aumentoPorConsumo = 1000.0;
                break;
            case "B":
                aumentoPorConsumo = 800.0;
                break;
            case "C":
                aumentoPorConsumo = 600.0;
                break;
            case "D":
                aumentoPorConsumo = 500.0;
                break;
            case "E":
                aumentoPorConsumo = 300.0;
                break;
            case "F":
                aumentoPorConsumo = 100.0;
               // this.precio += 100.0;
                break;
        }

        if (peso > 1.0 && peso < 19.0) { //precios por tamanios
            aumentoPorTamanio = 100.0;
            //this.precio += 100.0;
        }
        if (peso > 20.0 && peso < 49.0) {
            aumentoPorTamanio = 500.0;
        }
        if (peso > 50.0 && peso < 79.0) {
            aumentoPorTamanio = 800.0;
        }
        if (peso > 80.0) {
            aumentoPorTamanio = 1000.0;
        }
//        System.out.println("El aumento por consumo energético es $" + aumentoPorConsumo);
//        System.out.println("Aumento por peso $" + aumentoPorTamanio);
        //aumento los precios segun corresponda

       setPrecio(precio + aumentoPorConsumo + aumentoPorTamanio);
        return precio;
    }

    //toString
    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    /////////////////fin metodos////////////////////////////
    // getter y setter
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

}
