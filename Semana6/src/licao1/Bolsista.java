package licao1;

public class Bolsista extends Aluno{
	
	private float bolsa;
	
	public void renovarBolsa()
	{
		System.out.println("Bolsa renovada!!!");
	}
	
	public void pagarMensalidade(float valor)
	{
		System.out.println("Valor recebido = " + valor);
		System.out.println("Valor mensalidade = " + (valor+bolsa));
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public String toString() {
		return super.toString()+"Bolsista [bolsa=" + bolsa + "]";
	}
	
	
	
}