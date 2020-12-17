package semana1exercicio;
public class Videogame {
	String nome;
	String cor;
	int ano;
	int geracao;
    boolean ligado;

    void ligar()
    {
    	if (ligado)
    		System.out.println("O video game já está ligado");
    }

    void desligar()
    {
    	if (!ligado)
    		System.out.println("O video game já foi desligado");
    		
    }
    void status()
	{
		System.out.println("Classe Videogame");
		System.out.println("Nome: " + nome);
		System.out.println("Cor: " + cor);
		System.out.println("Ano: " + ano);
		System.out.println("Geração: " + geracao);
	}

}