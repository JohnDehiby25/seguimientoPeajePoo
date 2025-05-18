package co.edu.uniquindio.poo;

public class VehiculoMoto  extends Vehiculo{
    
    private double cilindraje;

    public VehiculoMoto(String placa, int numeroPeajesPagados, double cilindraje){

        super(placa, numeroPeajesPagados);

        this.cilindraje=cilindraje;
    }
    
    public void informacionGeneralVehiculo(){
        System.out.println("La moto cuenta con las siguientes características: ");
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Numero peajes pagados: " + this.getNumeroPeajesPagados());
        System.out.println("Cilindraje: " + this.getCilindraje());
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    
}
