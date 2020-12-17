/*
Nome: João Gabriel Alegria Napoleão
Matrícula: 0050013804
 */
package questao2;

public class Fusca extends Carro {
	@Override
	public void mostrar_marca()
	{
		setMarca("Wolkswagen");
		System.out.println("Marca do veículo:" +getMarca());
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
