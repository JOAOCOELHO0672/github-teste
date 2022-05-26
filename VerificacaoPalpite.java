package adivinhacao.palavras;

public class VerificacaoPalpite {
	private char letrasAcertadas[];
	private int quantLetrasAcertadas;
	
	
	public char[] getLetrasAcertadas() {
		return letrasAcertadas;
	}


	public void setLetrasAcertadas(char[] letrasAcertadas) {
		this.letrasAcertadas = letrasAcertadas;
	}


	public int getQuantLetrasAcertadas() {
		return quantLetrasAcertadas;
	}


	public void setQuantLetrasAcertadas(int quantLetrasAcertadas) {
		this.quantLetrasAcertadas = quantLetrasAcertadas;
	}


	public VerificacaoPalpite verificaPalpite(int quantLetrasPalavra,
			String palavra, String letraPalpite, char letrasAcertadas[]) {
		VerificacaoPalpite retornoDados = new VerificacaoPalpite();
		char letraAtualPalavra;		
		for (int i = 0; i < quantLetrasPalavra ; i++) {
			letraAtualPalavra = palavra.charAt(i);
			if ((letraPalpite.charAt(0) == letraAtualPalavra)
					&& (letraPalpite.charAt(0) 
					!= (letrasAcertadas[i]))) {
				letrasAcertadas[i] = letraAtualPalavra;
				quantLetrasAcertadas++;
				retornoDados.setLetrasAcertadas(letrasAcertadas);
			} 
		}
		
		return retornoDados;
	}


}
