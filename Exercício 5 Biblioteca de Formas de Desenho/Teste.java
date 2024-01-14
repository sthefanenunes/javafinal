package Atividade2;

public class Teste {
	public static void main(String[] args) {

		Forma retangulo = new Retangulo(5, 3);
		Forma circulo = new Circulo(4);
		Forma linha = new Linha(10);

		realizarOperacoes(retangulo);
		realizarOperacoes(circulo);
		realizarOperacoes(linha);
	}

	public static void realizarOperacoes(Forma forma) {
		forma.desenhar();
		forma.mover(2, 3);
		forma.redimensionar(1.5);
		System.out.println("-------------------------");
	}
}
