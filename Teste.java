package adivinhacao.palavras;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		//System.out.println(char o);
		char c;
		String s = "ESCOLA";
		int n = s.length();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		char l = letra.charAt(0); 
		
		for (int i = 0; i < n ; i++) {
			c = s.charAt(i);
			if (c == l) {
								
			}
			System.out.println("a " + (i+1) + "ª letra da palavra " + s 
					+ " é " + c);
		}
		
		
		char test = 111;
		System.out.println(test);
	}

}
