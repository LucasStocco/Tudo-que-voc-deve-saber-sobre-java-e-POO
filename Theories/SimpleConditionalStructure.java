import java.util.Scanner;

public class SimpleConditionalStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade:");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Legal! Você já pode dirigir");
        } else {
            System.out.println("Que pena, você não pode dirigir.");
        }
        scanner.close();
    }
}
/*Explicações:
 * 
 * 1.Scanner: 
 * >> O código começa criando um objeto Scanner para capturar a entrada do usuário(a idade no caso).
 * 
 * 2.Leitura da idade:
 * >> O programa solicita que o usuário digite sua idade com a função System.out.print. A idade é armazenada em uma variável 'age'.
 * 
 * 3.Estrutura condicional (if):
 * >> O código verifica se a idade do usuário é igual ou maior a 18 usando a expressão age >= 18.
 * >> Se for verdadeiro, o programa exibe a mensagem "Legal! Você pode dirigir."
 * >> Se for falso, exibe "Que pena, você não pode dirigir"
 * 
 * 4.Fechamento do Scanner:
 * >> Após a execução, p Scanner é fechado com scaenner.close para liberar os recursos e evitar vazamentos de dados.
 */
