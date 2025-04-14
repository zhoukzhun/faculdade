import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    // Atributos
    private String nome;
    private int cpf;
    private String dataNascimento;
    private String email;
    private String telefone;

    // Construtor sem parâmetros
    public Cliente() {
        this(null, 0, null, null, null);
    }

    // Construtor com parâmetros
    public Cliente(String nome, int cpf, String dataNascimento, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Metodo para cadastrar clientes
    public Cliente cadastroCliente(Scanner sc) {
        System.out.println("- ".repeat(20) + "\n[ Cadastro de Cliente ]\n");
        sc.nextLine();

        System.out.print("Cadastrar nome do Cliente: ");
        String cadastroNome = sc.nextLine();

        System.out.print("Cadastrar CPF do Cliente: ");
        int cadastroCpf = sc.nextInt();
        sc.nextLine();

        System.out.print("Cadastrar Data de Nascimento do Cliente: ");
        String cadastroDataNascimento = sc.nextLine();

        System.out.print("Cadastrar Email do Cliente: ");
        String cadastroEmail = sc.nextLine();

        System.out.print("Cadastrar telefone do Cliente: ");
        String cadastroTelefone = sc.nextLine();

        System.out.println("\nCadastro do Cliente realizado com Sucesso!");
        return new Cliente(cadastroNome, cadastroCpf, cadastroDataNascimento, cadastroEmail, cadastroTelefone);
    }

    // Metodo para exibir a lista de Clientes cadastrados
    public void exibirListaCliente(ArrayList<Cliente> listaCliente) {
        System.out.println("- ".repeat(20) + "\n[ Lista de Clientes Cadastrados ]\n");

        if (listaCliente.isEmpty()) {
            System.out.println("Nenhum Cadastro de Cliente realizado no momento!");
        } else {
            for (Cliente informacaoCliente : listaCliente) {
                System.out.println("Nome do Cliente: " + informacaoCliente.getNome());
                System.out.println("CPF do Cliente: " + informacaoCliente.getCpf());
                System.out.println("Data de Nascimento: " + informacaoCliente.getDataNascimento());
                System.out.println("Email do Cliente: " + informacaoCliente.getEmail());
                System.out.println("Telefone do Cliente: " + informacaoCliente.getTelefone() + "\n-");
            }
        }
    }
}