import java.util.Scanner;

public class Exercicio_3{

     public static void main(String []args){
         
        boolean inicializador = true;
        
        int contador = -1;
        
                float media = 0;

        // While para iniciar um loop:
        
        while(inicializador){
               
        // Recebimento das entradas:
               
            Scanner entrada = new Scanner(System.in);
            float valores;
            
            System.out.println("Digite o valor desejado:  ");
            valores = entrada.nextFloat();
            
            contador++;
            
            media += valores;
            
        // Condição para parar o loop:
            
            
            if(valores == 0){
            
            System.out.println( media / contador );

                break;
                
            }
            
            
     }
     }
}