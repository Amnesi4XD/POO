import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a forma geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Triangulo");
        System.out.println("3. Quadrado");
        System.out.println("4. Retângulo");
        System.out.print("5. Sair ");

        int escolha = scanner.nextInt();

        while (escolha != 5)
        {
            
        switch (escolha) {
            case 1:
                System.out.print("Informe o raio do Círculo: ");
                double raio = scanner.nextDouble();
                Circulo circulo = new Circulo(raio);
                circulo.ImprimeCirculo();
                break;
            case 2:
                System.out.print("Informe a base do Triângulo: ");
                double base = scanner.nextDouble();
                System.out.print("Informe a altura do Triângulo: ");
                double altura = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(base, altura);
                break;
            case 3:
                System.out.print("Informe o lado do Quadrado: ");
                double lado = scanner.nextDouble();
                Quadrado quadrado = new Quadrado(lado);
                break;  
            case 4:
                System.out.print("Informe a base do Retângulo: ");
                base = scanner.nextDouble();
                System.out.print("Informe a altura do Retângulo: ");
                altura = scanner.nextDouble();  
                Retangulo retangulo = new Retangulo(base, altura);
                break;


            default:
                System.out.println("Escolha inválida.");
                System.exit(1);
        }
    }


        scanner.close();
    }
}
