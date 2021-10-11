import java.util.Arrays;
 
class Exercicio_3 {
    public static void main(String[] args) {
        
                 int matriz_a [][] = {{1, 3}, {5, 7}, {10, 5}};
                 
                 int matriz_b [][] = {{2, 4}, {6, 8}, {9, 3}};
                 
                 int [][] valor_minimo = new int [3][2];
         
         
                System.out.println("VALORES INICIAIS DA MATRIZ A");
                
         for (int l = 0; l < 3; l++) {
             for(int c = 0; c < 2; c++) {
                 
                                 // laco para printar;
                                 
                 System.out.println("Linha " + l + " Coluna " + c + " :  " + matriz_a[l][c]);
                 
             }
             
         }
         
         System.out.println(" ");
         
                  
                  System.out.println("VALORES INICIAIS DA MATRIZ B");
                  
         for (int l = 0; l < 3; l++) {
             
             for(int c = 0; c < 2; c++) {
                 
                 System.out.println("Linha " + l + " Coluna " + c + " : " + matriz_b[l][c]);
                 
             }
             
         }
         
         System.out.println(" ");
         
                  
    
         
         System.out.println("VALOR MINIMO DAS MATRIZES:  ");
         
         for (int l = 0; l < 3; l++) {
           
             for(int c = 0; c < 2; c++) {
                    if(matriz_a[l][c] < matriz_b[l][c] ){
                        System.out.println(matriz_a[l][c]);
                    }else{
                        System.out.println(matriz_b[l][c]);
                    }
                        
                    }

                 
             }
             
         
    }
}
