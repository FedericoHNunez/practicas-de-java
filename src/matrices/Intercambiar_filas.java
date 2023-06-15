/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

 

public class Intercambiar_filas {

    
  public static void LimpiarPantalla () {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e){}
        
          
}  


    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       int matriz[][], fila , col ;
       
        fila = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de filas"));
        col = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de col"));
        
        Scanner teclado= new Scanner(System.in);
        
        matriz= new int [fila][col];
        
        
        System.out.println("*******************************\n");
        System.out.println("Cargue la matriz");
        System.out.println("*******************************\n");
        
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[matriz.length-1].length ; j++)
            {
                System.out.print("Ingrese numero pos: " +i+ " col: "+j + " : ");    
                matriz[i][j] = teclado.nextInt();
            }
    
        }
        
        
  
         
        System.out.println("*******************************\n"); 
        
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < (matriz[matriz.length-1].length); j++) 
            {
                  System.out.print(matriz [i][j]+ " ");    
            }
             System.out.println("");       
        }
        
        
        LimpiarPantalla();
        
        
        int vectoraux[];
        vectoraux = new int[col];
     
      
       //copiar la primer fila en el vector aux
        
        for (int i = 0; i < col; i++) 
        {
            
            vectoraux[i]= matriz [0][i];
            matriz [0][i]= matriz [fila-1][i];
            matriz [fila-1][i]= vectoraux[i];
            
      
        }
     
      
       // imprimir matriz intercambiada 
        
        System.out.println("*******************************\n"); 
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[matriz.length-1].length; j++) 
            {
                  System.out.print(matriz [i][j]+ " ");    
            }
             System.out.println("");       
        }
        

        //imprimir los vertices
        
    System.out.println("*******************************\n");
    
        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][(matriz[matriz.length-1].length)-1]);
        System.out.println(matriz[(matriz.length-1)][0]);
        System.out.println(matriz[(matriz.length-1)][(matriz[matriz.length-1].length)-1]);
        
             
       //convertir a char los vetices
       
       char a, b ,c ,d;
       
       a = (char)matriz[0][0];
       b = (char)matriz[0][(matriz[matriz.length-1].length)-1];
       c= (char) matriz[(matriz.length-1)][0];
       d = (char)matriz[(matriz.length-1)][(matriz[matriz.length-1].length)-1];
       
        System.out.println("\n"+ a + " "+ b +" "+ c +" "+ d);
        
       
    
        
            System.out.println("*******************************\n");
            
        //imprimir la diagonal
        
        int j = 0, i=0 ;           
       while ( j < (matriz[matriz.length-1].length) &&  i < (matriz.length) )         
       {
           
            System.out.print(matriz[i][j] + " ");
            j++;
            i ++;        
       }
        System.out.println("");   
    System.out.println("*******************************\n");
    
    
    
    }
    
    
    
}


