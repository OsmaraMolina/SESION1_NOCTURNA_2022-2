/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author user
 */
public class ejercicio_25 {

   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Indica el numero a calcular su factorial: ");

        int valorCalcular = 0;

        // bucle mientras valorCacular es inferior a 1
        while (valorCalcular < 1) {
            try {
                // Solicitamos un entero
                valorCalcular = entrada.nextInt();

                // Indicamos que es incorrecto si el valor es inferior a1
                if (valorCalcular < 1) {
                    System.out.println("El valor tiene que ser superior a 0");
                }
            } catch (InputMismatchException e) {
                // Controlamos que siempre introduzca un valor numerico
                System.out.println("El valor tiene que ser numerico...");
                entrada.nextLine();
            }
        }

        long factorial = 1L;
        for (int i = valorCalcular; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + valorCalcular + " es " + factorial);
    }

}
