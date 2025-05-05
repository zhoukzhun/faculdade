import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario extends Conta {
    private String nome;
    private float descontoPorcentagem;
    private ArrayList<Produto> listaProduto = new ArrayList<>();
    private ArrayList<Produto> listaProdutoCliente = new ArrayList<>();

    public Usuario(String email, String endereco, String nome, float descontoPorcentagem) {
        super(email, endereco);
        this.nome = nome;
        this.descontoPorcentagem = descontoPorcentagem;
    }

    public String getNome() {
        return nome;
    }

    public void exibirInfoUsuario() {
        System.out.println("\n- - Informações do Usuário  - -");
        System.out.println("Usuário: " + this.nome);
        System.out.println("E-mail: " + getEmail());
        System.out.println("Endereço cadastrado pelo Usuário: " + getEndereco());
        System.out.println("* Desconto para compras de nossos produtos: " + this.descontoPorcentagem + "%\n");
    }

    private void produtoArmazenado() {
        listaProduto.add(new Bebida("coca-cola 200ml", 3));
        listaProduto.add(new Bebida("coca-cola 600ml", 6.50f));
        listaProduto.add(new Bebida("coca-cola 2L", 9.50f));
        listaProduto.add(new Bebida("coca-cola lata", 5));
    }

    public void exibirCatalogo() {
        listaProduto.clear();
        produtoArmazenado();

        System.out.print("\nCatálogo dos Produtos:\n");
        for (Produto exibirCadaProduto : listaProduto) {
            exibirCadaProduto.exibirDetalhes();
            System.out.println();
        }
    }

    public void adicionarRemoverProduto(Scanner sc) {
        System.out.print("[Adicionar] digite (1).  [Remover] digite (0)  > ");
        int opcaoAddRemover = sc.nextInt();
        sc.nextLine();

        if (opcaoAddRemover == 1) {
            System.out.print("Nome Produto que deseja Adicionar: ");
            String adicionarProduto = sc.nextLine();

            for (Produto verificarProduto : listaProduto) {
                if (verificarProduto.getNomeProduto().equals(adicionarProduto.toLowerCase().strip())) {
                    listaProdutoCliente.add(new Produto(adicionarProduto, verificarProduto.getPrecoProduto()));
                    break;
                }
            }
            if (listaProdutoCliente.isEmpty()) {
                System.out.print("O produto que você deseja [Adicionar] está inválido, tente novamente!\n");
            }

        } else if (opcaoAddRemover == 0) {
            System.out.print("Nome Produto que deseja Remover: ");
            String removerProduto = sc.nextLine();

            for (Produto verificarProduto : listaProduto) {
                if (verificarProduto.getNomeProduto().equals(removerProduto.toLowerCase().strip())) {
                    listaProdutoCliente.remove(verificarProduto);
                    break;
                }
            }
            if (listaProdutoCliente.isEmpty()) {
                System.out.print("O produto que você deseja [Remover] está inválido, tente novamente!\n");
            }

        }
    }

    public void realizarPedido(Scanner sc) {
        float precototal = 0;
        if (!listaProdutoCliente.isEmpty()) {
            for (Produto listaCliente : listaProdutoCliente) {
                listaCliente.exibirDetalhes();
                precototal += listaCliente.getPrecoProduto();
            }

            System.out.print("Digite (1) para Realizar Pedido  ou (2) para voltar ao Menu >  ");
            int opcaoRealizarPedido = sc.nextInt();

            switch (opcaoRealizarPedido) {
                case 1:
                    System.out.print("Pedido Realizado com Sucesso! Ficou no total de R$" + precototal);
                    break;
                case 2:
                    System.out.print("Voltando ao Menu..\n");
                    break;
                default:
                    System.out.print("Voltando ao Menu, nenhuma opção válida!\n");
            }
        } else {
            System.out.print("Nenhum produto ainda na lista!\n");
        }


    }




}
