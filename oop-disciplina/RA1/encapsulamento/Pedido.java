
public class Pedido {

    // Atributos da Classe Pedido
    private String tipoComida;    
    private int quantidadeComida;
    private boolean levarParaViagem;
    private String sobremesaCortesia;
    private String bebidaAcompanhado;

    // Construtor da Classe Pedido (sem parâmetros)
    public Pedido() {
        this("Nenhum", 0, false, "Nenhum", "Nenhum");
    }

    // Construtor da Classe Pedido (com parâmetros)
    public Pedido(String tipoComida, int quantidadeComida, boolean levarParaViagem, String sobremesaCortesia, String bebidaAcompanhado) {
        this.tipoComida = tipoComida;
        this.quantidadeComida = quantidadeComida;
        this.levarParaViagem = levarParaViagem;
        this.sobremesaCortesia = sobremesaCortesia;
        this.bebidaAcompanhado = bebidaAcompanhado;
    }


    // Getters da Classe Pedido
    public String getTipoComida() {
        return this.tipoComida;
    }

    public int getQuantidadeComida() {
        return this.quantidadeComida;
    }

    public boolean getLevarParaViagem() {
        return this.levarParaViagem;
    }

    public String getSobremesaCortesia() {
        return this.sobremesaCortesia;
    }

    public String getBebidaAcompanhado() {
        return this.bebidaAcompanhado;
    }


    // Setters da Classe Pedido
    public void setTipoComida(String tipoComida) {
        if (tipoComida.trim().length() <= 4) {
            System.out.println("Comida inválida, insira nome de uma comida acima de 4 caracteres!\n");
            this.tipoComida = "Nenhuma comida inserida";
        } else {
            this.tipoComida = tipoComida;
        }
    }

    public void setQuantidadeComida(int quantidadeComida) {
        if (quantidadeComida < 0) {
            System.out.println("Quantidade de comida negativa, coloque uma quantidade igual ou acima de zero!\n");
            this.quantidadeComida = 0;
        } else {
            this.quantidadeComida = quantidadeComida;
        }
    }

    public void setLevarParaViagem(boolean levarParaViagem) {
        this.levarParaViagem = levarParaViagem;
    }

    public void setSobremesaCortesia(String sobremesaCortesia) {
        if (sobremesaCortesia.length() <= 3) {
            System.out.println("Sobremesa de Cortesia não inserida ou quantidade de caracteres inválida. Tente acima de 3 caracteres!\n");
            this.sobremesaCortesia = "Nenhuma sobremesa de cortesia escolhido";
        } else {
            this.sobremesaCortesia = sobremesaCortesia;
        }
    }

    public void setBebidaAcompanhado(String bebidaAcompanhado) {
        if (bebidaAcompanhado.length() <= 3) {
            System.out.println("Bebida não reconhecido, tente uma bebida acima de 3 caracteres!");
            this.bebidaAcompanhado = "Nenhuma bebida acompanhado";
        } else {
            this.bebidaAcompanhado = bebidaAcompanhado;
        }
    }


    // Método para exibir as informações do Pedido realizado
    public void exibirPedido() {
        System.out.println("\n" + "- ".repeat(20) + "\nExibição das Informações do Pedido:\n");
        System.out.println("Tipo de Comida: " + this.tipoComida);
        System.out.println("Quantidade de Comida: " + this.quantidadeComida);

        if (this.levarParaViagem == false) {
            System.out.println("Levar para viagem: Não");
        } else {
            System.out.println("Levar para viagem: Sim");
        }

        System.out.println("Sobremesa Cortesia: " + this.sobremesaCortesia);
        System.out.println("Bebida Acompanhado: " + this.bebidaAcompanhado);
        System.out.println("- ".repeat(20));
    }
}
