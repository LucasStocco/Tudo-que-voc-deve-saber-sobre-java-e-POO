public class LoopWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Número: " + i);
            i++; //Incrementa para evitar loop infinito
        }
    }
}

//Explicação:

//O loop while é utilizado quando você deseja que o código seja repetido enquanto uma condição for verdadeira. A condição é verificada antes de cada iteração, o que significa que, se a condição for falsa logo de início, o loop pode não ser exectato.
