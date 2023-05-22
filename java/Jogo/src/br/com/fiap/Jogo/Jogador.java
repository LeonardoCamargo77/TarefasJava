package br.com.fiap.Jogo;

public class Jogador {
	
	private String nome = "Shaodree";
	private int xp = 10;
	private int hp = 100;
	private boolean envenenado;
	
	public void jogador() {
		
	}
	
	public Jogador(String nome) {
		System.out.println("Foi criado o jogador: " + nome);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getXp() {
		return xp;
	}
	
	public int getHp() {
		return hp;
	}
	
	public boolean isEnvenenado() {
		return envenenado;
	}
	
	
	public void recebeAntidoto () {
		if (isEnvenenado()) {
			envenenado = false;
		} 
		
		else {
			envenenado = true;
		}
		
	}
	
	public void atacar (Jogador jogador) {
		
		jogador.receberDano(this.xp);
		
		if(jogador.foiDerrotado()) 
			this.ganharExperiencia(jogador.getXp());
		
	}
	
	public void receberDano (int xp2) {
		if (this.hp <= 0) {
			System.out.println("Game Over");
			this.hp = 0;
		}
	}
	
	public void receberCura(int cura) {
		this.hp += cura; 
	}
	
	public void ganharExperiencia(int experiencia) {
		this.xp += experiencia;
	}
	
	private boolean foiDerrotado() {
		return hp == 0;
	}

}