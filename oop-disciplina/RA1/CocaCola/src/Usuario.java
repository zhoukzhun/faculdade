import java.util.ArrayList;

import java.util.ArrayList;

public class Usuario extends Conta {
    private String nome;
    private float descontoPorcentagem;
    private ArrayList<Produto> listaProduto = new ArrayList<>();

    public Usuario(String email, String endereco, String nome, float descontoPorcentagem) {
        super(email, endereco);
        this.nome = nome;
        this.descontoPorcentagem = descontoPorcentagem;
    }

    public String getNome() {
        return nome;
    }

    public void exibirInfoUsuario() {
        System.out.println("\n- - Informações do Usuário  - -");
        System.out.println("Usuário: " + this.nome);
        System.out.println("E-mail: " + getEmail());
        System.out.println("Endereço cadastrado pelo Usuário: " + getEndereco());
        System.out.println("* Desconto para compras de nossos produtos: " + this.descontoPorcentagem + "%\n");
    }

    public void exibirCatalogo() {
        listaProduto.clear();
        listaProduto.add(new Bebida("Coca-Cola 200ml", 3));
        listaProduto.add(new Bebida("Coca-Cola 600ml", 6.50f));
        listaProduto.add(new Bebida("Coca-Cola 2L", 9.50f));
        listaProduto.add(new Bebida("Coca-Cola Lata", 5));

        System.out.print("\nCatálogo dos Produtos:\n");
        for (Produto exibirCadaProduto : listaProduto) {
            exibirCadaProduto.exibirDetalhes();
            System.out.println();
        }
    }


}
