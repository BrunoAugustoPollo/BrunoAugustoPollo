import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int[] vetor = new int[5];
        

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número");
            vetor[i] = entrada.nextInt();
        }
        
                System.out.println("A ordem númerica inversa é:  ");
    
        for(int i = 4; i >= 0; i--){
            
            System.out.println(vetor[i]);
        }
        
    }
}