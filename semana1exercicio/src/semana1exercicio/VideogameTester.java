package semana1exercicio;

public class VideogameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Videogame v1 = new Videogame();
		v1.nome = "Game Cube";
		v1.cor = "prata";
		v1.ano = 2001;
		v1.geracao = 6;
		v1.ligado = true;
		v1.status();
		v1.ligar();
		v1.ligado = false;
		v1.desligar();
	}
}
