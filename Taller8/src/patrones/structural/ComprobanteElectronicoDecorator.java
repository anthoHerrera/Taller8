/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.structural;

import sinPatron.ComprobanteElectronico;

/**
 *
 * @author User
 */
public abstract class ComprobanteElectronicoDecorator extends ComprobanteElectronico{
    
    protected ComprobanteElectronico comprobante;

    public ComprobanteElectronicoDecorator(ComprobanteElectronico comprobante) {
        this.comprobante = comprobante;
    }

    public ComprobanteElectronico getComprobante() {
        return comprobante;
    }

    public void setComprobante(ComprobanteElectronico comprobante) {
        this.comprobante = comprobante;
    }

}
