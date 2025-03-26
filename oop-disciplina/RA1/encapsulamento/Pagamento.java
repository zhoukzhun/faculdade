public class Pagamento {
    
    // Atributo da classe Pagamento
    private String tipoPagamento;
    private float valorPagamento;
    private boolean opcaoParcelamento;
    private int quantidadeParcelamento;

    // Construtor da Classe Pagamento (sem parâmetros)
    public Pagamento() {
        this("Em vazio", 0, false, 0);
    }

    // Construtor da Classe Pagamento (com parâmetros)
    public Pagamento(String tipoPagamento, float valorPagamento, boolean opcaoParcelamento, int quantidadeParcelamento) {
        this.tipoPagamento = tipoPagamento;
        this.valorPagamento = valorPagamento;
        this.opcaoParcelamento = opcaoParcelamento;
        this.quantidadeParcelamento = quantidadeParcelamento;
    }


    // Getters da Classe Pagamento
    public String getTipoPagamento() {
        return this.tipoPagamento;
    }

    public float getValorPagamento() {
        return this.valorPagamento;
    }

    public boolean getOpcaoParcelamento() {
        return this.opcaoParcelamento;
    }

    public int getQuantidadeParcelamento() {
        return this.quantidadeParcelamento;
    }

    
    // Setters da classe Pagamento
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void setValorPagamento(float valorPagamento) {
        this.valorPagamento = valorPagamento;
    } 

    public  void setOpcaoParcelamento(boolean opcaoParcelamento) {
        this.opcaoParcelamento = opcaoParcelamento;
    }

    public void setQuantidadeParcelamento(int quantidadeParcelamento) {
        this.quantidadeParcelamento = quantidadeParcelamento;
    }


    // Método para exibir informações de Pagamento
    public void exibirInfoPagamento() {
        System.out.println("\n\n" + "- ".repeat(20));
        System.out.println("Informações de Pagamento:\n");
        System.out.println("Tipo de Pagamento: " + this.tipoPagamento);
        System.out.println("Valor pagamento: " + this.valorPagamento);

        if (this.opcaoParcelamento == false) {
            System.out.println("Opção de Parcelamento: Não permitido");
            System.out.println("Quantidade de Parcelamento: Não permitido");
        } else {
            System.out.println("Opção de Parcelamento: Permitido");
            System.out.println("Quantidade de Parcelamento: " + this.quantidadeParcelamento + "x");
        }
        System.out.println("- ".repeat(20));
    }
}
