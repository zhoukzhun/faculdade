public class Produto {
    private String nomeProduto;
    private float precoProduto;

    public Produto(String nomeProduto, float precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void exibirDetalhes() {
        System.out.print(nomeProduto + " - R$" + precoProduto);
    }
}
