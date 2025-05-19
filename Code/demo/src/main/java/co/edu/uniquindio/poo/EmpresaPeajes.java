package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class EmpresaPeajes {
    
    private String nombre;
    private ArrayList<Persona> listPersonas;
    private ArrayList<EstacionPeaje> listEstacionesPeajes;

    public EmpresaPeajes(String nombre){
        this.nombre=nombre;
        this.listPersonas=new ArrayList<>();
        this.listEstacionesPeajes=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getListPersonas() {
        return listPersonas;
    }

    public void setListPersonas(ArrayList<Persona> listPersonas) {
        this.listPersonas = listPersonas;
    }

    public ArrayList<EstacionPeaje> getListEstacionesPeajes() {
        return listEstacionesPeajes;
    }

    public void setListEstacionesPeajes(ArrayList<EstacionPeaje> listEstacionesPeajes) {
        this.listEstacionesPeajes = listEstacionesPeajes;
    }
    

}
