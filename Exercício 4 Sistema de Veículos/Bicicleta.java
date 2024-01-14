package Atividade2;

public class Bicicleta extends VeiculoBase {

	public Bicicleta(String modelo, String cor, int ano) {
		super(modelo, cor, ano);
	}

	@Override
	public void acelerar() {
		System.out.println("Pedalando mais rápido...");
	}

	@Override
	public void frear() {
		System.out.println("Freando a bicicleta...");
	}

	@Override
	public double calcCombustivel() {
		return 0;
	}
}
