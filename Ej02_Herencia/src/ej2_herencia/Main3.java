package ej2_herencia;

import ej2_herencia.entidades.Electrodomesticos;
import ej2_herencia.entidades.Lavadora;
import ej2_herencia.entidades.Televisor;

/*Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.*/
public class Main3 {

    public static void main(String[] args) {

        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        System.out.println("Precio final de Lavadora: $" + lavadora.precioFinal());
        System.out.println("---------");

        Televisor tele = new Televisor();
        tele.crearTelevisor();
        System.out.println("Precio final TV $" + tele.precioFinal());
        System.out.println("---------");

        //muestro datos de c/electrodomestico
        System.out.println(lavadora);
        System.out.println("-----------");
        System.out.println(tele);

    }
}
