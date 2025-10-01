import java.util.*;

public class Ex004_DissectingVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String input = scanner.nextLine();

        // Verifica se é um char, e então faz a conversão
        if (input.length() == 1) {
            // Se passar no teste, convertemos com o seguinte comando
            System.out.println("Você digitou um caractere: '" + input.charAt(0) + "'");
        // verifica se é um int, e então faz a conversão
        } else if (typeInt(input)) {

            // Se passar no teste, convertemos com o seguinte comando
            int valor = Integer.parseInt(input);

            System.out.println("Você digitou um número inteiro: " + valor);
        // Verifica se é um double, e então faz a conversão
        } else if (typeDouble(input)) {

            // Se passar no teste, convertemos com o seguite comando
            double valor = Double.parseDouble(input);
            System.out.println("Você digitou um número decimal: " + valor);
        // Verifica se é um boolean
        } else if (typeBoolean(input)) {

            // Se passar no teste, convertemos com o seguinte comando
            boolean valor = Boolean.parseBoolean(input);

            System.out.println("Você digitou um booleano: " + valor);
        } else {
            // Se não passou em nenhum dos outros testes, só pode ser uma string
            System.out.println("Você digitou uma String: \"" + input + "\"");
        }

        scanner.close();
    }
    // Métodos Auxiliares

    // Tenta converter para Int
    private static boolean typeInt(String str) {
        // Tenta converter a String para int
        try {   
            Integer.parseInt(str);
            // Se conseguir, retorna true
            return true;
        } catch(NumberFormatException e) {
            // Se der erro, retorna false
            return false;
        }
    }
    // Tenta converter para Double
    private static boolean typeDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    // Tenta converter para Boolean
    private static boolean typeBoolean(String str) {
        return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false");
    }
}

