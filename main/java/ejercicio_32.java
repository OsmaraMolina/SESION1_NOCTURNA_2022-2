/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ejercicio_32 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int edad = 0;
        double promedio = 0;
        int contador = 0;
        double suma = 0;

        System.out.println("ingrese una edad: ");
        edad = input.nextInt();
        suma += solicitar(edad);
        while (edad != 0) {
            System.out.println("ingrese una edad: ");
            edad = input.nextInt();
            suma += solicitar(edad);
            if (edad > 18) {
                contador++;
            }
            System.out.println("Digite 0 para finalizar...");
        }
        promedio = suma / contador;
        System.out.println("El promedio es: " + promedio);
    }

    public static double solicitar(int edad) {
        if (edad > 18) {
            return edad;
        } else {
            return 0;
        }
    }
}

   