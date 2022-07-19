/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio_17 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int horas;
        System.out.print("Digite la cantidad de horas: ");
        horas = entrada.nextInt();
        System.out.println("Precio: " + calcularPrecio(horas));
    }

    public static double calcularPrecio(int horas) {
        double precio = 0;
        if (horas <= 3) {
            precio = horas * 20;
        } else if (horas > 3 && horas <= 24) {
            precio = (3 * 20) + ((horas - 3) * 15);
            if (horas == 24) {
                precio = 250;
            }
        } else if (horas > 24) {
            precio = ((int) (horas / 24)) * 250 + (horas % 24 * 15);
        }
        return precio;
    }
}
