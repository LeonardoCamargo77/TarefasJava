package br.com.fiap.Jogo;

public class App {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Shaodree");
		Jogador jogador2 = new Jogador("Vini");
		
		
		System.out.println("\nJogador: " + jogador1.getNome()+ 
				"\nXP = " + jogador1.getXp() +
				"\nHP = " + jogador1.getHp() +   
				"\nEnvenenado = " + jogador1.isEnvenenado()   
				);
		
		System.out.println("\nJogador: " + jogador2.getNome()+ 
				"\nXP = " + jogador2.getXp() +
				"\nHP = " + jogador2.getHp() +   
				"\nEnvenenado = " + jogador2.isEnvenenado()   
				);
		
		
		
		jogador1.ganharExperiencia(20);
		
		System.out.println("\nO jogador: " + jogador1.getNome()+ " tem " + jogador1.getXp() + " de XP");
		
		jogador2.ganharExperiencia(40);
		
		System.out.println("\nO jogador: " + jogador2.getNome()+ " tem " + jogador2.getXp() + " de XP");
	}

}