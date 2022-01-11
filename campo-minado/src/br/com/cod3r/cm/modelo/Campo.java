package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.cm.execao.ExplosaoException;

public class Campo {

	private final int linha;
	private final int coluna;
	
	private boolean aberto=false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int linha,int coluna){
		this.linha = linha;
		this.coluna = coluna;
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
	void alternarMarcacao () {
		if(!aberto) {
			marcado =!marcado;
		}
	}
	boolean abrir() {
		if(!aberto && !marcado) {
			aberto =true;
			
			if(minado) {
				throw new ExplosaoException();
			}
			if(vizinhacaSegura()) {
				vizinhos.forEach(v->v.abrir());
			}
			return true;
			
		}else {
		return false;
	}
	}
	
	boolean vizinhacaSegura() {
		
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
	
	long minasNaVizinhança() {
		return vizinhos.stream().filter(v->v.minado).count();
	}
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	public String toString() {
		if(marcado) {
			return "X";
		}else if (aberto && minado) {
			return "*";
		}else if(aberto && minasNaVizinhança()>0) {
			return Long.toString(minasNaVizinhança());
		}else if(aberto) {
			return" ";
		}else {
			return"?";
		}
	}
	
	
	
}
