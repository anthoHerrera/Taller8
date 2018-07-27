/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creational;

import sinPatron.ComprobanteElectronico;

/**
 *
 * @author Anthony777
 */
public class GeneraComprobanteElectronico {

    public GeneraComprobanteElectronico(ComprobanteElectronicoAbstractFactory factory) {
        ComprobanteElectronico ce = factory.createComprobanteElectronico();
    }
    
}
