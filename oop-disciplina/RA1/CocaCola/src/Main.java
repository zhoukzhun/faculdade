import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuarioNovo = new Usuario("zhou@gmail.com", "Rua ABCDEF, n123 - Centro/PR", "Zhou", 0);

        while (true) {
            usuarioNovo.exibirMenuConsumidor();
            System.out.print("Escolha uma das Opções acima -> ");
            int opcaoEscolhida = sc.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    usuarioNovo.exibirInfoUsuario();
                    break;
                case 2:
                    System.out.println("1");
                    break;
                case 3:
                    usuarioNovo.exibirCatalogo();
                    break;
                case 4:
                   usuarioNovo.adicionarRemoverProduto(sc);
                    break;
                case 5:
                    System.out.println("Saindo do Menu..");
                    break;
                default:
                    System.out.println("Ocorreu um erro, digite novamente uma das Opção válidas acima!");
                    break;
            }

            if (opcaoEscolhida == 5) {
                System.out.println("Até logo " + usuarioNovo.getNome() + ", volte sempre! ✌");
            }

        }
    }
}