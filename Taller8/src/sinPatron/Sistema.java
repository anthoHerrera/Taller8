/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinPatron;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import patrones.behavioral.Context;
import patrones.behavioral.EsquemaOffline;
import patrones.behavioral.EsquemaOnline;
import patrones.behavioral.Strategy;
import patrones.creational.ComprobanteElectronicoAbstractFactory;
import patrones.creational.FactoryFactura;
import patrones.creational.FactoryGuiaRemision;
import patrones.creational.FactoryNotaCredito;
import patrones.structural.AgregarLema;
import patrones.structural.AgregarLogo;
import patrones.structural.ComprobanteElectronicoDecorator;

/**
 *
 * @author Anthony777
 */
public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bandera = 0;
        String numeroAutorizacion = "0";
        Date fecha= new Date();
        ArrayList<String> productos = new ArrayList<>();
        productos.add("1");       
        productos.add("2");
        productos.add("3");
        int total = productos.size();
        while(bandera==0){
            System.out.println("Bienvenido a Stupendo");
            System.out.println("1: Factura");
            System.out.println("2: Guia de remision");
            System.out.println("3: Nota de credito");
            System.out.println("4: Salir");
            System.out.println("Elija una opcion del menu");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    
                    System.out.print("Ingrese nombre del cliente: ");
                    String nombreCliente = sc.nextLine();
                    nombreCliente = sc.nextLine();
                    System.out.print("Ingrese codigo: ");
                    String codigo = sc.next();
                    System.out.print("Ingrese clave de acceso: ");
                    String claveAcceso = sc.nextLine();
                    claveAcceso = sc.nextLine();
                    
                    System.out.print("Ingrese detalles del emisor: ");
                    String detallesDelEmisor = sc.nextLine();
                    
                    ComprobanteElectronicoAbstractFactory f1 = new FactoryFactura();
                    ComprobanteElectronico factura = f1.createComprobanteElectronico(nombreCliente,codigo,null,null,productos,total,null,null,0.0f,detallesDelEmisor,numeroAutorizacion,claveAcceso,fecha.toString());
//                    AgregarLema elec = (AgregarLema) factura;
//                    System.out.println(elec.getComprobante());
                    Factura f = (Factura) factura;
                    
                    
                    System.out.println("Tipo de esquema");
                    System.out.println("1: Esquema Offline");
                    System.out.println("2: Esquema Online");
                    i=sc.nextInt();
                    if(i==1){
                        Strategy s = new EsquemaOffline();
                        Context c = new Context(s);
                        c.establecerEsquema(factura);
                    }else if(i==2){
                        Strategy s = new EsquemaOnline();
                        Context c = new Context(s);
                        c.establecerEsquema(factura);
                    }
                    System.out.println("Agregar lema: ");
                    String lema1 = sc.nextLine();
                    lema1 = sc.nextLine();
                    ComprobanteElectronicoDecorator dec2 = new AgregarLema(factura, lema1);
                    System.out.println("Agregar logo: ");
                    String logo1 = sc.nextLine();
                    ComprobanteElectronicoDecorator d2 = new AgregarLogo(factura, logo1);
                    System.out.println(factura);
                    System.out.println(dec2);
                    System.out.println(d2);
                    break;
                case 2:
                    
                    System.out.print("Ingrese destino: ");
                    String destino = sc.nextLine();
                    destino = sc.nextLine();
                    System.out.print("Ingrese placa vehiculo: ");
                    String placa = sc.next();
//                    
                    System.out.print("Ingrese clave de acceso: ");
                    claveAcceso = sc.nextLine();
                    claveAcceso = sc.nextLine();
                    System.out.print("Ingrese detalles del emisor: ");
                    detallesDelEmisor = sc.nextLine();
                    
                    ComprobanteElectronicoAbstractFactory f2 = new FactoryGuiaRemision();
                    ComprobanteElectronico guia = f2.createComprobanteElectronico(null,null,destino,placa,productos,0,null,null,0.0f,detallesDelEmisor,numeroAutorizacion,claveAcceso,fecha.toString());
//                    AgregarLema elec = (AgregarLema) factura;
//                    System.out.println(elec.getComprobante());
                    
                    
                    
                    System.out.println("Tipo de esquema");
                    System.out.println("1: Esquema Offline");
                    System.out.println("2: Esquema Online");
                    i=sc.nextInt();
                    if(i==1){
                        Strategy s = new EsquemaOffline();
                        Context c = new Context(s);
                        c.establecerEsquema(guia);
                    }else if(i==2){
                        Strategy s = new EsquemaOnline();
                        Context c = new Context(s);
                        c.establecerEsquema(guia);
                    }
                     System.out.println("Agregar lema: ");
                    String lema = sc.nextLine();
                    lema = sc.nextLine();
                    ComprobanteElectronicoDecorator dec = new AgregarLema(guia, lema);
                    System.out.println("Agregar logo: ");
                    String logo = sc.nextLine();
                    ComprobanteElectronicoDecorator d = new AgregarLogo(guia, logo);
                    System.out.println(guia);
                    System.out.println(dec);
                    System.out.println(d);
                    
                    break;
                case 3:
                    
                    System.out.print("Ingrese nombre del cliente: ");
                    nombreCliente = sc.nextLine();
                    nombreCliente = sc.nextLine();
                    System.out.print("Ingrese codigo comprobante a modificar: ");
                    codigo = sc.next();
                    System.out.print("Ingrese detalle de modificacion: ");
                    String detalle = sc.nextLine();
                    detalle = sc.nextLine();
                    System.out.print("Ingrese valor a pagar: ");
                    float valor = sc.nextFloat();
                    System.out.print("Ingrese clave de acceso: ");
                    claveAcceso = sc.nextLine();
                    claveAcceso = sc.nextLine();
                    System.out.print("Ingrese detalles del emisor: ");
                    detallesDelEmisor = sc.nextLine();
                    
                    ComprobanteElectronicoAbstractFactory f3 = new FactoryNotaCredito();
                    ComprobanteElectronico nota = f3.createComprobanteElectronico(nombreCliente,null,null,null,null,0,codigo,detalle,valor,detallesDelEmisor,numeroAutorizacion,claveAcceso,fecha.toString());
      
                    System.out.println("Tipo de esquema");
                    System.out.println("1: Esquema Offline");
                    System.out.println("2: Esquema Online");
                    i=sc.nextInt();
                    if(i==1){
                        Strategy s = new EsquemaOffline();
                        Context c = new Context(s);
                        c.establecerEsquema(nota);
                    }else if(i==2){
                        Strategy s = new EsquemaOnline();
                        Context c = new Context(s);
                        c.establecerEsquema(nota);
                    }
                    
                    System.out.println("Agregar lema: ");
                    String lema3 = sc.nextLine();
                    lema3 = sc.nextLine();
                    ComprobanteElectronicoDecorator dec1 = new AgregarLema(nota, lema3);
                    System.out.println("Agregar logo: ");
                    String logo3 = sc.nextLine();
                    ComprobanteElectronicoDecorator d1 = new AgregarLogo(nota, logo3);
                    System.out.println(nota);
                    System.out.println(dec1);
                    System.out.println(d1);
                    break;
                case 4:
                    System.out.println("Gracias por su visita");
                    bandera=1;
                    break;
                default:
                    System.out.println("Opcion incorrecta. Vuelve a intentar");
                    break;
            }
        }
        
    }
}
