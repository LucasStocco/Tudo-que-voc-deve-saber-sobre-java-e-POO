import java.util.Scanner;
import java.util.Locale;

public class ConversorDolarReal {
    public static void main(String[] args) {
        // Garante que o ponto seja usado como separador decimal
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        // Leitura do valor em dólar e da cotação
        double valor = scanner.nextDouble();
        double cot = scanner.nextDouble();

        // Conversão
        double resultado = valor * cot;

        // Saída formatada com duas casas decimais
        System.out.printf("Equivale a R$ %.2f\n", resultado);

        scanner.close();
    }
}
