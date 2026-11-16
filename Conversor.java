package modelo;

public class Conversor {

    public double pesos;
    public double tasaCambio; 
    public Conversor() {
    }
    public Conversor(double pesos, double tasaCambio) {
        this.pesos = pesos;
        this.tasaCambio = tasaCambio;
    }
    public double getPesos() {
        return pesos;
    }
    public void setPesos(double pesos) {
        this.pesos = pesos;
    }
    public double getTasaCambio() {
        return tasaCambio;
    }
    public void setTasaCambio(double tasaCambio) {
        this.tasaCambio = tasaCambio;
    }
    public double convertirADolares() {
        return pesos / tasaCambio;
    }
}