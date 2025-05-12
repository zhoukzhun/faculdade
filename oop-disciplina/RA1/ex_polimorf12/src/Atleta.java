public class Atleta extends Pessoa {
    private String modalidade;

    public Atleta(String nome, int idade, float altura, String modalidade) {
        super(nome, idade, altura);
        this.modalidade = modalidade;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou Atleta e pratico " + modalidade);
    }

    public void competir() {
        System.out.println("O Atleta está competindo na modalidade " + modalidade + "!");
    }
}
