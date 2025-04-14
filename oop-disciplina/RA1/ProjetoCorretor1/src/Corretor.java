import java.util.ArrayList;
import java.util.Scanner;

public class Corretor {
    // Atributos
    private String nome;
    private String creci;
    private String telefone;
    private String email;
    private int numeroVendas;

    // Construtor sem parâmetros
    public Corretor() {
        this(null, null, null, null, 0);
    }

    // Construtor com parâmetros
    public Corretor(String nome, String creci, String telefone, String email, int numeroVendas) {
        this.nome = nome;
        this.creci = creci;
        this.telefone = telefone;
        this.email = email;
        this.numeroVendas = numeroVendas;
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getCreci() {
        return this.creci;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public int getNumeroVendas() {
        return this.numeroVendas;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    // Metodo para cadastrar Corretores
    public Corretor cadastroCorretor(Scanner sc) {
        System.out.println("- ".repeat(20) + "\n[ Cadastro de Corretor ]\n");
        sc.nextLine();

        System.out.print("Cadastrar nome do Corretor: ");
        String cadastroNome = sc.nextLine();

        System.out.print("Cadastrar Identificação CRECI do Corretor: ");
        String cadastroCreci = sc.nextLine();

        System.out.print("Cadastrar telefone do Corretor: ");
        String cadastroTelefone = sc.nextLine();

        System.out.print("Cadastrar email do Corretor: ");
        String cadastroEmail = sc.nextLine();

        System.out.print("Cadastrar número de vendas do Corretor: ");
        int cadastroNumeroVendas = sc.nextInt();

        System.out.println("\nCadastro do Corretor realizado com Sucesso!");
        return new Corretor(cadastroNome, cadastroCreci, cadastroTelefone, cadastroEmail, cadastroNumeroVendas);
    }

    // Metodo para exibir a lista de Corretores cadastrados
    public void exibirListaCorretor(ArrayList<Corretor> listaCorretor) {
        System.out.println("- ".repeat(20) + "\n[ Lista de Corretores Cadastrados ]\n");

        if (listaCorretor.isEmpty()) {
            System.out.println("Nenhum Cadastro de Corretor realizado no momento!");
        } else {
            for (Corretor informacaoCorretor : listaCorretor) {
                System.out.println("Nome do Corretor: " + informacaoCorretor.getNome());
                System.out.println("Identificação CRECI do Corretor: " + informacaoCorretor.getCreci());
                System.out.println("Telefone do Corretor: " + informacaoCorretor.getTelefone());
                System.out.println("Email do Corretor: " + informacaoCorretor.getEmail());
                System.out.println("Número de Vendas: " + informacaoCorretor.getNumeroVendas() + "\n-");
            }
        }
    }
}
