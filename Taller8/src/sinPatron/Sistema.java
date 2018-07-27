/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinPatron;

import java.util.Scanner;

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
            if(i ==1){
                
            }else if(i==2){
                
            }else if(i==3){
                
            }else if(i==4){
                System.out.println("Gracias por su visita");
                bandera=1;
            }else{
                System.out.println("Opcion incorrecta. Vuelve a intentar");
            }
        }
        Factura f1 = new Factura();
        
    }
}
