package Atividade2;

public class Circulo implements Forma {

	private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo.");
    }

    @Override
    public void mover(int deltaX, int deltaY) {
        System.out.println("Movendo o círculo por (" + deltaX + ", " + deltaY + ").");
    }

    @Override
    public void redimensionar(double fator) {
        raio *= fator;
        System.out.println("Redimensionando o círculo para raio " + raio + ".");
    }

}