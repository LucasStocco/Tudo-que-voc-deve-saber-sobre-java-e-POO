import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita a entrada do usuário
        System.out.println("Digite um numero (1-3): ");
        int option = scanner.nextInt();

        //Estrutura switch case
        switch(option) {
            case 1:
                System.out.println("Voce digitou o numero 1.");
                break;
            case 2:
                System.out.println("Voce digitou o numero 2.");
                break;
            case 3:
                System.out.println("Voce digitou o numero 3.");
                break;
            default:
                System.out.println("Opção incaclida! Escolha um  numero entre 1 e 3.");
        }
        scanner.close();
    }
}
// Explicação: 

// 1. Usa-se Scanner para ler a entrada do usuário

// 2. O Switch avalia o valor da variável opcao e executa o caso correspondente.

// 3. O break evita que os próximos cases sejam executados após encontrar uma correspondência.

// 4. O default trata valores inválidos.

// 5. O scanner.close(); fecha o scanner para evitar vazamento de recursos. (Ocorre quando um programa aloca algo, como memória ou conexões, e não libera corretamente.)
