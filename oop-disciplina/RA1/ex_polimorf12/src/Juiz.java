public class Juiz extends Pessoa {
    private String modalidadeArbitrada;

    public Juiz(String nome, int idade, float altura, String modalidadeArbitrada) {
        super(nome, idade, altura);
        this.modalidadeArbitrada = modalidadeArbitrada;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá sou Juiz e arbitro jogos de " + modalidadeArbitrada);
    }

    public void apitarJogo() {
        System.out.println("O Juiz está apitando o jogo de " + modalidadeArbitrada + "!");
    }
}
