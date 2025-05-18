package co.edu.uniquindio.poo;

public class VehiculoCamion extends Vehiculo{
    private double capacidadCarga;
    private int numeroEjes;

    public VehiculoCamion(String placa, int numeroPeajesPagados, double capacidadCarga, int numeroEjes){

        super(placa, numeroPeajesPagados);
        this.capacidadCarga=capacidadCarga;
        this.numeroEjes=numeroEjes;
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
