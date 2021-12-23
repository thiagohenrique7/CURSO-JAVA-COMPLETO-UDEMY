package partida;
public class Jogador {
    private String nome, apelido, email, telefone;

    public Jogador() {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void status() {
        System.out.println("O nome do jog1 é: " + this.getNome());
    }
}
