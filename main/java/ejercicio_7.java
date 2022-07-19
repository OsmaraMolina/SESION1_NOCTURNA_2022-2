/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio_7 {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Ingrese un número entero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("EL NUMERO ES PAR");
        } else {
            System.out.printf("EL NUMERO ES IMPAR");
        }
    }
}
