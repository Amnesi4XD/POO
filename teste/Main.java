public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(10, 15);
        Triangulo triangulo = new Triangulo(8, 10);

        System.out.println("Circulo:");
        System.out.println("Area do circulo: " + circulo.calcularArea());
        System.out.println("Perimetro do circulo: " + circulo.calcularPerimetro());
        System.out.println("Quadrado:");
        System.out.println("Area do quadrado: " + quadrado.calcularArea());
        System.out.println("Perimetro do quadrado: " + quadrado.calcularPerimetro());
        System.out.println("Retangulo:");
        System.out.println("Area do retangulo: " + retangulo.calcularArea());
        System.out.println("Perimetro do retangulo: " + retangulo.calcularPerimetro());
        System.out.println("Triangulo:");
        System.out.println("Area do triangulo: " + triangulo.calcularArea());
        System.out.println("Perimetro do triangulo: " + triangulo.calcularPerimetro());
    }

}
