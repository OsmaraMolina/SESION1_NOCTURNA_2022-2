/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ejercicio_21 {
public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double Montocompra;
        double Desc = 0.020;
        double Totalp;

        System.out.print("Ingrese el monto de su compra : ");
        Montocompra = in.nextDouble();
        in.nextLine();

        Desc = Montocompra * 0.020;
        Totalp= Montocompra-Desc;
        
        if (Montocompra <= 999) {
            System.out.println("No existe Descuento");
            System.out.println("Su total a pagar es de: "+Montocompra+"$");
        } else if (Montocompra >= 1000) {
            System.out.println("Su descuento del 20% es de: "+Desc +"$");
             System.out.println("El total a pagar es de: "+Totalp);
        }
    }
}
