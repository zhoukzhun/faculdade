import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    // Criação de atributo lista em outra lista (lista geral de clientes cadastrados)
    private List<List<Object>> listaCliente = new ArrayList<>();

    // Criação de Objeto input (ler dados)
    Scanner passarInfo = new Scanner(System.in);

    // getter atributo listaCliente
    public List<List<Object>> getListaCliente() {
        return this.listaCliente;
    }

    // Método adicionar cliente para lista geral (listaCliente)
    public void adicionarCliente(List<Object> cadastrarClienteIndiv) {
        this.listaCliente.add(cadastrarClienteIndiv);
    }

    // Método para cadastrar cliente individualmente
    public List<Object> cadastrarCliente() {

        // Criação de objeto lista individual de um cliente 
        List<Object> cadastrarClienteIndiv = new ArrayList<>();
        
        // Criação de variáveis das informações que serão cadastradas
        String nomeCliente;
        int idadeCliente;
        String cpfCliente;
        String estadoCivilCliente;
        String tipoImovelDesejado;

        // Cadastrar nome do Cliente
        while (true) {
            System.out.print("\nNome do Cliente: ");
            nomeCliente = passarInfo.nextLine();

            if (nomeCliente.isEmpty() || nomeCliente == "") {
                System.out.println("Nome do Cliente vazio, tente novamente!\n");
            } else {
                break;
            }
        }

        // Cadastrar idade do Cliente
        while (true) {
            System.out.print("Idade do Cliente: ");
            idadeCliente = passarInfo.nextInt();
            
            if (idadeCliente < 0) {
                System.out.println("Idade abaixo de 0, tente novamente!\n");
            } else {
                passarInfo.nextLine();
                break;
            }
        }

        // Cadastrar CPF do Cliente
        while (true) {
            System.out.print("CPF do Cliente: ");
            cpfCliente = passarInfo.nextLine();

            if (cpfCliente.isEmpty() || cpfCliente.length() <= 5) {
                System.out.println("CPF abaixo de 5 caracteres, tente novamente!\n");
            } else {
                break;
            }
        }

        // Cadastrar Estado civil do Cliente
        while (true) {
            System.out.print("Estado Civil do Cliente: ");
            estadoCivilCliente = passarInfo.nextLine();

            if (estadoCivilCliente.isEmpty() || estadoCivilCliente.length() <= 4) {
                System.out.println("Digite novamente o seu estado civil!\n");
            } else {
                break;
            }
        }

        // Cadastrar tipo de Imóvel desejado pelo Cliente
        while (true) {
            System.out.print("Tipo de Imóvel interessado do Cliente: ");
            tipoImovelDesejado = passarInfo.nextLine();

            if (tipoImovelDesejado.isEmpty() || tipoImovelDesejado.length() <= 3) {
                System.out.println("Digite corretamente o tipo de Imóvel interessado!\n");
            } else {
                break;
            }
        }

        // Passar as informações para uma lista individual (Cadastro Cliente)
        cadastrarClienteIndiv.add(nomeCliente);
        cadastrarClienteIndiv.add(idadeCliente);
        cadastrarClienteIndiv.add(cpfCliente);
        cadastrarClienteIndiv.add(estadoCivilCliente);
        cadastrarClienteIndiv.add(tipoImovelDesejado);

        System.out.println("\nCadastro efetuado com Sucesso!");
        return cadastrarClienteIndiv;
    }   
}
