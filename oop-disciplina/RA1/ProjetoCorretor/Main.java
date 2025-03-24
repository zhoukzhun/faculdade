import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Criação de Objetos Interface, Corretor, Cliente e Imóvel
        Interface objMenu = new Interface();
        Corretor novoCorretor = new Corretor();
        Cliente novoCliente = new Cliente();
        Imovel novoImovel = new Imovel();

        // Criação de Objetos lerOpcao e pularEtapa (input de dados)
        Scanner lerOpcao = new Scanner(System.in);
        Scanner pularEtapa = new Scanner(System.in);

        while (true) { 
            // Exibir menu e ler opção
            objMenu.exibirMenu();
            int opcaoEscolhida = lerOpcao.nextInt();
            
            // Opção escolhida no menu
            switch (opcaoEscolhida) {
                // Opção 1
                case 1:                    
                    List<Object> passarInfoCadastroCorretor = novoCorretor.cadastrarCorretor();
                    novoCorretor.adicionarCorretor(passarInfoCadastroCorretor);
                    break;
                
                // Opção 2
                case 2:
                    List<Object> passarInfoCadastroCliente = novoCliente.cadastrarCliente();
                    novoCliente.adicionarCliente(passarInfoCadastroCliente); 
                    break;
                
                // Opção 3
                case 3:
                    List<Object> passarInfoCadastroImovel = novoImovel.cadastrarImovel();
                    novoImovel.adicionarImovel(passarInfoCadastroImovel);
                    break;
                
                // Opção 4
                case 4:
                    List<List<Object>> listagemCorretor = novoCorretor.getListaCorretor();
                    System.out.println("\nCorretores Cadastrados:");

                    for (int pos1 = 0; pos1 < listagemCorretor.size(); pos1++) {
                        System.out.println("-\nNome: " + listagemCorretor.get(pos1).get(0));
                        System.out.println("Idade: " + listagemCorretor.get(pos1).get(1));
                        System.out.println("CPF: " + listagemCorretor.get(pos1).get(2));
                        System.out.println("Estado civil: " + listagemCorretor.get(pos1).get(3));
                        System.out.println("Empresa que está atuando: " + listagemCorretor.get(pos1).get(4));
                    }

                    System.out.println("- ".repeat(20));
                    System.out.print("\nAperte qualquer tecla para prosseguir>  ");
                    
                    String pularProxEtapa1 = pularEtapa.nextLine();
                    break;

                // Opção 5
                case 5:
                    List<List<Object>> listagemCliente = novoCliente.getListaCliente();
                    System.out.println("\nClientes Cadastrados: ");

                    for (int pos1 = 0; pos1 < listagemCliente.size(); pos1++) {
                        System.out.println("-\nNome: " + listagemCliente.get(pos1).get(0));
                        System.out.println("Idade: " + listagemCliente.get(pos1).get(1));
                        System.out.println("CPF: " + listagemCliente.get(pos1).get(2));
                        System.out.println("Estado civil: " + listagemCliente.get(pos1).get(3));
                        System.out.println("Tipo de Imóvel interessado: " + listagemCliente.get(pos1).get(4));

                    }

                    System.out.println("- ".repeat(20));
                    System.out.println("\nAperte qualquer tecla para prosseguir> ");

                    String pularProxEtapa2 = pularEtapa.nextLine();
                    break;

                // Opção 6
                case 6:
                    List<List<Object>> listagemImovel = novoImovel.getListaImovel();
                    System.out.println("\nImóveis Cadastrados: ");

                    for (int pos1 = 0; pos1 < listagemImovel.size(); pos1++) {
                        System.out.println("-\nTipo Imóvel: " + listagemImovel.get(pos1).get(0));
                        System.out.println("Endereço Imóvel: " + listagemImovel.get(pos1).get(1));
                        System.out.println("Área Imóvel: " + listagemImovel.get(pos1).get(2));
                        System.out.println("Vagas Estacionamento: " + listagemImovel.get(pos1).get(3));
                        System.out.println("Cômodo Extra: " + listagemImovel.get(pos1).get(4));
                        System.out.println("Idade Imóvel: " + listagemImovel.get(pos1).get(5));
                        System.out.println("Valor da Venda: " + listagemImovel.get(pos1).get(6));
                        System.out.println("Condição de Pagamento: " + listagemImovel.get(pos1).get(7));
                        System.out.println("Desconto ou Negociar: " + listagemImovel.get(pos1).get(8));
                    }

                    System.out.println("- ".repeat(20));
                    System.out.println("\nAperte qualquer tecla para prosseguir> ");

                    String pularProxEtapa3 = pularEtapa.nextLine();
                    break;
                
                // Opção 7
                case 7:
                    System.out.println("\nObrigado, volte sempre :)");
                    break;

                // Fora das Opções
                default:
                    System.out.println("\nNão existe essa opção, espere um momento!");
                    break;

            }
            
            if (opcaoEscolhida == 7) {
                pularEtapa.close();
                lerOpcao.close();
                break;
            }  

            try {
                // Congela a tela por 2 segundos (2000 milissegundos)
                Thread.sleep(2000); 
                // Limpa a tela
                objMenu.limparTela();
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }

        }
    }
}
