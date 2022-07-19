/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
import java.io.*;

/**
 *
 * @author user
 */
public class ejercicio_22 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        int cifras;
        char car;
        do {
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            cifras = 0;    //esta variable es el contador de cifras
            while (n != 0) {             //mientras a n le queden cifras
                n = n / 10;         //le quitamos el último dígito
                cifras++;          //sumamos 1 al contador de cifras
            }
            System.out.println("El número tiene " + cifras + " cifras");
            System.out.print("Continuar? ");
            car = (char) System.in.read();
        } while (car != 'n' && car != 'N');
    }
}
    
