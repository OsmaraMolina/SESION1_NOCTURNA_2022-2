/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ejercicio_33 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int exponente = 0;
        int base = 0;

        System.out.println("ingrese la base: ");
        base = input.nextInt();
        System.out.println("ingrese el exponente: ");
        exponente = input.nextInt();

        System.out.println("El resultado es: " + elevar(base, exponente));

    }

    public static double elevar(int base, int exponente) {
        return Math.pow(base, exponente);
    }
}
