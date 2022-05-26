package adivinhacao.palavras;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		Tela tela = new Tela();
		VerificacaoPalpite verificacao = new VerificacaoPalpite();
		
		char letraAtualPalavra = 0;
		String palavra = "DICIONARIO";
		System.out.println();
		int quantLetrasPalavra = palavra.length();
		int quantLetrasAcertadas = 0;
		char[] letrasAcertadas = new char[quantLetrasPalavra];
		String letraPalpite;
		
		Scanner scan = new Scanner(System.in);

		
		while (quantLetrasAcertadas <= quantLetrasPalavra) {
			
			// imprime na tela as letras advinhadas da palavra
			tela.imprimePalavra(quantLetrasPalavra, letraAtualPalavra, 
					palavra, letrasAcertadas);
			
			

			System.out.println();
			if (verificacao.getQuantLetrasAcertadas() == quantLetrasPalavra) {
				System.out.println("Jogo acabou");
				break;
			}
				
			System.out.println("Digite uma letra: ");
			letraPalpite = scan.next();
			
			// Verifica se o palpite da letra está correto
			verificacao.verificaPalpite (quantLetrasPalavra, palavra,
					letraPalpite, letrasAcertadas);
			
			

		}
	}
}
