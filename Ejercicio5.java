package vista;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        double diagonalMayor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la diagonal mayor"));
        double diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la diagonal menor"));
        double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el lado"));

        double area = (diagonalMayor * diagonalMenor) / 2;
        double perimetro = 4 * lado;

        System.out.println("El área es: " + area);
        System.out.println("El perímetro es: " + perimetro);
    }
}
