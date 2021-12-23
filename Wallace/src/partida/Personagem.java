package partida;
import java.util.ArrayList;

 class Personagem {
    private String nome;
    private ArrayList<String> habilidades;
    private boolean status;
    private int vida;

    public Personagem(String nome) {
        this.nome = nome;
        this.habilidades = habilidades;
        this.vida = 100;
        this.status = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" + "Habilidades: " + getHabilidades() + "\n" + "Vida: " + getVida() + "\n";
    }
   
}
