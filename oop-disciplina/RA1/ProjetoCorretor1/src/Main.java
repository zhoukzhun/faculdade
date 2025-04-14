import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Instanciar Objeto de input
        Scanner sc = new Scanner(System.in);

        // Criar uma Coleção de Objetos para Corretores, Clientes e Imóveis
        ArrayList<Corretor> listaCorretor = new ArrayList<>();
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        ArrayList<Imovel> listaImovel = new ArrayList<>();

        // Instanciar Objeto Corretor, Cliente e Imovel
        Corretor novoCorretor = new Corretor();
        Cliente novoCliente = new Cliente();
        Imovel novoImovel = new Imovel();

        // Iniciar Tela de Opções (Menu)
        while (true) {
            // Metodo para "Limpar terminal" (pular de linha)
            limparTerminal();

            // Exibir uma tela de Opções de Menu
            Interface criarInterface = new Interface("Cadastrar Corretor", "Cadastrar Cliente", "Cadastrar Imóvel", "Listar Corretores", "Listar Clientes", "Listar Imóveis", "Sair");
            criarInterface.exibirTela();
            System.out.print("Digitar Opção>  ");
            int lerOpcao = sc.nextInt();

            // Escolher Opção
            switch (lerOpcao) {
                // Cadastrar Corretor
                case 1:
                    listaCorretor.add(novoCorretor.cadastroCorretor(sc));
                    break;

                // Cadastrar Cliente
                case 2:
                    listaCliente.add(novoCliente.cadastroCliente(sc));
                    break;

                // Cadastrar Imovel
                case 3:
                    listaImovel.add(novoImovel.cadastroImovel(sc));
                    break;

                // Exibir Lista de Corretores cadastrados
                case 4:
                    novoCorretor.exibirListaCorretor(listaCorretor);
                    break;

                // Exibir Lista de Clientes cadastrados
                case 5:
                    novoCliente.exibirListaCliente(listaCliente);
                    break;

                // Exibir Lista de Imóveis cadastrados
                case 6:
                    novoImovel.exibirListaImovel(listaImovel);
                    break;

                // Sair do Sistema
                case 7:
                    System.out.println("\nObrigado e volte sempre!");
                    sc.close();
                    break;

                // Caso digite uma Opção inexistente
                default:
                    System.out.println("\nOpção Inválida, digite alguma opção exibido na Interface!");
                    break;
            }

            // Encerrar
            if (lerOpcao == 7) {
                break;
            }

        }
    }

    // Metodo para "limpar terminal" (pular de linha)
    private static void limparTerminal() {
        // Imprimir várias linhas em branco para "limpar" o terminal
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }
}