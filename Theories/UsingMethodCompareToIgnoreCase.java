public class UsingMethodCompareToIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "word";

        //Comparação ignorando maiúsculas e minúsculas
        int result1 = str1.compareToIgnoreCase(str2);
        int result2 = str1.compareToIgnoreCase(str3);
        int resulr3 = str3.compareToIgnoreCase(str1);

        //Exibindo os resultados
        System.out.println("Comparando 'Hello' e 'hello': " + result1);
        System.out.println("Comparando 'Hello' e 'word': " + result2);
        System.out.println("Comparando 'word' e 'Hello': " + resulr3);
    }
}
/*
 * Explicação: 
 * 
 * O método compareToIgnoreCase(String str) compara duas strings lexicograficamente, ignorando diferenças entre autoridades e ministerias. Ele retorna:
 * 
 * >> 0 se as strings forem iguais (ignorando autoridades e minúsculas).
 * 
 * >> Um valor negativo se a primeira string for menor que a segunda.
 * 
 * >> Um valor positivo se a primeira string para maior que a segunda. 
 */