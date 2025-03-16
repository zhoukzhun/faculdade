package objeto;
    
public class Produto {

    // Atributos
    public String nomeProduto;
    public String tipoProduto;
    public String validadeProduto;
    public float pesoProduto;
    public float valorProduto;
    

    // Métodos
    // Aplicar desconto ao valor do produto (desconto em valor líquido e não em porcentagem)
    public float descontar_valor(float desconto) {
        if (valorProduto == 0) {
            return this.valorProduto;
        } else {
            float descontoAjuste = valorProduto - desconto;
            return descontoAjuste;
        }
            
    }

    // Aplicar aumento ao valor do produto (aumento em valor líquido e não em porcentagem)
    public float aumentar_valor(float aumento) {
        if (aumento < 0) { 
            return this.valorProduto;    
        } else {
            float aumentoAjuste = valorProduto + aumento;
            return aumentoAjuste;
        }
    }

    // Aplicar promoção ao produto específico em porcentagem
    public float realizar_promocao(float porcentagem_promocao) {
        if (porcentagem_promocao == 0 || porcentagem_promocao < 0) {
            return this.valorProduto;
        } else {
            float valorDesconto = this.valorProduto * (porcentagem_promocao/100);
            float produto_desconto_ajuste = this.valorProduto - valorDesconto;
            return produto_desconto_ajuste;
        }
    }


    public static void main(String[] args) {
        // Criar objeto refrigerante da classe Produto
        Produto refrigerante = new Produto();

        // Atribuindo valores aos atributos do objeto referente à classe Produto 
        refrigerante.nomeProduto = "Coca-Cola";
        refrigerante.tipoProduto = "bebida";
        refrigerante.validadeProduto = "01/07/2025";
        refrigerante.pesoProduto = 2;
        refrigerante.valorProduto = 10f;

        // Exibir informações detalhadas do objeto criado
        System.out.println("\n\nObjeto Refrigerante: \n-");
        System.out.println(" Nome do produto: " + refrigerante.nomeProduto);
        System.out.println(" Tipo de produto: " + refrigerante.tipoProduto);
        System.out.println(" Validade do produto: " + refrigerante.validadeProduto);
        System.out.println(" Tamanho do produto: " + refrigerante.pesoProduto + "l (Litros)");
        System.out.println(" Valor do produto: R$ " + refrigerante.valorProduto + "\n-");
        System.out.println(" Desconto aplicado: R$ " + refrigerante.descontar_valor(3)); 
        System.out.println(" Valor aumentado: R$ " + refrigerante.aumentar_valor(5));
        System.out.println(" Promoção aplicado: R$ " + refrigerante.realizar_promocao(5));
    }
}
