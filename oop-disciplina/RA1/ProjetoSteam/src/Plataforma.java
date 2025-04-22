public class Plataforma {
    // SuperClasse Plataforma

    // Atributos
    private String nomePlataforma;
    private String nomeConta;
    private float saldoConta;

    // Construtor com parâmetros
    public Plataforma(String nomeConta, float saldoConta) {
        this.nomeConta = nomeConta;
        this.saldoConta = saldoConta;
    }

    // Construtor sem parâmetros
    public Plataforma(String nomePlataforma) {
        this.nomePlataforma = nomePlataforma;
    }

    // Getters
    public String getNomePlataforma() {
        return this.nomePlataforma = nomePlataforma;
    }

    public String getNomeConta() {
        return this.nomeConta;
    }

    public float getSaldoConta() {
        return this.saldoConta;
    }

    // Setters
    public void setNomePlataforma(String nomePlataforma) {
        this.nomePlataforma = nomePlataforma;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    // Metodo para exibir tela de Menu Principal
    public void exibirMenu() {
        System.out.println("- - ".repeat(10));
        System.out.println("\t\t\t( " + this.nomePlataforma.toUpperCase() + " )");
        System.out.println("1 -  Saldo");
        System.out.println("2 -  Carrinho Compra");
        System.out.println("3 -  Jogos Adquiridos");
        System.out.println("4 -  Adicionar ou Remover Jogo da Compra");
        System.out.println("5 -  Lista de Amigos");
        System.out.println("6 -  Adicionar ou Remover da Lista de Amigos");
        System.out.println("7 -  Sair");
        System.out.println("- - ".repeat(10));

    }
}