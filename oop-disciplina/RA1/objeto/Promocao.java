package objeto;

public class Promocao {
    
    // Atributos
    public String nomePromocao;
    public float desconto;
    public String dataInicio;
    public String dataFinal;
    public String produtoRelacionado;


    // Métodos
    // Aplicar desconto aos produtos relacionados ao tema\temporada escolhido
    public void aplicarDesconto(float porcentagem) {
        System.out.println("\n\nDesconto de " + porcentagem + "% aplicado para " + this.produtoRelacionado + "!\n");
    }

    // Aplicar validade aos produtos relacionados ao tema\temporada escolhido
    public void validadeDesconto() {
        System.out.println(this.produtoRelacionado + " possuem desconto entre " + this.dataInicio + " - " + this.dataFinal);
        System.out.println("CUPOM válido até data a limite! CUPOM: verao_cupom25\n");
    } 

    // Aplicar bônus para Cliente, ao adquirir na promoção da temporada\tema em momento
    public void adicionarBonus(String bonusIncluso) {
        System.out.println("Ao adquirir nessa promoção, ganhe de bônus " + bonusIncluso);
    }


    public static void main(String[] args) {
        // Criar objeto da classe Promocao
        Promocao promocionalCriado = new Promocao();

        // Atribuindo valores de atributos ao objeto da classe Promocao
        promocionalCriado.nomePromocao = "Promoção de Verão";
        promocionalCriado.desconto = 30f;
        promocionalCriado.dataInicio = "01/04/2025";
        promocionalCriado.dataFinal = "14/04/2025";
        promocionalCriado.produtoRelacionado = "produtos relacionado à moda Verão";

        // Aplicar e exibir desconto, validade e bônus
        promocionalCriado.aplicarDesconto(20);
        promocionalCriado.validadeDesconto();
        promocionalCriado.adicionarBonus("+2 Looks de sua preferência para essa Temporada Verão!");
    }
}
