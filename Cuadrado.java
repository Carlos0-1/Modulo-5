// Subclase 2
public class Cuadrado extends Formas {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Cuadrado");
    }

    public double calcularArea() {
        return lado * lado;
    }
}
