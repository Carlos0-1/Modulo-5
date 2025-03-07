
import java.util.Scanner;

// Clase principal para probar la herencia
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("\n--- Menu de Formas ---");
                System.out.println("1. Dibujar un Circulo");
                System.out.println("2. Dibujar un Cuadrado");
                System.out.println("3. Dibujar un Triangulo");
                System.out.println("4. Dibujar una Linea");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el radio del circulo: ");
                        double radio = scanner.nextDouble();
                        Circulo circulo = new Circulo(radio);
                        circulo.dibujar();
                        System.out.println("Radio: " + circulo.calcularRadio());
                    }
                    
                    case 2 -> {
                        System.out.print("Ingrese el lado del cuadrado: ");
                        double lado = scanner.nextDouble();
                        Cuadrado cuadrado = new Cuadrado(lado);
                        cuadrado.dibujar();
                        System.out.println("Area: " + cuadrado.calcularArea());
                    }
                    
                    case 3 -> {
                        System.out.print("Ingrese el angulo del triangulo: ");
                        double angulo = scanner.nextDouble();
                        System.out.print("Ingrese la base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingrese la altura: ");
                        double altura = scanner.nextDouble();
                        Triangulo triangulo = new Triangulo(angulo);
                        triangulo.dibujar();
                        System.out.println("Area: " + triangulo.calcularArea(base, altura));
                    }
                    
                    case 4 -> {
                        System.out.print("Ingrese el largo de la linea: ");
                        double largo = scanner.nextDouble();
                        Linea linea = new Linea(largo);
                        linea.dibujar();
                        System.out.println("Largo: " + linea.getLargo());
                    }
                    
                    case 5 -> System.out.println("Saliendo del programa...");
                    
                    default -> System.out.println("Opcion invalida, intente de nuevo.");
                }
            } while (opcion != 5);
        }
    }
}
