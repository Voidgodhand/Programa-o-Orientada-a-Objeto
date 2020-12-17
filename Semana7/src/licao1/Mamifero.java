package licao1;

public class Mamifero extends Animal{
	private String corPelo;

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Andando!");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Mamífero alimentado.");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("WRAAAUGH");
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public String toString() {
		return super.toString()+" Mamifero [corPelo=" + corPelo + "]";
	}
	

}
