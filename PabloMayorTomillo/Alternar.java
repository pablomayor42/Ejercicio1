/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios;

import java.util.Scanner;

/**
 *
 * @author maytompa
 */
public class Alternar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        float cont = 0;

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Resultado: ");

        for (int i = 0; i < frase.length(); i++) 
        {
            while (cont < (float) frase.length() / 2) 
            {
                System.out.print(frase.charAt(i));
                i = i + 1;
                num = frase.length() - i;
                cont++;
                if (cont <= (float) frase.length() / 2) {
                    System.out.print(frase.charAt(num));
                }
            }
        }
        System.out.println();
    }
}
