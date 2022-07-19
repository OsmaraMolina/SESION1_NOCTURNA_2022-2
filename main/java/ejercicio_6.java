/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ejercicio_6 {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el valor del cateto A: ");
        double a = input.nextDouble();
        System.out.print("Ingese el valor del cateto B: ");
        double b = input.nextDouble();

        a = Math.pow(a, 2);
        b = Math.pow(b, 2);

        double c = Math.sqrt(a + b);

        System.out.println("--------------------------");
        System.out.println("Valor de Hipotenusa es: " + c);
    }
}
    
