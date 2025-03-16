package objeto;

public class Pedido {

    // Atributos
    public int numeroPedido;
    public int itensPedido;
    public float precoPedido;
    public float precoFrete;
    public boolean entrega;
    public String tipoPagamento;


    // Métodos
    // Alterar a forma de Pagamento
    public void alterarPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
        System.out.println("\n\nAlteramos a forma de pagamento do Pedido Número " + this.numeroPedido);
        System.out.println(" Forma de pagamento atualizado: " + this.tipoPagamento);
    }

    // Exibir informações detalhada do pedido
    public void informacaoPedido() {
        System.out.println("\n\nNúmero pedido: " + this.numeroPedido);
        System.out.println("Quantidade de itens no Pedido: " + this.itensPedido);
        
        float precoTotal = this.precoPedido + this.precoFrete;
        
        if (this.precoFrete > 0) {
            System.out.println("Pedido + Frete (Incluso)  R$ " + precoTotal + "\t Frete R$ " + this.precoFrete);
        } else {
            System.out.println("Pedido (Sem inclusão de frete)  R$ " + precoTotal);
        }

        if (this.entrega == false) {
            System.out.println("Situação da Entrega: Em processo de Entrega..");
        } else {
            System.out.println("Situação da Entrega: Pedido já entregue ao Destinatário..");
        }

        System.out.println("Tipo de Pagamento: " + this.tipoPagamento);
    }

    // Aplicar desconto ao atingir um preço "x" estipulado 
    public void atingirPreco() {
        System.out.println("\n\nPara pedidos acima de R$ 350,00 , receba um desconto de 7%");

        if (this.precoPedido >= 350) {
            System.out.println(" Parabéns, seu desconto de 7% foi aplicado ao seu pedido!");
        } else {
            System.out.println(" Atinja o valor de 350,00 para que possa aplicar o seu desconto de 7% !");
        }
    }


    public static void main(String[] args) {
        // Criar uma objeto da Classe Pedido
        Pedido pedidoCriado = new Pedido();

        // Atribuindo valores ao atributo do objeto pedidoCriado
        pedidoCriado.numeroPedido = 123456;
        pedidoCriado.itensPedido = 5;
        pedidoCriado.precoPedido = 450;
        pedidoCriado.entrega = false;
        pedidoCriado.tipoPagamento = "Boleto Bancário";

        // Exibir informações do Pedido
        pedidoCriado.informacaoPedido();

        // Alterações no Pedido
        pedidoCriado.alterarPagamento("Cartão em Débito");
        pedidoCriado.precoFrete = 10f;
        pedidoCriado.entrega = true;

        // Aplicar desconto de 7% ao atingir um preço "x" no pedido
        pedidoCriado.atingirPreco();

        // Exibir alterações de Pedido
        pedidoCriado.informacaoPedido();
    }
}
