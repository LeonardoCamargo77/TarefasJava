package br.com.fiap.ProjetoEscola;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
		Double soma = (double) 0;
		Double resultado;
		int i = 0;
		String stringNota = JOptionPane.showInputDialog("Escreva as notas do " + nome + ". (Finalize digitando um valor negativo)");
		double nota = Double.valueOf(stringNota);
		
		while (nota >= 0) {
			
			soma += nota;
			i++;
					
			stringNota = JOptionPane.showInputDialog("Escreva as notas do " + nome + ". (Finalize digitando um valor negativo)");
			nota = Double.parseDouble(stringNota);
			 		 
		}

		resultado = soma / i;
		
		String mensagem = String.format("O Aluno " + nome + "tem a média de: %.2f" , resultado);
		System.out.println(mensagem);

		
	}
}