public class Jogo {
    // Atributos
    private String nomeJogo;
    private float precoJogo;

    // Construtor com parâmetros
    public Jogo(String nomeJogo, float precoJogo) {
        this.nomeJogo = nomeJogo;
        this.precoJogo = precoJogo;
    }

    // Getters
    public String getNomeJogo() {
        return this.nomeJogo;
    }

    public float getPrecoJogo() {
        return this.precoJogo;
    }

    // Setters
    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public void setPrecoJogo(float precoJogo) {
        this.precoJogo = precoJogo;
    }
}