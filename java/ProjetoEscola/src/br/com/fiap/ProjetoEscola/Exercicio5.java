package br.com.fiap.ProjetoEscola;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {

	String MediaFinal = JOptionPane.showInputDialog("Digite a media final do aluno: ");
	int mediaFinal = Integer.valueOf(MediaFinal);
	String Frequencia = JOptionPane.showInputDialog("Digite a frequencia do aluno: ");
	Double frequencia = Double.valueOf(Frequencia);
	
	if (mediaFinal > 6 && frequencia > 7.5) {
		System.out.println("O Aluno esta aprovado");
	
	} else {
		System.out.println("O Aluno esta repovado");
		
	}

	}
}