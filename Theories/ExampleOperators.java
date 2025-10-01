import java.util.Scanner;

public class ExampleOperators {
    public static void main(String[] args){

        //Criando o objeto Scanner para ler os dados do usuário.
        Scanner scanner = new Scanner(System.in);
        
        //Solicitando ao usuário para inserir dois números
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        //Operadores Aritméticos
        int sum = a + b;            //Adição
        int subtraction = a - b;    //Subtração
        int multiplication = a * b; //Multiplicação
        int division = a / b;       //Divião
        int module = a % b;         //Módulo (resto da divisão)

        //Exibindo os resultados aritméticos com formatação
        System.out.printf("Soma: %d\n", sum);
        System.out.printf("Subtração: %d\n", subtraction);
        System.out.printf("Multiplicação: %d\n", multiplication);
        System.out.printf("Divisão: %d\n", division);
        System.out.printf("Módulo: %d\n", module);

        //Operadores Relacionais
        boolean greaterThan  = a > b;         //Maior que 
        boolean gessThan = a < b;             //Menor que 
        boolean equal = a == b;               //Igual a
        boolean different = a != b;           //Diferente de
        boolean greaterThanOREqual = a >= b;  //Maior ou igual
        boolean lessThanOrEqual = a <= b;     //Menor ou igual

        //Exibindo os resultados relacionais com formatação
        System.out.printf("a > b: %b\n", greaterThan);
        System.out.printf("a < b: %b\n", gessThan);
        System.out.printf("a == b: %b\n", equal);
        System.out.printf("a != b: %b\n", different);
        System.out.printf("a >= b: %b\n", greaterThanOREqual);
        System.out.printf("a <= b: %b\n", lessThanOrEqual);

        //Operadores Lógicos
        boolean conditionOne = true;
        boolean conditionTwo = false;
        boolean andLogical = conditionOne && conditionTwo; //AND lógico
        boolean orLogical = conditionOne || conditionTwo;  //OR lógico
        boolean notLogical = !conditionOne;                //NOT lógico

        //Exibindo os resultados lógicos com formatação
        System.out.printf("condicao1 && condicao2: %b\n", andLogical);
        System.out.printf("condicao1 || condicao2: %b\n", orLogical);
        System.out.printf("!condicao: %b\n", notLogical);

        //Operadores de Atribuição
        int x = 10;
        x += 5; // x = x + 5
        x -= 3; // x = x - 3
        x *= 2; // x = x * 2
        x /= 4; // x = x / 4
        x %= 3; // x = x % 3

        //Exibindo os resultados da atribuição com formatação
        System.out.printf("Resultado da atribuição de x: %d\n", x);

        //Comparação de Strings
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = "Python";

        //Comparando se as strings são iguais
        boolean compareEqual = str1.equals(str3); //Comparação com equals()
        boolean compareDifferent = str1.equals(str2); //Comparação considerando maiúsculas/minúsculas
        boolean compareEqualIgnoreCase = str1.equalsIgnoreCase(str2); //Ignora diferença de maiúsculas/minúsculas

        //Comparação usando == (compara referências, não o conteúdo)
        boolean compareReference = (str1 == str3);

        //Exibindo os resultados das comparações de strings com formatação
        System.out.printf("str1 equals str3: %b\n", compareEqual); //True, pois as strings são iguais
        System.out.printf("str1 equals str2: %b\n", compareDifferent); //False, pois a diferença está na capitalização
        System.out.printf("str1 equalsIgnoreCase str2: %b\n", compareEqualIgnoreCase); //True, ignora a diferença de capitalização
        System.out.printf("str1 == str3: %b\n", compareReference); //True, pois ambas as referências apontam para o mesmo objeto "Java"
        System.out.printf("str1 == str4: %b\n", (str1 == str4)); //False, pois são referências diferentes
    }
}

/*Explicação:
 * 
 * 1.Leitura de números pelo usuário:
 * 
 * >> Usei o scanner para capturar os números inseridos pelo usuário. O nextInt() lê os números inteiros.
 * 
 * 2.Formatação da saída com o printf():
 * 
 * >> O método printf() permite formatar a saída de maneira mais controlada.a Aqui, o %d é usado para exibir números inteiros e %b é usado para exibir valores booleanos.
 * 
 * 3.Como funciona o printf():
 * 
 * >> O printf() permite especificar o tipo de dados a ser exibido. Por exemplo, %d é para inteiros, %b para booleanos, e assim por diante.
 * 
 * >> O \n é usado para adicionar uma quebra de linha após cada resultado.
 * 
 */
