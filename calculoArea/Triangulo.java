public class Triangulo {

    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }
    
        double base;
        double altura;
    
        public double calcularArea()
        {
            return (base * altura) / 2;
        }
    
        public double calcularPerimetro()
        {
            return base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        }
    
}