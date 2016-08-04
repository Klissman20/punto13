/*
Implementar un programa que utilice clases y que permita visualizar los primeros n términos de la serie Fibonacci
 */
package punto13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Punto13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fibonacci Serie = new Fibonacci();
        Serie.Generar_serie();
        Serie.Mostrar_t();
    }
    
}
