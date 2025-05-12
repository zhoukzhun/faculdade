public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa() {
        this.nome = null;
        this.idade = 0;
        this.altura = 0;
    }

    public void exibirInfoPessoa() {
        System.out.println(" - - ".repeat(10));
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nAltura: " + this.altura);
        System.out.println(" - - ".repeat(10));
    }

    public void apresentar() {
        System.out.println("Olá, sou uma pessoa, e me chamo " + this.nome + "!");
    }

}
