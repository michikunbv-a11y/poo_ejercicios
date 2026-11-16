package modelo;

public class Rombo {

    public double diagonalMayor;
    public double diagonalMenor;
    public double lado;
    public Rombo() {
    }
    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }
    public double getDiagonalMayor() {
        return diagonalMayor;
    }
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
    public double getDiagonalMenor() {
        return diagonalMenor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
