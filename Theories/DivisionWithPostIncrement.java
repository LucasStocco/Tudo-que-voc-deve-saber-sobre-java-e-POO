public class DivisionWithPostIncrement {
    public static void mian(String[] args) {
        int numerator = 10;
        int denominator = 3;

        //Pós-incremento: o incremento acontece depois de usar a variável
        int quotiente = numerator++ / denominator;
        int rest = numerator % denominator;

        //Exibindo  o resultado
        System.out.println("Divisão com pós-incremento: " + quotiente + " R " + rest);
    }
}

/* Resumo das Diferenças:
 * 
 * >> Pré-Incremento (++numerator): O incremento acontece antes de usar a variável na operação. Isso afeta diretamente o resultado da operação, já que o valor da variável é alterado antes de ser usado.
 * 
 * >> Pós-Incremento (numerador++): O incremento acontece depois de usar o valor na operação. A variável mantém seu valor original durante a operação, e só incrementada depois que a operação é concluída
 */

 /* Explicação do Pós-Incremento:
 * 
 * >> No pós-incremento (numerator++), o valor de numerador é usado primeiro na operação de divisão e depois é incrementado.*
 *  
 * >> O numerador original era 10, então a divisão será feita como 10 / 3, resultando em 3 de quociente e 1 de resto.
 * 
 * >> Após a divisão, o valor de numerador é incrementado, passando de 10 para 11. O resto é calculado com o valor de numerador (11 % 3), resultando em 2. 
 * 
 * Saída:
 * 
 * Divisão com pós-incremento 3 R: 2
 */
