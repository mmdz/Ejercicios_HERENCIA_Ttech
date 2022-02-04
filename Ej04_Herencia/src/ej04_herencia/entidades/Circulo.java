package ej04_herencia.entidades;

import ej04_herencia.interfaces.CalculosFormas;
import java.util.Scanner;

/*Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.(diametro = radio*2)
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2**/
public class Circulo extends FigurasGeometricas implements CalculosFormas {

    //constructores
    public Circulo() {
        super();
    }

    public Circulo(Double radio, Double base, Double altura) {
        super(radio, base, altura);
    }

//metodos
    public void crearCirculo() {
        
        System.out.println("CREANDO CÍRCULO");
        crearFigura();
        setBase(0.0);
        setAltura(0.0);
    }

    //metodos sobreescritos
    @Override
    public Double calcularArea() {
        Double area = PI * (Math.pow(getRadio(), 2));
        return area;
    }

    @Override
    public Double calcularPerimetro() {
        Double perimetro = PI * (getRadio() * 2);
        return perimetro;
    }

}
