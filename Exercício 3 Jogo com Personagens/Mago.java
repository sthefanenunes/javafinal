package Atividade2;

public class Mago extends Personagem {

	public Mago(String nome, Integer vida) {
		super(nome, vida);
	}

	@Override
	public void atacar() {
		System.out.println(getNome() + " lançou uma bola de fogo!");
	}

	@Override
	public void defender() {
		System.out.println(getNome() + " conjurou um escudo mágico!");
	}

	@Override
	public void usarHabilidadeEspecial() {
		System.out.println(getNome() + " realizou um feitiço poderoso!");
	}
}
