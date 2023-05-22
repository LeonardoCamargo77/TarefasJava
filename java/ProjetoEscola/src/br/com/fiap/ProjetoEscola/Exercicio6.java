package br.com.fiap.ProjetoEscola;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
	
	String stringAulas = JOptionPane.showInputDialog("Digite o numero de aulas");
	int aulas = Integer.valueOf(stringAulas);
	String stringFaltas = JOptionPane.showInputDialog("Digite o numero de faltas");
	int faltas = Integer.valueOf(stringFaltas);
	int subtracao;
	Double resultado;
	
	subtracao = (aulas - faltas);
	
	resultado = (double) ((subtracao * 100) / aulas);
	
		System.out.println("A frequência do aluno e: " + resultado + "%");
	}
	
	
	
	

}