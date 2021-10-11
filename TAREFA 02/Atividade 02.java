import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int[] vetor = new int[5];
        

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número");
            vetor[i] = entrada.nextInt();
        }
        
                System.out.println("A ordem númerica é:  ");
    
        for(int i = 0; i <= 4; i++){
            
            
            System.out.println(vetor[i]);
        }
        
    }
}