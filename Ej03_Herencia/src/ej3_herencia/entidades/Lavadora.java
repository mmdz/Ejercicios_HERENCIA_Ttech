package ej3_herencia.entidades;

import ej3_herencia.entidades.Electrodomesticos;
import java.util.Scanner;

public class Lavadora extends Electrodomesticos {
    //atributos propios

    private Integer carga; //kg que carga el lavarropa

    //constructores
    public Lavadora() {
        super();//por buenas practicas lo pongo
    }

    public Lavadora(Integer carga, Double precio, String color, String consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso); //atributos de padre
        this.carga = carga;
    }

    ////////////metodos////////////   
    public void crearLavadora() {
        /*este método llama a crearElectrodomestico() de la clase padre, lo utilizamos
        para llenar los atributos heredados del padre y después llenamos el atributo propio de la lavadora.*/
        Scanner leer = new Scanner(System.in);

        System.out.println("CREANDO LAVADORA");
        crearElectrodomestico(); //lleno los datos

        System.out.println("Ingrese capacidad de carga de la lavadora(0 Kg): ");
        setCarga(leer.nextInt());
    }

    
   // @Override
    public Double precioFinal() {

        /*Método precioFinal(): este método será heredado y se le sumará la siguiente
        funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
        si la carga es menor o igual, no se incrementará el precio. Este método debe
        llamar al método padre y añadir el código necesario. Recuerda que las
        condiciones que hemos visto en la clase Electrodoméstico también deben
        afectar al precio.*/
        
        Double aux = 0.0;
      
        if (getCarga() > 30) {
            aux = super.precioFinal();//llamo metodo padre
            setPrecio((aux+500.0));
           // System.out.println("Se aumenta $500 por carga");
        } else {
            setPrecio(super.precioFinal()); //llamo al metodo del padre
        }
        return getPrecio();
    }

    
    
    
    @Override
    public String toString() {
        return "LAVADORA: \n" + "Precio final $"
                + precio + "\ncarga: " + carga + "\nColor: " 
                + color  + "\nConsumo energético: "+consumoEnergetico.toUpperCase();
    }
//getter y setter

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

}
