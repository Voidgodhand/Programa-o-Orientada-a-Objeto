package licao1;

public class Peixe extends Animal {
	private String corEscama;
	public void soltarBolha(){
		System.out.println("GLUB GLUB");
	}
	
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando!");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Peixe alimentado.");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("GLUB GLUB");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public String toString() {
		return super.toString()+" Peixe [corEscama=" + corEscama + "]";
	}
	

}
