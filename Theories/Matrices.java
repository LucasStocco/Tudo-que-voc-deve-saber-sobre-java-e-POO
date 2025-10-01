public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //Acessando um elemento/índice específico
        System.out.println("Elemento da posicao[1][2]: " + matriz[1][2]); //6

        //Percorrendo a matrix
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Obs:
// Um vetor de vetores (ou matriz) pode ser criado para armazenar dados em várias dimensões.
