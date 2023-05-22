package br.com.fiap.banco;

public class TransferirValorMaiorQueSaqueException extends RuntimeException{
	
	public TransferirValorMaiorQueSaqueException(String mensagem) {
		super(mensagem);
	}

}