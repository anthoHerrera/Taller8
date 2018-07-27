package sinPatron;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Anthony777
 */
public class Factura extends ComprobanteElectronico {
    private String nombreCliente;
    private String codigo;
    private ArrayList<String> productos;
    private int total;

    public Factura() {
    }

    public Factura(String nombreCliente, String codigo, ArrayList<String> productos, int total, String detallesDelEmisor, String numeroAutorizacion, String claveAcceso, String fecha) {
        super(detallesDelEmisor, numeroAutorizacion, claveAcceso, fecha);
        this.nombreCliente = nombreCliente;
        this.codigo = codigo;
        this.productos = productos;
        this.total = total;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<String> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<String> productos) {
        this.productos = productos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura:\n" 
            + "Detalles del emisor: " + super.getDetallesDelEmisor() 
            + "\nCliente: " + nombreCliente + "\nNumero de Autorizacion: " 
            + super.getNumeroAutorizacion()+ "\nClave de acceso: " 
            + super.getClaveAcceso()+ "\nCodigo:" + codigo + "\nFecha: " 
            + super.getFecha()+ "\nProductos:" + productos + "\nTotal=" + total;
    }
    
    
}
