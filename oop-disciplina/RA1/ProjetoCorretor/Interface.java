import java.util.List;

public class Interface {

    // Método exibir menu
    public void exibirMenu() {

        List<String> listaOpcao = List.of("Cadastrar Corretor", "Cadastrar Cliente", "Cadastrar Imóvel", 
        "Listar Corretores", "Listar Clientes", "Listar Imóveis", "Sair");
        
        System.out.println("- ".repeat(20));

        for (int numOpcao = 0; numOpcao < listaOpcao.size(); numOpcao++) {
            System.out.println(numOpcao + 1 + " - " + listaOpcao.get(numOpcao));
        }

        System.out.print("- ".repeat(20) + "\nDigitar Opção>  ");
        
    }

    // Método para limpar tela do terminal
    public void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
