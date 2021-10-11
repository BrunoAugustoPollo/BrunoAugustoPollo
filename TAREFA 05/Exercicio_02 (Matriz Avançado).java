import java.util.Arrays;
 
class Exercicio_2 {
    public static void main(String[] args) {
        
                 int matriz_a [][] = {{1, 2}, {3, 4}, {5, 6}};
                 
                 int matriz_b [][] = {{1, 2}, {3, 4}, {5, 6}};
                 
                 int matriz_c [][] = {{1, 2}, {3, 4}, {5, 6}};
                 
                 int [][] media = new int [3][3];
         
         
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
         
                  
                  System.out.println("VALORES INICIAIS DA MATRIZ C");
                  
         for (int l = 0; l < 3; l++) {
             
             for(int c = 0; c < 2; c++) {
                 
                 System.out.println("Linha " + l + " Coluna " + c + " : " + matriz_c[l][c]);
                 
             }
             
         }
         
            System.out.println(" ");
         
         System.out.println("MÉDIA DAS MATRIZES:  ");
         
         for (int l = 0; l < 3; l++) {
           
             for(int c = 0; c < 2; c++) {
           
                media[l][c] = (matriz_a[l][c] + matriz_b[l][c] + matriz_c[l][c]) / 3 ;
                
                         System.out.println("A MÉDIA DA LINHA " + l + " E DA COLUNA " + c + " CORRESPONDE A " + media[l][c]);

                 
             }
             
         
    }
}
}
