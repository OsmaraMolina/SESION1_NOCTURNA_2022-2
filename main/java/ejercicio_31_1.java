/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ejercicio_31_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = 0;
        double suma = 0;
        double promedio = 0;
        int contador = 0;

        System.out.println("ingrese un numero: ");
        N = input.nextInt();

        suma += N;

        while (N != 0) {
            System.out.println("ingrese un numero: ");
            N = input.nextInt();
            suma += N;
            contador++;
        }
        promedio = suma / contador;
        System.out.println("El promedio es: " + promedio);
    }
}

    
  