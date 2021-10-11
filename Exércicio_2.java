import java.util.Scanner;

public class Exercicio_2{

     public static void main(String []args){
         
        
            Scanner a = new Scanner(System.in);
            int numero_1;
            
            System.out.println("Digite o 1° valor: ");
            numero_1 = a.nextInt();
            

            Scanner b = new Scanner(System.in);
            int numero_2;
                
            System.out.println("Digite o 2° valor:  ");
            numero_2 = b.nextInt();
        
        
            System.out.println("RESULTADO FINAL: ");
                         
                        for(int i = numero_1; i <= numero_2; ++i){
                            
            
                            if(i % 3 == 0 && i % 2 != 0 || i % 7 == 0 && i % 2 != 0 )
                            System.out.println( i );
                            
                            
     }
        }
}