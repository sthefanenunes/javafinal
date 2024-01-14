package Atividade2;

public class Moto extends VeiculoBase {

	private double consumoCombustivel;

	public Moto(String modelo, String cor, int ano, double consumoCombustivel) {
		super(modelo, cor, ano);
		this.consumoCombustivel = consumoCombustivel;
	}

	@Override
	public void acelerar() {
		System.out.println("Moto acelerando...");
	}

	@Override
	public void frear() {
		System.out.println("Moto freando...");
	}

	@Override
	public double calcCombustivel() {
		return consumoCombustivel;
	}
}
