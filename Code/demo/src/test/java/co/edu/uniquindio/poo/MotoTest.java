/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MotoTest{
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testVerificarElmetodoParaCalcularTarifaMoto() {
        LOG.info("testVerificarElmetodoParaCalcularTarifaMoto");

        EstacionPeaje estacionPeaje = new EstacionPeaje("ArmeniaPeaje", "Quindio", 10);

        VehiculoMoto moto1= new VehiculoMoto("AWS-234", 10, 250);

        double tarifa = estacionPeaje.tarifaPeajeVehiculoMoto(moto1);

        assertEquals(7000, tarifa, 0.001);


        LOG.info("testVerificarElmetodoParaCalcularTarifaMoto");
    }

    @Test
    public void testVerificarSiEstaVacioUnaLista() {
        LOG.info("testVerificarSiEstaVacioUnaLista");

        EmpresaPeajes empresaPeajes=new EmpresaPeajes("PeajesSA");

        VehiculoMoto vehiculoMoto= new VehiculoMoto("DFW-5343", 23, -5);

        EstacionPeaje estacionPeaje = new EstacionPeaje("Boyaca", "Tunja", 2);

        estacionPeaje.getListVehiculos().add(vehiculoMoto);

        empresaPeajes.getListEstacionesPeajes().add(estacionPeaje);

        assertNotNull(empresaPeajes.getListEstacionesPeajes(), "La lista no puede ser nula");

        LOG.info("testVerificarSiEstaVacioUnaLista");
    }

    


}
