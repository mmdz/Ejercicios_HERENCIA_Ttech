package ej01_herenciaextra.entidades;

import java.util.Scanner;

/*• Número de mástiles para veleros.*/
public class Veleros extends Barco {
    //atributos propios

    private Integer cantidadDeMastiles;

    //constructores
    public Veleros() {
        super();
    }

    public Veleros(Integer cantidadDeMastiles, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.cantidadDeMastiles = cantidadDeMastiles;
    }

    //crearVelero
    public void crearVelero() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("CREANDO VELERO");
        super.crearBarco();
        System.out.println("Ingrese cantidad de mástiles: ");
        setCantidadDeMastiles(leer.nextInt());
        System.out.println("-----");

    }

    //toString
    @Override
    public String toString() {
        return "Veleros{" + "cantidadDeMastiles=" + cantidadDeMastiles + '}';
    }

    ////////getter y setter/////////////
    public Integer getCantidadDeMastiles() {
        return cantidadDeMastiles;
    }

    public void setCantidadDeMastiles(Integer cantidadDeMastiles) {
        this.cantidadDeMastiles = cantidadDeMastiles;
    }

}
