package br.com.fiap.banco;

public class DepositarValorNegativoException extends RuntimeException{
	
	public DepositarValorNegativoException(String mensagem) {
		super(mensagem);
	}
}