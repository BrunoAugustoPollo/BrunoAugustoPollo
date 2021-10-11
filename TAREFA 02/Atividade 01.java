import java.util.Scanner;

public class Exercicio_1{

     public static void main(String []args){
         
        
        
            Scanner a = new Scanner(System.in);
            int numero_n;
            
            System.out.println("Digite o valor: ");
            numero_n = a.nextInt();
            
        int vetor[10];

        int tamanho_n = numero_n;


        vetor = new int[tamanho_n];


            for (int i=0; i<tamanho_n; i++) {

                if(vetor[i].length % 2 == 0){

                vetor[i] = i*2;

                }

                    System.out.println(vetor[i]);

}
     }
    }

