/*
Nome: Jo�o Gabriel Alegria Napole�o
Matr�cula: 0050013804
 */
package questao1;

import java.util.Scanner;

public class DadosTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dados d=new Dados();
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com um n�mero para saber se � �mpar ou par: ");
		d.mostrar(input.nextInt());
		System.out.println("Entre com uma string para saber seu tamanho de caracteres: ");
		d.mostrar(input.next());
		input.close();

	}

}
