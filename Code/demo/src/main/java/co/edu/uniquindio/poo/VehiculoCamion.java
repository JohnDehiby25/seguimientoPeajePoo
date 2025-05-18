package co.edu.uniquindio.poo;

public class VehiculoCamion extends Vehiculo implements IDescripcion{
    private double capacidadCarga;
    private int numeroEjes;

    public VehiculoCamion(String placa, int numeroPeajesPagados, double capacidadCarga, int numeroEjes){

        super(placa, numeroPeajesPagados);
        this.capacidadCarga=capacidadCarga;
        this.numeroEjes=numeroEjes;
    }
    public void informacionGeneralVehiculo(){
        System.out.println("El camión cuenta con las siguientes características: ");
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Numero peajes pagados: " + this.getNumeroPeajesPagados());
        System.out.println("Capacidad de carga: " + this.getCapacidadCarga());
        System.out.println("Numero de ejes: " + this.getNumeroEjes());
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
    

}
