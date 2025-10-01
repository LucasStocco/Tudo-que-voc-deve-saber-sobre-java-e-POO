//Exemplo de perda de dados
public class ExplicitCastingLoss {
    public static void main(String[] main) {
        long numLong = 10000000000l; //Um valor grande para long
        int numWhole = (int) numLong; //Casting explícito (long para int)
        System.out.println("Valor inteiro após o casting: " + numWhole);
    }
}

//Explicação:

//O valor de 10000000000l é muito grande para um int, que pode armazenar valores entre -2^31 e 2^31-1 (Aprpximadamente de -2 bi a 2bi.) Como o valor ultrapassa o limite do int, ocorre um overflow e o valor se torna negativo.
