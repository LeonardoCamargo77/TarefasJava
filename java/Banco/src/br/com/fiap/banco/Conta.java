package br.com.fiap.banco;

public class Conta {
	
	private String nomeDoTitular;
	private String numeroDaConta;
	private double saldo;
	private double depositar;
	private double sacar;
	private double transferir;
	private double receber;

	public Conta(String numero, String nomeDoTitular) {
		this.numeroDaConta = numero;
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public String getNome() {
		return nomeDoTitular;
	}

	public void setNome(String nome) {
		this.nomeDoTitular = nome;
	}
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getDepositar() {
		return depositar;
	}

	public void setDepositar(double depositar) throws DepositarValorNegativoException{
		this.depositar = depositar;
		if (depositar > 0)
			this.saldo = depositar + saldo;
		else
			throw new DepositarValorNegativoException("Não pode depositar valor negativo");
	}

	public double getSacar() {
		return sacar;
	}

	public void setSacar(double sacar) throws DepositarValorNegativoException{
		this.sacar = sacar;
		if (sacar <= saldo)
			this.saldo = saldo - sacar;
		else
			throw new DepositarValorNegativoException("Não pode sacar valor maior que saldo");
	}
	
	public double getTransferir() {
		return transferir;
	}

	public void setTransferir(double transferir) throws TransferirValorMaiorQueSaqueException, TransferirValorNegativoException{
			this.transferir = transferir;
		if (transferir <= saldo)
			if (transferir > 0)
				this.saldo = saldo - transferir;
			else
				throw new TransferirValorNegativoException("Não pode transferir valor negativo");
		else
			throw new TransferirValorMaiorQueSaqueException("Não pode transferir valor maior que saldo e valor negativo");
	}

	public double getReceber() {
		return receber;
	}

	public void setReceber(double receber) {
		this.receber = saldo;
	}

}
