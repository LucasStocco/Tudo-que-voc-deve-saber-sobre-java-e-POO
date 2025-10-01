public class LoopDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Número: " + i);
            i++; //Incrementa para evitar loop infinito
        } while (i <= 5);
    }
}

//Explicação:

//O loop do-while é semelhante ao while, mas a diferença é que a condição é verificada após a execução do bloco de código. Isso garante que o código será executado pelo menos uma vez, mesmo que a condição seja falsa na primeira vez.