package modelo;

public class Familia {
    
    public int edadMadre;
    public int edadHijo;
    public Familia() {
    }
    public Familia(int edadMadre, int edadHijo) {
        this.edadMadre = edadMadre;
        this.edadHijo = edadHijo;
    }
    public int getEdadMadre() {
        return edadMadre;
    }
    public void setEdadMadre(int edadMadre) {
        this.edadMadre = edadMadre;
    }
    public int getEdadHijo() {
        return edadHijo;
    }
    public void setEdadHijo(int edadHijo) {
        this.edadHijo = edadHijo;
    }
    public int calcularEdadAlParto() {
        return edadMadre - edadHijo;
    }
}
