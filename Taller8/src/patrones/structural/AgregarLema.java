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
public class AgregarLema extends ComprobanteElectronicoDecorator{
    private String lema;
    
    public AgregarLema(ComprobanteElectronico comprobante, String lema) {
        super(comprobante);
        this.lema=lema;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }
    
    
}
