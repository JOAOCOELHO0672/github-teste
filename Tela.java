package adivinhacao.palavras;

public class Tela {
	char c;
	int quantLetrasAcertadas = 0;
	public void imprimirPalavra(String palavra, int quantLetrasAcertadas){ 
		int n = palavra.length();
		for (int i = 0; i < n ; i++) {
			c = palavra.charAt(i);
			for (int j = 0; j < quantLetrasAcertadas; j++) {
				
			}
			System.out.println(c); 
		
		}
	}

}
