/*
Nome: Jo�o Gabriel Alegria Napole�o
Matr�cula: 0050013804
 */
package questao2;

public class Carro extends Veiculo {
	public Carro()
	{
		setMarca("Hyundai");
		setVelocidade_maxima(150);
		setPotencia(130);
	}
	public void mostrar_marca()
	{
		System.out.println("Marca do ve�culo:" +getMarca());
	}
	@Override
	public String toString() {
		return "Velocidade m�xima=" + this.getVelocidade_maxima() + " Pot�ncia=" + this.getPotencia();
	}
	

}
