/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creational;

import java.util.ArrayList;
import sinPatron.ComprobanteElectronico;
import sinPatron.NotaCredito;

/**
 *
 * @author Anthony777
 */
public class FactoryNotaCredito extends ComprobanteElectronicoAbstractFactory{

    @Override
    public ComprobanteElectronico createComprobanteElectronico(String nombreCliente, String codigo, String destino, String placaVehiculo, ArrayList<String> productos, int total, String codigoComprobanteModificar, String detalleModificacion, float valorAPagar, String detallesDelEmisor, String numeroAutorizacion, String claveAcceso, String fecha) {
        System.out.println("notacredito");//es para probar el print
        return new NotaCredito(nombreCliente,codigoComprobanteModificar,detalleModificacion,valorAPagar,detallesDelEmisor,numeroAutorizacion,claveAcceso,fecha);
    }

    
    
}
