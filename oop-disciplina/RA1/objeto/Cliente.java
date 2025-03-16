package objeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    // Atributos
    public String nome;
    public String email;
    public String endereco;
    public String telefone;
    public ArrayList<String> historicoPedido;


    // Métodos
    // Exibir informações do Cliente
    public void dadoCliente() {
        System.out.println("\n\nDados do Cliente: " + this.nome);
        System.out.println(" E-mail: " + this.email);
        System.out.println(" Endereço: " + this.endereco);
        System.out.println(" Telefone\\Contato: " + this.telefone);

        if (this.historicoPedido == null || this.historicoPedido.isEmpty()) {
            System.out.println(" Histórico Pedido: Nada no momento");
        } else {
            System.out.println(" Histórico Pedido: " + this.historicoPedido);
        }
    }

    // Retornar uma lista de pedidos registrados 
    public void fazerPedido(int quantidade_pedido) {
        ArrayList<String> listaPedido = new ArrayList<>();
        Scanner lerPedido = new Scanner(System.in);

        if (quantidade_pedido != 0 && quantidade_pedido > 0) {
            for (int inicial = 1; inicial <= quantidade_pedido; inicial++) {
                System.out.print("Pedido " + "[" + inicial + "]: ");
                String ordemPedido = lerPedido.nextLine();
                listaPedido.add(ordemPedido);         
            }
            lerPedido.close();   
        }
        this.historicoPedido = listaPedido;
    }

    // Atualizar o endereço do Destinatário
    public void atualizarEndereco(String atualizar_nomeEndereco) {
        this.endereco = atualizar_nomeEndereco;
        System.out.println("\n\n( Endereço do cliente " + this.nome + " foi atualizado com sucesso! )");
    }


    public static void main(String[] args) {
        // Criando objeto da Classe Cliente
        Cliente novoCliente = new Cliente();

        // Definindo valores para atributos de objeto da Classe Cliente 
        novoCliente.nome = "Roberta";
        novoCliente.email = "robdevteste@gmail.com";
        novoCliente.endereco = "Rua Imaculada Conceição,1155 Prado Velho CEP 80215-901 Curitiba";
        novoCliente.telefone = "Telefone não cadastrado";
        novoCliente.dadoCliente();
        
        // Ler informação de valor inteiro
        Scanner quantidadePedido = new Scanner(System.in);
        System.out.print("\n\nRegistrar quantidade de pedidos (0 para encerrar): ");
        int num_quantidadePedido = quantidadePedido.nextInt();

        // Cadastrar pedidos 
        novoCliente.fazerPedido(num_quantidadePedido);
        quantidadePedido.close();

        // Exibir informações atualizada do Cliente
        novoCliente.telefone = "(41) 9999-9999";
        novoCliente.atualizarEndereco("Rua Oswaldo da Cruz, n.XXX, Centro-PR");
        novoCliente.dadoCliente();
    }
}
