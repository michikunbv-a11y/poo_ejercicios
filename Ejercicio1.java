package vista;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la primera calificación"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la segunda calificación"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tercera calificación"));

        double promedio = (n1 + n2 + n3) / 3;

        System.out.println("El promedio es: " + promedio);
    }
}