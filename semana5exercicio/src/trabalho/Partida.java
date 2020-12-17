package trabalho;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Partida implements IPartida {
	private ArrayList<Time> timeVisitante;
	private ArrayList<Time> timeLocal;
	private int scoreVisitante;
	private int scoreLocal;
	private Date dataPartida;
	@Override
	public void iniciarPartida() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		this.scoreVisitante = rand.nextInt(11);
		rand = new Random();
		this.scoreLocal = rand.nextInt(11);
	}
	@Override
	public void mostrarResultado(String nomeLocal, String nomeVisitante) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println(nomeLocal + " " + this.scoreLocal + " X " + nomeVisitante + " " + this.scoreVisitante);
	}
	@Override
	public void finalizarPartida(Time t1, Time t2) {
		// TODO Auto-generated method stub
		if (this.scoreLocal>this.scoreVisitante)
		{
			t1.setQtdVitorias(t1.getQtdVitorias()+1);
			t1.setQtdPontos(t1.getQtdPontos()+3);
			t2.setQtdDerrotas(t2.getQtdDerrotas()+1);
		}
		else if(this.scoreLocal==this.scoreVisitante)
		{
			t1.setQtdEmpates(t1.getQtdEmpates()+1);
			t1.setQtdPontos(t1.getQtdPontos()+1);
			t2.setQtdEmpates(t2.getQtdEmpates()+1);
			t2.setQtdPontos(t2.getQtdPontos()+1);
		}
		else if(this.scoreLocal<this.scoreVisitante)
		{
			t1.setQtdDerrotas(t1.getQtdDerrotas()+1);
		    t2.setQtdVitorias(t2.getQtdVitorias()+1);
		    t2.setQtdPontos(t2.getQtdPontos()+3);
		}
	}
}
