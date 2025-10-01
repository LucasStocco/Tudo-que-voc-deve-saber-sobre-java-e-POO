//Exemplo:
public class ImplicitCasting {
    public static void main(String[] args) {
        int numWhole = 100;
        long numLong = numWhole; //Casting implícito (inteiro para long)
        System.out.println("Valor long: " + numLong);
    }
}
//Explicação:
//O valor de int foi automaticamente convertido para long sem precisar de uma conversão explícita. Pois o tipo long é mais amplo que o int e pode armazenar todos os valores possíveis de um int.
