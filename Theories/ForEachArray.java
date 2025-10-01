public class ForEachArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        //O for-each percorre a array sem precissar de índices
        for(int number:numbers) {
            System.out.println("Numero: " + number);
        }
    }
}
