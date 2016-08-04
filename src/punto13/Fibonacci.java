/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Fibonacci {
    Scanner lector = new Scanner(System.in);
    int[] vector;
    int j,dig;
    int[] vector1;
    
    public void Generar_serie(){
        System.out.println("Numero de digitos a generar: ");
        j = lector.nextInt();
        vector = new int[j];
        vector[0] = 0;
        vector[1] = 1;
        vector[2] = 1;
        for (int i=3;i<j;i++){
            vector [i] = vector[i-2]+vector [i-1];   
        }
    }
    public void Mostrar_t (){
        System.out.println("Cuantos digitos: ");
        dig = lector.nextInt();
        vector1 = new int[dig];
        System.out.println("Los digitos son: ");
        for(int i=0;i<dig;i++){
            vector1[i]=vector[i];
            System.out.print(vector1[i]+" ");
        }
        
    }
    
}
