package Atividade2;

public class Teste {
	public static void main(String[] args) {

		VeiculoBase carro = new Carro("Fusca", "Azul", 1975, 12.5);
		VeiculoBase moto = new Moto("Harley Davidson", "Preto", 2020, 18.0);
		VeiculoBase bicicleta = new Bicicleta("Caloi", "Vermelha", 2022);

		realizarAcoes(carro);
		realizarAcoes(moto);
		realizarAcoes(bicicleta);
	}

	public static void realizarAcoes(VeiculoBase veiculo) {
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Cor: " + veiculo.getCor());
		System.out.println("Ano: " + veiculo.getAno());

		veiculo.acelerar();
		veiculo.frear();
		System.out.println("Consumo de Combustível: " + veiculo.calcCombustivel() + " litros/km");

		System.out.println("-------------------------");
	}
}
