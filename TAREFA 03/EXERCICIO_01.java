import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int[] vetor = new int[11];
        

        for(int i = 1; i < 11; i++){
            System.out.println("Digite um número");
            vetor[i] = entrada.nextInt();
        }
        
                System.out.println("Os valores apresentados são estes:  ");
    
        for(int i = 1; i <= 11; i++){
            
            if(i == 2 || i == 4 || i == 6 || i == 8 || i == 10 ){
               System.out.println(vetor[i] * 2); 
            }else{
            
            System.out.println(vetor[i]);
        }
        
    }
}
}