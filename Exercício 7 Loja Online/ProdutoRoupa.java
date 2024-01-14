package Atividade2;

public class ProdutoRoupa implements Produto {

	private String tipo;
	private double preco;
	private String tamanho;

	public ProdutoRoupa(String tipo, double preco, String tamanho) {
		this.tipo = tipo;
		this.preco = preco;
		this.tamanho = tamanho;
	}

	@Override
	public String getDescricao() {
		return tipo + " - Tamanho " + tamanho;
	}

	@Override
	public double calcularPreco() {
		return preco;
	}

}