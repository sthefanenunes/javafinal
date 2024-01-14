package Atividade2;

public class Teste {
	public static void main(String[] args) {

		Personagem mago = new Mago("Gandalf", 100);
		Personagem guerreiro = new Guerreiro("Aragorn", 120);
		Personagem arqueiro = new Arqueiro("Legolas", 80);

		realizarAcao(mago);
		realizarAcao(guerreiro);
		realizarAcao(arqueiro);
	}

	public static void realizarAcao(Personagem personagem) {
		System.out.println("Ações de " + personagem.getNome() + ":");
		personagem.atacar();
		personagem.defender();
		personagem.usarHabilidadeEspecial();
		System.out.println("Vida restante: " + personagem.getVida());
		System.out.println("-------------------------");
	}
}
