public class DivisionWithPreIncrement {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 3;

        //Pós-incremento: o incremento acontece depois de usar a variável
        int quotiente = numerator++ / denominator;
        int rest = numerator % denominator;

        //Exibindo o resutado
        System.out.println("Divião com pós-incremento: " + quotiente  + " R: " + rest);
    }   
} 

/* Resumo das Diferenças:
 * 
 * >> Pré-Incremento (++numerator): O incremento acontece antes de usar a variável na operação. Isso afeta diretamente o resultado da operação, já que o valor da variável é alterado antes de ser usado.
 * 
 * >> Pós-Incremento (numerador++): O incremento acontece depois de usar o valor na operação. A variável mantém seu valor original durante a operação, e só incrementada depois que a operação é concluída
 */

/*  Explicação do Pré-Incremento: 
 *
 * >> No pré-incremento (++numerator), o valor de numerator é incrementado antes de ser usado na divisão.
 * 
 * >> O numerator original era 10, mas ao fazer ++numerator, ele se torna 11 antes de ser usado na operação.
 * 
 * >> Assim, a divisão será feita como 11 / 3, resultando em 3 de quotiente e 2 de rest.
 * 
 * Saída:
 * 
 * Divisão com pré-incremento 3 R: 2
 * 
 */
