package trabalho;

public interface IPartida {
	public abstract void iniciarPartida();
	public abstract void mostrarResultado(String nomeLocal, String nomeVisitante);
	public abstract void finalizarPartida(Time t1, Time t2);
}
