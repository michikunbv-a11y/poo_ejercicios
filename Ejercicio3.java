package vista;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los pesos colombianos"));
        double tasa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cuántos pesos vale 1 dólar"));

        double dolares = pesos / tasa;

        System.out.println(pesos + " pesos son " + dolares + " dólares");
    }
}