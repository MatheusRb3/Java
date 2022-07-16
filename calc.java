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
public class calc {
    public static void main(String[] args){
        int num1 = 0;
        int soma;
        
        while (num1 <100){
            soma = num1 + 2;
            num1 = soma;
            
            System.out.printf("O valor é %d\n", soma);
        }
    }
}
