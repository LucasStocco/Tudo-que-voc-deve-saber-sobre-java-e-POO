//Exemplo com break:
public class BreakExemple {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; //Interrompe o loop quando o 'i' é 5.
            }
            System.out.println("Número:" + i);
        }
    }
}

//Explicação:

//A instrução break é usada para sair de um loop antes que sua condição seja falsa. Isso é útil quando você precisa interromper o loop com base em uma condição interna.
