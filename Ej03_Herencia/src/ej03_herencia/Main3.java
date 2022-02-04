package ej03_herencia;

import ej3_herencia.entidades.Electrodomesticos;
import ej3_herencia.entidades.Lavadora;
import ej3_herencia.entidades.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.*/
public class Main3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        List<Electrodomesticos> listaElectrodomesticos = new ArrayList();
        String tipo = "";

        int cont = 0;
        do {
            do {
                System.out.println("Qué tipo de electrodoméstico desea crear, lavadora o televisor?");
                tipo = leer.next();
            } while ((!tipo.equalsIgnoreCase("lavadora")) && (!tipo.equalsIgnoreCase("televisor")));

            if (tipo.equalsIgnoreCase("lavadora")) {

                Lavadora lavadora = new Lavadora();
                lavadora.crearLavadora();
                // Double pre = lavadora.precioFinal();
                // System.out.println(pre);
                listaElectrodomesticos.add(lavadora);

            } else if (tipo.equalsIgnoreCase("televisor")) {

                Televisor televisor = new Televisor();
                televisor.crearTelevisor();
                //  televisor.precioFinal();
                listaElectrodomesticos.add(televisor);
            }
            System.out.println("--------");

            cont++;// = contA + contB;
        } while ((cont != 2));// || (tipo.equalsIgnoreCase("televisor"))));

//////////////////////////////////
        Double precioTotal = 0.0;
        Double sumaLavadora = 0.0;
        Double sumaTele = 0.0;

        for (Electrodomesticos listaElec : listaElectrodomesticos) {
            String tipoDato = listaElec.getClass().getSimpleName();

            System.out.println("Precio Final: $" + listaElec.precioFinal() + " de " + tipoDato);

            if (tipoDato.equalsIgnoreCase("lavadora")) {
                //traigo el tipo de dato
                sumaLavadora += listaElec.getPrecio(); //sumo solo  lavadora

            } else if (listaElec.getClass().getSimpleName().equalsIgnoreCase("televisor")) {
                sumaTele += listaElec.getPrecio(); //sumo solo tv
            }

            precioTotal += listaElec.getPrecio(); //sumo todos los precios

            // System.out.println(listaElec); //muestro todo el objeto
            System.out.println("-----");
        }
        System.out.println("Suma lavadora $" + sumaLavadora);
        System.out.println("Suma Televisor $" + sumaTele);
        System.out.println("Suma total de precios $" + precioTotal);

    }

}
