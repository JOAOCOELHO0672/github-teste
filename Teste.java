package adivinhacao.palavras;

import java.util.Scanner;

public class Teste {
	

	public static void main(String[] args) {
		char letraAtualPalavra;
		String palavra = "ESCOLA";
		System.out.println();
		int quantLetrasPalavra = palavra.length();
		int quantLetrasAcertadas = 0;
		char[] letrasAcertadas = new char[quantLetrasPalavra];
		
		Scanner scan = new Scanner(System.in);

//		letrasAcertadas[0] = palavra.charAt(0);
//		letrasAcertadas[2] = palavra.charAt(2);
//		letrasAcertadas[4] = palavra.charAt(4);
		
		while (quantLetrasAcertadas <= quantLetrasPalavra) {
			
			for (int i = 0; i < quantLetrasPalavra ; i++) {
				letraAtualPalavra = palavra.charAt(i);
				if (letrasAcertadas[i] == letraAtualPalavra){
					System.out.print(letraAtualPalavra);
				} else {
					System.out.print("_");
				}
	
						

			}	
			System.out.println();
			if (quantLetrasAcertadas == quantLetrasPalavra) {
				System.out.println("Jogo acabou");
				break;
			}


				
			System.out.println("Digite uma letra: ");
			String letraPalpite = scan.next();

			
						
			for (int i = 0; i < quantLetrasPalavra ; i++) {
				letraAtualPalavra = palavra.charAt(i);
				if ((letraPalpite.charAt(0) == letraAtualPalavra) && (letraPalpite.charAt(0) 
						!= (letrasAcertadas[i]))) {
					letrasAcertadas[i] = letraAtualPalavra;
					quantLetrasAcertadas++;
					
				} 
				 
						

			}	
		// char l = letra.charAt(0); 
		
		//tela.imprimirPalavra(palavra, quantLetrasAcertadas);
			
		
		
		}
		
		
		
		
		
		
		
/*		
		
		for (int i = 0; i < n ; i++) {
			c = palavra.charAt(i);
//			if (c == l) {
//								
//			}


		}
		
		
		char test = 111;
		System.out.println(test);
*/
	}

}
