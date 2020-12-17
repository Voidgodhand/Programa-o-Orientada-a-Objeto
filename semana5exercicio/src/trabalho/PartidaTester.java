package trabalho;

import java.util.Scanner;

public class PartidaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
		Time t2 = new Time();
		Partida p = new Partida();
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com o nome do time local: ");
		t1.setNome(input.next());
		System.out.println("Entre com o nome do time visitante: ");
		t2.setNome(input.next());
	    p.iniciarPartida();
	    p.mostrarResultado(t1.getNome(), t2.getNome());
	    p.finalizarPartida(t1, t2);
	    t1.listar();
	    t2.listar();
	}

}
