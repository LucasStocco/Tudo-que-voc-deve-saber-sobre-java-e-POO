import java.util.Scanner;

public class Ex002_RespondendoUsuario {
    public static void main(String[] args) {
        // Criando o objeto scanner para capturar a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome aqui: ");
        String nome = scanner.nextLine();
        System.out.printf("Seja bem vindo! " + nome);
    }
}
