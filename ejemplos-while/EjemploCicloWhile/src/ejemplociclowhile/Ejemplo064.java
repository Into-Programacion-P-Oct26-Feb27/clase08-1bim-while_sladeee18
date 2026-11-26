/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejemplo064 {
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
     
         boolean bandera = true;
         String pais;
         String capital;
         String reporte = "";
         int contador = 0;
         while(bandera==true){
             System.out.println("ingrese un pais");
             pais = entrada.nextLine();
             
             System.out.println("ingrese la capital del pais");
             capital  = entrada.nextLine();
             
             reporte = String.format("%s%s\t%\n", reporte,pais, capital);
             contador = contador + 1;
             
             String salir;
             System.out.println("desea salir del ciclo, ingrese si");
             salir = entrada.nextLine();
             if(salir.equals("si")){
         }        bandera = false;
     }
         reporte = String.format("%sTotal paises ingrsados %d\n", reporte,contador);
         System.out.printf("&s\n", reporte);
     }
}

