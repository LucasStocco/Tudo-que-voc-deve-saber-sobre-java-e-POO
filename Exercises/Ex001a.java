import java.util.Scanner;
public class Ex001a {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 

        System.out.print("Digite o nome do aluno(a): ");
        String nome = teclado.nextLine(); //Lê o nome
        
        System.out.print("Digite a nota do aluno(a): ");
        float nota = teclado.nextFloat(); //Lê a nota
        
        //System.out.println("A nota é: " + nota);
        //>> Dica: para escrever o comando de print de forma fácil, use: sout + enter/tab.

        //>> De forma formatada (printf):
        System.out.printf("A nota de %s é %.2f",  nome, nota);
        /*
         * A nota se encaixa no %f, se você colocar %.2f terá duas casas decimais.
         * '\n' quebra a linha.
         * %s para Strings.
         */
        

        /*
         * Usando o .format(): 
         * System.out.format("Sua nota é %.2f", nota);
        ----------------------------------------------------- 
        Algusn métodos para leitura de tipos primitivos:

         >> int idade = teclado.nextInt();
         >> float salario = teclado.nextFloat();
         >> String nome = teclado.nextLine();
         */   
    }
}
