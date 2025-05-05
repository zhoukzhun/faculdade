import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario extends Conta {
    private String nome;
    private float descontoPorcentagem;
    private ArrayList<Produto> listaProduto = new ArrayList<>();

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

    public void exibirCatalogo() {
        listaProduto.clear();
        listaProduto.add(new Bebida("Coca-Cola 200ml", 3));
        listaProduto.add(new Bebida("Coca-Cola 600ml", 6.50f));
        listaProduto.add(new Bebida("Coca-Cola 2L", 9.50f));
        listaProduto.add(new Bebida("Coca-Cola Lata", 5));

        System.out.print("\nCatálogo dos Produtos:\n");
        for (Produto exibirCadaProduto : listaProduto) {
            exibirCadaProduto.exibirDetalhes();
            System.out.println();
        }
    }

    public void adicionarRemoverProduto(Scanner sc) {
        System.out.println("\n[1] Adicionar Produto");
        System.out.println("[2] Remover Produto");
        System.out.print("Escolha: ");
        int escolha = sc.nextInt();
        sc.nextLine();

        if (escolha == 1) {
            System.out.print("Nome do Produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do Produto: ");
            float preco = sc.nextFloat();
            listaProduto.add(new Bebida(nomeProduto, preco));
            System.out.println("Produto adicionado com sucesso!");
        } else if (escolha == 2) {
            if (listaProduto.isEmpty()) {
                System.out.println("Não há produtos para remover.");
                return;
            }

            System.out.println("Produtos disponíveis:");
            for (int i = 0; i < listaProduto.size(); i++) {
                System.out.println("[ " + i + " ] " + listaProduto.get(i).getNomeProduto());
            }

            System.out.print("Digite o número do produto que deseja remover: ");
            int numProduto = sc.nextInt();

            if (numProduto >= 0 && numProduto < listaProduto.size()) {
                Produto removido = listaProduto.remove(numProduto);
                System.out.println("Produto \"" + removido.getNomeProduto() + "\" removido com sucesso!");
            } else {
                System.out.println("Índice inválido.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public void efetuarPedido(Scanner sc) {
        if (listaProduto.isEmpty()) {
            exibirCatalogo();
        }

        ArrayList<Produto> carrinho = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSelecione um produto para adicionar ao carrinho:");
            for (int i = 0; i < listaProduto.size(); i++) {
                System.out.println("[ " + i + " ] " + listaProduto.get(i).getNomeProduto() + " - R$" + listaProduto.get(i).getPrecoProduto());
            }
            System.out.println("[ -1 ] Finalizar pedido");

            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            if (escolha == -1) {
                continuar = false;
            } else if (escolha >= 0 && escolha < listaProduto.size()) {
                carrinho.add(listaProduto.get(escolha));
                System.out.println("Produto adicionado ao carrinho!");
            } else {
                System.out.println("Opção inválida.");
            }
        }

        if (carrinho.isEmpty()) {
            System.out.println("Nenhum produto selecionado.");
            return;
        }

        float total = 0f;
        System.out.println("\nResumo do Pedido:");
        for (Produto p : carrinho) {
            p.exibirDetalhes(); // chamada polimórfica
            System.out.println();
            total += p.getPrecoProduto();
        }

        float desconto = total * (descontoPorcentagem / 100);
        float totalComDesconto = total - desconto;

        System.out.printf("Total bruto: R$%.2f\n", total);
        System.out.printf("Desconto aplicado (%.1f%%): R$%.2f\n", descontoPorcentagem, desconto);
        System.out.printf("Total final com desconto: R$%.2f\n", totalComDesconto);
    }



}
