//Exemplo:
public class ExplicitCasting {
    public static void main(String[] args) {
        double numDouble = 9.69;
        int numWhole = (int) numDouble; //Casting explícito (double para int)
        System.out.println("Valor inteiro: " + numWhole);
    }
}

//Explicação: O valor de 9.69 foi convertido para 9 (inteiro) ao fazer o casting explícito de double para int. Nesse caso, a parte decimal foi descartada, pois o int não pode armazenar números decimais.
