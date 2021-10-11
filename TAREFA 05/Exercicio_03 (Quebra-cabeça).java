import java.util.Scanner;
import java.util.Arrays;

public class teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[4][3];
        int indicador;
        
        

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("Digite um valor: ");
                matriz[i][j] = input.nextInt();
                 
            }
  
        }
        
        System.out.println("Resultado das matrizes :");
        
        for (int i = 0; i < matriz.length; i++) {
            
            System.out.println(Arrays.toString(matriz[i]));
            
           
        }
        
        if((matriz[0][1] == 0) && (matriz[0][2] == 0) && (matriz[1][2] == 0) || (matriz[3][1] == 0) && (matriz[3][2] == 0) && (matriz[2][2] == 0 )){
            
            System.out.println("A matriz caracteriza-se como sendo triangular! ");
        }else{
         System.out.println("A matriz caracteriza-se como nao sendo triangular! ");   
        }
        
System.out.println(" ");


        
    }

}
