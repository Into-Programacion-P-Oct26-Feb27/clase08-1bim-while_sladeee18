/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo061;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class java {
     public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
     
         boolean bandera = true;
         while(bandera==true){
             System.out.println("estoy en cicllo");
             
             int salir;
             System.out.println("desea salir del ciclo, ingrese -100");
             salir = entrada.nextInt();//100
             if(salir == -100){
         }        bandera = false;
     }
     }
}

/*
cuando esta en 100 sigue en el ciclo , cuando esta en -100 sale del ciclo
*/