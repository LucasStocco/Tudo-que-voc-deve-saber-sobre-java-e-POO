import java.util.*;

public class Ex003_AddingTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lendo o primeiro número
        System.out.print("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        // Lendo o segundo número
        System.out.print("Digite outro número: ");
        int n2 = scanner.nextInt();
        int sun = n1 + n2;
        System.out.printf(">> A soma dos números " + n1 + " e " + n2 + " é igual á: " + sun);
    }   
}
