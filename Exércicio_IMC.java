import java.util.Scanner;

public class IMC{

     public static void main(String []args){
                 
                // RECEPÇÃO DE ENTRADAS:

                        Scanner a = new Scanner(System.in);
                        float altura;
                        
                        System.out.println("Digite a sua altura: ");
                        altura = a.nextFloat();

                        Scanner b = new Scanner(System.in);
                        float peso;
                        
                        System.out.println("Digite o seu peso: ");
                        peso = b.nextFloat();

                // FÓRMULA DE IMC (COM ARREDONDAMENTO): 

                         float imc = Math.round(peso/ (altura * altura));

                // VERIFICADOR DE PESAGEM: 

                if(imc < 18.5){
                    System.out.println("Você está abaixo do peso, pois seu IMC é de " + imc);
                }

                    if(imc > 18.5 && imc <= 24.9 ){
                        System.out.println("Seu peso está normal, pois seu IMC é de " + imc);
                    }

                        if(imc >= 25 && imc <= 29.9 ){
                            System.out.println("Você está com sobrepeso, pois seu IMC é de " + imc);
                        }

                            if(imc >= 30 && imc <= 34.9 ){
                                System.out.println("Você está com obesidade grau I, pois seu IMC é de " + imc);
                            }

                                if(imc >= 35 && imc <= 39.9 ){
                                    System.out.println("Você está com obesidade grau II, pois seu IMC é de " + imc);
                                }

                                        if(imc >= 40 ){
                                            System.out.println("Você está com obesidade mórbida, pois seu IMC é de " + imc);
                                        }

                
            }
        }
            
            
                        
