/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creational;

import sinPatron.ComprobanteElectronico;
import sinPatron.Factura;

/**
 *
 * @author Anthony777
 */
public class FactoryFactura extends ComprobanteElectronicoAbstractFactory{

    @Override
    public ComprobanteElectronico createComprobanteElectronico() {
        System.out.println("factura");// es para probar el print
        return new Factura();
    }
    
}
