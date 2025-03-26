import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        // Criar Objeto para input (ler entrada de dados)
        Scanner sc =  new Scanner(System.in);

    
        // ----  Classe Pedido  ----

        // Criar Objeto da classe Pedido (sem parâmetros)
        Pedido novoPedido = new Pedido();
        novoPedido.exibirPedido();

        // Criar inputs e passar os valores para setter da classe Pedido 
        System.out.print("Tipo de Comida: ");
        String comidaPedido = sc.nextLine();
        novoPedido.setTipoComida(comidaPedido);

        System.out.print("Quantidade de Comida: ");
        int quantidadeComidaPedido = sc.nextInt();
        novoPedido.setQuantidadeComida(quantidadeComidaPedido);
        novoPedido.exibirPedido();
    
        // Criar outro Objeto da classe Pedido (com parâmetros)
        Pedido novoPedido2 = new Pedido("Coxinha", 3, true, "Pudim", "Suco de Morango");
        novoPedido2.exibirPedido();
        // Alterar o valor do atributo com uso de Setter
        novoPedido2.setSobremesaCortesia("Bolo de Chocolate");
        novoPedido2.exibirPedido();

        System.out.println("\n\n");


        // ----  Classe Funcionario  ----

        // Criar Objeto da classe Funcionario (sem parâmetros)
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.exibirFuncionario();
        
        // Ler nome do funcionário e usar setter para realizar a modificação no valor do atributo
        System.out.print("Nome do funcionário: ");
        String registrarNomeFuncionario = sc.nextLine();
        sc.nextLine();
        novoFuncionario.setNomeFuncionario(registrarNomeFuncionario);
        
        // Ler idade do funcionário e usar setter para realizar a modificação no valor do atributo
        System.out.print("Idade do funcionário: ");
        int registrarIdadeFuncionario = sc.nextInt();
        sc.nextLine();
        novoFuncionario.setIdadeFuncionario(registrarIdadeFuncionario);

        // Escrever as informações sobre o intervalo de Contrato do funcionário e modificar usando setter
        System.out.print("Tempo de Contrato do Funcionário (texto): ");
        String registrarTempoContrato = sc.nextLine();
        novoFuncionario.setTempoContrato(registrarTempoContrato);

        // Especificar o cargo do funcionário e modificar com setter
        System.out.print("Cargo do funcionário: ");
        String registrarCargoFuncionario = sc.nextLine();
        novoFuncionario.setCargoFuncionario(registrarCargoFuncionario);

        // Especificar o intervalo de férias (em texto)
        System.out.print("Escreva o intervalo de férias (texto): ");
        String registrarIntervaloFerias = sc.nextLine();
        novoFuncionario.setIntervaloFerias(registrarIntervaloFerias);

        // Colocar a empresa que o funcionário está atuando no momento
        System.out.print("Empresa que o funcionário está registrado atualmente: ");
        String registrarEmpresaAtual = sc.nextLine();
        novoFuncionario.setEmpresaAtual(registrarEmpresaAtual);

        novoFuncionario.exibirFuncionario();
        
        // Criar outro Objeto da classe Funcionario (com parâmetros)
        Funcionario novoFuncionario2 = new Funcionario("Junior Santos", 35, "6 Meses", "Gestor de Negócios", "1 Mês", "Importacao Sul Online LTDA");
        novoFuncionario2.exibirFuncionario();
        novoFuncionario2.aptoTrabalhar();
    
                
        //  ----  Classe Pagamento  ----

        //  Criar Objeto da classe Pagamento (sem parâmetros)
        Pagamento novoPagamento = new Pagamento();
        novoPagamento.exibirInfoPagamento();
        
        Pagamento novoPagamento2 = new Pagamento("Cartão de Débito", 50.58f, true, 3);
        novoPagamento2.exibirInfoPagamento();

        novoPagamento2.setTipoPagamento("Cartão de Crédito");
        novoPagamento2.setValorPagamento(70.91f);
        novoPagamento2.setQuantidadeParcelamento(2);

        novoPagamento2.exibirInfoPagamento();


        //  ----  Classe Estacionamento  ----

        // Criar Objeto da classe Estacionamento (sem parâmetros)
        Estacionamento usuarioEstacionamento1 = new Estacionamento();
        // Exibir extrato do Carro do Cliente no Estacionamento 
        usuarioEstacionamento1.extratoClienteEstacionamento();

        // Criar outro Objeto da classe Estacionamento (com parâmetros)
        usuarioEstacionamento1 = new Estacionamento("Chevrolet Onix", 2022, "Mensalista", 350f, "pequeno");
        // Exibir extrato de outro Carro
        usuarioEstacionamento1.extratoClienteEstacionamento();

        // Ler informações para atributos da classe Estacionamento (input)
        System.out.print("Digitar Modelo de Carro: ");
        String digitarModeloCarro = sc.nextLine().trim().toLowerCase();

        System.out.print("Digitar Ano do Carro: ");
        int digitarAnoCarro = sc.nextInt();
        sc.nextLine();

        System.out.print("Digitar Tamanho do Carro: ");
        String digitarTamanhoCarro = sc.nextLine().trim().toLowerCase();

        // Uso de setters para Modelo, ano, tamanho, preço do Carro que vai ser colocado no Estacionamento
        usuarioEstacionamento1.setModeloCarro(digitarModeloCarro);
        usuarioEstacionamento1.setAnoCarro(digitarAnoCarro);
        usuarioEstacionamento1.setTamanhoVaga(digitarTamanhoCarro);
        usuarioEstacionamento1.setPrecoUso(380);
        usuarioEstacionamento1.extratoClienteEstacionamento();

        usuarioEstacionamento1.setTipoCliente("temporario");
        usuarioEstacionamento1.extratoClienteEstacionamento();

        sc.close();
    }
}
