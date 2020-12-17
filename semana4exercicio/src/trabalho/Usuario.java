/*
Aluno: João Gabriel Alegria Napoleão
Matrícula: 0050013804
 */
package trabalho;
import java.util.ArrayList;

public class Usuario {
	private String login;
	private String senha;
	private ArrayList<Tweet> tweets;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
		if(senha.equals("poo"))
		     System.out.println("Acesso OK!! ");
		else
	         System.out.println("Acesso Negado!! ");
	}
	public ArrayList<Tweet> getTweets() {
		return tweets;
	}
	public void setTweets(ArrayList<Tweet> tweets) {
		this.tweets = tweets;
	}
    public  void listar()
    {
    	for (Tweet t1:tweets)
    	{
    		System.out.println("Tweets: " + t1.getDescricao());
        }
    }
}
