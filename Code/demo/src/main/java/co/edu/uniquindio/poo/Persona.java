package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.time.*;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String id;
    private LocalDate fechaNacimiento;
    private ArrayList<Vehiculo> listVehiculosAsignados;

    public Persona(String nombre, String apellido, String id, LocalDate fechaNacimiento){

        this.nombre=nombre;
        this.apellido=apellido;
        this.id=id;
        this.fechaNacimiento=fechaNacimiento;
        this.listVehiculosAsignados=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Vehiculo> getListVehiculosAsignados() {
        return listVehiculosAsignados;
    }

    public void setListVehiculosAsignados(ArrayList<Vehiculo> listVehiculosAsignados) {
        this.listVehiculosAsignados = listVehiculosAsignados;
    }

    
}
