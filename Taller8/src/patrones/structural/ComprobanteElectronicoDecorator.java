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
    
    private String rutaALaImagen;
    private String lema;
    private ComprobanteElectronico comprobante;

    public ComprobanteElectronicoDecorator(ComprobanteElectronico comprobante) {
        this.comprobante = comprobante;
    }

    public ComprobanteElectronico getComprobante() {
        return comprobante;
    }

    public void setComprobante(ComprobanteElectronico comprobante) {
        this.comprobante = comprobante;
    }

    public String getRutaALaImagen() {
        return rutaALaImagen;
    }

    public void setRutaALaImagen(String rutaALaImagen) {
        this.rutaALaImagen = rutaALaImagen;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }
    
}
