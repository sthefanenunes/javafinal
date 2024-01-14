package Atividade2;

public class Teste {
	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente("João", 500.00, 1000.00);
		ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", 1000.00, 0.03);

		contaCorrente.depositar(200.00);
		contaCorrente.sacar(700.00);

		contaPoupanca.depositar(500.00);
		contaPoupanca.calcularJuros();

		contaCorrente.transferir(contaPoupanca, 300.00);
	}
}
