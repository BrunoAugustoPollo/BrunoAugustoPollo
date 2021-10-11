import java.util.Arrays;
 
class Exercicio_1 {
    public static void main(String[] args) {
        
                 int matriz_a [][] = {{1, 2}, {3, 4}, {5, 6}};
                 
                 int matriz_b [][] = {{1, 2}, {3, 4}, {5, 6}};
                 
                 int [][] soma = new int [3][2];
         
         // Print da primeira matriz (sem soma):
         
                System.out.println("VALORES INICIAIS DA MATRIZ A");
                
         for (int l = 0; l < 3; l++) {
             for(int c = 0; c < 2; c++) {
                 
                                 // laco para printar;
                                 
                 System.out.println("Linha " + l + " Coluna " + c + " :  " + matriz_a[l][c]);
                 
             }
             
         }
         
         System.out.println(" ");
         
         System.out.println(" ");
                  
                  System.out.println("VALORES INICIAIS DA MATRIZ B");
                  
         for (int l = 0; l < 3; l++) {
             
             for(int c = 0; c < 2; c++) {
                 
                 System.out.println("Linha " + l + " Coluna " + c + " : " + matriz_b[l][c]);
                 
             }
             
         }
         
         System.out.println(" ");
         
         // SOMA DAS MATRIZES
         
         System.out.println("SOMA DAS MATRIZES:  ");
         
         for (int l = 0; l < 3; l++) {
           
             for(int c = 0; c < 2; c++) {
           
                soma[l][c] = matriz_a[l][c] + matriz_b[l][c];
                         System.out.println("A SOMA DA LINHA " + l + " E DA COLUNA " + c + " CORRESPONDE A " + soma[l][c]);

                 
             }
             
                      System.out.println(" ");


         
         
    }
}
}
