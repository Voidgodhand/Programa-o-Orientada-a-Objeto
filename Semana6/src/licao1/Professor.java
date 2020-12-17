package licao1;

public class Professor extends Pessoa {
	
	private String especialidade;
	private float salario;
	
	public void receberAumento(float valor)
	{
		this.salario += valor;
	}

	// getters/setters
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + "Professor [especialidade=" + especialidade + ", salario=" + salario + "]";
	}

	
}