package ej01_herenciaextra.servicios;

import ej01_herenciaextra.entidades.Alquiler;
import ej01_herenciaextra.entidades.Barco;
import ej01_herenciaextra.entidades.Veleros;
import java.util.Date;
import java.util.Scanner;

/*Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en
CV y en los yates se suma la potencia en CV y el número de camarotes.*/
public class ServicioAlquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler cargarDatosDeAlquiler() {
        Alquiler alqui = new Alquiler();

        System.out.println("CARGANDO DATOS DE ALQUILER");

        System.out.println("Ingrese nombre de cliente:");
        alqui.setNombreCliente(leer.next());

        System.out.println("Ingrese DNI de cliente:");
        alqui.setDniCliente(leer.nextLong());

//        System.out.println("Ingrese fecha de alquiler:");
//        //pedir dia mes anio 
//        System.out.println("día:");
//        int dia = leer.nextInt();
//        System.out.println("mes:");
//        int mes = leer.nextInt();
//        System.out.println("año:");
//        int anio = leer.nextInt();
//
//        Date fechaAlqui = new Date(dia + "/" + mes + "/" + (anio));
//        alqui.setFechaDeAlquiler(fechaAlqui);
//        
//        System.out.println("----");
//        
//        System.out.println("Ingrese fecha de devolución:");
//        //pedir dia mes anio 
//        System.out.println("día:");
//        dia = leer.nextInt();
//        System.out.println("mes:");
//        mes = leer.nextInt();
//        System.out.println("año:");
//        anio = leer.nextInt();
//        
//        Date fechaDevolucion = new Date(dia + "/" + mes + "/" + (anio));
//        alqui.setFechaDeDevolucion(fechaDevolucion);
        
        System.out.println("Ingrese posición de amarre:");
        alqui.setPosicionDeAmarre(leer.nextInt());

        System.out.println("Ingrese nombre del Barco");
        alqui.setNombreBarco(leer.next());
        
        return alqui;
    }

    public void calcularCostoDeAlquiler(Alquiler alqui, Integer eslora){
        Integer diasDeOcupacion=0 ;
        
        int mes, anio, dia;
//        anio = (alqui.getFechaDeDevolucion().getYear()+1900) - (alqui.getFechaDeAlquiler().getYear()+1900);
//        System.out.println("año: "+ anio);
//        
//        mes = (alqui.getFechaDeDevolucion().getMonth() - alqui.getFechaDeAlquiler().getMonth());
//        System.out.println("Meses "+mes);
//        
//        dia = (alqui.getFechaDeDevolucion().getDay() - alqui.getFechaDeAlquiler().getDay());
//        System.out.println("dias "+dia);
//        

    //ingreso dias para testear mientras
        System.out.println("Ingrese dias de alquiler:");
        diasDeOcupacion = leer.nextInt();

        double valorModulo = (eslora*10);
        System.out.println("Valor módulo $" + valorModulo);
        
        double costoAlquiler  = (double)(valorModulo * diasDeOcupacion);
        System.out.println("El costo de alquiler es $" + costoAlquiler);
        
    }
}
