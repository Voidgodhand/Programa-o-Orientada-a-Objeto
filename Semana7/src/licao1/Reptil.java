package licao1;

public class Reptil extends Animal {
	private String corEscama;

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Rastejando!");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Réptil alimentado.");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("RSSSSSS");
	}
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public String toString() {
		return super.toString()+" Reptil [corEscama=" + corEscama + "]";
	}
	

}
