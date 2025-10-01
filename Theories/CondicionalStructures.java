import java.util.Scanner;

public class CondicionalStructures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = scanner.nextInt();

        if (number > 10) {
            System.out.println("--A primeira condicao e verdadeira, o numero e maior que 10.");
        } else if (number > 5) {
            System.out.println("--A segunda condicao: e verdadeira, o numero e maior que 5, mas menor ou igua a 10.");
        } else {
            System.out.println("--Nenhuma condicao e verdadeira, o numero é menor que 5.");
        }
        scanner.close();
    }
}
