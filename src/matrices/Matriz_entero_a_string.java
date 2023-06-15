/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author fenu1
 */
public class Matriz_entero_a_string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        Scanner teclado= new Scanner(System.in);
        int fila, col;
       int matriz [][];
       String matrizString [][]; 
      
        
        System.out.println("********************************");
        System.out.print("ingrese la cantidad de filas: ");
        fila= teclado.nextInt();
        System.out.print("Ingrese la cantidad de columnas :");
        col= teclado.nextInt();
        System.out.println("\n********************************");
        
        matriz = new int[fila][col];
        matrizString = new String[fila][col];
            
         System.out.println("\n********************************");
         
        for (int i = 0; i < fila; i++)
        {
            for (int j = 0; j < col ; j++) 
            {
                System.out.print("\nIngrese numero para fila "+ (i+1)+ " columna "+(j+1)+ ": ");
                matriz[i][j]= teclado.nextInt();
            }
    
        }
         
        for (int i = 0; i < fila; i++) 
        {
            for (int j = 0; j < col; j++)
            {
                matrizString [i][j]= "";
               // matrizString [i][j]+= matriz[i][j]; 
               matrizString[i][j]= Integer.toString(matriz[i][j]);
            }
   
        }
       
            System.out.println("\n********************************");
            System.out.println("La matriz a string es: ");
                       
        for (int i = 0; i < fila; i++) 
        {
            for (int j = 0; j < col ; j++)
            {
                System.out.print(matrizString[i][j]+" ");    
            }
            System.out.println("");
        }
        
        
        
        
        
    
    
    }
    
    
    
    
}
