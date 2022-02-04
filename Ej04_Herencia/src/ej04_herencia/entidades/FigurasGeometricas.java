package ej04_herencia.entidades;

import java.util.Scanner;

/*Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro. (diametro = radio*2)
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2*/
public class FigurasGeometricas {

    //atributos
    private Double radio;
    private Double base;
    private Double altura;

    //constructores
    public FigurasGeometricas() {
    }

    public FigurasGeometricas(Double radio, Double base, Double altura) {
        this.radio = radio;
        this.base = base;
        this.altura = altura;
    }

    //metodos
    public void crearFigura() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese radio: ");
        setRadio(leer.nextDouble());
    }

    public void mostrarFigura(String forma,String nombre,Double valor) {
        System.out.println("El " + forma + " del "+ nombre +" es: " + valor);
    }

    //toString
    @Override
    public String toString() {
        return "FigurasGeometricas{" + "radio=" + radio + ", base=" + base + ", altura=" + altura + '}';
    }

    //getter y setter
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

}
