import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            Interface criarInterface = new Interface("Cadastrar Corretor", "Cadastrar Cliente", "Cadastrar Imóvel", "Listar Corretores", "Listar Clientes", "Listar Imóveis", "Sair");
            //Utilidade criarUtilidade = new Utilidade();

            criarInterface.getmenuGeral();
            
            Scanner lerOpcao = new Scanner(System.in);
            System.out.print("Digitar Opção> ");
            

            int opcaoEscolhida = lerOpcao.nextInt();   
            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("1");
                    break;
            
                case 2:
                    System.out.println("2");
                    break;
                
                case 3:
                    System.out.println("3");
                    break;

                case 4:
                    System.out.println("4");
                    break;

                case 5:
                    System.out.println("5");
                    break;
                
                case 6:
                    System.out.println("6");
                    break;

                case 7:
                    System.out.println("7");
                    break;

                default:
                    System.err.println("fora da opcao");
                    break;
            }
            
            lerOpcao.close();
            
            if (opcaoEscolhida < 0 && opcaoEscolhida > 7) {
                break;
            }
        }
    }
}