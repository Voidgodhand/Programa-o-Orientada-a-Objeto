package licao1;

public class Tecnico extends Aluno{
	private String registroProfissional;

	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	public void praticar() {
		System.out.println("Praticando...");
	}

	@Override
	public String toString() {
		return super.toString()+"Tecnico [registroProfissional=" + registroProfissional + "]";
	}

}
