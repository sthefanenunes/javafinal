package Atividade2;

public class Linha implements Forma {

	private int comprimento;

	public Linha(int comprimento) {
		this.comprimento = comprimento;
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando uma linha.");
	}

	@Override
	public void mover(int deltaX, int deltaY) {
		System.out.println("Movendo a linha por (" + deltaX + ", " + deltaY + ").");
	}

	@Override
	public void redimensionar(double fator) {
		comprimento *= fator;
		System.out.println("Redimensionando a linha para comprimento " + comprimento + ".");
	}
}
