import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao, x = 0, y = 0, z = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        x = scanner.nextInt();
        System.out.print("Digite o valor de y: ");
        y = scanner.nextInt();
        System.out.println("1 Para Adição");
        System.out.println("2 Para Subtração");
        System.out.println("3 Para Divisão");
        System.out.println("4 Para Multiplicação");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                z = x + y;
                System.out.printf("Sua Adição foi: %d\n", z);
                break;
            case 2:
                z = x - y;
                System.out.printf("Sua Subtração foi: %d\n", z);
                break;
            case 3:
                if (y != 0) {
                    z = x / y;
                    System.out.printf("Sua Divisão foi: %d\n", z);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            case 4:
                z = x * y;
                System.out.printf("Sua Multiplicação foi: %d\n", z);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        scanner.close();
    }
}
