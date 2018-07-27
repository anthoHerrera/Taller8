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
public class AgregarLogo extends ComprobanteElectronicoDecorator {
    private String rutaALaImagen;
    
    public AgregarLogo(ComprobanteElectronico comprobante, String direccionLogo) {
        super(comprobante);
        rutaALaImagen=direccionLogo;
    }

    public String getRutaALaImagen() {
        return rutaALaImagen;
    }

    public void setRutaALaImagen(String rutaALaImagen) {
        this.rutaALaImagen = rutaALaImagen;
    }
    
    
}
