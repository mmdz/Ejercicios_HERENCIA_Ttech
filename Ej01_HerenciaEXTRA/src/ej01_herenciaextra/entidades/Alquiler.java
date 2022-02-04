package ej01_herenciaextra.entidades;

import java.util.Date;

/*En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en
CV y en los yates se suma la potencia en CV y el número de camarotes.*/

public class Alquiler {
    //atributos propios
    private String nombreCliente;
    private Long dniCliente;
    private Date fechaDeAlquiler;
    private Date fechaDeDevolucion;
    private Integer posicionDeAmarre; //supongo q son numeros de puerto
    private String nombreBarco;
    
    //constructores
    public Alquiler(){
        
    }

    public Alquiler(String nombreCliente, Long dniCliente, Date fechaDeAlquiler, Date fechaDeDevolucion, Integer posicionDeAmarre, String nombreBarco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionDeAmarre = posicionDeAmarre;
        this.nombreBarco = nombreBarco;
    }
    
    //toString

    @Override
    public String toString() {
        return "Alquiler{" + "nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDeDevolucion=" + fechaDeDevolucion + ", posicionDeAmarre=" + posicionDeAmarre + ", nombreBarco=" + nombreBarco + '}';
    }
    
    
    //////////getter y setter////////////////

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Date getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(Date fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public Date getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(Date fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public Integer getPosicionDeAmarre() {
        return posicionDeAmarre;
    }

    public void setPosicionDeAmarre(Integer posicionDeAmarre) {
        this.posicionDeAmarre = posicionDeAmarre;
    }

    public String getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }
    
}
