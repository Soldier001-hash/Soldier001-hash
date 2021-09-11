package exercicio3;

import java.util.Scanner;

public class exercicio3 {

	public exercicio3() {
		
	}
	public static void main(String[] args) {
		
        
        Scanner scan = new Scanner(System.in);
        		        	       
        		        
      System.out.println("Digite o primeira nota: ");
      int n1 = scan.nextInt();
      System.out.println("Digite a segunda nota: ");
      int n2 = scan.nextInt();
      double media = (n1 + n2) / 2;
              		
   	if (media >= 7 && media < 10 ) {
       System.out.println("Aluno aprovado");
   	}else if (media < 7) {
        System.out.println("Aluno reprovado");
   	}else if(media == 10)  {  
       System.out.println("Aluno com distincao "); 
       
       
       
   	}
   	
	}
	
}