/*
Nome: João Gabriel Alegria Napoleão
Matrícula: 0050013804
 */
package questao2;

public abstract class Veiculo {
	private String marca;
	private int velocidade_maxima;
	private int potencia;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVelocidade_maxima() {
		return velocidade_maxima;
	}
	public void setVelocidade_maxima(int velocidade_maxima) {
		this.velocidade_maxima = velocidade_maxima;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	

}
