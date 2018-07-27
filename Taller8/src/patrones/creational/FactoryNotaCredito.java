/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creational;

import sinPatron.ComprobanteElectronico;
import sinPatron.NotaCredito;

/**
 *
 * @author Anthony777
 */
public class FactoryNotaCredito extends ComprobanteElectronicoAbstractFactory{

    @Override
    public ComprobanteElectronico createComprobanteElectronico() {
        System.out.println("notacredito");//es para probar el print
        return new NotaCredito();
    }
    
}
