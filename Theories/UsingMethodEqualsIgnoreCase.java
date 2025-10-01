public class UsingMethodEqualsIgnoreCase {
    public static void main(String[] args) {
        String word1 = "Java";
        String word2 = "java";

        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("As strings são iguais!");
        } else {
            System.out.println("As strings são diferentes.");
        }
    }
}

/*
 * Explição:
 * 
 * >> O método equalsignoreCase é um método da classe String em Java que compara duas strings ignorando a diferença entre a diferença * entre maiúsculas e minúsculas.
 * 
 * Sintaxe:
 * 
 * boolean result = string1.equalsIgnoreCase(string2);
 * 
 * >> Retorna 'true' se duas strings forem iguais, ignorando minúsculas e maiúsculas.
 * 
 * >> Retorna 'false' caso contrário
 * 
 * Saída:
 * 
 * As strings são iguais!
 * 
 * >> Isso acontece porque equalsIgnoreCase considera "Java" e "java" como iguais, mesmo que a primeira tenha uma letra maiúscula e segunda não.
 */
