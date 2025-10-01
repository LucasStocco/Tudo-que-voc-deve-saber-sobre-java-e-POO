import java.util.Scanner;

public class Ex007_ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double grade1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double grade2 = scanner.nextDouble();

        double avarege = (grade1 + grade2) / 2;
        System.out.println("A média final é igual a: " + avarege);

        scanner.close();
    }
}
/*🧠 Explicação:

🎯 Objetivo:
>> Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre sua média.

📋 Descrição:
>> Programa simples para calcular a média aritmetica de um aluno lendo dois valores double

▶️ Como Funciona:
>> Lê as notas digitadas pelo usuário

>> Calcula a média

>> Retorna a média final
 */
