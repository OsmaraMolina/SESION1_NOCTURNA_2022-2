/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class ejercicio_14 {

   public static void main(String[] args) {

        int segundos = 0;
        int minutos = 0;
        int horas = 0;
        int horasSegundos = 0;
        int minutosSegundos = 0;

        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas:"));
        minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos:"));
        horasSegundos = horas * 3600;
        minutosSegundos = minutos * 60;
        segundos = horasSegundos + minutosSegundos;
        JOptionPane.showMessageDialog(null, "El resultado en segundos es: " + segundos);
    }
}
