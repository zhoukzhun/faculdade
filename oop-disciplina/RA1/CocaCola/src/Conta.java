public class Conta {
    private String email;
    private String endereco;

    public Conta(String email, String endereco) {
        this.email = email;
        this.endereco = endereco;
    }

    public void exibirMenuConsumidor() {
        System.out.println("- - ".repeat(15));
        System.out.println("(Menu Coca-Cola)\t\t#Consumidor2025 #FaçaSeusPedidos");
        System.out.println("[ 1 ] Informações da Conta do Usuário");
        System.out.println("[ 2 ] Efetuar Pedido");
        System.out.println("[ 3 ] Catálogo dos Produtos");
        System.out.println("[ 4 ] Adicionar ou Remover Produtos");
        System.out.println("[ 5 ] Sair");
        System.out.println("- - ".repeat(15));
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }
}
