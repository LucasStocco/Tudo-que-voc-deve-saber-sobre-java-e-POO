import java.util.Scanner;
import java.math.*;

public class Ex006_DoubleTripleAndSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número qualquer: ");
        int number = scanner.nextInt();

        int Double= number * 2;
        int triple = number * 3;
        double squareRoot = Math.sqrt(number);

        System.out.println(">> O dobro de " + number + " é: " + Double);
        System.out.println(">> O triplo de " + number + " é: " + triple);
        System.out.println(">> A raiz quadrado de " + number + " é: " + squareRoot);

        scanner.close();
    }
}
/*🧠 Explicação:

🎯 Objetivo:
>> Crie um algoritmo que leia um número e mostre na tela o seu dobro, triplo e raiz quadrada.

📋 Descrição:
>> Lê um número int e retorna o seu dobro, triplo e calcula sua raiz quadrada

▶️ Como Funciona:
>> Lê um número int

>> Calcula o seu dobro (number * 2)

>> Calcula o seu triplo (number * 3)

>> Calcula a sua raiz quadrada usando função 'Math.sqrt()' (Obs: retorna sempre um double)
 */
