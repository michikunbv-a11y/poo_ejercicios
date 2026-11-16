package vista;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        int edadMadre = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la madre"));
        int edadHijo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del hijo"));

        int diferencia = edadMadre - edadHijo;

        System.out.println("La madre tenía " + diferencia + " años cuando dio a luz");
    }
}