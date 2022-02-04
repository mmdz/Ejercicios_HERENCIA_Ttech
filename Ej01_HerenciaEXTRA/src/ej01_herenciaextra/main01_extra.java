package ej01_herenciaextra;

import ej01_herenciaextra.entidades.Alquiler;
import ej01_herenciaextra.entidades.Barco;
import ej01_herenciaextra.entidades.BarcosAMotor;
import ej01_herenciaextra.entidades.Veleros;
import ej01_herenciaextra.entidades.Yates;
import ej01_herenciaextra.servicios.ServicioAlquiler;
import java.util.Scanner;

/*En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en
CV y en los yates se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las
clases y los métodos necesarios que permitan al usuario elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler.*/
public class main01_extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioAlquiler sa = new ServicioAlquiler();

        String salir = "";
        do {
            System.out.println("Ingrese qué tipo de barco desea ingresar?");
            System.out.println("1.Velero\n2.Yate\n3.Barco a motor\n4.Barco común");

            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Veleros velero = new Veleros();
                    velero.crearBarco();
                    Integer costo = 1;//(velero.getCantidadDeMastiles()+velero.getEslora());
                  
                    
                    
                    
                    System.out.println("costo" + costo);

                    Alquiler alquiVela = sa.cargarDatosDeAlquiler();
                    sa.calcularCostoDeAlquiler(alquiVela, costo);
                    break;
                case 2:
                    Yates yate = new Yates();
                    yate.crearYate();
                    System.out.println("eslora" + yate.getEslora());

                    Alquiler alquiYate = sa.cargarDatosDeAlquiler();
                    sa.calcularCostoDeAlquiler(alquiYate, yate.getEslora());
                    break;
                case 3:
                    BarcosAMotor barcoMotor = new BarcosAMotor();
                    barcoMotor.crearBarcoAMotor();
                   
                    System.out.println("eslora" + barcoMotor.getEslora());
                    Alquiler alquiMotor = sa.cargarDatosDeAlquiler();
                    sa.calcularCostoDeAlquiler(alquiMotor, barcoMotor.getEslora());
                    break;
                case 4:
                    Barco barco = new Barco();
                    barco.crearBarco();
                    
                    System.out.println("eslora" + barco.getEslora());
                    Alquiler alqui = sa.cargarDatosDeAlquiler();
                    sa.calcularCostoDeAlquiler(alqui, barco.getEslora());
                    break;
                default:
                    System.out.println("Opción inválida");
                    opcion = -1;
            }
            System.out.println("Desea ingresar otro alquiler? S/N");
            salir = leer.next();

        } while (salir.equalsIgnoreCase("S"));
    }

}
