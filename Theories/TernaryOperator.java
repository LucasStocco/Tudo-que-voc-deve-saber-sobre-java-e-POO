public class TernaryOperator {
    public static void main(String[] args) {
        int number = 10;
        String result = (number % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("O número é " + result);
    }
}

/* Explicação
* Os operadores ternários em Java são uma forma concisa de expressar estruturas condicionais simples. O operador ternário é representado 
* pelo símbolo ? : e funciona como um atalho para a instrução if-else.
* 
* Sintaxe:
*
* variavel = (condicao) ? valor_se_verdadeiro : valor_se_falso; *condicao → Uma expressão booleana (true ou false).
* valor_se_verdadeiro → O valor atribuído à variável caso a condição seja verdadeira. * valor_se_falso → O valor atribuído à variável caso a condição seja falsa.
*  Vantagens
*  Código mais curto e legível para expressões simples.  *  Redução do uso de if-else quando apenas uma atribuição está envolvida.
*  Limitações  *  Pode reduzir a clareza do código se usado de forma excessiva ou com expressões muito complexas.
*  Difícil de depurar em casos onde múltiplas expressões são encadeadas.
*  O operador ternário é uma ferramenta útil quando usado com moderação e para expressões simples.
*/