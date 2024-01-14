package Atividade2;

public class Circulo implements Forma {

	private Double raio;
	
	public Circulo(Double raio) {
		super();
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
}
