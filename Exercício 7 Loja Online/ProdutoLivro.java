package Atividade2;

public class ProdutoLivro implements Produto {

	private String titulo;
	private double preco;
	private String autor;

	public ProdutoLivro(String titulo, double preco, String autor) {
		this.titulo = titulo;
		this.preco = preco;
		this.autor = autor;
	}

	@Override
	public String getDescricao() {
		return titulo + " - " + autor;
	}

	@Override
	public double calcularPreco() {
		return preco;
	}
}
