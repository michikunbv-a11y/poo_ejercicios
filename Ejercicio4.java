package vista;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio"));

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área es: " + area);
        System.out.println("El perímetro es: " + perimetro);
    }
}