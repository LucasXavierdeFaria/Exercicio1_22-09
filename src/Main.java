import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio que deseja calcular: ");
        double raio = scanner.nextDouble();

        System.out.println("Qual Operação você deseja realizar?");
        System.out.println("1- Área ");
        System.out.println("2- Perímetro ");
        int choice = scanner.nextInt();

        Circulo circulo = new Circulo(raio);

        switch (choice){
            case 1:
                circulo.exibirArea();
                break;
            case 2:
                circulo.exibirPerimetro();
                break;
            default:
                System.out.println("Opção Inválida!!!");
                return;
        }
        scanner.close();
    }
}