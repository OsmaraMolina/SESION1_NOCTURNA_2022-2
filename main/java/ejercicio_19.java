/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class ejercicio_19 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, 1, 1);
        int mes = date.getMonthValue();
        int dia = date.getDayOfMonth();
        int mesIn;
        int diaIn;

        mesIn = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes:"));
        diaIn = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia:"));

        LocalDate dateIn = LocalDate.of(2014, mesIn, diaIn);

        Period periodo = Period.between(date, dateIn);
        int dias = periodo.getDays();
        int meses = periodo.getMonths();

        System.out.println(date + "\n" + dateIn);
        System.out.println("Han pasado: " + meses + " meses y " + dias + " dias");
    }

}
