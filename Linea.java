// Subclase 3
public class Linea extends Formas {
    private final double largo;

    public Linea(double largo) {
        this.largo = largo; 
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una Linea de largo: " + largo);
    }

    public double getLargo() {
        return largo;
    }
}
