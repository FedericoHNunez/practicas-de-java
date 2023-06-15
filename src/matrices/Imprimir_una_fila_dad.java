/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author fenu1
 */
public class Imprimir_una_fila_dad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner teclado = new Scanner(System.in);
        
        int matriz[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {10,11,12}
        };
   
        for (int i = 0; i < 4; i++) 
        {
           
            for (int j = 0; j < 3; j++)
            {
                System.out.print(matriz[i][j]+ " ");    
            }
            System.out.println("");     
        }
        
        
        System.out.println( "\n" + matriz.length);  //filas
        System.out.println("\n" + matriz[matriz.length-1].length); // columnas
        
        int fila;
        System.out.println("Que fila quiere imprimir: ");
        fila = teclado.nextInt();
        System.out.println("");

        for (int i = 0; i < 3; i++)
         {
             System.out.print(matriz[fila-1][i]);   
         }
            System.out.println("");
    
    }
    
}
