public class ChainedCompoundConditionalStructures {
    public static void main(String[] args) {
        int grade = 85;

        if(grade >= 90) {
            System.out.println("Parabéns! Você foi aprovado com excelência.");
        } else if(grade >= 70) {
            System.out.println("Aprovado!");
        } else if(grade >= 50) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}

/*Como funciona?
 * 
 * 1. O código verifica se a primeira condição(grade >= 90). Se for verdadeira ele executa o bloco, ou seja, vai retornar o print da mensagem.
 * 
 * 2. Se for falsa, ele vai verificar a segunda condição(grade >= 70), e assim por diante.
 * 
 * 3. Se nenhuma condição for atendida, o bloco else será executado.
 */
