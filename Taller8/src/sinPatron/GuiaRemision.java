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
public class GuiaRemision extends ComprobanteElectronico{
    private String destino;
    private String placaVehiculo;
    private ArrayList<String> productos;

    public GuiaRemision() {
    }

    public GuiaRemision(String destino, String placaVehiculo, ArrayList<String> productos, String detallesDelEmisor, String numeroAutorizacion, String claveAcceso, String fecha) {
        super(detallesDelEmisor, numeroAutorizacion, claveAcceso, fecha);
        this.destino = destino;
        this.placaVehiculo = placaVehiculo;
        this.productos = productos;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public ArrayList<String> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<String> productos) {
        this.productos = productos;
    }
    
}
