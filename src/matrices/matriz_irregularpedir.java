/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import com.sun.javafx.collections.ElementObservableListDecorator;
import java.util.Scanner;

/**
 *
 * @author fenu1
 */
public class matriz_irregularpedir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int matriz[][];
        int cantidaddefilas, elementos;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de filas para a matriz: ");
        cantidaddefilas = teclado.nextInt();
        
        matriz= new int[cantidaddefilas][];
        System.out.println("******************************");
        
        for (int i = 0; i < matriz.length; i++)
        { 
            System.out.print("Ingrese la cantidad de elementos para la fila "+ (i+1)+ " : ");
            elementos= teclado.nextInt();
            
            matriz[i]= new int[elementos];
            
              for (int j = 0; j < matriz[i].length; j++) 
              {
                  System.out.print("Digite un elemento: ");
                  matriz [i][j]= teclado.nextInt();
              }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                System.out.print(matriz[i][j]+" ");    
            }
            System.out.println("");
        }
            
        
        /*/ crear matriz
      
        1
        12
        123
        1234
        12345      
        
*/        
        
        System.out.println("***********************************");
        System.out.println("");
        
        
        
        
        int matriz2[][];
        matriz2 = new int [5][];
        
        
        
        for (int i = 0; i < 5; i++) 
        {
            
            matriz2 [i]= new  int [i+1];
           
        }
        
        
           
        
        for (int i = 0; i < matriz2.length; i++) 
        {
            for (int j = 0; j < matriz2[i].length; j++) 
            {
                matriz2[i][j]= (int)(Math.random()*100);
                
                System.out.print(matriz2[i][j]+" ");    
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        



    }
    
}
