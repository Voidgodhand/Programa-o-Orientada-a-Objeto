/*
Aluno: João Gabriel Alegria Napoleão
Matrícula: 0050013804
 */
package trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class TestTweet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tweet> tweets = new ArrayList<Tweet>();
		Usuario u1 = new Usuario();
		Scanner input = new Scanner(System.in);
		String resposta="Sim";
		System.out.println("Entre com seu login: ");
        u1.setLogin(input.next());
		System.out.println("Entre com sua senha: ");
		u1.setSenha(input.next());
		while(resposta.equalsIgnoreCase("Sim"))
		{
			System.out.println("Entre com o tweet: ");
			String d=input.next();
			Tweet t1 = new Tweet();
			t1.setDescricao(d);
			tweets.add(t1);
			System.out.println("Deseja twittar novamente?");
		    resposta=input.next();
		}
		u1.setTweets(tweets);
		System.out.println("Login: " + u1.getLogin());
		u1.listar();
		input.close();
	}

}
