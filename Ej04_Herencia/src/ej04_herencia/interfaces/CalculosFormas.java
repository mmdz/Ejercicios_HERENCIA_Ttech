package ej04_herencia.interfaces;

/*vamos a crear una Interfaz, llamada calculosFormas que tendrá, 
los dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2**/

public interface CalculosFormas {

    public final Double PI = Math.PI; //debe ser public para poder ser implementada

    public Double calcularArea();//solo escribo la FIRMA de los métodos

    public Double calcularPerimetro();
}
