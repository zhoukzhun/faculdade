public class Main {
    public void modoAcaoJuiz(Pessoa pessoa) {
        if (pessoa instanceof Juiz) {
            Juiz juizPessoa = (Juiz) pessoa;
            juizPessoa.apitarJogo();
        }
    }

    private void modoAcaoAtleta(Pessoa pessoa) {
        if (pessoa instanceof Atleta) {
            Atleta atletaPessoa = (Atleta) pessoa;
            atletaPessoa.competir();
        }
    }

    private void modoAcaoTreinador(Pessoa pessoa) {
        if (pessoa instanceof Treinador) {
            Treinador treinadorPessoa = (Treinador) pessoa;
            treinadorPessoa.treinarAtleta();
        }
    }

    public void apresentarPessoa(Pessoa pessoa) {
        pessoa.apresentar();
    }

    public static void main(String[] args) {
        Main main = new Main();

        Pessoa pessoa1 = new Juiz("Jorge", 34, 1.70f,"Futebol");
        Pessoa pessoa2 = new Atleta("Pep", 40, 1.75f, "Futebol");
        Pessoa pessoa3 = new Treinador("Messi", 29, 1.67f, "Futebol");

        pessoa1.apresentar();
        pessoa2.apresentar();
        pessoa3.apresentar();

        System.out.println("- - ".repeat(15));

        main.modoAcaoJuiz(pessoa1);
        main.modoAcaoAtleta(pessoa2);
        main.modoAcaoTreinador(pessoa3);

        System.out.println("- - ".repeat(15));

        main.apresentarPessoa(pessoa1);
        main.apresentarPessoa(pessoa2);
        main.apresentarPessoa(pessoa3);
    }

}