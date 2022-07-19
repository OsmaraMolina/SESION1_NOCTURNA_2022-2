/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio_18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double kilogramos;
        double libras;
        double estatura;
        double metros;
        double imc;
        String clasificacion = "";

        System.out.print("Ingrese su peso en libras: ");
        libras = in.nextDouble();
        in.nextLine();

        System.out.print("Ingrese Su estatura en centimetros: ");
        estatura = in.nextInt();
        in.nextLine();

        metros = estatura * 0.01;
        kilogramos = libras * 0.453;

        System.out.println("Valor en KG es: " + kilogramos);

        imc = kilogramos / Math.pow(metros, 2);

        if (imc < 16) {
            clasificacion = "Criterio de ingreso";
        } else if (imc >= 16 && imc <= 16.9) {
            clasificacion = "Infrapeso";
        } else if (imc >= 17 && imc <= 18.4) {
            clasificacion = "Bajo Peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            clasificacion = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            clasificacion = "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            clasificacion = "Obesidad pre-mórbida";
        } else if (imc >= 45) {
            clasificacion = "obesidad híper-mórbida.";
        }

        System.out.println("\nTu índice de masa corporal es (IMC): " + imc);
        System.out.println("Atendiendo al IMC, tiene: " + clasificacion);

    }
}
