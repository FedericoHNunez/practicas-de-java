/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author fenu1
 */
public class Mayor_de_la_matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado= new Scanner(System.in);
        int matriz [][];
        
        System.out.println("******************************");
        
        int fila, col;
        
        System.out.print("Ingrese cantidad de filas: ");
        fila = teclado.nextInt();
        System.out.print("\nIngrese cantidad de columnas: ");
        col = teclado.nextInt();
             
        matriz= new int[fila][col];
             
        System.out.println("*********************************");
        System.out.println(matriz.length);
         System.out.println(matriz[matriz.length-1].length);
        
        
        
        for (int i = 0; i < fila; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print("Ingrese el numero de la fila "+i+" columna "+j+" : ");
                matriz[i][j]= teclado.nextInt();
            }
        }
         
        
        
        
        int max , posf, posc;
        
        max = matriz [0][0];
        posf =0;
        posc = 0;
        
        for (int i = 0; i < fila; i++)
        {
            for (int j = 0; j < col; j++) 
            {
              if (matriz[i][j]>max) 
              {
                  max= matriz[i][j];
                  posf= i;
                  posc= j;
              } 
            }
        }
          
        System.out.println("el mayor es: " + max + " en la pos: ["+ posf + "] [" + posc + "]");
        
        
        
        
        
        
        
}          
        
        
}
        


        
        
   
    
     
        
        
        
        
        
        
   
   

