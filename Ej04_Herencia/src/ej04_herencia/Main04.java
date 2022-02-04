package ej04_herencia;

import ej04_herencia.entidades.Circulo;
import ej04_herencia.entidades.Rectangulo;

/*Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2*/
public class Main04 {

    public static void main(String[] args) {
        //  Rectangulo rec = new Rectangulo(2.1, 5.0, 7.0);

        Rectangulo rec = new Rectangulo();
        rec.crearRectangulo();
        rec.mostrarFigura("perímetro", "rectángulo" , rec.calcularPerimetro());
        rec.mostrarFigura("área", "rectángulo", rec.calcularArea());

        System.out.println("-----");

        //  Circulo cir = new Circulo(3.0, perRectangulo, perRectangulo);
        Circulo cir = new Circulo();
        cir.crearCirculo();
        rec.mostrarFigura("perímetro", "círculo" , cir.calcularPerimetro());
        rec.mostrarFigura("área", "círculo", cir.calcularArea());
    }

}
