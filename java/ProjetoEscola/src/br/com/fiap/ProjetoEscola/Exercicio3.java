package br.com.fiap.ProjetoEscola;

import javax.swing.JOptionPane;

public class Exercicio3 {

public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno): ");
		String stringNota = JOptionPane.showInputDialog("Informe a nota do aluno: ");
		Double nota = Double.valueOf(stringNota);

		if (nota > 5)
		{
			System.out.println(nome + " esta aprovado!");
		}
		else
		{
			System.out.println(nome + " esta reprovado");
		}
	}
}