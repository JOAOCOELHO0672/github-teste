package adivinhacao.palavras;

public class Tela {
	public void imprimePalavra (int quantLetrasPalavra,
			char letraAtualPalavra, String palavra,
			char[] letrasAcertadas) {
		for (int i = 0; i < quantLetrasPalavra ; i++) {
			letraAtualPalavra = palavra.charAt(i);
			if (letrasAcertadas[i] == letraAtualPalavra){
				System.out.print(letraAtualPalavra);
			} else {
				System.out.print("_");
			}
		}
	}	

}
