//Exemplo com Array
public class LoopForEach {
    public static void main(String[] args) {
        String[] fruits = {"Maçã", "Banana", "Laranja"};
        for (String fruit : fruits) {
            System.out.println("Fruta: " + fruit);
        }
    }
}

//Explicação:

//O for-each é uma versão simplificada do loop for e é utilizado para percorrer elementos de arrays ou coleções(como ArrayList, Hashset, etc...). Ele não exige o uso de um índice e torna o código mais legível.
