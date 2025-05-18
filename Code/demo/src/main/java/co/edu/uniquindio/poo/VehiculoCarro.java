package co.edu.uniquindio.poo;

public class VehiculoCarro extends Vehiculo  implements IDescripcion{

    private TipoCarro tipoCarro;

    public VehiculoCarro(String placa, int numeroPeajesPagados, TipoCarro tipoCarro){

        super(placa, numeroPeajesPagados);
        this.tipoCarro=tipoCarro;
    }

    public void informacionGeneralVehiculo(){
        System.out.println("El carro cuenta con las siguientes características: ");
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Numero peajes pagados: " + this.getNumeroPeajesPagados());
        System.out.println("Tipo de carro:" + this.getTipoCarro());
    }
    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
    
    
}
