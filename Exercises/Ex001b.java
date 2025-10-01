import java.util.Scanner;

public class Ex001b {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Leitura dos valors.
            System.out.print("Digite o númerador: ");
            int numerator = scanner.nextInt();

            System.out.print("Digite o denominador: ");
            int denominator = scanner.nextInt();

            //Verifica se o denominador é zero para evitar erro.
            if (denominator == 0) {
                System.out.println("Erro: por favor, digite um valor diferente de zero.");
            } else {
                //Cálculo da divisão normal e da divisão com resto.
                double normalDivision = (double) numerator/ denominator;
                int quotient = numerator / denominator;
                int rest = numerator % denominator;

                //Exibição dos resultados.
                System.out.println("Divisão: " + normalDivision);
                System.out.println("resto: " + rest);
                System.out.println("Quociente: " + quotient);
            }
            scanner.close();
        }
    }
    