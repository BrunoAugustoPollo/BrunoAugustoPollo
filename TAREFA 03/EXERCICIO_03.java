import java.util.Scanner;

public class Exercicio{

public static void main(String[] args) {
    
    int i = 0;
    int vetor[]= new int [5];
    Scanner leitor= new Scanner(System.in);
    int menor = 10;
     int aux = 0;
    
    
    for(i=0;i<= vetor.length-1;i++){
        System.out.print("Digite as 5 notas : ");
        vetor[i]=leitor.nextInt();
        
        
    }
    
    for(i = 0;i<= vetor.length-1;i++){
           

     aux += vetor[i];
     
            if(vetor[i]<menor){
               menor=vetor[i]; 
            }
              
  
        }
        
    System.out.println("A menor nota é : "+menor);
 
    System.out.println("A média é : "+aux / 5);
    
}
}
