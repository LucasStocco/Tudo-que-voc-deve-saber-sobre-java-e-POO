import java.util.Scanner;

public class Ex005_PredecessorAndSuccessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número qualquer: ");
        int number = scanner.nextInt();
        int predecessor = number - 1;
        int successor = number + 1;
        System.out.println(">> O Sucessor de " + number + " é: " + successor);
        System.out.println(">> O Antecessor de " + number + " é: " + predecessor);
        scanner.close();
    }
}
/*🧠 Explicação:

🎯 Objetivo:
>> Faça um programa que leia um número inteiro e mostre na tela o seu sucessor e antecessor. 

📋 Descrição:
>> Lê um número int e mostra o seu antecessor e sucessor.

▶️ Como Funciona:
>> Lê um número int

>> Calcula o antecessor (numero - 1)

>> Calcula o sucessor (numero + 1)

>> Exibe os resultados
 */
