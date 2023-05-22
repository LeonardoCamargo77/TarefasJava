package br.com.fiap.ProjetoEscola;
import java.util.Scanner;

public class Exercicio7 {
	
    public static void main(String[] args) {
      
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Digite o valor Total de Alunos:");
	        int totalDeAlunos = sc.nextInt();
	        
	    System.out.println("Digite o valor Total de Aprovados:");
		    Double totalDeAprovados = sc.nextDouble();
        
		System.out.println("Digite o valor Total de Aprovados:");
			Double totalDeReprovados = sc.nextDouble();
	
    	Double resultadoAprovados;
    	Double resultadoReprovados;
    	
    	resultadoAprovados = (totalDeAprovados / totalDeAlunos) * 100;
    	resultadoReprovados = (totalDeReprovados / totalDeAlunos) * 100;
    	
    	String stringAprovado = String.format(" com a porcentagem de %.2f" , resultadoAprovados); 
    	String stringReprovado = String.format(" com a porcentagem de %.2f" , resultadoReprovados);
    	System.out.println("O valor total de alunos aprovados e " + totalDeAprovados + stringAprovado + "%" + " e o total de alunos reprovados é " + totalDeReprovados + stringReprovado + "%");
    	
    }
}

