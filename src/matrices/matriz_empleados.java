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
public class matriz_empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    Scanner teclado= new Scanner(System.in);
    
    String nombres[];
    nombres= new String[3];
    
        System.out.println("ingresar los nombres de los empleados: ");
        System.out.println("**************************************");
        
        for (int i = 0; i < 3; i++) 
        {
            System.out.print("Ingrese el nombre del empleado " +i+": ");
            nombres[i]= teclado.nextLine();
                      
        }
    
        System.out.println("");
        System.out.println("****************************");
        
        
        
        
        int matriz[][];
        matriz = new int [3][];
        int faltas, max=0 ; 
        int maxnombre=0 ;       
        
        for (int i = 0; i < 3; i++) 
        {
          
                    
            System.out.print("Ingresar cuantos dias a faltado el empleado "+ nombres[i] +": ");
            faltas = teclado.nextInt();
            matriz[i]= new int [faltas]; 
             
            if (max< faltas)
            {
                
                max= faltas;
                maxnombre = i;
            }
              
            
            for (int j = 0; j< faltas ; j++) 
            {
                System.out.print("Ingrese dia de falta "+nombres[i]+ ": ");    
                matriz[i][j]= teclado.nextInt();
                
            }
            System.out.println("");
                
        }
        
         
        System.out.println("");
        System.out.println("****************************");
        
        for (int i = 0; i <3; i++)  
        {     
            System.out.println("El empleado nombre :" + nombres[i]+ " Falto los dias: ");
            for (int j = 0; j < matriz[i].length; j++) 
            {
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println("******");
        }
        
        System.out.println("El empleado que mas falto fue: " + nombres[maxnombre]+ " con "+max+ " faltas.");
        
    
    
        
        
        
        
        
        
        
        
    }
}
