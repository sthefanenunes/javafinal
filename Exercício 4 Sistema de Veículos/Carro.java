package Atividade2;

public class Carro extends VeiculoBase {

	private double consumoCombustivel;

	public Carro(String modelo, String cor, int ano, double consumoCombustivel) {
		super(modelo, cor, ano);
		this.consumoCombustivel = consumoCombustivel;
	}
	
	

	@Override
	public void acelerar() {
		System.out.println("Carro acelerando...");
	}

	@Override
	public void frear() {
		System.out.println("Carro freando...");
	}

	@Override
	public double calcCombustivel() {
		return consumoCombustivel;
	}
}