public class Retangulo {

    public Retangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }
    
        double base;
        double altura;
    
        public double calcularArea()
        {
            return base * altura;
        }
    
        public double calcularPerimetro()
        {
            return 2 * (base + altura);
        }
    
}
