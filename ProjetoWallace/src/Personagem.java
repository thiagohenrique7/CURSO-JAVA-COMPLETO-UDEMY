import java.util.ArrayList;
import java.util.List;

public class Personagem {
	protected String nome;
	protected Boolean status;
	protected List<String> habilidades = new ArrayList<String>();
	protected int vida;
	
	
	public Personagem(String nome, String habilidade1,String habilidade2) {
		this.nome = nome;
		this.status = false;		
		this.habilidades.add(habilidade1);
		this.habilidades.add(habilidade2);
		this.vida = 100;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public List<String> getHabilidades() {
		return habilidades;
	}


	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	@Override
	public String toString() {
			return "[Nome=" + nome + ", habilidades=" + habilidades + "]";
		
	}
	
	
}
