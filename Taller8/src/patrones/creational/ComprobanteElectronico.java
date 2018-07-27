/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creational;

/**
 *
 * @author User
 */
public interface ComprobanteElectronico {
    
    public String getDetallesDelEmisor();

    public void setDetallesDelEmisor(String detallesDelEmisor);
	
    public String getNumeroAutorizacion();

    public void setNumeroAutorizacion(String numeroAutorizacion);

    public String getClaveAcceso();

    public void setClaveAcceso(String claveAcceso);

    public String getFecha();

    public void setFecha(String fecha);
    
    
}
