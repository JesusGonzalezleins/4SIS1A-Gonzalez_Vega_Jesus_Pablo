
import java.util.InputMismatchException;
import java.util.Scanner;

class AreaPerimetro {
    
    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }
}

class rectangulo extends AreaPerimetro {
    private double longitud;
    private double ancho;

    public rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return longitud * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }
}

class circulo extends AreaPerimetro {
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class triangulo extends AreaPerimetro {
    private double base;
    private double altura;

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    public double calcularPerimetro() {
        // Los triángulos no tienen perímetro en esta implementación
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            try {
                System.out.println("Seleccione una figura geométrica:");
                System.out.println("1. Rectángulo");
                System.out.println("2. Círculo");
                System.out.println("3. Triángulo");
                int opcion = entrada.nextInt();

                if (opcion == 1) {
                    System.out.print("Ingrese la longitud del rectángulo: ");
                    double longitud = entrada.nextDouble();
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = entrada.nextDouble();

                    rectangulo rectangulo = new rectangulo(longitud, ancho);
                    System.out.println("Área: " + rectangulo.calcularArea());
                    System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
                } else if (opcion == 2) {
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = entrada.nextDouble();

                    circulo circulo = new circulo(radio);
                    System.out.println("Área: " + circulo.calcularArea());
                    System.out.println("Perímetro: " + circulo.calcularPerimetro());
                } else if (opcion == 3) {
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = entrada.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = entrada.nextDouble();

                    triangulo triangulo = new triangulo(base, altura);
                    System.out.println("Área: " + triangulo.calcularArea());
                    System.out.println("Perímetro: " + triangulo.calcularPerimetro());
                } else {
                    System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, introduzca un número válido.");
            }
        }
    }
}