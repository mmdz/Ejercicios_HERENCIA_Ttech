package ej04_herencia.entidades;

import ej04_herencia.interfaces.CalculosFormas;
import java.util.Scanner;

/*Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.(diametro = radio*2)
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2**/
public class Rectangulo extends FigurasGeometricas implements CalculosFormas {

    //constructores
    public Rectangulo() {
        super();
    }

    public Rectangulo(Double radio, Double base, Double altura) {
        super(radio, base, altura);
    }

    //metodos
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("CREANDO RECTÁNGULO");

        crearFigura();
        System.out.println("Ingrese base: ");
        setBase(leer.nextDouble());

        System.out.println("Ingrese altura: ");
        setAltura(leer.nextDouble());
    }

    @Override
    public Double calcularArea() {
        Double area = getBase() * getAltura();
        return area;
    }

    @Override
    public Double calcularPerimetro() {
        Double perimetro = (getBase() + getAltura()) * 2;
        return perimetro;
    }

}
