package licao1;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
    
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	
	public String getModelo()
	{
		return this.modelo;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void escrever()
	{
		if(tampada)
			System.out.println("Erro! Não consigo escrever!");
		else
			System.out.println("Escrevendo...");
	}
	
	public void tampar()
	{
		this.tampada = true;
	    //this - acessar atributo ou método dentro da classe
	}
	
	public void destampar()
	{
		this.tampada = false;
	}
}
