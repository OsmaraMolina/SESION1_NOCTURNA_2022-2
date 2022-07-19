/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ejercicio_34 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lado = 0;

        System.out.println("ingrese la medida de un lado de un petagono: ");
        lado = input.nextInt();

        System.out.println("El perimetro del pentagono es: " + calcular(lado));

    }

    public static int calcular(int lado) {
        return lado * 5;

    }
}
