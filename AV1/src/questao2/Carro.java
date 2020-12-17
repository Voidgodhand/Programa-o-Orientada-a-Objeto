/*
Nome: João Gabriel Alegria Napoleão
Matrícula: 0050013804
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
		System.out.println("Marca do veículo:" +getMarca());
	}
	@Override
	public String toString() {
		return "Velocidade máxima=" + this.getVelocidade_maxima() + " Potência=" + this.getPotencia();
	}
	

}
