/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ejercicio_12 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int year;
         System.out.println("Ingresa dia:");
          dia = sc.nextInt();
          System.out.println("Ingresa mes: ");
           mes = sc.nextInt();
        System.out.println("Ingresa year: ");
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year% 400 == 0) {
            System.out.println("El año " + year + " Si es bisiesto ");
        } else {
            System.out.println("El año " + year + " No es bisiesto ");
        }
    }
}
