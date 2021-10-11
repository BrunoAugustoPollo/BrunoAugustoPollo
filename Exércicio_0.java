import java.util.Scanner;

public class Exercicio_0{

     public static void main(String []args){
         
                // Entrada do valor mínimo;
        
            Scanner a = new Scanner(System.in);
            int numero_min;
            
            System.out.println("Digite o valor mínimo: ");
            numero_min = a.nextInt();
            
                // Entrada do valor máximo;

            Scanner b = new Scanner(System.in);
            int numero_max;
                
            System.out.println("Digite o valor máximo:  ");
            numero_max = b.nextInt();

            // Apresentação dos valores junto do for;
        
        
            System.out.println("A contagem entre os valores divulgados é esta: ");
                         
                        for(int i = numero_min; i <= numero_max; ++i){
                            System.out.println( i );
     }
        }
}