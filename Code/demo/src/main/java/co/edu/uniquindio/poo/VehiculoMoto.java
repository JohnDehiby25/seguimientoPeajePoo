package co.edu.uniquindio.poo;

public class VehiculoMoto  extends Vehiculo{
    
    private double cilindraje;

    public VehiculoMoto(String placa, int numeroPeajesPagados, double cilindraje){

        super(placa, numeroPeajesPagados);

        this.cilindraje=cilindraje;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    
}
