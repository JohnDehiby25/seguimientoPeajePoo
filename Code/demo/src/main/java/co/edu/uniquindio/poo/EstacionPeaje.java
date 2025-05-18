package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class EstacionPeaje {
    private String nombre;
    private String departamento;
    private double totalPeajeRecolectado;
    private ArrayList<Persona> listPersonas;
    private ArrayList<Vehiculo> listVehiculos;

    public EstacionPeaje(String nombre, String departamento, double totalPeajeRecolectado){

        this.nombre=nombre;
        this.departamento=departamento;
        this.totalPeajeRecolectado=totalPeajeRecolectado;
        this.listPersonas=new ArrayList<>();
        this.listVehiculos= new ArrayList<>();
    }
    //metodo de tarifa de peaje del carro 
   public double tarifaPeajeVehiculoCarro(Vehiculo vehiculo){
        double valorBase=10.000;
            if(vehiculo instanceof VehiculoCarro){
               VehiculoCarro v = (VehiculoCarro) vehiculo;
               if(v.getTipoCarro() == TipoCarro.ELECTRICO){
                    valorBase= valorBase -(valorBase*0.20);
               }
               else if(v.getTipoCarro() == TipoCarro.SERVICIOPUBLICO){
                    valorBase=valorBase + (valorBase*0.15);
               }
            }
        return valorBase;

   }
   //metodo de tarifa de peaje del camion
   public double tarifaPeajeVehiculoCamion(Vehiculo vehiculo){
        double valortotal=0;
            if(vehiculo instanceof VehiculoCamion){
                VehiculoCamion v = (VehiculoCamion) vehiculo;
                valortotal=v.getNumeroEjes() * 7000;
                if(v.getCapacidadCarga() > 10 ){
                    valortotal = valortotal-(valortotal*0.10);
                }
            }
        return valortotal;
   }
   //Metodo de tarifa de peaje de moto
   public double tarifaPeajeVehiculoMoto(Vehiculo vehiculo){
        double valorTotal=5.000;
            if(vehiculo instanceof VehiculoMoto){
                VehiculoMoto v = (VehiculoMoto) vehiculo;
                if(v.getCilindraje() > 200){
                    valorTotal+= valorTotal+2000;
                }
            }
        return valorTotal;
   }

   //Metodo 1 de los pedidos en el enunciado 
   public void detalleVehiculoPeaje(){
        ArrayList<VehiculoCamion> listVehiculosCamion= new ArrayList<>();
        ArrayList<VehiculoCarro> listVehiculosCarro= new ArrayList<>();
        ArrayList<VehiculoMoto> listVehiculosMoto= new ArrayList<>();

        for(Vehiculo v: listVehiculos){
            if(v instanceof VehiculoCamion){
                VehiculoCamion vehiculo=(VehiculoCamion) v;
                listVehiculosCamion.add(vehiculo);
            }
            else if(v instanceof VehiculoCarro){
                VehiculoCarro vehiculo2 = (VehiculoCarro) v;
                listVehiculosCarro.add(vehiculo2);
            }
            else if(v instanceof VehiculoMoto){
                VehiculoMoto vehiculo3 = (VehiculoMoto) v;
                listVehiculosMoto.add(vehiculo3);
            }
        }
        double totalAcumuladoPeajeCarro=0;
        double totalAcumuladoPeajeCamion=0;
        double totalAcumuladoPeajeMoto=0;


        for(VehiculoCarro c:listVehiculosCarro){
            double tarifaIndividual = tarifaPeajeVehiculoCarro(c);
            totalAcumuladoPeajeCarro+=tarifaIndividual;
            System.out.print("La tarifa individual por carro es de " + tarifaIndividual + " pesos");
        }
        for(VehiculoCamion ca: listVehiculosCamion){
            double tarifaIndividualCamion = tarifaPeajeVehiculoCamion(ca);
            totalAcumuladoPeajeCamion+=tarifaIndividualCamion;
            System.out.println("La tarifa individual por camion es de " + tarifaIndividualCamion + " pesos");
        }
        for(VehiculoMoto m: listVehiculosMoto){
            double tarifaIndividualMoto= tarifaPeajeVehiculoMoto(m);
            totalAcumuladoPeajeMoto+=tarifaIndividualMoto;
            System.out.println("La tarifa individual por moto es de " + tarifaIndividualMoto + " pesos");
        }

        System.out.println("El listado de camiones que llegaron al peaje son: " + 
        listVehiculosCamion + " y la tarifa acumulada es de " + totalAcumuladoPeajeCamion);

        System.out.println("El listado de carros que llegaron al peaje son: " + 
        listVehiculosCarro  + " y la tarifa acumulada es de " + totalAcumuladoPeajeCarro);

        System.out.println("El listado de motos que llegaron al peaje son: " + 
        listVehiculosMoto  + " y la tarifa acumulada es de " + totalAcumuladoPeajeMoto);

   }
   //Metodo 2 pedido en el enunciado

   public void consultarTotalPeajesPorPersona(String idPersonabuscada){
    Persona personaEncontrada=null;
    for(Persona p: listPersonas){
        if(p.getId().equalsIgnoreCase(idPersonabuscada)){
            personaEncontrada =p;
        }
    }
    if(personaEncontrada==null){
        System.out.print("La persona buscada no existe");
        return;
    }

    double costototalgeneral=0;
    for(Vehiculo v: personaEncontrada.getListVehiculosAsignados()){
        double tarifaIndividual=0;
        if(v instanceof VehiculoCamion){
            tarifaIndividual+= tarifaPeajeVehiculoCamion(v);
        }
        else if(v instanceof VehiculoCarro){
            tarifaIndividual+= tarifaPeajeVehiculoCarro(v);
        }
        else if(v instanceof VehiculoMoto){
            tarifaIndividual+=tarifaPeajeVehiculoMoto(v);
        }
        double numeroPeajes=v.getNumeroPeajesPagados();
        costototalgeneral+=tarifaIndividual*numeroPeajes;

    }
    System.out.println("El costo a pagar de la persona " + personaEncontrada.getNombre() + " es de " + costototalgeneral + " pesos");

   }

   //Metodo 3 de lista de vehiculos de un conductor que tiene asignado
   public void listVehiculosAsignadasConductor(){
    ArrayList<VehiculoCamion> listCamiones = new ArrayList<>();
    ArrayList<VehiculoCarro> listCarros = new ArrayList<>();
    ArrayList<VehiculoMoto> listMotos = new ArrayList<>();

    for(Persona p: listPersonas){
        if(p instanceof Conductor){
            Conductor conductor= (Conductor) p;
            for(Vehiculo v: conductor.getListVehiculosAsignados()){
                if(v instanceof VehiculoCamion){
                    VehiculoCamion vehiculoCamion = (VehiculoCamion) v;
                    listCamiones.add(vehiculoCamion);
                }
                else if(v instanceof VehiculoCarro){
                    VehiculoCarro carrro=(VehiculoCarro) v;
                    listCarros.add(carrro);
                }
                else if(v instanceof VehiculoMoto){
                    VehiculoMoto moto=(VehiculoMoto) v;
                    listMotos.add(moto);
                }
            }
        }
    }
    
    System.out.println("Camiones:");
    for (VehiculoCamion c : listCamiones) {
        System.out.println(c);
    }

    System.out.println("Carros:");
    for (VehiculoCarro c : listCarros) {
        System.out.println(c);
    }

    System.out.println("Motos:");
    for (VehiculoMoto m : listMotos) {
        System.out.println(m);
    }

   }
   //Metodo 4 calculo de peaje vehiculo x
   public void calculoPeajeVehiculoX(Vehiculo v){
    double tarifa = 0;

    if (v instanceof VehiculoCamion) {
        tarifa = tarifaPeajeVehiculoCamion(v);
    } else if (v instanceof VehiculoCarro) {
        tarifa = tarifaPeajeVehiculoCarro(v);
    } else if (v instanceof VehiculoMoto) {
        tarifa = tarifaPeajeVehiculoMoto(v);
    }

    v.setNumeroPeajesPagados(v.getNumeroPeajesPagados() + 1);
    double totalRecaudado=0;
    totalRecaudado+=tarifa;
    listVehiculos.add(v);
    System.out.println("El vehiculo " + v.getPlaca() + " pagó " + totalRecaudado + " pesos");


   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getTotalPeajeRecolectado() {
        return totalPeajeRecolectado;
    }

    public void setTotalPeajeRecolectado(double totalPeajeRecolectado) {
        this.totalPeajeRecolectado = totalPeajeRecolectado;
    }

    public ArrayList<Persona> getListPersonas() {
        return listPersonas;
    }

    public void setListPersonas(ArrayList<Persona> listPersonas) {
        this.listPersonas = listPersonas;
    }

    public ArrayList<Vehiculo> getListVehiculos() {
        return listVehiculos;
    }

    public void setListVehiculos(ArrayList<Vehiculo> listVehiculos) {
        this.listVehiculos = listVehiculos;
    }
    
}
