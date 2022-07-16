/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Deus e fiel
 */
public class Mult5 {
    public static void main(String[] args){
        int num1 = 5;
        int cont = 0;
        int mult;
        
        while (cont <= 10){
            mult = num1 * cont;
            cont ++;
            
            System.out.printf("O valor é %d\n", mult);
        }
    }
}
