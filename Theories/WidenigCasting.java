public class WidenigCasting { //Conversão automática(int = double)
    public static void main(String[] args) {
        int numint = 10; //Variável do tipo int
        double numDouble = numint; //Conversão implícita de int para double
        System.out.println("Valor inteiro: " + numint);
        System.out.println("Valor convertido para double: " + numDouble);
    }
}