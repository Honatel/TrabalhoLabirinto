
/**
 * @author Marcos.Honatel
 *
 */
public class Sala {
	
	public Porta porta;
	public boolean cadeado;
	public Personagem personagem;
	public Chave chave;
	public Armadilha armadilha;
	public Inimigo inimigo;
	public Arma arma;
	public Escudo escudo;
	public int NumeroSala;
	public SentidoSala[] sentido;

	public int getNumeroSala() {
		return NumeroSala;
	}

	public void setNumeroSala(int numeroSala) {
		NumeroSala = numeroSala;
	}
	
	public Porta getPorta() {
		return porta;
	}
	public void setPorta(Porta porta) {
		this.porta = porta;
	}
	public boolean isCadeado() {
		return cadeado;
	}
	public void setCadeado(boolean cadeado) {
		this.cadeado = cadeado;
	}
	public Personagem getPersonagem() {
		return personagem;
	}
	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	public Chave getChave() {
		return chave;
	}
	public void setChave(Chave chave) {
		this.chave = chave;
	}
	public Armadilha getArmadilha() {
		return armadilha;
	}
	public void setArmadilha(Armadilha armadilha) {
		this.armadilha = armadilha;
	}
	public Inimigo getInimigo() {
		return inimigo;
	}
	public void setInimigo(Inimigo inimigo) {
		this.inimigo = inimigo;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public Escudo getEscudo() {
		return escudo;
	}
	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}
	
	
	
	
}
	