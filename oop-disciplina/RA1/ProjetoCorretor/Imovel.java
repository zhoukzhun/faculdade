import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imovel {

    // Criação de atributo Lista em outra lista (lista de todos Imóveis cadastrados)
    private List<List<Object>> listaImovel = new ArrayList<>();

    // Criação de Objeto input (ler dados)
    Scanner passarInfo = new Scanner(System.in);

    // getter do atributo listaImovel
    public List<List<Object>> getListaImovel() {
        return this.listaImovel;
    }

    // Método para adicionar informações individuais de um Imóvel para uma lista geral
    public void adicionarImovel(List<Object> cadastrarImovelIndiv) {
        this.listaImovel.add(cadastrarImovelIndiv);
    }

    // Cadastrar individualmente um Imóvel
    public List<Object> cadastrarImovel() {

        // Criar uma lista para cadastro separados dos imóveis
        List<Object> cadastrarImovelIndiv = new ArrayList<>();

        // Criar variáveis das informações que serão cadastradas de um Imóvel
        String tipoImovel;
        String enderecoImovel;
        String areaImovel;
        int quantidadeVagaEstacionamento;
        String comodoExtra;
        int idadeImovel;
        float valorVenda;
        String condicaoPagamento;
        String descontoNegociar;

        // Cadastrar tipo de imóvel 
        while (true) {
            System.out.print("\nTipo de Imóvel: ");
            tipoImovel = passarInfo.nextLine();

            if (tipoImovel.isEmpty() || tipoImovel.length() <= 3) {
                System.out.println("Tipo de imóvel não válido, digite novamente!");
            } else {
                break;
            }
        }

        // Cadastrar endereço de um Imóvel
        while (true) {
            System.out.print("Endereço Imóvel: ");
            enderecoImovel = passarInfo.nextLine();

            if (enderecoImovel.isEmpty() || enderecoImovel.length() <= 3) {
                System.out.println("Endereço do Imóvel não válido, tente novamente!");
            } else {
                break;
            }
        }

        // Cadastrar área total do Imóvel
        while (true) {
            System.out.print("Área Total do Imóvel: ");
            areaImovel = passarInfo.nextLine();

            if (areaImovel.isEmpty()) {
                System.out.println("Área do Imóvel inválida, tente novamente!");
            } else {
                break;
            }
        }

        // Cadastrar quantidade de vagas disponíveis no Estacionamento
        while (true) {
            System.out.print("Quantidade de Vagas (Estacionamento) > ");
            quantidadeVagaEstacionamento = passarInfo.nextInt();

            if (quantidadeVagaEstacionamento < 0) {
                System.out.println("Quantidade de vagas negativa, tente novamente!");
            } else {
                break;
            }
        }

        // Adicionar informações caso exista cômodo extra
        while (true) {
            System.out.print("Cômodo extra: ");
            comodoExtra = passarInfo.nextLine();

            if (comodoExtra.isEmpty()) {
                System.out.println("Caso não tenha Cômodo, digite apenas 'não possui'");
            } else {
                break;
            }
        }

        // Adicionar a idade do Imóvel
        while (true) {
            System.out.println("Idade do Imóvel: ");
            idadeImovel = passarInfo.nextInt();

            if (idadeImovel < 0) {
                System.out.println("Digite a idade desse Imóvel (0 ou acima)");
            } else {
                break;
            }
        }

        // Adicionar o valor da venda de um Imóvel 
        while (true) {
            System.out.print("Valor da Venda do Imóvel: ");
            valorVenda = passarInfo.nextFloat();
            
            if (valorVenda <= 0) {
                System.out.println("Digitar um valor acima de 0");
            } else {
                break;
            }
        }

        // Adicionar condições de pagamentos 
        while (true) {
            System.out.print("Condição de Pagamento: ");
            condicaoPagamento = passarInfo.nextLine();

            if (condicaoPagamento.isEmpty()) {
                System.out.println("Coloque a condição de pagamento desejado para esse imóvel!");
            } else {
                break;
            }
        }

        // Adicionar negociação ou desconto
        while (true) {
            System.out.println("Digite um desconto ou Negociar desejado: ");
            descontoNegociar = passarInfo.nextLine();

            if (descontoNegociar.isEmpty()) {
                System.out.println("Caso prefira apenas manter a condição atual, digite algo como 'sem negociação'");
            } else {
                break;
            }
        }   

        // Registrar todas essas informações para Lista individual do Imóvel
        cadastrarImovelIndiv.add((tipoImovel));
        cadastrarImovelIndiv.add((enderecoImovel));
        cadastrarImovelIndiv.add((areaImovel));
        cadastrarImovelIndiv.add((quantidadeVagaEstacionamento));
        cadastrarImovelIndiv.add((comodoExtra));
        cadastrarImovelIndiv.add((idadeImovel));
        cadastrarImovelIndiv.add((valorVenda));
        cadastrarImovelIndiv.add((condicaoPagamento));
        cadastrarImovelIndiv.add((descontoNegociar));

        System.out.println("\nCadastro efetuado com Sucesso!");
        return cadastrarImovelIndiv;
    }
}
