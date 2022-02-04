package ej01_herenciaextra.entidades;

import java.util.Scanner;

/*• Potencia en CV (caballo de vapor)y número de camarotes para yates de lujo.*/
public class Yates extends Barco {
//atributos propios

    private Double potenciaCV;
    private Integer cantidadCamarotes;

//cosntructores    
    public Yates() {
        super();
    }

    public Yates(Double potenciaCV, Integer cantidadCamarotes, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.cantidadCamarotes = cantidadCamarotes;
    }

    //crear yate
    public void crearYate() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("CREANDO YATE");
        super.crearBarco();
        System.out.println("Ingrese potencia en CV:");
        setPotenciaCV(leer.nextDouble());
        System.out.println("Ingrese cantidad de camarotes:");
        setCantidadCamarotes(leer.nextInt());
        System.out.println("-----");

    }

    //toString
    @Override
    public String toString() {
        return "Yates{" + "potenciaCV=" + potenciaCV + ", cantidadCamarotes=" + cantidadCamarotes + '}';
    }
    ////getter y setter/////////

    public Double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Integer getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(Integer cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

}
