/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio_8 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        // Manda un  mensaje
        System.out.println("Escribe un número:");
        // Leer lo que se introduce
        double numero = escaner.nextDouble();
        // Comparar
        if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }

    }
}
