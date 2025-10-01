import java.util.Arrays;
public class ArrayFilling {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Arrays.fill(numbers, 7); //Preenche todo o vetor com o valor 7
        System.out.println("Vetor preenchido: " + Arrays.toString(numbers));
    }
}
