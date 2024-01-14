package Atividade2;

public class Retangulo implements Forma {

	private int largura;
	private int altura;

	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando um retângulo.");
	}

	@Override
	public void mover(int deltaX, int deltaY) {
		System.out.println("Movendo o retângulo por (" + deltaX + ", " + deltaY + ").");
	}

	@Override
	public void redimensionar(double fator) {
		largura *= fator;
		altura *= fator;
		System.out.println("Redimensionando o retângulo para largura " + largura + " e altura " + altura + ".");
	}
}
