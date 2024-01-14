package Atividade2;

public class ProdutoEletronico implements Produto {

	private String nome;
	private double preco;
	private String marca;

	public ProdutoEletronico(String nome, double preco, String marca) {
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}

	@Override
	public String getDescricao() {
		return nome + " - " + marca;
	}

	@Override
	public double calcularPreco() {
		return preco;
	}
}
