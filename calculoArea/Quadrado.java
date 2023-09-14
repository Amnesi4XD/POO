public class Quadrado {

    public Quadrado(double lado)
    {
        this.lado = lado;
    }

    double lado;

    public double calcularArea()
    {
        return Math.pow(lado, 2);
    }

    public double calcularPerimetro()
    {
        return 4 * lado;
    }
    
}
