package Atividade2;

public class Teste {
	public static void main(String[] args) {

		ProdutoEletronico celular = new ProdutoEletronico("Smartphone", 1200.0, "Samsung");
		ProdutoRoupa camisa = new ProdutoRoupa("Camisa Polo", 50.0, "M");
		ProdutoLivro livro = new ProdutoLivro("O Senhor dos Anéis", 80.0, "J.R.R. Tolkien");

		System.out.println("Detalhes do Produto:");
		exibirDetalhesProduto(celular);
		exibirDetalhesProduto(camisa);
		exibirDetalhesProduto(livro);
	}

	private static void exibirDetalhesProduto(Produto produto) {
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Preço: R$" + produto.calcularPreco());
		System.out.println("------------------------------");
	}
}
