/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAW TARDE
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // TODO code application logic here
        /*int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
        // System.out.println(matriz[0].length);
        // Recorrer elemento a elemento
        /*
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][2] + "");
                break;
            }
System.out.print("\n");
        }
         */
        // Mostrar elementos de la tercera columna
        /*
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][2] + "");
        }
         */
        // Mostrar elementos de la primera fila
        /*for (int i = 0; i < matriz[0].length; i++) {
            System.out.println(matriz[0][i] + "  ");
        }
        /*String [][] tresRaya = new String [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la fila");
        int fila = sc.nextInt();
        System.out.println("Introduzca la columna");
        int columna = sc.nextInt();
        if (tresRaya[fila][columna] == null){
            tresRaya[fila][columna] = "jugador 1";
        }*/
      /* int [] [] matriz ={
           {1, 2, 3}, {4,5,6}, {7,8,9}
    };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i] [j] + " ");
            }
        }
        */
       /* int [] [] matriz2 = {
            {1,2},
            {3,4}
        };
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                
            }
        }*/
       Random random = new Random (100);
        int [] [] matriz3 = new int [4] [3];
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                
                matriz3 [i] [j] =  random.nextInt(100) +1;
                System.out.print(matriz3 [i][j]+ "  ");
            }
            System.out.println("\n");
        }
        
        int [] [] matriz4 = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int guardador  [] = new int [20]; 
        int contador = 0;
        for (int i = 0; i < matriz4.length; i++) {
            for (int j = 0; j < matriz4[i].length; j++) {
            contador = contador + matriz4[i][j];    
            }
            
                guardador [i] = contador; 
                contador = 0; 
            System.out.println(guardador [i]);
        }
    }
    }

