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
public class Ejemplo062 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;
        while (bandera == true) {
            System.out.println("estoy en cicllo");

            String salir;
            System.out.println("desea salir del ciclo, ingrese si");
            salir = entrada.nextLine();//100
            if (salir.equals("si")){
            }
            bandera = false;
        }
    }
}

/*
cuando esta en 100 sigue en el ciclo , cuando esta en -100 sale del ciclo
*/
