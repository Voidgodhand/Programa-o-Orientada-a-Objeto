package licao1;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	//construtor
	public ControleRemoto()
	{
		this.volume = 50;
		this.ligado=true;
		this.tocando=false;
	}
	//metodos getters/setters
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean isTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		setLigado(true);
		
	}
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		setLigado(false);
		
	}
	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		/*if(this.volume<100)
			this.volume = this.volume + 5;*/
		if(getVolume()<100)
			setVolume(getVolume()+5);
		System.out.println("Volume = " + this.volume);
		
	}
	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if(getVolume()>0)
			setVolume(getVolume()-5);
		System.out.println("Volume = " + this.volume);
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		if(getLigado())
		    System.out.println("Tocando....");
		else
			System.out.println("Erro! Não posso tocar....");
		
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause ativado com sucesso!");
	}
}