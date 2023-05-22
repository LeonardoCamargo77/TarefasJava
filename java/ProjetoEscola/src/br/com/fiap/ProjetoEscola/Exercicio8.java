package br.com.fiap.ProjetoEscola;

import javax.swing.JOptionPane;

public class Exercicio8 {
	public static void main(String[] args) 
	{
		
		String diasDaSemana = JOptionPane.showInputDialog("Escolha uma opção:\n" +
                "a - Segunda-feira\n" +
                "b - Terça-feira\n" +
                "c - Quarta-feira\n" +
                "d - Quinta-feira\n" +
                "e - Sexta-feira\n");
                
		char dias = diasDaSemana.charAt(0);
		
		switch(dias) {
		case 'a':
        case 'A':
            System.out.println("Havera aula de AI & chatbot e Building Relational Database");
            break;
        case 'b':
        case 'B':
            System.out.println("Havera aula de Domain Driven Design e Computational Thinking Using Python");
            break;
        case 'c':
        case 'C':
            System.out.println("Havera aula de Computational Thinking Using Python e Responsive Web Development");
            break;
        case 'd':
        case 'D':
            System.out.println("Havera aula de Domain Driven Design e Software Design & Total Experience");
            break;
        case 'e':
        case 'E':
            System.out.println("Havera aula de Software Design & Total Experience e Responsive Web Development");
            break;
		}
    }
}
	
