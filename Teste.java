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

		
		while (quantLetrasAcertadas <= quantLetrasPalavra) {
			
			// imprime na tela as letras advinhadas da palavra
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
			
			// Verifica se o palpite da letra está correto			
			for (int i = 0; i < quantLetrasPalavra ; i++) {
				letraAtualPalavra = palavra.charAt(i);
				if ((letraPalpite.charAt(0) == letraAtualPalavra)
						&& (letraPalpite.charAt(0) 
						!= (letrasAcertadas[i]))) {
					letrasAcertadas[i] = letraAtualPalavra;
					quantLetrasAcertadas++;
				} 
			}	
		}
	}
}
