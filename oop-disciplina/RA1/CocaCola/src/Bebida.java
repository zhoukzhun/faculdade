public class Bebida extends Produto {
    public Bebida(String nomeProduto, float precoProduto) {
        super(nomeProduto, precoProduto);
    }

    @Override
    public void exibirDetalhes() {
        System.out.print("[Bebida] " + getNomeProduto() + " - R$" + getPrecoProduto());
    }
}
