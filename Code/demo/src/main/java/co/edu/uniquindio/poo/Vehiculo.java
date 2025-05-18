package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    protected String placa;
    protected int numeroPeajesPagados;

    public Vehiculo(String placa, int numeroPeajesPagados){
        this.placa=placa;
        this.numeroPeajesPagados=numeroPeajesPagados;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroPeajesPagados() {
        return numeroPeajesPagados;
    }

    public void setNumeroPeajesPagados(int numeroPeajesPagados) {
        this.numeroPeajesPagados = numeroPeajesPagados;
    }
    
}
