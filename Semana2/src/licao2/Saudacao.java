package licao2;

import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String nome;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre o nome ");
    nome = entrada.next();
    System.out.println("Boa noite, " + nome);
    entrada.close();
	}

}
