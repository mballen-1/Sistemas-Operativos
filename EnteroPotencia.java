/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos;

import java.util.Scanner;


public class EnteroPotencia {

    static int enteroPotencia(int base, int exp) {
        int x=1;
        
            for (int i = 1; i <= exp; i++) {
                 x*=base;
                   }  
                 
           return x;
       
    }

    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
	System.out.println("Ingresa la base");
        int base = lector.nextInt();
	System.out.println("Ingresa el exponente");
        int exponente = lector.nextInt();
        System.out.printf("%d\n", enteroPotencia(base, exponente));

    }
}
