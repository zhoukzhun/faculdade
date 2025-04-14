import java.util.ArrayList;
import java.util.Scanner;

public class Imovel {
    // Atributos
    private double preco;
    private int quantidadeQuarto;
    private double area;
    private int vagaGaragem;

    // Construtor sem parâmetros
    public Imovel() {
        this(0, 0, 0, 0);
    }

    // Construtor com parâmetros
    public Imovel(double preco, int quantidadeQuarto, double area, int vagaGaragem) {
        this.preco = preco;
        this.quantidadeQuarto = quantidadeQuarto;
        this.area = area;
        this.vagaGaragem = vagaGaragem;
    }

    // Getters
    public double getPreco() {
        return this.preco;
    }

    public int getQuantidadeQuarto() {
        return this.quantidadeQuarto;
    }

    public double getArea() {
        return this.area;
    }

    public int getVagaGaragem() {
        return this.vagaGaragem;
    }

    // Setters
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeQuarto(int quantidadeQuarto) {
        this.quantidadeQuarto = quantidadeQuarto;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setVagaGaragem(int vagaGaragem) {
        this.vagaGaragem = vagaGaragem;
    }

    // Metodo para cadastrar Imóvel
    public Imovel cadastroImovel(Scanner sc) {
        System.out.println("- ".repeat(20) + "\n[ Cadastro de Imóvel ]\n");
        sc.nextLine();

        System.out.print("Preço do Imóvel R$");
        double cadastroPreco = sc.nextDouble();

        System.out.print("Quantidade de Quarto(s): ");
        int cadastroQuantidadeQuarto = sc.nextInt();

        System.out.print("Área total (m²): ");
        double cadastroArea = sc.nextDouble();

        System.out.print("Número de vaga(s) na Garagem: ");
        int cadastroVagaGaragem = sc.nextInt();

        System.out.println("\nCadastro do Imóvel realizado com Sucesso!");
        return new Imovel(cadastroPreco, cadastroQuantidadeQuarto, cadastroArea, cadastroVagaGaragem);
    }

    // Metodo para exibir a lista de Imóveis cadastrados
    public void exibirListaImovel(ArrayList<Imovel> listaImovel) {
        System.out.println("- ".repeat(20) + "\n[ Lista de Imóveis Cadastrados ]\n");

        if (listaImovel.isEmpty()) {
            System.out.println("Nenhum Cadastro de Imóvel realizado no momento!");
        } else {
            for (Imovel informacaoImovel : listaImovel) {
                System.out.println("Preço do Imóvel R$" + informacaoImovel.getPreco());
                System.out.println("Quantidade de Quarto(s): " + informacaoImovel.getQuantidadeQuarto());
                System.out.println("Área Total (m²): " + informacaoImovel.getArea());
                System.out.println("Número de Vagas na Garagem: " + informacaoImovel.getVagaGaragem() + "\n-");
            }
        }
    }
}