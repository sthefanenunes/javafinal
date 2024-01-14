package Atividade2;

public class Teste {
	public static void main(String[] args) {

		FuncionarioAssalariado assalariado = new FuncionarioAssalariado("João", 328, 5000.0, 25);
		FuncionarioHora porHora = new FuncionarioHora("Maria", 002, 20.0, 40);

		System.out.println(assalariado);
		System.out.println("Salario Final: " + String.format("%.2f", assalariado.calcSalario()));
		System.out.println(porHora);
		System.out.println("Salario Final: " + String.format("%.2f", porHora.calcSalario()));
	}
}
