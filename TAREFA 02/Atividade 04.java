import java.util.Scanner;

public class Exercicio_4{

     public static void main(String []args){
         
        
        
            Scanner a = new Scanner(System.in);
            int numero_n;
            
            System.out.println("Digite o valor: ");
            numero_n = a.nextInt();
            
        int vetor[ ];

        int tamanho_n = numero_n;


        vetor = new int[tamanho_n];


            for (int i=0; i<tamanho_n; i++) {

                vetor[i] = i*i;

                    System.out.println("O resultado de " + i + " ao quadrado é " + vetor[i]);
}
}
}
