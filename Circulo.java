//subclase 1
public class Circulo extends Formas {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Circulo");
    }

    public double calcularRadio() {
        return radio;
    }
}
