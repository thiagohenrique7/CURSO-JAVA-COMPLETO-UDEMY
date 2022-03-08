package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

	private final int linha;
	private final int coluna;
	
	private boolean aberto=false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	private List<CampoObservador> observadores 
	= new ArrayList<>(); //SetList NÃO aceita duplicação
//	private List<BiConsumer<Campo,CampoEvento>> observadores2 
//	= new ArrayList<>(); MESMA COISA
	Campo(int linha,int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public void registrarObservador(CampoObservador observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(CampoEvento evento) {
		observadores
		 .stream().forEach(o -> o.eventoOcorreu(this, evento));
	}
	
	boolean adicionarVizinho (Campo vizinho) {
		boolean linhaDiferente = linha!=vizinho.linha;
		boolean colunaDiferente = coluna!=vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaLinha + deltaColuna;
		
		if(deltaGeral ==1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
			
		}else if(deltaGeral==2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		}else {
			return false;
		}
	}
	public void alternarMarcacao () {
		if(!aberto) {
			marcado =!marcado;
			
			if(marcado) {
				notificarObservadores(CampoEvento.MARCAR);
			}else {
				notificarObservadores(CampoEvento.DESMARCAR);				
			}
		}
	}
	public boolean abrir() {
		if(!aberto && !marcado) {
			if(minado) {
				notificarObservadores(CampoEvento.EXPLODIR);
				return true;
			}
			setAberto(true);
			if(vizinhancaSegura()) {
				vizinhos.forEach(v->v.abrir());
			}
			return true;
			
		}else {
		return false;
	}
	}
	
	public boolean vizinhancaSegura() {
		
		return vizinhos
				.stream()
				.noneMatch(v->v.minado);
	}
	
	public boolean isMarcado() {
		return this.marcado;
	}
	void minar() {
		this.minado = true;			
	}
	public boolean isMinado() {
		return this.minado;
	}
	void marcar() {
		this.marcado = true;			
	}
	public boolean isAberto() {
		return this.aberto;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
		
		if(aberto) {
			notificarObservadores(CampoEvento.ABRIR);
		}
	}

	public boolean isFechado() {
		return !this.aberto;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	boolean objetivoAlcançado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
		
	}
	
	public int minasNaVizinhança() {
		return (int) vizinhos.stream().filter(v->v.minado).count();
	}
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
		notificarObservadores(CampoEvento.REINICIAR);
	}
	
	
	
	
}
