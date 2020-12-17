package trabalho;

public class Time {
	private String nome;
	private int qtdVitorias;
	private int qtdEmpates;
	private int qtdDerrotas;
	private int qtdPontos;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdVitorias() {
		return qtdVitorias;
	}
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}
	public int getQtdEmpates() {
		return qtdEmpates;
	}
	public void setQtdEmpates(int qtdEmpates) {
		this.qtdEmpates = qtdEmpates;
	}
	public int getQtdDerrotas() {
		return qtdDerrotas;
	}
	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}
	 public int getQtdPontos() {
		return qtdPontos;
	}
	public void setQtdPontos(int qtdPontos) {
		this.qtdPontos = qtdPontos;
	}
	public void listar()
	 {   System.out.println(" ");
		 System.out.println("Nome: " + this.nome);
		 System.out.println("Quantidade de vitórias: " + this.qtdVitorias);
		 System.out.println("Quantidade de empates: " + this.qtdEmpates);
		 System.out.println("Quantidade de derrotas: " + this.qtdDerrotas);
		 System.out.println("Quantidade de pontos: " + this.qtdPontos);
	 }
}
