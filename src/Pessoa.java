
public abstract class Pessoa {
	public TipoEstado tipoEstado;
	public int energia;
	public Arma arma;
	
	public abstract void Atacar();
	public abstract int GetDano();
	public abstract void Defender();
	public abstract void Movimenta();
}
