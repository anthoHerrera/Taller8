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
public class NotaCredito extends ComprobanteElectronico{
    private String nombreCliente;
    private String codigoComprobanteModificar;
    private String detalleModificacion;
    private float valorAPagar;

    public NotaCredito() {
    }

    public NotaCredito(String nombreCliente, String codigoComprobanteModificar, String detalleModificacion, float valorAPagar, String detallesDelEmisor, String numeroAutorizacion, String claveAcceso, String fecha) {
        super(detallesDelEmisor, numeroAutorizacion, claveAcceso, fecha);
        this.nombreCliente = nombreCliente;
        this.codigoComprobanteModificar = codigoComprobanteModificar;
        this.detalleModificacion = detalleModificacion;
        this.valorAPagar = valorAPagar;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCodigoComprobanteModificar() {
        return codigoComprobanteModificar;
    }

    public void setCodigoComprobanteModificar(String codigoComprobanteModificar) {
        this.codigoComprobanteModificar = codigoComprobanteModificar;
    }

    public String getDetalleModificacion() {
        return detalleModificacion;
    }

    public void setDetalleModificacion(String detalleModificacion) {
        this.detalleModificacion = detalleModificacion;
    }

    public float getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(float valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    @Override
    public String toString() {
        return "Nota de Credito:\n" 
            + "Detalles del emisor: " + super.getDetallesDelEmisor() 
            + "\nNumero de Autorizacion: " + super.getNumeroAutorizacion()
            + "\nClave de acceso: " + super.getClaveAcceso() 
            + "\nCliente: " + nombreCliente + "\nCodigo de Comprobante a Modificar: " 
            + codigoComprobanteModificar 
            + "\nFecha: " + super.getFecha() + "\nDetalle de Modificacion: " 
            + detalleModificacion + "\nValor a pagar: " + valorAPagar;
    }
    
}
