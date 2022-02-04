package herenciaejercicio03;

import Herencia.Electrodomestico;
import Herencia.Lavadora;
import Herencia.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HerenciaEjercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        List<Electrodomestico> listaElectrodomesticos = new ArrayList();
        String tipo = "";

        int cont = 0;
        do {
            System.out.println("Qué tipo de electrodoméstico desea crear, lavadora o televisor?");
            tipo = leer.next();

            if (tipo.equalsIgnoreCase("lavadora")) {

                Lavadora lavadora = new Lavadora();
                lavadora.creaLavadora();
               // lavadora.precioFinal();
                System.out.println("---");

                listaElectrodomesticos.add(lavadora);

            } else if (tipo.equalsIgnoreCase("televisor")) {

                Televisor televisor = new Televisor();
                televisor.crearTelevisor();
              //  televisor.precioFinal();
                System.out.println("---");
                listaElectrodomesticos.add(televisor);
            }
            System.out.println("--------");
            cont++;
        } while (cont != 2);

        Integer precioTotal = 0;
        Integer sumaLavadora = 0;
        for (Electrodomestico listaElec : listaElectrodomesticos) {
            listaElec.precioFinal();
            //System.out.println("empieza cpn lavad"+listaElec.toString().startsWith("Lavadora"));
            if(listaElec.toString().startsWith("Lavadora")){
                sumaLavadora += listaElec.getPrecio();
                System.out.println("Suma lavadora "+sumaLavadora);
            }
            precioTotal += listaElec.getPrecio();
            System.out.println("tipo de obje: "+listaElec.getClass().getName());
           // System.out.println(listaElectrodomesticos.getClass().getComponentType());
            System.out.println(listaElec);
        }
        System.out.println("Suma total de precios $" + precioTotal);

    }

}

//Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
//Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
//televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada
//electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
//es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
//eso, también deberemos mostrar, la suma del precio de todos los
//Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
//y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.
