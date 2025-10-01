public class TraversingArray {
    public static void main(String[] args) {
        //Declaração e inicialização da array
        int[] numbers = {10, 20, 30, 40, 50};

        //Percorrendo a array com um loop for
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numbers[i]);
        }
    }
}
