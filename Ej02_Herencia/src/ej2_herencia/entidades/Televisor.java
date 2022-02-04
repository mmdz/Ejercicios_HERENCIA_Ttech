package ej2_herencia.entidades;

import java.util.Scanner;

/*Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en resolucion) y sintonizador TDT (booleano), además de los
atributos heredados.*/
public class Televisor extends Electrodomesticos {

    //atributos propios
    private Double resolucion; //en pulgadas
    private Boolean sintonizadorTDT;

    //constructores
    public Televisor() {
        super();
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT, Double precio, String color, String consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

  

/////////////metodos//////////////
    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in);
        /*Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.*/
        System.out.println("CREANDO TELEVISOR");
        crearElectrodomestico();

        System.out.println("Ingrese pulgadas (0,0): ");
        setResolucion(leer.nextDouble());

        System.out.println("Tiene sintonizador TDT incorporado? S/N");
        String tiene = leer.next();
        if (tiene.equalsIgnoreCase("S")) { //sino tiene queda en false
            setSintonizadorTDT(true);
        } else {
            setSintonizadorTDT(false);
        }
    }

    public Double precioFinal() {

        /* este método será heredado y se le sumará la siguiente funcionalidad. Si el televisor tiene
       una resolución mayor de 40 resolucion, se incrementará el precio un 30% y si tiene un 
      sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones que hemos visto en la clase
    Electrodomestico también deben afectar al precio.*/
        Double aumentoPorResolucion = 0.0;
        Double aumentoPorTDT = 0.0;
        Double auxPrecio = super.precioFinal();
     //   System.out.println("Precio final antes del aumento: " + auxPrecio);

        if (getResolucion() > 40.0) {
           // System.out.println("Precio final antes del aumento: " + super.precioFinal());
            aumentoPorResolucion = (auxPrecio * 0.30); //calculo el aumento del 30%            
           // System.out.println("Aumento del 30% de $"+auxPrecio +",por tener más de 40', $" + aumentoPorResolucion);

        } else {
            setPrecio(auxPrecio);
        }

        if (getSintonizadorTDT()) {
            aumentoPorTDT = 500.0;
            //System.out.println("Se aumenta $500 por tener TDT");
        } else {
            setPrecio(auxPrecio);
        }

        setPrecio(auxPrecio + aumentoPorResolucion + aumentoPorTDT);//sumo y guardo los aumentos si hubo

        //System.out.println("Aumento por Tdt $" + aumentoPorTDT);

        return getPrecio();

    }

    @Override
    public String toString() {
        return "TELEVISOR: \n" + "Pulgadas: " + resolucion + "'"
                + "\nSintonizadorTDT: " + sintonizadorTDT + "\nPrecio $" + precio
                + "\nColor: " + color + "\nConsumo energético: " + consumoEnergetico.toUpperCase();
    }

//getter y setter
    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

}
