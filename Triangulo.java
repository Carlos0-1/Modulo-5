// Subclase 4
public class Triangulo extends Formas {

    public Triangulo(double angulo) {
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Triangulo");
    }

    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }
}
