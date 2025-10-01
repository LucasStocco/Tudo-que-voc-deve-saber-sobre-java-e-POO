public class UsingMethodCompareTo {
    public static void main(String[] args) {
        String word1 = "Maçã";
        String word2 = "Banana";

        int result = word1.compareTo(word2);

        if (result < 0) {
            System.out.println(word1 + " Vem antes de " + word2);
        } else if (result > 0) {
            System.out.println(word1 + " vem depois de " + word2);
        } else {
            System.out.println("As palavras são iguis.");
        }
    }
}

/*
 * Explicação:
 * 
 * >> Se compareTo retornar um número negativo, significa que a word1 vem antes de word2
 * 
 * >> Se retornar um número positivo, word1 vem antes de word2
*/