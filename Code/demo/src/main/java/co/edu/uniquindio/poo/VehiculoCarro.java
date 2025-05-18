package co.edu.uniquindio.poo;

public class VehiculoCarro extends Vehiculo {

    private TipoCarro tipoCarro;

    public VehiculoCarro(String placa, int numeroPeajesPagados, TipoCarro tipoCarro){

        super(placa, numeroPeajesPagados);
        this.tipoCarro=tipoCarro;
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
    
    
}
