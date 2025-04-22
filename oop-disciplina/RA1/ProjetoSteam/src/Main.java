import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciando Objeto Scanner (input)
        Scanner sc = new Scanner(System.in);

        // Instanciando Objeto Plataforma e Conta
        Plataforma steamPlataforma = new Plataforma("Steam");
        Conta usuario = new Conta("Zhou", 0);

        // Menu Principal
        while (true) {
            steamPlataforma.exibirMenu();
            System.out.print("Opção> ");
            int opcaoEscolhido = sc.nextInt();

            // Ler a Opção Escolhido
            switch (opcaoEscolhido) {
                // Opção 1 (Exibir e Adicionar Saldo)
                case 1:
                    usuario.exibirSaldo(sc);
                    break;

                // Opção 2 (Exibir e Comprar Jogos no Carrinho)
                case 2:
                    usuario.exibirCarrinhoCompra(sc);
                    break;

                // Opção 3 (Exibir a Lista de Jogos que possui)
                case 3:
                    usuario.exibirJogoAdquirido(sc);
                    break;

                // Opção 4 (Adicionar e Remover Jogos na Lista de Carrinho)
                case 4:
                    usuario.adicionarRemoverCompra(sc);
                    break;

                // Opção 5 (Exibir Lista de Amizade)
                case 5:
                    usuario.exibirListaAmizade(sc);
                    break;

                // Opção 6 (Adicionar e Remover Usuários da Lista de Amizade)
                case 6:
                    usuario.adicionarRemoverAmigo(sc);
                    break;

                // Opção 7 (Sair da Plataforma - Menu Principal)
                case 7:
                    System.out.println("- - ".repeat(10));
                    System.out.println("Saindo da Plataforma " + steamPlataforma.getNomePlataforma() + "!");
                    sc.close();
                    break;

                // Nenhuma das Opções Acima
                default:
                    System.out.println("- - ".repeat(10));
                    System.out.println("Opção Inválida, tente novamente!");
                    break;
            }

            // Encerrar o Programa (Opção 7)
            if (opcaoEscolhido == 7) {
                System.out.println("Volte Sempre " + usuario.getNomeConta() + " :)");
                break;
            }
        }
    }
}