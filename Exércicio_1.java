import java.util.Scanner;

public class Exércicio_1{

     public static void main(String []args){
         
        
        
            Scanner a = new Scanner(System.in);
            int numero_1;
            
            System.out.println("Digite o primeiro valor: ");
            numero_1 = a.nextInt();
            
        

            Scanner b = new Scanner(System.in);
            int numero_2;
                
            System.out.println("Digite o segundo valor:  ");
            numero_2 = b.nextInt();

            // Apresentação dos valores junto do for;
        
        
            System.out.println("RESULTADO FINAL: ");
                         
                        for(int i = numero_1; i <= numero_2; ++i){
                            
            // Verificador (IF) de múltiplos de 3 OU 5;
            
                            if(i % 3 == 0 || i % 5 == 0 )
                            System.out.println( i );
                            
                            
     }
        }
}