/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author fenu1
 */
public class Matriz_aleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int matriz[][];
        String matrizString[][];
        char matrizchar [][];
        
        int fila, col, lim;
        
        
        fila= Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de filas"));
        col=  Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de columnas"));
        lim = Integer.parseInt(JOptionPane.showInputDialog("ingrese limite aleatorio"));
        
        matriz = new int [fila][col];
        matrizString= new String[fila][col];
        matrizchar = new char[fila][col];
        
        
        //cargar la matriz con numeros aletorios
        for (int i = 0; i < fila; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                   matriz[i][j]= (int)(Math.random()*lim);
            }
        }
        
        //mostrar la matriz
        
        for (int i = 0; i < fila; i++) 
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println("");
        }
        System.out.println("*********************************");
        System.out.println("*********************************");
       
        
//converir la matriz a string
        
        for (int i = 0; i < fila; i++) 
        {
            for (int j = 0; j < col; j++)
            {
                matrizString[i][j]= Integer.toString(matriz[i][j]);
           
                System.out.print(matrizString[i][j]+ " ");        
        
            }
            System.out.println("");
        }
        System.out.println("*********************************");
        System.out.println("*********************************");
  
       
        
        
         for (int i = 0; i < fila; i++) 
        {
            for (int j = 0; j < col; j++)
            {
                matrizchar [i][j]= (char)(matriz[i][j]+ '@');
                        
                System.out.print(matrizchar[i][j]+ " ");        
        
            }
            System.out.println("");
        }
        System.out.println("*********************************");
        
        
        
        
        
        
        
        
        
        
    }
    
}
