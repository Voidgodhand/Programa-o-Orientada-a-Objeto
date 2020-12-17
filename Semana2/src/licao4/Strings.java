package licao4;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String nome1, nome2;
		System.out.println("Entre com um nome: ");
		nome1 = input.next();
		System.out.println("Entre com outro nome: ");
		nome2 = input.next();
		if(nome1.equals(nome2))
		{
			System.out.println("Os nomes são iguais");
		}
		else
		{
			System.out.println("Os nomes são diferentes");
		}
		input.close();
	}

}
