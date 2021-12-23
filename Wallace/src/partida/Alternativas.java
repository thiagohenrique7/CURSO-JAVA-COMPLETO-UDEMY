package partida;

public class Alternativas {
    private String enunciado;
    private boolean status;

    public Alternativas(String enunciado, boolean status) {
        this.enunciado = enunciado;
        this.status = status;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
