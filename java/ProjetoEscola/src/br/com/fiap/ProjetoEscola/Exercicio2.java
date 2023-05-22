package br.com.fiap.ProjetoEscola;

import javax.swing.JOptionPane;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		String numero1 = JOptionPane.showInputDialog("Informe a primeira nota: ");
		Double n1 = Double.valueOf(numero1);
		String numero2 = JOptionPane.showInputDialog("Informe a segunda nota: ");
		Double n2 = Double.valueOf(numero2);
		String numero3 = JOptionPane.showInputDialog("Informe a terceira nota: ");
		Double n3 = Double.valueOf(numero3);
		
		double resultado = 0;
		
		if (n1 <= n2 && n1 <= n3)
		{
			resultado = (n2 + n3) / 2;
		}
		else if (n2 <= n1 && n2 <= n3)
		{
			resultado = (n1 + n3) / 2;
		}
		else if (n3 <= n2 && n3 <= n1)
		{
			resultado = (n2 + n3) / 2;
		}
	
		String msgFormatada = String.format("O resultado é: %.2f", resultado);
		System.out.println(msgFormatada);
	}
}