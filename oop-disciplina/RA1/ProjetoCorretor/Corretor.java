import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Corretor {

    // Criar Atributo de Lista em outra Lista
    private List<List<Object>> listaCorretor = new ArrayList<>();
    
    // Criar Objeto input (ler dados) 
    Scanner passarinfo = new Scanner(System.in);

    // Getter da atributo listaCorretor (todos os cadastrados)
    public List<List<Object>> getListaCorretor() {
        return this.listaCorretor;
    }

    // Método para adicionar cadastro do corretor para uma lista geral de Corretores
    public void adicionarCorretor(List<Object> cadastroCorretorIndiv) {
        this.listaCorretor.add(cadastroCorretorIndiv);
    }

    // Método para retornar uma lista de informações cadastradas do Corretor 
    public List<Object> cadastrarCorretor() {
        
        // Criação de Objeto lista para armazenar as informações
        List<Object> cadastroCorretorIndiv = new ArrayList<>();

        // Criação de váriaveis das informações sobre o corretor
        String nomeCorretor;
        int idadeCorretor;
        String cpfCorretor;
        String estadoCivilCorretor;
        String empresaAtuaCorretor;

        // Cadastrar nome do Corretor
        while (true) {
            System.out.print("\nCadastrar nome Corretor: ");
            nomeCorretor = passarinfo.nextLine();

            if (nomeCorretor.isEmpty()) {
                System.out.println("Nome está vazio, tente novamente!\n");            
            } else {
                break;
            }
        }

        // Cadastrar idade do Corretor
        while (true) {
            System.out.print("Cadastrar idade do Corretor: ");
            idadeCorretor = passarinfo.nextInt(); 

            if (idadeCorretor < 0) {
                System.out.println("Idade é negativo, tente novamente!\n");
            } else {
                passarinfo.nextLine();
                break;
            }
        }

        // Cadastrar cpf do Corretor
        while (true) {
            System.out.print("Cadastrar cpf do Corretor: ");
            cpfCorretor = passarinfo.nextLine();
            
            if (cpfCorretor.isEmpty()) {
                System.out.println("CPF em branco, tente novamente!\n");
            } else if (cpfCorretor.length() == 0 || cpfCorretor.length() <= 5) {
                System.out.println("CPF abaixo ou igual a 5 caracteres, tente novamente!\n");
            } else {
                break;
            }
        }
        
        // Cadastrar estado civil do Corretor
        while (true) {
            System.out.print("Cadastrar estado civil do Corretor: ");
            estadoCivilCorretor = passarinfo.nextLine();
            
            if (estadoCivilCorretor.isEmpty() || estadoCivilCorretor == "") {
                System.out.println("O estado civil está vazio, tente novamente!\n");
            } else {
                break;
            }
        }
        
        // Cadastrar empresa que o Corretor atua
        while (true) {
            System.out.print("Cadastrar empresa que o Corretor atua: ");
            empresaAtuaCorretor = passarinfo.nextLine();
            
            if (empresaAtuaCorretor.isEmpty() || empresaAtuaCorretor == "") {
                System.out.println("Digite a empresa que está atuando no momento!\n");
            } else {
                break;
            }
        }
        
        // Adicionar essas informações cadastradas para uma lista individual
        cadastroCorretorIndiv.add(nomeCorretor);
        cadastroCorretorIndiv.add(idadeCorretor);
        cadastroCorretorIndiv.add(cpfCorretor);
        cadastroCorretorIndiv.add(estadoCivilCorretor);
        cadastroCorretorIndiv.add(empresaAtuaCorretor);

        System.out.println("\nCadastro efetuado com Sucesso!");
        return cadastroCorretorIndiv;
    }

}