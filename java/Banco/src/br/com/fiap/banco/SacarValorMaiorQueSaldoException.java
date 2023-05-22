package br.com.fiap.banco;

public class SacarValorMaiorQueSaldoException extends RuntimeException{

	public SacarValorMaiorQueSaldoException(String mensagem) {
		super(mensagem);
	}
}