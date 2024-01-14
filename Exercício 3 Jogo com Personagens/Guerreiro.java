package Atividade2;

public class Guerreiro extends Personagem {

	public Guerreiro(String nome, Integer vida) {
		super(nome, vida);
	}

	@Override
	public void atacar() {
		System.out.println(getNome() + " desferiu um golpe de espada!");
	}

	@Override
	public void defender() {
		System.out.println(getNome() + " levantou o escudo para se proteger!");
	}

	@Override
	public void usarHabilidadeEspecial() {
		System.out.println(getNome() + " executou uma investida poderosa!");
	}
}