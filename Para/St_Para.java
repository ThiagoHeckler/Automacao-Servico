package Para;

import java.util.Scanner;
public class St_Para
{

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Solicita ao usuário a base do item
            System.out.print("Digite o valor da base do item: ");
            double base = scanner.nextDouble();
            
            // Solicita ao usuário o MVA
            System.out.print("Digite o percentual do MVA: ");
            int decisao = scanner.nextInt();
            double mva = 0;
            if(decisao == 1){
                mva = 30.37; //scanner.nextDouble();
            }else if(decisao == 2) {
                mva = 40.00; //scanner.nextDouble();
            }else{
                System.out.println("Digitou errado!");
            }
            // Cálculo do ICMS
            double icms = base * 0.12;
            
            // Cálculo da Base ICMS ST
            double baseICMS = base + (base * (mva / 100));
            
            // Cálculo do ICMS ST
            double icmsST = (baseICMS * 0.19) - icms;
            
            // Exibe os resultados
            System.out.println("\nResultados:");
            System.out.printf("ICMS: R$ %.2f%n", icms);
            System.out.printf("Base ICMS ST: R$ %.2f%n", baseICMS);
            System.out.printf("ICMS ST: R$ %.2f%n", icmsST);
            
            // Pergunta se deseja calcular novamente
            System.out.print("Deseja calcular novamente? (S/N): ");
            char resposta = scanner.next().toUpperCase().charAt(0);
            if (resposta != '+') {
                break;
            }
        }
        
        scanner.close();
    }


}