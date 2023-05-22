package br.com.fiap.banco;

public class TransferirValorNegativoException extends RuntimeException{
	
	public TransferirValorNegativoException(String mensagem) {
		super(mensagem);
	}

}