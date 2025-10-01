public class ExempleArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Primeiro elemento: " + numbers[0]); //[0]10
        System.out.println("Ultimo elemento: " + numbers[4]); //[4]50

        //Modificando um elemento
        numbers[2] = 99;
        System.out.println("Novo terceiro elemento: " + numbers[2]); //[2]99
    }
}
