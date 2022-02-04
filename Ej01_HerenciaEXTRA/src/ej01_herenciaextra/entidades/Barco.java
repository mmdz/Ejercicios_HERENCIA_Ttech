package ej01_herenciaextra.entidades;

import java.util.Scanner;

/*Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación.*/
public class Barco {
    //atributos
    protected String matricula;
    protected Integer eslora; //metros
    protected Integer anioFabricacion;
    
    //constructores
    public Barco(){
        
    }
    public Barco(String matricula, Integer eslora, Integer anioFabricacion){
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }
    
    //crearBarco
    public void crearBarco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese matricula: ");
        setMatricula(leer.next());
        
        System.out.println("Ingrese eslora en metros");
        setEslora(leer.nextInt());
        
        System.out.println("Ingrese año de fabricación:");
        setAnioFabricacion(leer.nextInt());        
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }
    
    
    /////getter y setter/////

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
}
