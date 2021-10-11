import java.util.Arrays;
 
class Main {
    public static void main(String[] args) {

        int [][] matriz = { { 1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        int [][] matriz_transposta = new int [matriz.length][matriz.length];

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++) {
                matriz_transposta[j][j] = matriz[j][i];
                System.out.print(matriz_transposta[j][j] + " ");

            }
           System.out.println();
        }

    }
}
