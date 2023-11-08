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