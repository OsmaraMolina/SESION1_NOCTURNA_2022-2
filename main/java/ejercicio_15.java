/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ejercicio_15 {

    
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int segundos, minutos, horas;

        System.out.print("MOSTRAR LA CANTIDAD DE HORAS Y MINUTOS.\n\n");
        System.out.print("Ingrese una cantidad en segundos : ");
        segundos = Integer.parseInt(ingreso.next());
        horas = segundos / 3600;
        minutos = segundos / 60;
        System.out.println("EN HORAS : " + horas);
        System.out.println("EN MINUTOS : " + minutos);
    }
}
