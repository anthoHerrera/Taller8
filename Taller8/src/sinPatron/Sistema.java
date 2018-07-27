/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinPatron;

import java.util.Scanner;
import patrones.behavioral.Context;
import patrones.behavioral.EsquemaOffline;
import patrones.behavioral.EsquemaOnline;
import patrones.behavioral.Strategy;

/**
 *
 * @author Anthony777
 */
public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bandera = 0;
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
                    ComprobanteElectronico f1 = new Factura();
                    ComprobanteElectronico f = new 
                    System.out.print(f1.);
                    System.out.println("Tipo de esquema");
                    System.out.println("1: Esquema Offline");
                    System.out.println("2: Esquema Online");
                    i=sc.nextInt();
                    if(i==1){
                        Strategy s = new EsquemaOffline();
                        Context c = new Context(s);
                    }else if(i==2){
                        Strategy s = new EsquemaOnline();
                        Context c = new Context(s);
                    }
                    break;
                case 2:
                    break;
                case 3:
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
