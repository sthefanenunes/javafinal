package Atividade2;

public class Arqueiro extends Personagem {

	public Arqueiro(String nome, int vida) {
		super(nome, vida);
	}

	@Override
	public void atacar() {
		System.out.println(getNome() + " disparou uma flecha precisa!");
	}

	@Override
	public void defender() {
		System.out.println(getNome() + " se esquivou habilmente!");
	}

	@Override
	public void usarHabilidadeEspecial() {
		System.out.println(getNome() + " realizou um tiro múltiplo!");
	}

}
