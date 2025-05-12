public class Treinador extends Pessoa {
    private String especialidade;

    public Treinador(String nome, int idade, float altura, String especialidade) {
        super(nome, idade, altura);
        this.especialidade = especialidade;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou Treinador e a minha especialidade é " + especialidade);
    }

    public void treinarAtleta() {
        System.out.println("O Treinador está treinando um atleta na área de " + especialidade + "!");
    }

}
