package sinPatron;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony777
 */
public abstract class ComprobanteElectronico {
    private String detallesDelEmisor;
    private String numeroAutorizacion;
    private String claveAcceso;
    private String fecha;

    public ComprobanteElectronico() {
    }
    
    public ComprobanteElectronico(String detallesDelEmisor, String numeroAutorizacion, String claveAcceso, String fecha) {
        this.detallesDelEmisor = detallesDelEmisor;
        this.numeroAutorizacion = numeroAutorizacion;
        this.claveAcceso = claveAcceso;
        this.fecha = fecha;
    }

    public String getDetallesDelEmisor() {
        return detallesDelEmisor;
    }

    public void setDetallesDelEmisor(String detallesDelEmisor) {
        this.detallesDelEmisor = detallesDelEmisor;
    }

    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    public void setNumeroAutorizacion(String numeroAutorizacion) {
        this.numeroAutorizacion = numeroAutorizacion;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
