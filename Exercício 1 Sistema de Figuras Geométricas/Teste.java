package Atividade2;

public class Teste {
	public static void main(String[] args) {

		Forma c1 = new Circulo(3.65);
		Forma r1 = new Retangulo(2.6, 8.7);
		Forma t1 = new Triangulo(5.2, 7.8);

		System.out.println(String.format("%.2f", c1.area()));
		System.out.println(String.format("%.2f", r1.area()));
		System.out.println(String.format("%.2f", t1.area()));

	}
}
