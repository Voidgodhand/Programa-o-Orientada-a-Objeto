/*
Nome: Jo�o Gabriel Alegria Napole�o
Matr�cula: 0050013804
 */
package questao2;

public class Fusca extends Carro {
	@Override
	public void mostrar_marca()
	{
		setMarca("Wolkswagen");
		System.out.println("Marca do ve�culo:" +getMarca());
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
