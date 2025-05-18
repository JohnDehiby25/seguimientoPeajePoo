package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Recaudador extends Persona{

    private double sueldoMensual;

    public Recaudador(String nombre, String apellido, String id, LocalDate fechaNacimiento, double sueldoMensual){

        super(nombre, apellido, id, fechaNacimiento);
        this.sueldoMensual=sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
    
}
