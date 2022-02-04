package ej01_herenciaextra.entidades;

import java.util.Scanner;

/*• Potencia en CV para barcos a motor.*/
public class BarcosAMotor extends Barco {
    
    //atributos propios
    private Integer potenciaCV;
    
    //constructores   
    public BarcosAMotor() {
        super();
    }

    public BarcosAMotor(Integer potenciaCV, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    //crearBarco
    public void crearBarcoAMotor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("CREANDO BARCO A MOTOR");
        crearBarco();
        System.out.println("Ingrese potencia en CV");
        setPotenciaCV(leer.nextInt());
        System.out.println("-----");
    }
    
    //toString
    @Override
    public String toString() {
        return "barcosAMotor{" + "potenciaCV=" + potenciaCV + '}';
    }

    ////////getter y setter/////////
    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

}
