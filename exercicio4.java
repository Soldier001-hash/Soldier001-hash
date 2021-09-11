package exercicio4;

import java.util.Scanner;

public class exercicio4 {		
	        
		public static void main(String [] args) {
	        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Entre com a primeiro numero: ");
	        double n1 = scan.nextDouble();
	        
	        System.out.println("Entre com a segundo numero: ");
	        double n2 = scan.nextDouble();
	        
	        System.out.println("Entre com a terceiro numero: ");
	        double n3 = scan.nextDouble();
	        
			if(n1 > n2 && n1 > n3 ) {
				System.out.println("E um numero maior " + n1);
			}else if(n2 > n3 && n2 > n1) {
				System.out.println("E um numero maior " + n2);
			}else if(n3 > n2 && n3 > n1) {
				System.out.println("E um numero maior " + n3);
			}if(n1 < n2 && n1 < n3 ) {
				System.out.println("E um numero menor " + n1);
			}else if(n2 < n3 && n2 < n1) {
				System.out.println("E um numero menor " + n2);
			}else if(n3 < n2 && n3 < n1) {
				System.out.println("E um numero menor " + n3);
			}
		
			
			
		}
			
	               
	   }