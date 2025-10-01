public class ExempleContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Pula a iteração quando i é 3
            }
            System.out.println("Número: " + i);
        }
    }
}
