
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.senac.SimpleJava.Console;

public class Labirinto {
	public String caminhoCordenada;
	public DesenhaLabirinto desenha;
	public Sala[] salas = new Sala[31];
	public int numeroSala = 0;
	public int salaAtual = 0;
	
	public void run() throws IOException{
		
		this.caminhoCordenada = "C:/Users/marcos.honatel/Desktop/Trabalho/Labirinto.txt";
		LerArquivoCordenadas(caminhoCordenada);
		InicioJogo();
		
	}
	private void InicioJogo() {
		salaAtual = salas[0].getNumeroSala();
		
		do {
			Console.println("Você esta na sala " + salaAtual);
			String texto = verificaSalaAtual(salaAtual);
			Console.println(texto);
			
			int t = Console.readInt("Para qual sala voce deseja se deslocar");
			
			salaAtual = t;
			
		} while (salaAtual > 0);
		
	}
	private String verificaSalaAtual(int salaAtual) {
		
		salaAtual = salaAtual - 1;
		String texto = "";
		for (int i = 0; i < salas[salaAtual].sentido.length; i++) {
			if (salas[salaAtual].sentido[i] != null) {
				if (salas[salaAtual].sentido[i].getNome().equals("Norte")) {
					texto = texto + "Você tem uma porta ao " + salas[salaAtual].sentido[i].getNome()+ " ";
					texto = texto + " Que vai sair sa sala " + salas[salaAtual].sentido[i].getNorte()+ " \n";	
				}else if(salas[salaAtual].sentido[i].getNome().equals("Sul")){
					texto = texto +"Você tem uma porta ao " + salas[salaAtual].sentido[i].getNome()+ " ";
					texto = texto + " Que vai sair sa sala " + salas[salaAtual].sentido[i].getSul()+ " \n";					
				}else if(salas[salaAtual].sentido[i].getNome().equals("Leste")){
					texto = texto +"Você tem uma porta ao " + salas[salaAtual].sentido[i].getNome()+ " ";
					texto = texto + " Que vai sair sa sala " + salas[salaAtual].sentido[i].getLeste()+ " \n";					
				}else if(salas[salaAtual].sentido[i].getNome().equals("Oeste")){
					texto = texto +"Você tem uma porta ao " + salas[salaAtual].sentido[i].getNome()+ " ";
					texto = texto + " Que vai sair sa sala " + salas[salaAtual].sentido[i].getOeste()+ " \n";					
				}else if(salas[salaAtual].sentido[i].getNome().equals("Up")){
					texto = texto +"Você tem uma porta ao " + salas[salaAtual].sentido[i].getNome()+ " ";
					texto = texto + " Que vai sair sa sala " + salas[salaAtual].sentido[i].getUp()+ " \n";					
				}else if(salas[salaAtual].sentido[i].getNome().equals("Down")){
					texto = texto +"Você tem uma porta ao " + salas[salaAtual].sentido[i].getNome()+ " ";
					texto = texto + " Que vai sair sa sala " + salas[salaAtual].sentido[i].getDown()+ " \n";					
				}					
			}
		}
		return texto;
	}
	private void LerArquivoCordenadas(String caminhoCordenada2) throws IOException {
		Scanner sc = null;
		try {
			sc = new  Scanner(new FileInputStream(caminhoCordenada2)); 
			
			while(sc.hasNext()){
				
				String DadosSala = sc.nextLine();  
				salas[numeroSala] = MontaSalas(DadosSala);
				numeroSala ++;
			}
		} catch (FileNotFoundException fnfe ) {
			System.err.println("Não foi possível abrir o Arquivo " + caminhoCordenada2);
		}
	}
	private Sala MontaSalas(String dadosSala){

		Scanner scSala = new Scanner(dadosSala);
		Sala sala = new Sala();
		sala.sentido = new SentidoSala[6];
		
		int indiceSentido = 0;
		
			while (scSala.hasNext()) {
				SentidoSala  sentidoSala = new SentidoSala();
				String sentido = scSala.next();
				if (sentido.equalsIgnoreCase("room")) {
					sala.setNumeroSala(scSala.nextInt());
				}else if (sentido.equalsIgnoreCase("north")) {
					sentidoSala.setNorte(scSala.nextInt());
					sentidoSala.setNome("Norte");
				}else if (sentido.equalsIgnoreCase("south")) {
					sentidoSala.setSul(scSala.nextInt());
					sentidoSala.setNome("Sul");
				}else if (sentido.equalsIgnoreCase("east")) {
					sentidoSala.setLeste(scSala.nextInt());
					sentidoSala.setNome("Leste");
				}else if (sentido.equalsIgnoreCase("west")) {
					sentidoSala.setOeste(scSala.nextInt());
					sentidoSala.setNome("Oeste");
				}else if (sentido.equalsIgnoreCase("down")) {					
					sentidoSala.setDown(scSala.nextInt());
					sentidoSala.setNome("Down");
				}else if (sentido.equalsIgnoreCase("up")) {
					sentidoSala.setUp(scSala.nextInt());
					sentidoSala.setNome("Up");
				}
				if (sentidoSala.getNome() != null) {
					sala.sentido[indiceSentido] = sentidoSala;
					indiceSentido ++;	
				}
				
			}
			return sala;			
	}
}







