import java.util.ArrayList;
import java.util.Scanner;

public class Conta extends Plataforma {
    // SubClasse Conta

    // Atributos
    private ArrayList<Amigo> listaAmizade = new ArrayList<>();
    private ArrayList<Jogo> listaJogoAdquirido = new ArrayList<>();
    private ArrayList<Jogo> listaCarrinhoCompra = new ArrayList<>();

    // Construtor com parâmetros (passando para SuperClasse)
    public Conta(String nomeConta, float saldoConta) {
        super(nomeConta, saldoConta);
    }

    // Metodo para exibir e adicionar Saldo
    public void exibirSaldo(Scanner sc) {
        System.out.println("\n\n"+ "- - ".repeat(12));
        System.out.println("Olá " + getNomeConta() + ", seu saldo na plataforma é de R$" + getSaldoConta());
        System.out.println("\nPara Adicionar Saldo, digite 1. Para sair, digite 0.");
        System.out.print("- - ".repeat(12) + "\nOpção> ");
        int opcaoSaldo = sc.nextInt();

        if (opcaoSaldo == 1) {
            System.out.print("[Adicionar] +R$");
            float adicionarQuantia = sc.nextFloat();

            if (adicionarQuantia > 0) {
                setSaldoConta(getSaldoConta() + adicionarQuantia);
                System.out.println("Saldo Adicionado com Sucesso!");
            } else {
                System.out.println("Saldo Inválido, digite um Saldo maior que zero!");
            }
        } else {
            System.out.println("Retornando ao Menu Principal..");
        }
    }

    // Metodo para Exibir e Comprar os Jogos que estão na lista do Carrinho
    public void exibirCarrinhoCompra(Scanner sc) {
        System.out.println("- - ".repeat(10) + "\nCarrinho de Compras do(a) " + getNomeConta() + ":");

        if (listaCarrinhoCompra.isEmpty()) {
            System.out.println("Nenhum Jogo foi adicionado ao Carrinho :(");

        } else {
            float totalPrecoCompra = 0f;

            for (Jogo exibirCadaJogoCarrinho : listaCarrinhoCompra) {
                System.out.println("Nome do Jogo: " + exibirCadaJogoCarrinho.getNomeJogo().toLowerCase() + "   -->  Preço R$" + exibirCadaJogoCarrinho.getPrecoJogo());
                totalPrecoCompra += exibirCadaJogoCarrinho.getPrecoJogo();
            }

            System.out.println("- - ".repeat(10) + "\nTOTAL da Lista de Compra. R$" + totalPrecoCompra);
            System.out.print("Para Comprar, digite 1. Não comprar, digite 0.  Opção> ");
            int opcaoCompra = sc.nextInt();

            if (opcaoCompra == 1) {
                if (getSaldoConta() >= totalPrecoCompra) {
                    float resto = getSaldoConta() - totalPrecoCompra;
                    setSaldoConta(resto);
                    System.out.println("Compra realizada com êxito. Saldo Atualizado [R$" + getSaldoConta() + "]");
                    listaJogoAdquirido.addAll(listaCarrinhoCompra);
                    listaCarrinhoCompra.clear();
                } else {
                    System.out.println("Saldo insuficiente para realizar a Compra da Lista :(");
                }
            } else {
                System.out.println("Retornando ao Menu Principal..");
            }

        }
    }

    // Metodo para Adicionar e Remover Jogos na lista de Carrinho
    public void adicionarRemoverCompra(Scanner sc) {
        System.out.print("- - ".repeat(10) + "\nAdicionar ao Carrinho digite 1. Para Remover digite 0.  Opção> ");
        int opcaoCompra = sc.nextInt();

        if (opcaoCompra == 1) {
            sc.nextLine();
            System.out.print("[Adicionar] Jogo para a Lista de Compras> ");
            String adicionarNomeJogoCompra = sc.nextLine().toLowerCase();

            System.out.print("[Adicionar] Digite o Preço do Jogo> ");
            float precoJogoCompra = sc.nextFloat();

            if (!adicionarNomeJogoCompra.isEmpty() && precoJogoCompra >= 0) {
                listaCarrinhoCompra.add(new Jogo(adicionarNomeJogoCompra, precoJogoCompra));
                System.out.println("[Jogo: " + adicionarNomeJogoCompra + " ] adicionado ao Lista de Compra!");
            }
            else {
                System.out.println("Ops, tente novamente. Retornando ao Menu Principal..");
            }

        } else if (opcaoCompra == 0){
            System.out.print("[Remover] Jogo da Lista de Compras> ");
            sc.nextLine();
            String removerNomeJogoCompra = sc.nextLine().toLowerCase();
            boolean confirmarRemocaoJogo = false;

            for (Jogo exibirCadaListaCompra : listaCarrinhoCompra) {
                if (exibirCadaListaCompra.getNomeJogo().equals(removerNomeJogoCompra)) {
                    listaCarrinhoCompra.remove(exibirCadaListaCompra);
                    System.out.println("Jogo removido com Sucesso!\nRetornando ao Menu Principal..");
                    confirmarRemocaoJogo = true;
                    break;
                }
            }

            if (!confirmarRemocaoJogo) {
                System.out.println("Não foi encontrado esse Jogo para Remover, tente novamente!");
            }

        } else {
            System.out.println("Tente novamente. Retornando ao Menu Principal..");
        }
    }

    // Metodo para Exibir os Jogos Adquiridos (comprados) na Conta
    public void exibirJogoAdquirido(Scanner sc) {
        System.out.println("- - ".repeat(10) + "\nLista de Jogos Adquiridos na Conta '" + getNomeConta() + "':");

        if (listaJogoAdquirido.isEmpty()) {
            System.out.println("Você não possui nenhum Jogo Adquirido :(");
        } else {
            for (Jogo exibirJogoAdquirido : listaJogoAdquirido) {
                System.out.println(exibirJogoAdquirido.getNomeJogo() + "  -->  comprado por R$" + exibirJogoAdquirido.getPrecoJogo());
            }
        }
    }

    // Metodo para Exibir a Lista de Amizade
    public void exibirListaAmizade(Scanner sc) {
        if (listaAmizade.isEmpty()) {
            System.out.println("Nenhum Amigo adicionado ainda na sua Lista de Amizade");
        } else {
            System.out.println("- - ".repeat(10) + "\nLista de Amizade:");
            for (Amigo exibirAmigo : listaAmizade) {
                System.out.println("Amigo(a): " + exibirAmigo.getNomeAmigo());
            }
        }
    }

    // Metodo para Adicionar e Remover Amigo da Lista de Amizade
    public void adicionarRemoverAmigo(Scanner sc) {
        System.out.print("- - ".repeat(10) + "\nAdicionar Amigo ao sua Lista, digite 1. Para Remover, digite 0.  Opção> ");
        int opcaoAmigo = sc.nextInt();

        if (opcaoAmigo == 1) {
            System.out.print("\nNome do Usuário que deseja [Adicionar] ao sua Lista> ");
            sc.nextLine();
            String adicionarAmigo = sc.nextLine().toLowerCase();
            listaAmizade.add(new Amigo(adicionarAmigo));
            System.out.println("Usuário '" + adicionarAmigo + "' Adicionado com Sucesso!");

        } else if (opcaoAmigo == 0) {
            System.out.print("\nNome do Usuário que deseja [Remover] da sua lista> ");
            sc.nextLine();
            String removerAmigo = sc.nextLine().toLowerCase();
            boolean confirmarRemocaoAmigo = false;

            for (Amigo removerListaAmigo : listaAmizade) {
                if (removerListaAmigo.getNomeAmigo().equals(removerAmigo)) {
                    System.out.println("Usuário '" + removerListaAmigo.getNomeAmigo() + "' [removido] com Sucesso da sua Lista!");
                    listaAmizade.remove(removerListaAmigo);
                    confirmarRemocaoAmigo = true;
                    break;
                }
            }

            if (!confirmarRemocaoAmigo) {
                System.out.println("Usuário [não encontrado] ao remover, tente novamente!");
            }

        } else {
            System.out.println("Retornando ao Menu Principal..");
        }
    }
}