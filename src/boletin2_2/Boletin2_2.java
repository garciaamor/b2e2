
package boletin2_2;

import java.util.Scanner;


public class Boletin2_2 {

   
     public static void main(String[] args) {
        float euros,cambio,dolares;
        Scanner obx= new Scanner(System.in);
        System.out.println("introduce cantidad de euros : ");
        euros=obx.nextFloat();
        System.out.println("introduce el tipo de cambio : ");
        cambio=obx.nextFloat();
        dolares=euros*cambio;
        System.out.println("esta cantidad equivale a : "+dolares + "$");
       
    }
    
}
   
