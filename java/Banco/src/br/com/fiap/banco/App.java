package br.com.fiap.banco;

public class App {

	public static void main(String[] args) {
		
		try {
		} catch (DepositarValorNegativoException e) {
			System.out.println("Valor do depósito negativo");
		} catch (SacarValorMaiorQueSaldoException e) {
			System.out.println("Saque do valor maior que saldo");
		} catch (TransferirValorMaiorQueSaqueException e) {
			System.out.println("Valor de transferência maior que saldo");
		} catch (TransferirValorNegativoException e) {
			System.out.println("Valor de transferência negativo");
		} finally {
			
		}
		
		ContaCorrente conta = new ContaCorrente("40028-9", "Leo");
		ContaPoupanca conta2 = new ContaPoupanca("30289-3", "Shaodree");
		
		conta.setSaldo(36000);
		conta2.setSaldo(980);
		
		System.out.println("O saldo atual da conta " + conta.getNome() + " e de: " + "R$" + conta.getSaldo());
		
		conta.setDepositar(7000);
		conta.setSacar(4500);
		conta.setTransferir(430);
		
		System.out.println("\nO extrato atual da conta " + conta.getNome() + " do numero " + conta.getNumeroDaConta() + ":" + 
							"\n\nDepositou um total de R$" + conta.getDepositar() +
							"\nSacou um total de R$" + conta.getSacar() +
							"\nTransferiu um total de R$" + conta.getTransferir() +
							"\nSaldo atual da conta: R$" + conta.getSaldo());				
	}
	
	
	
	
}
