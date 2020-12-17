package licao1;

public class Ave extends Animal{
	private String corPena;
	public void fazerNinho(){
		System.out.println("Ninho feito.");
	}
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voando!");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Ave alimentada.");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("PIU PIU");
	}
	
	public String getCorPena() {
		return corPena;
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Ave [corPena=" + corPena + "]";
	}
	
	
}
